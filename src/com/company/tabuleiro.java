package com.company;

import java.util.Scanner;

public class tabuleiro {
    int win = 0;

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


        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(mtz[l][c] + "    ");
            }
            System.out.println();
        }

    }

    public void joga() {

        while (0 == 0) {

            Scanner jogada = new Scanner(System.in);  // Create a Scanner object
            System.out.println("digite a linha jogador " + jogador1);
            String linhaJ1 = jogada.nextLine();
            //todo verifica se slot vago
            System.out.println("digite a coluna jogador " + jogador1);
            String colunaJ1 = jogada.nextLine();

            testaWin(Integer.parseInt(linhaJ1), Integer.parseInt(colunaJ1));
        }
    }


    public int testaWin(int linhaJ1, int colunaJ1) {

        mtz[linhaJ1][colunaJ1] = "O";


        for (int l = 0; l < 3; l++) {

//todo fazer o mesmo para testar colunas
            if (mtz[l][0] == "O") {
                win = win + 1;
            }
            if (win == 3) {
                System.out.println("vencedor");
                boolean stat = true;
            }

        }

        return 0;
    }
}






