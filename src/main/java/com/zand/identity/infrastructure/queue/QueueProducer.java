package com.zand.identity.infrastructure.queue;

import com.zand.identity.web.dto.CreditCardRequest;

public interface QueueProducer {
  void sendMessage(CreditCardRequest request);
}
