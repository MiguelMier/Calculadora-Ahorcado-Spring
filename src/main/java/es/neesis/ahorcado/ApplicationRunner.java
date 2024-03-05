package es.neesis.ahorcado;

import es.neesis.ahorcado.applications.AhorcadoApplication;
import es.neesis.ahorcado.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AhorcadoApplication ahorcado = context.getBean(AhorcadoApplication.class);
        ahorcado.iniciarJuego();

    }
}
