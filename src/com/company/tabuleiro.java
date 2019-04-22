package com.company;

import java.util.Scanner;

public class tabuleiro {
    int win1 = 0;
    int win2 = 0;
    int tamanhoX = 3;
    int TamanhoY = 3;

    String jogador1 = "O";
    String jogador2 = "X";
    String mtz[][] = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

    public String[][] getMtz() {
        return mtz;
    }

    public void setMtz(String[][] mtz) {
        this.mtz = mtz;
    }

    //popular com *
    // joga
    //mostra jogo
    //regra linha
    //regra diagonal

    public void inicializa() {


        System.out.println("inicializando");


        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                mtz[l][c] = "*";
            }
            System.out.println();
        }
    }

    public void mostraJogo() {
        //String mtz[][]={{"*","*"},{"*","*"},{"*","*"}};

        System.out.println("status do jogo atual");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(mtz[l][c] + "    ");
            }
            System.out.println();
        }

    }

    public void joga() {

        while (win1 < 3 || win2 < 3) {

            Scanner jogada = new Scanner(System.in);  // Create a Scanner object
            System.out.println("digite a linha jogador " + jogador1);
            String linhaJ1 = jogada.nextLine();
            //todo verifica se slot vago
            System.out.println("digite a coluna jogador " + jogador1);
            String colunaJ1 = jogada.nextLine();
            testaWin(Integer.parseInt(linhaJ1), Integer.parseInt(colunaJ1), "O");

            //jogador 2

            System.out.println("digite a linha jogador " + jogador2);
            String linhaJ2 = jogada.nextLine();
            //todo verifica se slot vago
            System.out.println("digite a coluna jogador " + jogador2);
            String colunaJ2 = jogada.nextLine();
            testaWin(Integer.parseInt(linhaJ2), Integer.parseInt(colunaJ2), "X");

        }
    }


    public int testaWin(int linhaJ1, int colunaJ1, String jogador) {

        mtz[linhaJ1][colunaJ1] = jogador;
        mostraJogo();
        for (int l = 0; l < 3; l++) {

//todo fazer o mesmo para testar colunas
            if (jogador == "O") {
                if (mtz[l][0] == jogador) {
                    win1 = win1 + 1;
                }
            } else {
                if (mtz[l][0] == jogador) {
                    win2 = win2 + 1;
                }
            }
        }

        if (win1 == 3) {
            System.out.println("vencedor jogador >>> O");
        }
        if (win2 == 3) {
            System.out.println("vencedor jogador >>> X");
        }

        return 0;
    }
}






