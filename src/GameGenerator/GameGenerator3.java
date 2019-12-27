package GameGenerator;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class GameGenerator3
{
    int countGenre = 0;
    int countChar = 0;
    int countWorld = 0;
    Reader readerGenre = new FileReader("C:\\Users\\levim\\Documents\\GitHub\\Personal-Code\\src\\GameGenerator\\Events\\Genre.txt");
    BufferedReader bufferedReaderGenre = new BufferedReader(readerGenre);
    String lineGenre = bufferedReaderGenre.readLine();
    List genre = new ArrayList();

    Reader readerChar = new FileReader("C:\\Users\\levim\\Documents\\GitHub\\Personal-Code\\src\\GameGenerator\\Events\\Character.txt");
    BufferedReader bufferedReaderChar = new BufferedReader(readerChar);
    String lineChar = bufferedReaderChar.readLine();
    List charA = new ArrayList();
    String charAString;

    Reader readerWorld = new FileReader("C:\\Users\\levim\\Documents\\GitHub\\Personal-Code\\src\\GameGenerator\\Events\\World.txt");
    BufferedReader bufferedReaderWorld = new BufferedReader(readerWorld);
    String lineWorld = bufferedReaderWorld.readLine();
    List world = new ArrayList();
    String worldString;

    int rand;
    String store;


    public GameGenerator3() throws IOException
    {
        while(lineGenre != null){
            genre.add(lineGenre);
            countGenre ++;
            lineGenre = bufferedReaderGenre.readLine();
        }

        while(lineChar != null){
            charA.add(lineChar);
            countChar ++;
            lineChar = bufferedReaderChar.readLine();
        }

        while(lineWorld != null){
            world.add(lineWorld);
            countWorld ++;
            lineWorld = bufferedReaderWorld.readLine();
        }
    }

    public String genre() throws IOException
    {
        rand = (int) (Math.random() * genre.size());
        return (String) genre.get(rand);
    }

    public String charA() throws IOException
    {
        rand = (int) (Math.random() * charA.size());
        charAString = (String) charA.get(rand);
        charA.remove(rand);
        return charAString;
    }

    public String world() throws IOException
    {
        rand = (int) (Math.random() * world.size());
        worldString = (String) world.get(rand);
        world.remove(rand);
        return worldString;
    }

    public int genreSize() throws IOException
    {
        return genre.size();
    }

    public int charSize() throws IOException
    {
        return charA.size();
    }

    public int worldSize() throws IOException
    {
        return world.size();
    }


}
