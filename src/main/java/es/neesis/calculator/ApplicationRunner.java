package es.neesis.calculator;

import es.neesis.calculator.applications.CalculatorApplication;
import es.neesis.calculator.configuration.AppConfig;
import es.neesis.calculator.console.ConsoleMenu;
import es.neesis.calculator.services.CalculadoraService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CalculatorApplication calculator = context.getBean(CalculatorApplication.class);
        calculator.run();
        System.out.println("--------------------");

    }
}
