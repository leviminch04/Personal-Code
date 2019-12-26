package GameGenerator;

import java.io.IOException;

/*
 Different locations: /Users/levi/Documents/GitHub/Personal-Code/src/GameGenerator/Events/Genre.txt
 C:\Users\levim\Documents\GitHub\Personal-Code\src\GameGenerator\Events\Genre.txt
 */
public class GameGeneratorClient
{
    public static void main(String[] args) throws IOException
    {
        GameGenerator3 gen = new GameGenerator3();
        System.out.println("Genre: " + gen.genre());
        System.out.println("Character: " + gen.charA());

    }
}
