package com.swat018.springcore;


import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class EventService_NS {
    @NonNull
    public String createEvent(@NonNull String name) {
        return "hell " + name;
    }
}
