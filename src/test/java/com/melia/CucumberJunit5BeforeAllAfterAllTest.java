package com.melia;


import io.cucumber.junit.platform.engine.Cucumber;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

@Cucumber
public class CucumberJunit5BeforeAllAfterAllTest {
  @BeforeAll
  public static void beforeAll() {
      System.out.println("****** Before All JUnit5 *****");
  }
  @AfterAll
  public static void afterAll() {
      System.out.println("****** After All JUnit5 *****");
  }
  
}
