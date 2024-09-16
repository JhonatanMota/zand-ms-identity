package com.zand.identity.infrastructure.external;

import com.zand.identity.infrastructure.external.dto.IdentityVerificationRequest;

public interface IdentityVerificationVendor {

  boolean verifyIdentity(IdentityVerificationRequest request);
}
