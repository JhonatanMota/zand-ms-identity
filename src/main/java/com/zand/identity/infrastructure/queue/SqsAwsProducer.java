package com.zand.identity.infrastructure.queue;

import com.zand.identity.web.dto.CreditCardRequest;
import org.springframework.stereotype.Service;

@Service
public class SqsAwsProducer implements QueueProducer {

  @Override
  public void sendMessage(CreditCardRequest request) {

    // just mocking the sending
    /*
     * publish in AWS SQS queue to be  processed later by another service
     * like employment-verification, compliance-check, risk-evaluation and behavioral-analysis
     */
  }
}
