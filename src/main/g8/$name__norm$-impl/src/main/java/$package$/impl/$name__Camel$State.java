/*
 * Copyright (C) 2016 Lightbend Inc. <http://www.lightbend.com>
 */
package $package$.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.Preconditions;
import com.lightbend.lagom.serialization.CompressedJsonable;
import org.immutables.value.Value;

/**
 * The state for the {@link $name;format="Camel"$Entity} entity.
 */
@SuppressWarnings("serial")
@Value.Immutable
@JsonDeserialize(as = Immutable$name;format="Camel"$State.class)
@JsonSerialize(as = Immutable$name;format="Camel"$State.class)

public abstract class $name;format="Camel"$State implements CompressedJsonable {

}
