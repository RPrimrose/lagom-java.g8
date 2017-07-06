/*
 * Copyright (C) 2016 Lightbend Inc. <http://www.lightbend.com>
 */
package $package$.impl;

import static com.lightbend.lagom.javadsl.testkit.ServiceTest.defaultSetup;
import static com.lightbend.lagom.javadsl.testkit.ServiceTest.withServer;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import $package$.api.GreetingMessage;
import $package$.api.$name;format="Camel"$Service;

public class $name;format="Camel"$ServiceTest {

  @Test
  public void shouldStorePersonalizedGreeting() throws Exception {
    withServer(defaultSetup().withCassandra(true), server -> {
      $name;format="Camel"$Service service = server.client($name;format="Camel"$Service.class);

    });
  }

}
