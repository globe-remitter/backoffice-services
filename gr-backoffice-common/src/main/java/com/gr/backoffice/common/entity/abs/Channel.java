package com.gr.backoffice.common.entity.abs;

import com.gr.backoffice.common.entity.enums.MessageChannel;

public abstract class Channel {
    private long id;
    private String channelName;
    private int channelMaxInt;

    public Channel(MessageChannel messageChannel) {
        this.channelName = messageChannel.name();
        this.channelMaxInt = messageChannel.getChannelMaxInt();
    }

}
