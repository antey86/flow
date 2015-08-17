/*
 * Copyright 2000-2014 Vaadin Ltd.
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
package hummingbird;

import com.vaadin.annotations.StyleSheet;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@StyleSheet("TodoList.css")
public class TodoListUi extends UI {

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        TodoList todoList = new TodoList();
        todoList.addTodo("Make hummingbird work");

        Button addButton = new Button("Add another todo");
        addButton.getElement().addEventListener("click",
                () -> todoList.addTodo("Another todo"));
        //
        // Button toggleButton = new Button("Toggle completed");
        // toggleButton.addClickListener(e -> {
        // Element firstInput = todoList.getElement().getChild(0);
        // if (firstInput.hasAttribute("type")) {
        // firstInput.removeAttribute("type");
        // } else {
        // firstInput.setAttribute("type", "password");
        // }
        // });

        layout.addComponent(todoList);
        layout.addComponent(addButton);
        // layout.addComponent(toggleButton);

        setContent(layout);
    }
}