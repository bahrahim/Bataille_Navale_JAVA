package bo;
import java.util.Random;



public class Grille {
    // attributs

    private int nb_line;
    private int nb_col;
    private char[][] grille;

    //Constructeur

    public Grille(int nbr_line, int nbr_colnn) {
        nb_line = nbr_line;
        nb_col = nbr_colnn;
        grille = new char[nb_line][nb_col];

        for (int i = 0; i < nb_line; i++) {
            for (int j = 0; j < nb_col; j++) {

                grille[i][j] = '-';
            }
        }
    }

    public void afficherGrille() {
        System.out.println();
        for (int i = 0; i < nb_line; i++) {
            for (int j = 0; j < nb_col; j++) {

                System.out.print(" | " + grille[i][j]);
            }
            System.out.println(" | ");
        }
        System.out.println();
    }


    //Placer un joueur
    public void placePlayer(int l, int c, char t) {

        l = l - 1;
        c = c - 1;
        //on test si on est bien placer sur la grille
        if (l < 0 || c < 0 || l > nb_line || c > nb_col) {
            System.out.println("Erreur de placement ");
            return;
        }
        if (grille[l][c] == '-') {
            grille[l][c] = t;
        } else {
            System.out.println("cette place est deja prise");
        }
    }

    public int deplacerVersHaut() {
        char dep;

        for (int i = 0; i < nb_line; i++) {
            for (int j = 0; j < nb_col; j++) {
                if (grille[i][j] == 'J') {   //je cherche le joueur
                    // haut
                    if (i - 1 >= 0 && grille [i - 1][j] =='-') {        // je teste la position
                        dep = grille[i][j];    // je copie le perso
                        grille[i][j] = '-';      // je vide la case
                        grille[i - 1][j] = dep;  //je deplace le perso
                        return 1;

                    }
                }
            }
        }
        return 0;
    }

}








   /* public int placerRandom() {
        char tmp;
        for (int i = 0; i < nb_line; i++) {
            for (int j = 0; j < nb_col; j++) {
                if (grille[i][j] = "R ") {
                    // haut
                    if (i - 1 >= 0 && grille[i - 1][j] == "-") {
                        tmp = grille[i][j];
                        grille[i][j] = "- ";
                        grille[i - 1][j] = tmp;
                        return 1;
                        // bas
                    } else if (i + 1 <= nb_line && grille[i + 1][j] == "- ") {
                        tmp = grille[i][j];
                        grille[i][j] = "- ";
                        grille[i + 1][j] = tmp;
                        return 2;
                        // gauche
                    } else if (i - 1 >= 0 && grille[i][j - 1] == "-") {
                        tmp = grille[i][j];
                        grille[i][j] = "-";
                        grille[i][j - 1] = tmp;
                        return 3;
                        // droite
                    } else if (j + 1 <= nb_col && grille[i][j + 1] == "-") {
                        tmp = grille[i][j];
                        grille[i][j] = "- ";
                        grille[i][j + 1] = tmp;
                        return 4;
                    }
                }
            }
        }
        return 0;
    }
}
*/



