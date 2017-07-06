package $package$.impl;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.Optional;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.lightbend.lagom.javadsl.testkit.PersistentEntityTestDriver;
import com.lightbend.lagom.javadsl.testkit.PersistentEntityTestDriver.Outcome;

import akka.Done;
import akka.actor.ActorSystem;
import akka.testkit.JavaTestKit;
public class $name;format="Camel"$EntityTest {

  static ActorSystem system;

  @BeforeClass
  public static void setup() {
    system = ActorSystem.create("$name;format="Camel"$EntityTest");
  }

  @AfterClass
  public static void teardown() {
    JavaTestKit.shutdownActorSystem(system);
    system = null;
  }

  @Test
  public void test$name;format="Camel"$Entity() {
    PersistentEntityTestDriver<$name;format="Camel"$Command, $name;format="Camel"$Event, $name;format="Camel"$State> driver = new PersistentEntityTestDriver<>(system,
        new $name;format="Camel"$Entity(), "world-1");
  }

}
