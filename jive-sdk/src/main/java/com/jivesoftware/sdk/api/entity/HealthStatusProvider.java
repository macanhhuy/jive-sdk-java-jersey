/*
 *
 *  * Copyright 2013 Jive Software
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *       http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 */

package com.jivesoftware.sdk.api.entity;

import com.jivesoftware.sdk.api.health.data.HealthStatus;

/**
 * Created by rrutan on 2/6/14.
 */
public interface HealthStatusProvider extends BaseProvider {

    public void init() throws HealthStatusProviderException;

    public HealthStatus getStatus();

    class HealthStatusProviderException extends Exception {
        public HealthStatusProviderException() {
        }

        public HealthStatusProviderException(String message) {
            super(message);
        }

        public HealthStatusProviderException(String message, Throwable cause) {
            super(message, cause);
        }

        public HealthStatusProviderException(Throwable cause) {
            super(cause);
        }

        public HealthStatusProviderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }
} // end interface
