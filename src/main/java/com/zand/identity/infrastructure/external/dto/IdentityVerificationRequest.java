package com.zand.identity.infrastructure.external.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class IdentityVerificationRequest {

  private String emiratesId;
  private String name;
  private String mobileNumber;
  private String nationality;
  private String address;
}
