package core.loggers;

import core.beans.Event;

public class ConsoleEventLogger implements EventLogger{

    public void logEvent(Event event) {
        System.out.println(event.toString());
    }

}
