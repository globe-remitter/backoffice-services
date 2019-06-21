package com.gr.backoffice.common.entity.impl;

import com.gr.backoffice.common.entity.abs.Channel;
import com.gr.backoffice.common.entity.enums.MessageChannel;

public class EmailMessage extends Channel {
    public EmailMessage(String channelName) {
        super(MessageChannel.EMAIL);
    }
}
