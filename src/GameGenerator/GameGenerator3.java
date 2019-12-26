package GameGenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class GameGenerator3
{
    int count = 0;
    Reader reader = new FileReader("C:\\Users\\levim\\Documents\\GitHub\\Personal-Code\\src\\GameGenerator\\Events\\Genre.txt");
    BufferedReader bufferedReaderGenre = new BufferedReader(reader);
    String lineGenre = bufferedReaderGenre.readLine();
    List genre = new ArrayList();
    String store;
    int rand;


    public GameGenerator3() throws IOException
    {
        while(lineGenre != null){
            genre.add(lineGenre);
            count ++;
            lineGenre = bufferedReaderGenre.readLine();
        }
    }

    public String genre() throws IOException
    {
        rand = (int) (Math.random() * genre.size());
        return (String) genre.get(rand);
    }

    public String genreTest() throws IOException
    {
        store = (String) genre.get(1);
        return store;
    }

    public int genreSize() throws IOException
    {
        return genre.size();
    }


}
