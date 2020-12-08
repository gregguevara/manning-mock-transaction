package io.betterbanking.mocktransactionservice.model;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Transaction {

  private String type;
  private Long accountNumber;
  private String currency;
  private BigDecimal amount;
  private String merchantName;
  private String merchantLogo;
}
