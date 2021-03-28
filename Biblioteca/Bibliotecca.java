package Biblioteca;

import java.util.Scanner;
public class Bibliotecca;


public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Livro l1 = new Livro();
    

    System.out.println("Digite o nome do Livro: ");
    l1.nome = ler.nextLine();

    System.out.println("Digite o genero do Livro: ");
    l1.setGenero(ler.nextLine()); 

    System.out.println("Digite o preço do livro: ");
    l1.setPreco(ler.nextInt());


    System.out.println("-----------");

    System.out.println(l1);

    System.out.println("O gênero do livro é: " + l1.getGenero());
    System.out.println("O preço do livro é: " + l1.getPreco());
    System.out.println("O valor final da compra");
    System.out.println("**************************");
    System.out.println(l1.verificarPreco());


    

}