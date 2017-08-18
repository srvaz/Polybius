package criptografia;

import java.util.Scanner;

public class Polybius {
    
    public static Scanner ler = new Scanner(System.in);
    
    public static String[][] chaveDeSeguranca(int n){
        String numeros[][] = new String[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numeros[i][j] = Integer.toString(i+1)+Integer.toString(j+1);
            }
        }
        return numeros;
    }
    
    public static String[] fragmentarSenha(String senha){
        char [] arraySenhaChar = senha.toCharArray();
        String arraySenhaString[] = new String[arraySenhaChar.length];
        
        for (int i = 0; i < arraySenhaString.length; i++) {
            arraySenhaString[i] = Character.toString(arraySenhaChar[i]);
        }
        
        return arraySenhaString;
    }
    
    public static String[] algoritmo(String senha){
        int qtdN = 5;
        String [][] numeros;
        
        numeros = chaveDeSeguranca(qtdN);
        
        String [] arraySenha;
        arraySenha = fragmentarSenha(senha);
        
        for (int i = 0; i < arraySenha.length; i++) {
            switch(arraySenha[i]){
                case "a":
                    arraySenha[i] = numeros[0][0];
                    break;
                case "b":
                    arraySenha[i] = numeros[0][1];
                    break;
                case "c":
                    arraySenha[i] = numeros[0][2];
                    break;
                case "d":
                    arraySenha[i] = numeros[0][3];
                    break;
                case "e":
                    arraySenha[i] = numeros[0][4];
                    break;
                case "f":
                    arraySenha[i] = numeros[1][0];
                    break;
                case "g":
                  arraySenha[i] = numeros[1][1];
                    break;
                case "h":
                    arraySenha[i] = numeros[1][2];
                    break;
                case "i":
                    arraySenha[i] = numeros[1][3];
                    break;
                case "j":
                    arraySenha[i] = numeros[1][3];
                    break;
                case "k":
                    arraySenha[i] = numeros[1][4];
                    break;
                case "l":
                    arraySenha[i] = numeros[2][0];
                    break;
                case "m":
                    arraySenha[i] = numeros[2][1];
                    break;
                case "n":
                    arraySenha[i] = numeros[2][2];
                    break;
                case "o":
                    arraySenha[i] = numeros[2][3];
                    break;
                case "p":
                    arraySenha[i] = numeros[2][4];
                    break;
                case "q":
                    arraySenha[i] = numeros[3][0];
                    break;
                case "r":
                    arraySenha[i] = numeros[3][1];
                    break;
                case "s":
                    arraySenha[i] = numeros[3][2];
                    break;
                case "t":
                    arraySenha[i] = numeros[3][3];
                    break;
                case "u":
                    arraySenha[i] = numeros[3][4];
                    break;
                case "v":
                    arraySenha[i] = numeros[4][0];
                    break;
                case "w":
                    arraySenha[i] = numeros[4][1];
                    break;
                case "x":
                    arraySenha[i] = numeros[4][2];
                    break;
                case "y":
                    arraySenha[i] = numeros[4][3];
                    break;
                case "z":
                    arraySenha[i] = numeros[4][4];
                    break;
            }
        }
            
            return arraySenha;
    }
    
    public static String lerDados(){
        String senha = ler.nextLine();
        
        return senha;
    }
    
    public static void imprimirSenha(){
        String senha = lerDados();
        String [] senhaCriptografada = algoritmo(senha);
        
        for (int i = 0; i < senhaCriptografada.length; i++) {
             System.out.print(senhaCriptografada[i]); 
        }
    }
    
    public static void main(String[] args) {
        
        imprimirSenha();
    }
    
}
