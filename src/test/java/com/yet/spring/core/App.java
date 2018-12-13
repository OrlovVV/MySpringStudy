package com.yet.spring.core;

import com.yet.spring.core.beans.Client;
import com.yet.spring.core.loggers.ConsoleEventLoggers;

public class App {
    Client client;
    ConsoleEventLoggers eventLoggers;

    public static void main(String[] args){
        App app = new App();

        app.client = new Client("1", "John Smith");
        app.eventLoggers = new ConsoleEventLoggers();
        app.logEvent("Some event for user 1");

    }


    private void logEvent(String msg){
        String message = msg.replaceAll(client.getId(), client.getFullname());
        eventLoggers.logEvent(message);
    }

}
