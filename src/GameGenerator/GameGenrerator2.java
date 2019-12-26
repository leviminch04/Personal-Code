package GameGenerator;

import java.util.ArrayList;
import java.io.*;
import java.util.List;

public class GameGenrerator2
{
    public static void main(String[] args) throws IOException {
        int count = 0;
        Reader reader = new FileReader("/Users/levi/Desktop/Genre.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();
        List genre = new ArrayList();

        while(line != null){
            genre.add(line);
            count ++;
            line = bufferedReader.readLine();
        }


        System.out.println(genre);
    }

}
