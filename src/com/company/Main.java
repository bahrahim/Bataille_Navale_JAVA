package com.company;


import bo.Grille;
import objects.Joueur;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*
        System.out.println("Veuillez entrer votre nom : ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Vous etes le player 1 " + str);

        System.out.println("Veuillez entrer votre nom : ");
        Scanner scan2 = new Scanner(System.in);
        String str2 = scan2.nextLine();
        System.out.println("Vous etes le player 2 " + str2);


 */


        //Creation de la grille
        Grille g1 = new Grille(10,10);
        g1.afficherGrille();
        //Placer un joueur j
        g1.placePlayer(3,3,'J');
        g1.afficherGrille();
        //Deplacer le joueur j
        g1.deplacerVersHaut();
        g1.afficherGrille();
    }
}
