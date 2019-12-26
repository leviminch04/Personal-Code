package GameGenerator;

import java.awt.*;
import java.io.*;

public class GameGenrerator2
{
    public static void main(String[] args) throws IOException {
        int count = 0;
        Reader reader = new FileReader("C:\\Users\\levim\\Documents\\GitHub\\Personal-Code\\src\\GameGenerator\\Events\\Genre.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line = bufferedReader.readLine();
        List genre = new List(4,false);

        while(line!= null){
            List. add(line);
            count ++;
            line = bufferedReader.readLine();
        }

        System.out.println(list);
    }

}
