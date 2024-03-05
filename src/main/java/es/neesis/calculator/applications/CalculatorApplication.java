package es.neesis.calculator.applications;

import es.neesis.calculator.console.ConsoleMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorApplication {

    private ConsoleMenu consola;

    @Autowired
    public CalculatorApplication(ConsoleMenu consola) {
        this.consola = consola;
    }

    public void run(){
        consola.startMenu();
    }
}
