/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sorteioaleatorios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class SorteioAleatorios {

    public static void main(String[] args) {
        int escolha = 0, valor = 0;
        Random aleatorio = new Random();
        valor = aleatorio.nextInt(100);
        do {

            System.out.println("Escolha um numero:");
            Scanner scanner = new Scanner(System.in);
            escolha = scanner.nextInt();
            if (escolha == valor) {
                System.out.println("Você acertou parabéns!!");
            } else if (escolha > valor) {
                System.out.println("O número sorteado é menor que o digitado!");
            } else {
                System.out.println("O número sorteado é maior que o digitado!");
            }
        } while (escolha != valor);
    }
}
