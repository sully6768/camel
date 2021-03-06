/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The scheduler component is used for generating message exchanges when a
 * scheduler fires.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SchedulerEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Scheduler component.
     */
    public interface SchedulerEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedSchedulerEndpointBuilder advanced() {
            return (AdvancedSchedulerEndpointBuilder) this;
        }
        /**
         * Number of threads used by the scheduling thread pool. Is by default
         * using a single thread.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: scheduler
         */
        default SchedulerEndpointBuilder concurrentTasks(int concurrentTasks) {
            setProperty("concurrentTasks", concurrentTasks);
            return this;
        }
        /**
         * Number of threads used by the scheduling thread pool. Is by default
         * using a single thread.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: scheduler
         */
        default SchedulerEndpointBuilder concurrentTasks(String concurrentTasks) {
            setProperty("concurrentTasks", concurrentTasks);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Scheduler component.
     */
    public interface AdvancedSchedulerEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default SchedulerEndpointBuilder basic() {
            return (SchedulerEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSchedulerEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSchedulerEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSchedulerEndpointBuilder synchronous(boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSchedulerEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Scheduler (camel-scheduler)
     * The scheduler component is used for generating message exchanges when a
     * scheduler fires.
     * 
     * Category: core,scheduling
     * Available as of version: 2.15
     * Maven coordinates: org.apache.camel:camel-scheduler
     * 
     * Syntax: <code>scheduler:name</code>
     * 
     * Path parameter: name (required)
     * The name of the scheduler
     */
    default SchedulerEndpointBuilder scheduler(String path) {
        class SchedulerEndpointBuilderImpl extends AbstractEndpointBuilder implements SchedulerEndpointBuilder, AdvancedSchedulerEndpointBuilder {
            public SchedulerEndpointBuilderImpl(String path) {
                super("scheduler", path);
            }
        }
        return new SchedulerEndpointBuilderImpl(path);
    }
}