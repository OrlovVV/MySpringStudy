package core;

import core.beans.Client;
import core.loggers.ConsoleEventLoggers;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    Client client;
    ConsoleEventLoggers eventLoggers;

    public App(){
    }

    public App(Client client, ConsoleEventLoggers eventLoggers){
        this.client = client;
        this.eventLoggers = eventLoggers;
    }

    public static void main(String[] args){
        /*
        App app = new App();

        app.client = new Client("1", "John Smith");
        app.eventLoggers = new ConsoleEventLoggers();
*/

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");

        app.logEvent("Some event for 1");
        app.logEvent("Some event for 2");

    }


    private void logEvent(String msg){
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLoggers.logEvent(message);
    }

}
