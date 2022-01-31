package com.pedroperez.designpatterns.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private final List<Component> leaves = new ArrayList<>();

    @Override
    public String operation() {
        final StringBuilder builder = new StringBuilder();
        leaves.forEach(leaf -> builder.append(leaf.operation()));
        return builder.toString();
    }

    public void add(Component component) {
        leaves.add(component);
    }
}
