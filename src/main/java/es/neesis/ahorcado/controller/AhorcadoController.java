package es.neesis.ahorcado.controller;

import es.neesis.ahorcado.game.AhorcadoGame;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class AhorcadoController {

    private final String palabras[] = {"GATO", "COCHE", "ORDENADOR", "TECLADO"};

    private AhorcadoGame juego;

    public void iniciarJuego() {
        Scanner scanner = new Scanner(System.in);

        juego = new AhorcadoGame();

        while (juego.getIntentosRestantes() > 0 && !juego.isJuegoTerminado()) {
            System.out.println("Palabra: " + juego.getPalabraDescubierta());
            System.out.println("Intentos restantes: " + juego.getIntentosRestantes());

            System.out.print("Introduce una letra: ");
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.length() == 1) {
                juego.adivinarLetra(input.charAt(0));
            } else if (input.length() > 1) {
                juego.adivinarPalabra(input);
            }
        }

        if (juego.isJuegoGanado()) {
            System.out.println("¡Felicidades! Has ganado. La palabra es: " + juego.getPalabraDescubierta());
        } else {
            System.out.println("Lo siento, has perdido. La palabra era: " + juego.getPalabraDescubrir());
        }
    }
}