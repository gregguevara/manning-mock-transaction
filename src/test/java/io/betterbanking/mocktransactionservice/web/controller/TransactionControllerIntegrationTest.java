package io.betterbanking.mocktransactionservice.web.controller;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.when;
import static org.hamcrest.CoreMatchers.is;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import java.util.Random;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RequiredArgsConstructor
public class TransactionControllerIntegrationTest {

  private static final Long ACCOUNT_ID = new Random().nextLong();

  private final WebApplicationContext webApplicationContext;

  @BeforeEach
  public void setup() {
    RestAssuredMockMvc.webAppContextSetup(webApplicationContext);
  }

  @Test
  public void findTransaction_shouldReturnNonEmptyListAnd200Status() {
    when().
        get("/transactions/" + ACCOUNT_ID)
        .then()
        .statusCode(200)
        .body("isEmpty()", is(false));
  }
}