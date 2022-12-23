/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydimensaopersonalizadaporusuario;

import java.util.Scanner;

/**
 *
 * @author ph757
 */
public class ArrayDimensaoPersonalizadaPorUsuario {

    /**
     * @param args the command line arguments
     */
    //Array do tamanho que o usuario quiser
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cliente; //Aramazenará a quantidade digitada pelo usuario

        System.out.println("digite um numero: ");//usuarioi digita numero qualquer

        cliente = scan.nextInt();//armazena o numero digitado na variavel usuario

        int[] c = new int[cliente];//array do tamanho digitado pelo usuario

        for (int i = 0; i < c.length; i++) {//percorre o array
            System.out.println(c[i]);
        }

    }

}
