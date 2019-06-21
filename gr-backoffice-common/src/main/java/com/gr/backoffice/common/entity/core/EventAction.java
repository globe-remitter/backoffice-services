package com.gr.backoffice.common.entity.core;

import com.gr.backoffice.common.entity.abs.EventType;

import java.util.List;

public class EventAction {
    private long id;
    private String eventActionCode;
    private String eventActionType;
    private int eventActionDays;
    private EventType eventNext;
    private List<Fee> eventFee;
    private List<MessageType> eventNotification;
}
