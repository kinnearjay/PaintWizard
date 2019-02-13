
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PaintWiz {
    public static void main(String[] args){

        Paintstore cheapo = new Paintstore("CheapoMax", 19.99,10,21);
        Paintstore dog = new Paintstore("ThatOneWithTheDog",34.38,12,40);
        Paintstore joes = new Paintstore("AverageJoes",17.99,11,16);
        Paintstore dulux = new Paintstore("DuluxourousPaints",25.00,22,10);

        List<Paintstore> paintList = new ArrayList<Paintstore>();
        paintList.add(cheapo);
        paintList.add(dog);
        paintList.add(joes);
        paintList.add(dulux);

        BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));
        try{
            double roomsize = Double.parseDouble(buffread.readLine());
            PaintMath.calculateCost(paintList, roomsize);

        }catch (IOException e){

        }


    }

}
