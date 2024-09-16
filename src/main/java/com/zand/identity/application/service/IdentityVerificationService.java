package com.zand.identity.application.service;

import com.zand.identity.domain.model.CreditCardStatus;
import com.zand.identity.infrastructure.external.IdentityVerificationVendor;
import com.zand.identity.infrastructure.external.dto.IdentityVerificationRequest;
import com.zand.identity.infrastructure.internal.UpdateCreditCardStatusService;
import com.zand.identity.infrastructure.queue.QueueProducer;
import com.zand.identity.web.dto.CreditCardRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class IdentityVerificationService {

  private final IdentityVerificationVendor identityVerificationVendor;
  private final UpdateCreditCardStatusService updateCreditCardStatusService;
  private final QueueProducer queueProducer;

  public void verify(CreditCardRequest request) {
    IdentityVerificationRequest identityVerificationRequest =
        toIdentityVerificationRequest(request);

    boolean identityVerified =
        identityVerificationVendor.verifyIdentity(identityVerificationRequest);

    if (!identityVerified) {
      log.warn("Identity verification failed for request: {}", request);

      request.setStatus(CreditCardStatus.REJECTED);

      updateCreditCardStatusService.update(request);
    } else {
      log.info("Identity verification passed for request: {}", request);

      queueProducer.sendMessage(request);
    }
  }

  private IdentityVerificationRequest toIdentityVerificationRequest(CreditCardRequest request) {
    return IdentityVerificationRequest.builder()
        .emiratesId(request.getEmiratesId())
        .name(request.getName())
        .mobileNumber(request.getMobileNumber())
        .nationality(request.getNationality())
        .address(request.getAddress())
        .build();
  }
}
