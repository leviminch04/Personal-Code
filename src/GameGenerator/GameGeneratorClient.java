package GameGenerator;

import java.io.IOException;

public class GameGeneratorClient
{
    public static void main(String[] args) throws IOException
    {
        GameGenerator3 gen = new GameGenerator3();
        System.out.println(gen.genre());

    }
}
