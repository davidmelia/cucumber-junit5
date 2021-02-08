package com.melia;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class JUnit5Extension implements BeforeAllCallback, AfterAllCallback {

  @Override
  public void afterAll(ExtensionContext context) throws Exception {
    System.out.println("****** After All JUnit5 *****");
  }

  @Override
  public void beforeAll(ExtensionContext context) throws Exception {
    System.out.println("****** Before All JUnit5 *****");
  }
  
}