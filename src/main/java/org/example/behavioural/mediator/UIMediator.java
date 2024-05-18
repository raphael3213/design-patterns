package org.example.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class UIMediator {

    private final List<UIControl> colleagues = new ArrayList<>();

    public void register(UIControl control) {
        colleagues.add(control);
    }

    public void valueChanged(UIControl control) {
       colleagues
               .stream()
               .filter((colleagues) -> colleagues != control)
               .forEach((colleague) -> colleague.controlChanged(control));
    }
}
