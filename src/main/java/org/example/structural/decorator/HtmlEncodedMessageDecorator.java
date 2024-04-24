package org.example.structural.decorator;

import org.apache.commons.text.StringEscapeUtils;

public class HtmlEncodedMessageDecorator implements MessageComponent {

    public HtmlEncodedMessageDecorator(MessageComponent messageComponent) {
        this.messageComponent = messageComponent;
    }

    private final MessageComponent messageComponent;


    @Override
    public String getContent() {
        return StringEscapeUtils.escapeHtml4(messageComponent.getContent());
    }
}
