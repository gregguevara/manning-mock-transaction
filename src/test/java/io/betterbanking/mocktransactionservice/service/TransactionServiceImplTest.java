package io.betterbanking.mocktransactionservice.service;

import static org.assertj.core.api.Assertions.assertThat;

import io.betterbanking.mocktransactionservice.model.Transaction;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransactionServiceImplTest {

  private TransactionServiceImpl transactionService;
  private Long accountId;

  @BeforeEach
  public void setup() {
    transactionService = new TransactionServiceImpl();
    accountId = new Random().nextLong();
  }

  @Test
  void findAllByAccountNumber_shouldReturnNonEmptyList() {
    List<Transaction> transactionList = transactionService.findAllByAccountNumber(accountId);
    assertThat(transactionList).isNotEmpty();
  }
}