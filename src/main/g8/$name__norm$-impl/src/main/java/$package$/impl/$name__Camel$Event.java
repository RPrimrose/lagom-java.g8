/*
 * Copyright (C) 2016 Lightbend Inc. <http://www.lightbend.com>
 */
package $package$.impl;

import com.lightbend.lagom.javadsl.persistence.AggregateEvent;
import com.lightbend.lagom.javadsl.persistence.AggregateEventShards;
import com.lightbend.lagom.javadsl.persistence.AggregateEventTag;
import com.lightbend.lagom.javadsl.persistence.AggregateEventTagger;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Preconditions;
import com.lightbend.lagom.serialization.Jsonable;

public interface $name;format="Camel"$Event extends Jsonable, AggregateEvent<$name;format="Camel"$Event> {

  AggregateEventShards<$name;format="Camel"$Event> TAG = AggregateEventTag.sharded($name;format="Camel"$Event.class, 4);

  @Override
  default AggregateEventTagger<$name;format="Camel"$Event> aggregateTag() {
    return TAG;
  }
}
