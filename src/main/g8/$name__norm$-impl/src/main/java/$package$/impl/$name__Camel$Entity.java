/*
 * Copyright (C) 2016 Lightbend Inc. <http://www.lightbend.com>
 */
package $package$.impl;

import java.time.LocalDateTime;
import java.util.Optional;

import com.lightbend.lagom.javadsl.persistence.PersistentEntity;

public class $name;format="Camel"$Entity extends PersistentEntity<$name;format="Camel"$Command, $name;format="Camel"$Event, $name;format="Camel"$State> {

  @Override
  public Behavior initialBehavior(Optional<$name;format="Camel"$State> snapshotState) {

    BehaviorBuilder b = newBehaviorBuilder(
        snapshotState.orElse(new $name;format="Camel"$State("Hello", LocalDateTime.now().toString())));
    return b.build();
  }
}
