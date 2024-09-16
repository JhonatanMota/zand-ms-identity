package com.zand.identity.infrastructure.external.vendor;

import com.zand.identity.infrastructure.external.IdentityVerificationVendor;
import com.zand.identity.infrastructure.external.dto.IdentityVerificationRequest;
import org.springframework.stereotype.Service;

@Service
public class MockVendorAIntegration implements IdentityVerificationVendor {

  @Override
  public boolean verifyIdentity(IdentityVerificationRequest request) {

    // just mocking the verification
    return request.getEmiratesId().equals("784-1987-1234567-1");
  }
}
