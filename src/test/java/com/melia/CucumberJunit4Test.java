package com.melia;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/melia", plugin = {"pretty", "html:target/cucumber"})
public class CucumberJunit4Test {

  @BeforeClass
  public static void beforeClass() {
      System.out.println("****** Before Class JUnit4 *****");
  }
  @AfterClass
  public static void afterClass() {
      System.out.println("****** After Class JUnit4 *****");
  }
  
}
