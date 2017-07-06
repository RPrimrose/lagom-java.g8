/*
 * Copyright (C) 2016 Lightbend Inc. <http://www.lightbend.com>
 */
package $package$.impl;

import akka.Done;
import akka.NotUsed;
import akka.japi.Pair;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import com.lightbend.lagom.javadsl.api.broker.Topic;
import com.lightbend.lagom.javadsl.broker.TopicProducer;
import com.lightbend.lagom.javadsl.persistence.PersistentEntityRef;
import com.lightbend.lagom.javadsl.persistence.PersistentEntityRegistry;

import javax.inject.Inject;

import $package$.api.$name;format="Camel"$Service;
import $package$.impl.$name;format="Camel"$Command.*;


public class $name;format="Camel"$ServiceImpl implements $name;format="Camel"$Service {

  private final PersistentEntityRegistry persistentEntityRegistry;

  @Inject
  public $name;format="Camel"$ServiceImpl(PersistentEntityRegistry persistentEntityRegistry) {
    this.persistentEntityRegistry = persistentEntityRegistry;
    persistentEntityRegistry.register($name;format="Camel"$Entity.class);
  }  
}
