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
    int countGoal = 0;
    Reader readerGenre = new FileReader("C:\\Users\\Admin\\Documents\\Levi Minch\\Personal-Code\\src\\GameGenerator\\Events\\Genre.txt");
    BufferedReader bufferedReaderGenre = new BufferedReader(readerGenre);
    String lineGenre = bufferedReaderGenre.readLine();
    List genre = new ArrayList();

    Reader readerChar = new FileReader("C:\\Users\\Admin\\Documents\\Levi Minch\\Personal-Code\\src\\GameGenerator\\Events\\Character.txt");
    BufferedReader bufferedReaderChar = new BufferedReader(readerChar);
    String lineChar = bufferedReaderChar.readLine();
    List charA = new ArrayList();

    Reader readerWorld = new FileReader("C:\\Users\\Admin\\Documents\\Levi Minch\\Personal-Code\\src\\GameGenerator\\Events\\World.txt");
    BufferedReader bufferedReaderWorld = new BufferedReader(readerWorld);
    String lineWorld = bufferedReaderWorld.readLine();
    List world = new ArrayList();

    Reader readerGoal = new FileReader("C:\\Users\\Admin\\Documents\\Levi Minch\\Personal-Code\\src\\GameGenerator\\Events\\Goal.txt");
    BufferedReader bufferedReaderGoal = new BufferedReader(readerGoal);
    String lineGoal = bufferedReaderGoal.readLine();
    List goal = new ArrayList();
    String goalString;

    int rand;
    String replaceStr;
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

        while(lineGoal != null)
        {
            goal.add(lineGoal);
            countGoal ++;
            lineGoal = bufferedReaderGoal.readLine();
        }
    }

    public String genre() throws IOException
    {
        rand = (int) (Math.random() * genre.size());
        replaceStr = (String) genre.get(rand);
        genre.remove(rand);
        return replaceStr;
    }

    public String charA() throws IOException
    {
        rand = (int) (Math.random() * charA.size());
        replaceStr = (String) charA.get(rand);
        charA.remove(rand);
        return replaceStr;
    }

    public String world() throws IOException
    {
        rand = (int) (Math.random() * world.size());
        replaceStr = (String) world.get(rand);
        world.remove(rand);
        return replaceStr;
    }

    public String goal() throws IOException
    {
        rand = (int) (Math.random() * goal.size());
        replaceStr = (String) goal.get(rand);
        goal.remove(rand);
        return replaceStr;
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

    public String randomGen() throws IOException
    {
        rand = 1;
        if (rand==1)
        {
            store = "A " + genre() + " game where you " + goal() + " and try not to die from " + charA();
        }

        return store;
    }


}
