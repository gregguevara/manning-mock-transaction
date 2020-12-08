package io.betterbanking.mocktransactionservice.service;

import io.betterbanking.mocktransactionservice.model.Transaction;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

  @Override
  public List<Transaction> findAllByAccountNumber(Long accountNumber) {
    return List.of(Transaction.builder().build());
  }
}
