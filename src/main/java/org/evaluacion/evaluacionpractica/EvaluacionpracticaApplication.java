package org.evaluacion.evaluacionpractica;

import logical.evaluacion.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EvaluacionpracticaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EvaluacionpracticaApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

    	System.out.print(" ***************Algoritmo busqueda profundidad*************** \n");
    	System.out.print("\n");
    	
        Principal main = new Principal();
        main.buscarenProfundidad(100);
        

    }
}
