/*
 * Copyright 2000-2017 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.flow.dom;

import com.vaadin.flow.component.HasEnabled;

/**
 * Controls RPC communication from the client side to the server side respecting
 * enabled state.
 *
 * @see Element#setEnabled(boolean)
 * @see Element#isEnabled()
 * @see HasEnabled#setEnabled(boolean)
 * @see HasEnabled#isEnabled()
 *
 * @author Vaadin Ltd
 *
 */
public enum DisabledUpdateMode {
    /**
     * If used then updates from the client side are allowed even for disabled
     * element.
     */
    ALWAYS,
    /**
     * If used then updates from the client side are allowed only if element is
     * enabled.
     */
    ONLY_WHEN_ENABLED
}
