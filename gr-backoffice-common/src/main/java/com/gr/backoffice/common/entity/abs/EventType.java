package com.gr.backoffice.common.entity.abs;

import com.gr.backoffice.common.entity.core.EventAction;

import java.util.Map;

public abstract class EventType {
    private long id;
    private String eventCode;
    private Map<String, EventAction> eventActions;
}
