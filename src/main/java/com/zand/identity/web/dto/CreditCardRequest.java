package com.zand.identity.web.dto;

import com.zand.identity.domain.model.CreditCardStatus;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreditCardRequest {

  private String emiratesId;
  private String name;
  private String mobileNumber;
  private String nationality;
  private String address;
  private BigDecimal income;
  private String employmentDetails;
  private BigDecimal requestedCreditLimit;

  private boolean identityVerified;
  private boolean employmentVerified;
  private boolean complianceCheckPassed;
  private Double riskEvaluationScore;
  private Double behavioralAnalysisScore;

  private CreditCardStatus status;
}
