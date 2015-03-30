package android.jogodamemoria.model;

/**
 * Created by Alexsandro Santos on 23/03/2015.
 */
public class Carta {

    private char carta ;


    public Carta ()
    {

    }

    public void alteracarta(char novaletra)
    {
        this.carta = novaletra;
    }

    public char getcarta()
    {
        return carta;
    }
}
