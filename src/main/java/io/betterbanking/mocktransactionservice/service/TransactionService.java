package io.betterbanking.mocktransactionservice.service;

import io.betterbanking.mocktransactionservice.model.Transaction;
import java.util.List;

public interface TransactionService {

  List<Transaction> findAllByAccountNumber(Long accountNumber);
}
