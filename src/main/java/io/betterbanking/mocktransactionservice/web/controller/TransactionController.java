package io.betterbanking.mocktransactionservice.web.controller;

import io.betterbanking.mocktransactionservice.model.Transaction;
import io.betterbanking.mocktransactionservice.service.TransactionService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
@RequiredArgsConstructor
public class TransactionController {

  private final TransactionService transactionService;

  @GetMapping("/{accountNumber}")
  public ResponseEntity<List<Transaction>> findTransaction(@PathVariable Long accountNumber) {
    return new ResponseEntity<>(transactionService.findAllByAccountNumber(accountNumber),
        HttpStatus.OK);
  }
}
