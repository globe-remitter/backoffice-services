package com.gr.backoffice.common.entity.impl;

import com.gr.backoffice.common.entity.abs.Channel;
import com.gr.backoffice.common.entity.enums.MessageChannel;

public class SmsMessage extends Channel {
    public SmsMessage(String channelName) {
        super(MessageChannel.SMS);
    }
}
