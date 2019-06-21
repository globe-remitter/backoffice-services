package com.gr.backoffice.common.entity.enums;

public enum MessageChannel {
    SMS(200), EMAIL(200);
    private int channelMaxInt;

    MessageChannel(int channelMaxInt) {
        this.channelMaxInt = channelMaxInt;
    }

    public int getChannelMaxInt() {
        return channelMaxInt;
    }
}
