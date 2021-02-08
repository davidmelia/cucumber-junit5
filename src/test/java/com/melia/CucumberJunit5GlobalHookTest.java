package com.melia;

import io.cucumber.junit.platform.engine.Cucumber;
import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.TestRunFinished;
import io.cucumber.plugin.event.TestRunStarted;

@Cucumber
public class CucumberJunit5GlobalHookTest implements ConcurrentEventListener {
  @Override
  public void setEventPublisher(EventPublisher eventPublisher) {
    eventPublisher.registerHandlerFor(TestRunStarted.class, event -> {
      System.out.println("****** Before All JUnit5 *****");
    });
    eventPublisher.registerHandlerFor(TestRunFinished.class, event -> {
      System.out.println("****** After All JUnit5 *****");
    });
  }

}
