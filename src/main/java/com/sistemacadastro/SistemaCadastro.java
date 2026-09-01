/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sistemacadastro;

import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class SistemaCadastro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== Sistema de Cadastro ===");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Listar Usuários");
            System.out.println("3 - Deletar Usuário");
            System.out.println("0 – Sair");
            System.out.print("Escolha uma Opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("=== Cadastrar Usuário ===");
                    break;
                case 2:
                    System.out.println("=== Listar Usuários ===");
                    break;
                case 3:
                System.out.println("=== Deletar Usuário ===");
                    break;
                case 0:
                    System.out.println("Fechando Sistema");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
