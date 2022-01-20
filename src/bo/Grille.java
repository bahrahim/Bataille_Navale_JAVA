package bo;


public class Grille {
    // attributs

    private int nb_line;
    private int nb_col;
    private char [][] grille;

    //Constructeur

    public Grille(int nbr_line, int nbr_colnn){
        nb_line = nbr_line;
        nb_col  = nbr_colnn;
        grille = new char[nb_line][nb_col];

        for(int i=0; i<nb_line; i++){
            for(int j=0; j<nb_col; j++){

                grille[i][j] = '-';
            }
        }
    }

    public void afficher_grille(){
        System.out.println();
        for(int i=0; i<nb_line; i++){
            for(int j=0; j<nb_col; j++){

                System.out.print(" | " + grille[i][j]);
            }
            System.out.println(" | ");
        }
        System.out.println();
    }


//Placer un player
    public void placePlayer(int l, int c , char t){

        l = l-1;
        c = c-1;
        //on test si on est bien placer sur la grille
        if (l<0 || c<0 || l>nb_line || c>nb_col){
            System.out.println("Erreur de placement ");
            return;
        }
    }






    public void shoot(){}

    public void boat_position(){}


}

