package be.intecbrussel.javaInput;

import java.util.Scanner;

public class MyMain
{
    public static void main(String[] args)
    {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez votre nom.");
        String nom = clavier.nextLine();
        System.out.println("Votre nom est: " + nom + ".");
    }


}
