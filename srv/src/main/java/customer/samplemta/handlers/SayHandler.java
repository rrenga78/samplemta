package customer.samplemta.handlers;

import org.springframework.stereotype.Component;

import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.ServiceName;
import cds.gen.say.Say_;

import cds.gen.say.HelloContext;
import com.sap.cds.services.handler.annotations.On;

@Component
@ServiceName(Say_.CDS_NAME)
public class SayHandler implements EventHandler {
    
    @On(event = HelloContext.CDS_NAME)
    public void sayHello(HelloContext context) {
        String name = context.getTo();
        String greeting = "Hello " + name +"!";
        context.setResult(greeting);
    }
}
