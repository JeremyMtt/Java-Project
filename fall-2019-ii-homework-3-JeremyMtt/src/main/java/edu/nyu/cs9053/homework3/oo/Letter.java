package edu.nyu.cs9053.homework3.oo;

import java.io.*;

public class Letter{
    private final char[][] ASCIIART;
    private final PrintStream ps;

    public Letter(String ascii){
	ASCIIART = new char[10][20];
	ps = new PrintStream((OutputStream)(System.out));
	for(int i=0;i<10;i++){
	    for(int j=0;j<20;j++){
		ASCIIART[i][j]=' ';
	    }
	}
	switch(ascii){
	case "0":
	    ASCIIART[0][11] = '0';
            ASCIIART[0][10] = '0';
            ASCIIART[0][8] = '0';
            ASCIIART[0][9] = '0';
            ASCIIART[1][7] = '0';
            ASCIIART[1][12] = '0';
            ASCIIART[2][6] = '0';
            ASCIIART[2][13] = '0';
            ASCIIART[3][5] = '0';
	    ASCIIART[3][14] = '0';
	    ASCIIART[4][5] = '0';
	    ASCIIART[4][14] = '0';
	    ASCIIART[5][5] = '0';
	    ASCIIART[5][14] = '0';
	    ASCIIART[6][5] = '0';
	    ASCIIART[6][14] = '0';
	    ASCIIART[7][6] = '0';
	    ASCIIART[7][13] = '0';
	    ASCIIART[8][7] = '0';
	    ASCIIART[8][12] = '0';
	    ASCIIART[9][10] = '0';
	    ASCIIART[9][8] = '0';
	    ASCIIART[9][9] = '0';
	    ASCIIART[9][11] = '0';
	    break;
	    
	case "1":
	    ASCIIART[0][9] = '1';
	    ASCIIART[0][10] = '1';
	    ASCIIART[1][10] = '1';
	    ASCIIART[2][10] = '1';
	    ASCIIART[3][10] = '1';
	    ASCIIART[4][10] = '1';
	    ASCIIART[5][10] = '1';
	    ASCIIART[6][10] = '1';
	    ASCIIART[7][10] = '1';
	    ASCIIART[8][10] = '1';
	    ASCIIART[9][7] = '1';
	    ASCIIART[9][8] = '1';
	    ASCIIART[9][9] = '1';
	    ASCIIART[9][10] = '1';
	    ASCIIART[9][11] = '1';
	    ASCIIART[9][12] = '1';
	    ASCIIART[9][13] = '1';
	    break;

	case "2":
	    ASCIIART[0][11] = '2';
	    ASCIIART[0][10] = '2';
	    ASCIIART[1][8] = '2';
	    ASCIIART[1][13] = '2';
	    ASCIIART[2][6] = '2';
	    ASCIIART[2][15] = '2';
	    ASCIIART[3][5] = '2';
	    ASCIIART[3][16] = '2';
	    ASCIIART[4][15] = '2';
	    ASCIIART[5][13] = '2';
	    ASCIIART[6][11] = '2';
	    ASCIIART[7][9] = '2';
	    ASCIIART[8][7] = '2';
	    ASCIIART[9][5] = '2';
	    ASCIIART[9][6] = '2';
	    ASCIIART[9][7] = '2';
	    ASCIIART[9][8] = '2';
	    ASCIIART[9][9] = '2';
	    ASCIIART[9][10] = '2';
	    ASCIIART[9][11] = '2';
	    ASCIIART[9][12] = '2';
	    ASCIIART[9][13] = '2';
	    ASCIIART[9][14] = '2';
	    ASCIIART[9][15] = '2';
	    ASCIIART[9][16] = '2';
	    break;
	    
	case "3":
	    ASCIIART[0][8] = '3';
	    ASCIIART[0][9] = '3';
	    ASCIIART[0][10] = '3';
	    ASCIIART[0][11] = '3';
	    ASCIIART[0][12] = '3';
	    ASCIIART[0][13] = '3';
	    ASCIIART[0][7] = '3';
	    ASCIIART[1][6] = '3';
	    ASCIIART[1][14] = '3';
	    ASCIIART[2][12] = '3';
	    ASCIIART[3][10] = '3';
	    ASCIIART[4][8] = '3';
	    ASCIIART[4][9] = '3';
	    ASCIIART[5][9] = '3';
	    ASCIIART[6][10] = '3';
	    ASCIIART[7][12] = '3';
	    ASCIIART[8][14] = '3';
	    ASCIIART[8][6] = '3';
	    ASCIIART[9][9] = '3';
	    ASCIIART[9][10] = '3';
	    ASCIIART[9][11] = '3';
	    ASCIIART[9][12] = '3';
	    ASCIIART[9][13] = '3';
	    ASCIIART[9][8] = '3';
	    ASCIIART[9][7] = '3';
	    break;

	case "4":
	    ASCIIART[0][10] = '4';
	    ASCIIART[1][9] = '4';
	    ASCIIART[1][10] = '4';
	    ASCIIART[2][8] = '4';
	    ASCIIART[2][10] = '4';
	    ASCIIART[3][10] = '4';
	    ASCIIART[3][7] = '4';
	    ASCIIART[4][6] = '4';
	    ASCIIART[4][10] = '4';
	    ASCIIART[5][10] = '4';
	    ASCIIART[5][5] = '4';
	    ASCIIART[6][4] = '4';
	    ASCIIART[6][5] = '4';
	    ASCIIART[6][6] = '4';
	    ASCIIART[6][7] = '4';
	    ASCIIART[6][8] = '4';
	    ASCIIART[6][9] = '4';
	    ASCIIART[6][10] = '4';
	    ASCIIART[6][11] = '4';
	    ASCIIART[6][12] = '4';
	    ASCIIART[6][13] = '4';
	    ASCIIART[6][14] = '4';
	    ASCIIART[7][10] = '4';
	    ASCIIART[8][10] = '4';
	    ASCIIART[9][10] = '4';
	    break;

	case "5":
	    ASCIIART[0][8] = '5';
	    ASCIIART[0][9] = '5';
	    ASCIIART[0][10] = '5';
	    ASCIIART[0][11] = '5';
	    ASCIIART[0][12] = '5';
	    ASCIIART[0][13] = '5';
	    ASCIIART[1][7] = '5';
	    ASCIIART[2][7] = '5';
	    ASCIIART[3][7] = '5';
	    ASCIIART[4][7] = '5';
	    ASCIIART[5][13] = '5';
	    ASCIIART[4][8] = '5';
	    ASCIIART[4][9] = '5';
	    ASCIIART[4][10] = '5';
	    ASCIIART[4][11] = '5';
	    ASCIIART[4][12] = '5';
	    ASCIIART[6][14] = '5';
	    ASCIIART[7][14] = '5';
	    ASCIIART[8][13] = '5';
	    ASCIIART[9][12] = '5';
	    ASCIIART[9][11] = '5';
	    ASCIIART[9][10] = '5';
	    ASCIIART[9][9] = '5';
	    ASCIIART[9][8] = '5';
	    ASCIIART[9][7] = '5';
	    break;
	    
	case "6":
	    ASCIIART[0][8] = '6';
	    ASCIIART[0][10] = '6';
	    ASCIIART[0][7] = '6';
	    ASCIIART[0][9] = '6';
	    ASCIIART[1][6] = '6';
	    ASCIIART[2][5] = '6';
	    ASCIIART[3][4] = '6';
	    ASCIIART[4][4] = '6';
	    ASCIIART[4][5] = '6';
	    ASCIIART[4][6] = '6';
	    ASCIIART[4][7] = '6';
	    ASCIIART[4][8] = '6';
	    ASCIIART[4][9] = '6';
	    ASCIIART[5][3] = '6';
	    ASCIIART[5][10] = '6';
	    ASCIIART[6][11] = '6';
	    ASCIIART[6][2] = '6';
	    ASCIIART[7][3] = '6';
	    ASCIIART[7][10] = '6';
	    ASCIIART[8][9] = '6';
	    ASCIIART[8][4] = '6';
	    ASCIIART[9][4] = '6';
	    ASCIIART[9][5] = '6';
	    ASCIIART[9][6] = '6';
	    ASCIIART[9][7] = '6';
	    ASCIIART[9][8] = '6';
	    ASCIIART[9][9] = '6';
	    break;

	case "7":
	    ASCIIART[0][3] = '7';
	    ASCIIART[0][4] = '7';
	    ASCIIART[0][5] = '7';
	    ASCIIART[0][6] = '7';
	    ASCIIART[0][7] = '7';
	    ASCIIART[0][8] = '7';
	    ASCIIART[0][10] = '7';
	    ASCIIART[0][11] = '7';
	    ASCIIART[0][9] = '7';
	    ASCIIART[0][2] = '7';
	    ASCIIART[1][10] = '7';
	    ASCIIART[2][9] = '7';
	    ASCIIART[3][8] = '7';
	    ASCIIART[4][7] = '7';
	    ASCIIART[5][6] = '7';
	    ASCIIART[6][5] = '7';
	    ASCIIART[7][4] = '7';
	    ASCIIART[8][3] = '7';
	    ASCIIART[9][2] = '7';
	    break;

	case "8":
	    ASCIIART[0][10] = '8';
	    ASCIIART[0][11] = '8';
	    ASCIIART[0][12] = '8';
	    ASCIIART[0][9] = '8';
	    ASCIIART[1][8] = '8';
	    ASCIIART[1][13] = '8';
	    ASCIIART[2][8] = '8';
	    ASCIIART[2][13] = '8';
	    ASCIIART[3][8] = '8';
	    ASCIIART[3][13] = '8';
	    ASCIIART[4][9] = '8';
	    ASCIIART[4][10] = '8';
	    ASCIIART[4][11] = '8';
	    ASCIIART[4][12] = '8';
	    ASCIIART[5][8] = '8';
	    ASCIIART[5][13] = '8';
	    ASCIIART[6][8] = '8';
	    ASCIIART[6][13] = '8';
	    ASCIIART[7][8] = '8';
	    ASCIIART[7][13] = '8';
	    ASCIIART[8][8] = '8';
	    ASCIIART[8][13] = '8';
	    ASCIIART[9][10] = '8';
	    ASCIIART[9][11] = '8';
	    ASCIIART[9][12] = '8';
	    ASCIIART[9][9] = '8';
	    break;

	case "9":
	    ASCIIART[0][10] = '9';
	    ASCIIART[0][11] = '9';
	    ASCIIART[0][12] = '9';
	    ASCIIART[0][9] = '9';
	    ASCIIART[1][8] = '9';
	    ASCIIART[1][13] = '9';
	    ASCIIART[2][7] = '9';
	    ASCIIART[2][14] = '9';
	    ASCIIART[3][8] = '9';
	    ASCIIART[3][13] = '9';
	    ASCIIART[4][9] = '9';
	    ASCIIART[4][10] = '9';
	    ASCIIART[4][11] = '9';
	    ASCIIART[4][12] = '9';
	    ASCIIART[5][12] = '9';
	    ASCIIART[6][11] = '9';
	    ASCIIART[7][10] = '9';
	    ASCIIART[8][9] = '9';
	    ASCIIART[9][7] = '9';
	    ASCIIART[9][8] = '9';
	    break;

	case "A":
	    ASCIIART[0][9] = 'A';
	    ASCIIART[1][8] = 'A';
	    ASCIIART[1][10] = 'A';
	    ASCIIART[2][7] = 'A';
	    ASCIIART[2][11] = 'A';
	    ASCIIART[3][6] = 'A';
	    ASCIIART[3][12] = 'A';
	    ASCIIART[4][5] = 'A';
	    ASCIIART[4][13] = 'A';
	    ASCIIART[5][4] = 'A';
	    ASCIIART[5][7] = 'A';
	    ASCIIART[5][8] = 'A';
	    ASCIIART[5][9] = 'A';
	    ASCIIART[5][10] = 'A';
	    ASCIIART[5][11] = 'A';
	    ASCIIART[5][12] = 'A';
	    ASCIIART[5][13] = 'A';
	    ASCIIART[5][14] = 'A';
	    ASCIIART[5][15] = 'A';
	    ASCIIART[5][6] = 'A';
	    ASCIIART[5][5] = 'A';
	    ASCIIART[6][3] = 'A';
	    ASCIIART[6][15] = 'A';
	    ASCIIART[7][2] = 'A';
	    ASCIIART[7][16] = 'A';
	    ASCIIART[8][17] = 'A';
	    ASCIIART[8][1] = 'A';
	    ASCIIART[9][0] = 'A';
	    ASCIIART[9][18] = 'A';
	    break;

	case "B":
	    ASCIIART[0][10] = 'B';
	    ASCIIART[0][12] = 'B';
	    ASCIIART[1][9] = 'B';
	    ASCIIART[1][14] = 'B';
	    ASCIIART[2][9] = 'B';
	    ASCIIART[2][14] = 'B';
	    ASCIIART[3][9] = 'B';
	    ASCIIART[3][12] = 'B';
	    ASCIIART[4][9] = 'B';
	    ASCIIART[4][14] = 'B';
	    ASCIIART[5][9] = 'B';
	    ASCIIART[5][15] = 'B';
	    ASCIIART[6][9] = 'B';
	    ASCIIART[6][16] = 'B';
	    ASCIIART[7][9] = 'B';
	    ASCIIART[7][15] = 'B';
	    ASCIIART[8][9] = 'B';
	    ASCIIART[8][14] = 'B';
	    ASCIIART[9][9] = 'B';
	    ASCIIART[9][11] = 'B';
	    break;

	case "C":
	    ASCIIART[0][10] = 'C';
	    ASCIIART[0][11] = 'C';
	    ASCIIART[1][8] = 'C';
	    ASCIIART[2][7] = 'C';
	    ASCIIART[3][6] = 'C';
	    ASCIIART[4][5] = 'C';
	    ASCIIART[5][5] = 'C';
	    ASCIIART[6][6] = 'C';
	    ASCIIART[7][7] = 'C';
	    ASCIIART[8][8] = 'C';
	    ASCIIART[9][9] = 'C';
	    ASCIIART[9][10] = 'C';
	    break;

	case "D":
	    ASCIIART[0][10] = 'D';
	    ASCIIART[0][11] = 'D';
	    ASCIIART[1][12] = 'D';
	    ASCIIART[1][9] = 'D';
	    ASCIIART[2][9] = 'D';
	    ASCIIART[2][13] = 'D';
	    ASCIIART[3][9] = 'D';
	    ASCIIART[3][14] = 'D';
	    ASCIIART[4][9] = 'D';
	    ASCIIART[4][15] = 'D';
	    ASCIIART[5][9] = 'D';
	    ASCIIART[5][15] = 'D';
	    ASCIIART[6][9] = 'D';
	    ASCIIART[6][14] = 'D';
	    ASCIIART[7][9] = 'D';
	    ASCIIART[7][13] = 'D';
	    ASCIIART[8][9] = 'D';
	    ASCIIART[8][12] = 'D';
	    ASCIIART[9][9] = 'D';
	    ASCIIART[9][10] = 'D';
	    break;

	case "E":
	    ASCIIART[0][10] = 'E';
	    ASCIIART[0][11] = 'E';
	    ASCIIART[0][12] = 'E';
	    ASCIIART[0][9] = 'E';
	    ASCIIART[0][13] = 'E';
	    ASCIIART[0][8] = 'E';
	    ASCIIART[1][8] = 'E';
	    ASCIIART[2][8] = 'E';
	    ASCIIART[3][8] = 'E';
	    ASCIIART[4][10] = 'E';
	    ASCIIART[4][11] = 'E';
	    ASCIIART[4][12] = 'E';
	    ASCIIART[4][8] = 'E';
	    ASCIIART[4][13] = 'E';
	    ASCIIART[4][9] = 'E';
	    ASCIIART[5][8] = 'E';
	    ASCIIART[6][8] = 'E';
	    ASCIIART[7][8] = 'E';
	    ASCIIART[8][8] = 'E';
	    ASCIIART[9][10] = 'E';
	    ASCIIART[9][11] = 'E';
	    ASCIIART[9][12] = 'E';
	    ASCIIART[9][8] = 'E';
	    ASCIIART[9][13] = 'E';
	    ASCIIART[9][9] = 'E';
	    break;

	case "F":
	    ASCIIART[0][10] = 'F';
	    ASCIIART[0][11] = 'F';
	    ASCIIART[0][12] = 'F';
	    ASCIIART[0][9] = 'F';
	    ASCIIART[0][13] = 'F';
	    ASCIIART[0][8] = 'F';
	    ASCIIART[1][8] = 'F';
	    ASCIIART[2][8] = 'F';
	    ASCIIART[3][8] = 'F';
	    ASCIIART[4][10] = 'F';
	    ASCIIART[4][11] = 'F';
	    ASCIIART[4][12] = 'F';
	    ASCIIART[4][8] = 'F';
	    ASCIIART[4][13] = 'F';
	    ASCIIART[4][9] = 'F';
	    ASCIIART[5][8] = 'F';
	    ASCIIART[6][8] = 'F';
	    ASCIIART[7][8] = 'F';
	    ASCIIART[8][8] = 'F';
	    ASCIIART[9][8] = 'F';
	    break;

	case "G":
	    ASCIIART[0][10] = 'G';
	    ASCIIART[0][11] = 'G';
	    ASCIIART[0][12] = 'G';
	    ASCIIART[1][8] = 'G';
	    ASCIIART[2][7] = 'G';
	    ASCIIART[3][6] = 'G';
	    ASCIIART[4][6] = 'G';
	    ASCIIART[5][6] = 'G';
	    ASCIIART[5][13] = 'G';
	    ASCIIART[6][13] = 'G';
	    ASCIIART[6][7] = 'G';
	    ASCIIART[7][8] = 'G';
	    ASCIIART[7][13] = 'G';
	    ASCIIART[8][9] = 'G';
	    ASCIIART[8][13] = 'G';
	    ASCIIART[9][10] = 'G';
	    ASCIIART[9][11] = 'G';
	    break;

	case "H":
	    ASCIIART[0][9] = 'H';
	    ASCIIART[0][14] = 'H';
	    ASCIIART[1][9] = 'H';
	    ASCIIART[1][14] = 'H';
	    ASCIIART[2][9] = 'H';
	    ASCIIART[2][14] = 'H';
	    ASCIIART[3][9] = 'H';
	    ASCIIART[3][14] = 'H';
	    ASCIIART[4][9] = 'H';
	    ASCIIART[4][14] = 'H';
	    ASCIIART[4][11] = 'H';
	    ASCIIART[4][12] = 'H';
	    ASCIIART[4][13] = 'H';
	    ASCIIART[4][10] = 'H';
	    ASCIIART[5][9] = 'H';
	    ASCIIART[5][14] = 'H';
	    ASCIIART[6][9] = 'H';
	    ASCIIART[6][14] = 'H';
	    ASCIIART[7][9] = 'H';
	    ASCIIART[7][14] = 'H';
	    ASCIIART[8][9] = 'H';
	    ASCIIART[8][14] = 'H';
	    ASCIIART[9][9] = 'H';
	    ASCIIART[9][14] = 'H';
	    break;

	case "I":
	    ASCIIART[0][10] = 'I';
	    ASCIIART[0][9] = 'I';
	    ASCIIART[0][8] = 'I';
	    ASCIIART[1][9] = 'I';
	    ASCIIART[2][9] = 'I';
	    ASCIIART[3][9] = 'I';
	    ASCIIART[4][9] = 'I';
	    ASCIIART[5][9] = 'I';
	    ASCIIART[6][9] = 'I';
	    ASCIIART[7][9] = 'I';
	    ASCIIART[8][9] = 'I';
	    ASCIIART[9][8] = 'I';
	    ASCIIART[9][10] = 'I';
	    ASCIIART[9][9] = 'I';
	    break;

	case "J":
	    ASCIIART[0][10] = 'J';
	    ASCIIART[0][9] = 'J';
	    ASCIIART[0][8] = 'J';
	    ASCIIART[1][9] = 'J';
	    ASCIIART[2][9] = 'J';
	    ASCIIART[3][9] = 'J';
	    ASCIIART[4][9] = 'J';
	    ASCIIART[5][9] = 'J';
	    ASCIIART[6][9] = 'J';
	    ASCIIART[7][9] = 'J';
	    ASCIIART[8][9] = 'J';
	    ASCIIART[8][6] = 'J';
	    ASCIIART[9][8] = 'J';
	    ASCIIART[9][6] = 'J';
	    break;

	case "K":
	    ASCIIART[0][9] = 'K';
	    ASCIIART[0][14] = 'K';
	    ASCIIART[1][9] = 'K';
	    ASCIIART[1][13] = 'K';
	    ASCIIART[2][9] = 'K';
	    ASCIIART[2][12] = 'K';
	    ASCIIART[3][9] = 'K';
	    ASCIIART[3][11] = 'K';
	    ASCIIART[4][9] = 'K';
	    ASCIIART[5][9] = 'K';
	    ASCIIART[5][11] = 'K';
	    ASCIIART[6][9] = 'K';
	    ASCIIART[6][12] = 'K';
	    ASCIIART[7][9] = 'K';
	    ASCIIART[7][13] = 'K';
	    ASCIIART[8][9] = 'K';
	    ASCIIART[8][14] = 'K';
	    ASCIIART[9][9] = 'K';
	    ASCIIART[9][15] = 'K';
	    break;

	case "L":
	    ASCIIART[0][9] = 'L';
	    ASCIIART[1][9] = 'L';
	    ASCIIART[2][9] = 'L';
	    ASCIIART[3][9] = 'L';
	    ASCIIART[4][9] = 'L';
	    ASCIIART[5][9] = 'L';
	    ASCIIART[6][9] = 'L';
	    ASCIIART[7][9] = 'L';
	    ASCIIART[8][9] = 'L';
	    ASCIIART[9][9] = 'L';
	    ASCIIART[9][10] = 'L';
	    ASCIIART[9][12] = 'L';
	    ASCIIART[9][13] = 'L';
	    ASCIIART[9][11] = 'L';
	    break;

	case "M":
	    ASCIIART[0][7] = 'M';
	    ASCIIART[0][17] = 'M';
	    ASCIIART[1][7] = 'M';
	    ASCIIART[1][17] = 'M';
	    ASCIIART[1][13] = 'M';
	    ASCIIART[1][10] = 'M';
	    ASCIIART[2][7] = 'M';
	    ASCIIART[2][12] = 'M';
	    ASCIIART[2][17] = 'M';
	    ASCIIART[3][7] = 'M';
	    ASCIIART[3][17] = 'M';
	    ASCIIART[4][7] = 'M';
	    ASCIIART[4][17] = 'M';
	    ASCIIART[5][7] = 'M';
	    ASCIIART[5][17] = 'M';
	    ASCIIART[6][7] = 'M';
	    ASCIIART[6][17] = 'M';
	    ASCIIART[7][7] = 'M';
	    ASCIIART[7][17] = 'M';
	    ASCIIART[8][7] = 'M';
	    ASCIIART[8][17] = 'M';
	    ASCIIART[9][7] = 'M';
	    ASCIIART[9][17] = 'M';
	    break;

	case "N":
	    ASCIIART[0][4] = 'N';
	    ASCIIART[0][13] = 'N';
	    ASCIIART[1][4] = 'N';
	    ASCIIART[1][5] = 'N';
	    ASCIIART[1][13] = 'N';
	    ASCIIART[2][4] = 'N';
	    ASCIIART[2][6] = 'N';
	    ASCIIART[2][13] = 'N';
	    ASCIIART[3][4] = 'N';
	    ASCIIART[3][7] = 'N';
	    ASCIIART[3][13] = 'N';
	    ASCIIART[4][4] = 'N';
	    ASCIIART[4][8] = 'N';
	    ASCIIART[4][13] = 'N';
	    ASCIIART[5][4] = 'N';
	    ASCIIART[5][9] = 'N';
	    ASCIIART[5][13] = 'N';
	    ASCIIART[6][4] = 'N';
	    ASCIIART[6][10] = 'N';
	    ASCIIART[6][13] = 'N';
	    ASCIIART[7][4] = 'N';
	    ASCIIART[7][11] = 'N';
	    ASCIIART[7][13] = 'N';
	    ASCIIART[8][4] = 'N';
	    ASCIIART[8][12] = 'N';
	    ASCIIART[8][13] = 'N';
	    ASCIIART[9][4] = 'N';
	    ASCIIART[9][13] = 'N';
	    break;

	case "O":
	    ASCIIART[0][9] = 'O';
	    ASCIIART[0][10] = 'O';
	    ASCIIART[1][7] = 'O';
	    ASCIIART[1][12] = 'O';
	    ASCIIART[2][6] = 'O';
	    ASCIIART[2][13] = 'O';
	    ASCIIART[3][5] = 'O';
	    ASCIIART[3][14] = 'O';
	    ASCIIART[4][5] = 'O';
	    ASCIIART[4][14] = 'O';
	    ASCIIART[5][5] = 'O';
	    ASCIIART[5][14] = 'O';
	    ASCIIART[6][5] = 'O';
	    ASCIIART[6][14] = 'O';
	    ASCIIART[7][6] = 'O';
	    ASCIIART[7][13] = 'O';
	    ASCIIART[8][7] = 'O';
	    ASCIIART[8][12] = 'O';
	    ASCIIART[9][9] = 'O';
	    ASCIIART[9][10] = 'O';
	    break;

	case "P":
	    ASCIIART[0][9] = 'P';
	    ASCIIART[0][10] = 'P';
	    ASCIIART[1][9] = 'P';
	    ASCIIART[1][11] = 'P';
	    ASCIIART[2][9] = 'P';
	    ASCIIART[2][12] = 'P';
	    ASCIIART[3][9] = 'P';
	    ASCIIART[3][12] = 'P';
	    ASCIIART[4][9] = 'P';
	    ASCIIART[4][11] = 'P';
	    ASCIIART[5][9] = 'P';
	    ASCIIART[6][9] = 'P';
	    ASCIIART[7][9] = 'P';
	    ASCIIART[8][9] = 'P';
	    ASCIIART[9][9] = 'P';
	    break;

	case "Q":
	    ASCIIART[0][11] = 'Q';
	    ASCIIART[0][10] = 'Q';
	    ASCIIART[0][9] = 'Q';
	    ASCIIART[1][7] = 'Q';
	    ASCIIART[1][13] = 'Q';
	    ASCIIART[2][6] = 'Q';
	    ASCIIART[2][14] = 'Q';
	    ASCIIART[3][4] = 'Q';
	    ASCIIART[3][16] = 'Q';
	    ASCIIART[4][4] = 'Q';
	    ASCIIART[4][16] = 'Q';
	    ASCIIART[5][4] = 'Q';
	    ASCIIART[5][16] = 'Q';
	    ASCIIART[6][4] = 'Q';
	    ASCIIART[6][16] = 'Q';
	    ASCIIART[8][13] = 'Q';
	    ASCIIART[8][6] = 'Q';
	    ASCIIART[7][5] = 'Q';
	    ASCIIART[7][12] = 'Q';
	    ASCIIART[7][13] = 'Q';
	    ASCIIART[9][7] = 'Q';
	    ASCIIART[9][10] = 'Q';
	    ASCIIART[9][9] = 'Q';
	    ASCIIART[9][11] = 'Q';
	    ASCIIART[9][16] = 'Q';
	    break;

	case "R":
	    ASCIIART[0][10] = 'R';
	    ASCIIART[0][11] = 'R';
	    ASCIIART[1][9] = 'R';
	    ASCIIART[1][12] = 'R';
	    ASCIIART[2][9] = 'R';
	    ASCIIART[2][13] = 'R';
	    ASCIIART[3][9] = 'R';
	    ASCIIART[3][14] = 'R';
	    ASCIIART[4][9] = 'R';
	    ASCIIART[4][13] = 'R';
	    ASCIIART[5][9] = 'R';
	    ASCIIART[5][12] = 'R';
	    ASCIIART[6][9] = 'R';
	    ASCIIART[6][11] = 'R';
	    ASCIIART[7][9] = 'R';
	    ASCIIART[7][12] = 'R';
	    ASCIIART[8][9] = 'R';
	    ASCIIART[8][13] = 'R';
	    ASCIIART[9][9] = 'R';
	    ASCIIART[9][14] = 'R';
	    break;

	case "S":
	    ASCIIART[0][10] = 'S';
	    ASCIIART[0][11] = 'S';
	    ASCIIART[1][8] = 'S';
	    ASCIIART[1][12] = 'S';
	    ASCIIART[2][7] = 'S';
	    ASCIIART[2][13] = 'S';
	    ASCIIART[3][6] = 'S';
	    ASCIIART[4][7] = 'S';
	    ASCIIART[5][10] = 'S';
	    ASCIIART[6][11] = 'S';
	    ASCIIART[7][7] = 'S';
	    ASCIIART[7][12] = 'S';
	    ASCIIART[8][8] = 'S';
	    ASCIIART[8][13] = 'S';
	    ASCIIART[9][9] = 'S';
	    ASCIIART[9][10] = 'S';
	    break;

	case "T":
	    ASCIIART[0][10] = 'T';
	    ASCIIART[0][9] = 'T';
	    ASCIIART[0][8] = 'T';
	    ASCIIART[1][9] = 'T';
	    ASCIIART[2][9] = 'T';
	    ASCIIART[3][9] = 'T';
	    ASCIIART[4][9] = 'T';
	    ASCIIART[5][9] = 'T';
	    ASCIIART[6][9] = 'T';
	    ASCIIART[7][9] = 'T';
	    ASCIIART[8][9] = 'T';
	    ASCIIART[9][9] = 'T';
	    break;

	case "U":
	    ASCIIART[0][9] = 'U';
	    ASCIIART[0][14] = 'U';
	    ASCIIART[1][9] = 'U';
	    ASCIIART[1][14] = 'U';
	    ASCIIART[2][9] = 'U';
	    ASCIIART[2][14] = 'U';
	    ASCIIART[3][9] = 'U';
	    ASCIIART[3][14] = 'U';
	    ASCIIART[4][9] = 'U';
	    ASCIIART[4][14] = 'U';
	    ASCIIART[9][10] = 'U';
	    ASCIIART[5][9] = 'U';
	    ASCIIART[5][14] = 'U';
	    ASCIIART[6][9] = 'U';
	    ASCIIART[6][14] = 'U';
	    ASCIIART[7][9] = 'U';
	    ASCIIART[7][14] = 'U';
	    ASCIIART[8][9] = 'U';
	    ASCIIART[8][14] = 'U';
	    ASCIIART[9][9] = 'U';
	    ASCIIART[9][12] = 'U';
	    ASCIIART[9][13] = 'U';
	    ASCIIART[9][10] = 'U';
	    ASCIIART[9][11] = 'U';
	    break;

	case "V":
	    ASCIIART[0][0] = 'V';
	    ASCIIART[0][17] = 'V';
	    ASCIIART[1][1] = 'V';
	    ASCIIART[1][16] = 'V';
	    ASCIIART[2][1] = 'V';
	    ASCIIART[2][15] = 'V';
	    ASCIIART[3][2] = 'V';
	    ASCIIART[3][14] = 'V';
	    ASCIIART[4][3] = 'V';
	    ASCIIART[4][13] = 'V';
	    ASCIIART[5][4] = 'V';
	    ASCIIART[5][12] = 'V';
	    ASCIIART[6][5] = 'V';
	    ASCIIART[6][11] = 'V';
	    ASCIIART[7][6] = 'V';
	    ASCIIART[7][10] = 'V';
	    ASCIIART[8][7] = 'V';
	    ASCIIART[8][9] = 'V';
	    ASCIIART[9][8] = 'V';
	    break;

	case "W":
	    ASCIIART[9][7] = 'W';
	    ASCIIART[9][15] = 'W';
	    ASCIIART[8][7] = 'W';
	    ASCIIART[8][15] = 'W';
	    ASCIIART[8][9] = 'W';
	    ASCIIART[8][13] = 'W';
	    ASCIIART[7][7] = 'W';
	    ASCIIART[7][11] = 'W';
	    ASCIIART[7][15] = 'W';
	    ASCIIART[6][7] = 'W';
	    ASCIIART[6][17] = 'W';
	    ASCIIART[5][7] = 'W';
	    ASCIIART[5][17] = 'W';
	    ASCIIART[4][7] = 'W';
	    ASCIIART[4][17] = 'W';
	    ASCIIART[3][7] = 'W';
	    ASCIIART[3][17] = 'W';
	    ASCIIART[2][7] = 'W';
	    ASCIIART[2][17] = 'W';
	    ASCIIART[1][7] = 'W';
	    ASCIIART[1][17] = 'W';
	    ASCIIART[0][7] = 'W';
	    ASCIIART[0][17] = 'W';
	    break;

	case "X":
	    ASCIIART[0][1] = 'X';
	    ASCIIART[0][9] = 'X';
	    ASCIIART[1][2] = 'X';
	    ASCIIART[1][8] = 'X';
	    ASCIIART[2][3] = 'X';
	    ASCIIART[2][7] = 'X';
	    ASCIIART[3][4] = 'X';
	    ASCIIART[3][6] = 'X';
	    ASCIIART[4][5] = 'X';
	    ASCIIART[5][4] = 'X';
	    ASCIIART[5][6] = 'X';
	    ASCIIART[6][3] = 'X';
	    ASCIIART[6][7] = 'X';
	    ASCIIART[7][2] = 'X';
	    ASCIIART[7][8] = 'X';
	    ASCIIART[8][1] = 'X';
	    ASCIIART[8][9] = 'X';
	    ASCIIART[9][10] = 'X';
	    ASCIIART[9][0] = 'X';
	    break;

	case "Y":
	    ASCIIART[0][1] = 'Y';
	    ASCIIART[0][8] = 'Y';
	    ASCIIART[1][2] = 'Y';
	    ASCIIART[1][7] = 'Y';
	    ASCIIART[2][3] = 'Y';
	    ASCIIART[2][6] = 'Y';
	    ASCIIART[3][4] = 'Y';
	    ASCIIART[3][6] = 'Y';
	    ASCIIART[4][5] = 'Y';
	    ASCIIART[5][5] = 'Y';
	    ASCIIART[6][5] = 'Y';
	    ASCIIART[7][5] = 'Y';
	    ASCIIART[8][5] = 'Y';
	    ASCIIART[9][5] = 'Y';
	    break;

	case "Z":
	    ASCIIART[0][15] = 'Z';
	    ASCIIART[0][14] = 'Z';
	    ASCIIART[0][13] = 'Z';
      	    ASCIIART[0][10] = 'Z';
	    ASCIIART[0][9] = 'Z';
       	    ASCIIART[0][12] = 'Z';
	    ASCIIART[0][11] = 'Z';
	    ASCIIART[1][15] = 'Z';
	    ASCIIART[2][14] = 'Z';
	    ASCIIART[3][13] = 'Z';
	    ASCIIART[4][12] = 'Z';
	    ASCIIART[5][11] = 'Z';
	    ASCIIART[6][10] = 'Z';
	    ASCIIART[7][9] = 'Z';
	    ASCIIART[8][8] = 'Z';
	    ASCIIART[9][13] = 'Z';
	    ASCIIART[9][12] = 'Z';
	    ASCIIART[9][9] = 'Z';
	    ASCIIART[9][10] = 'Z';
	    ASCIIART[9][15] = 'Z';
	    ASCIIART[9][14] = 'Z';
	    ASCIIART[9][11] = 'Z';
	    break;
	}
    }
	public void print(){
	    for(int i=0;i<10;i++) {
		    ps.println(ASCIIART[i]);
		    }
	 }
}




	

