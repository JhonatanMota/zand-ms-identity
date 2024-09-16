package com.zand.identity.web;

import static org.springframework.http.HttpStatus.OK;

import com.zand.identity.application.service.IdentityVerificationService;
import com.zand.identity.web.dto.CreditCardRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping(value = "/identity/verification")
public class IdentityVerificationRestController {

  private final IdentityVerificationService identityVerificationService;

  @ResponseStatus(value = OK)
  @PostMapping(headers = "X-API-VERSION=v1.0")
  public void identityVerification(@RequestBody CreditCardRequest request) {

    log.info("Received request: {}", request);

    identityVerificationService.verify(request);
  }
}
