package com.zand.identity.infrastructure.internal;

import com.zand.identity.web.dto.CreditCardRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UpdateCreditCardStatusService {

  public void update(CreditCardRequest request) {
    log.info("Updating credit card status for request: {}", request);
    // implementation to call credit-card service to update the credit card status
  }
}
