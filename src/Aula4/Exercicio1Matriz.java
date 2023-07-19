package Aula4;

import java.util.Scanner;

public class Exercicio1Matriz {
    public static void main(String[] args) {
        int numAluno = 10;
        int numBimestres = 4;

        float[][] notas = new float[numAluno][numBimestres];
        float[] medias = new float[numAluno];

        Scanner leia = new Scanner(System.in);

       
        for (int i = 0; i < numAluno; i++) {
            System.out.println("Digite as notas do aluno " + (i + 1) + ":");
            for (int j = 0; j < numBimestres; j++) {
                System.out.print("Notas do bimestre " + (j + 1) + ": ");
                notas[i][j] = leia.nextFloat();
            }
        }

       
        for (int i = 0; i < numAluno; i++) {
            double soma = 0;
            for (int j = 0; j < numBimestres; j++) {
                soma = soma + notas[i][j];
            }
            medias[i] = (float) (soma / numBimestres);
        }

        System.out.println("Médias dos participantes:");
        for (int i = 0; i < numAluno; i++) {
            System.out.println("Participante " + (i + 1) + ": " + medias[i]);
        }
    }
}
