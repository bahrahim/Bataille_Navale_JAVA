package objects;

public class Joueur {

    //Attributs
    private int vie;
    private int hp;

    //Constructeurs

    public Joueur(){
        vie = 50;
        hp  = 10;
    }

    public Joueur(int v, int h){
        vie = v;
        hp  = h;
    }
}
