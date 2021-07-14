package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {


    public  static List<String[]> read (String file) {
        List<String[]> info= new LinkedList<String[]>();
        String infoRow ;

        try {
            BufferedReader br=new BufferedReader(new FileReader(file));
            while ((infoRow=br.readLine())!=null){
                String[] infoRowSingle=infoRow.split(",");
                info.add(infoRowSingle);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Could not found file");
        }
        catch (IOException e) {
            System.out.println("Could not read file");
        }
        return info;
    }
}