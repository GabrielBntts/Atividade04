package Biblioteca;

import java.util.Scanner;

public class BiblioMain {
    
    public static void main(String[] args) {
      
        Scanner ler = new Scanner(System.in);
        Livro l1 = new Livro();;
        
        System.out.println("Digite o gênero do Livro:");
        l1.setGenero(ler.nextLine());
        
        System.out.println("Digite o preço do Livro: ");
        l1.setPreco(ler.nextInt());
        
        System.out.println("--------------");
        
        System.out.println(l1);        
        System.out.println("O valor da compra é: " + l1.verificarPreco());
        
    }
    
}
