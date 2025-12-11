
package br.com.infox.testes;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecutaTestes {

    public static void main(String[] args) {

        Result resultado = JUnitCore.runClasses(
                ModuloConexaoTest.class,
                ClienteDAOTest.class,
                UsuarioDAOTest.class
        );

        System.out.println("======================================");
        System.out.println("Total de testes: " + resultado.getRunCount());
        System.out.println("Falhas:          " + resultado.getFailureCount());
        System.out.println("Ignorados:       " + resultado.getIgnoreCount());
        System.out.println("Tempo (ms):      " + resultado.getRunTime());
        System.out.println("======================================");

        if (!resultado.wasSuccessful()) {
            System.out.println("Falhas detalhadas:");
            for (Failure falha : resultado.getFailures()) {
                System.out.println("- " + falha.getTestHeader());
                System.out.println("  " + falha.getMessage());
                falha.getException().printStackTrace(System.out);
                System.out.println("----------------------------------");
            }
        } else {
            System.out.println(" Todos os testes passaram!");
        }
    }
}

