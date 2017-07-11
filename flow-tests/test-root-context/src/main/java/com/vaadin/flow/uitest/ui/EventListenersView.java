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
package com.vaadin.flow.uitest.ui;

import java.util.concurrent.atomic.AtomicInteger;

import com.vaadin.flow.html.Button;
import com.vaadin.flow.html.Label;

public class EventListenersView extends AbstractDivView {

    private Label tmp = new Label("a");

    @Override
    protected void onShow() {
        AtomicInteger count = new AtomicInteger();
        Button button = new Button("Click me");
        button.setId("click");
        button.addClickListener(evt -> {
            int value = count.incrementAndGet();
            Label label = new Label(String.valueOf(value));
            label.addClassName("count");
            add(label);
            add(button);
        });
        add(button);
    }

}