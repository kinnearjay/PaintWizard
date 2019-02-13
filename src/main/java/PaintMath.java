import java.util.ArrayList;
import java.util.List;

public class PaintMath {


    public static void calculateCost(List<Paintstore> lp, double roomSize){
          double valForCash = 0;
        ArrayList<Double> dblArry = new ArrayList<Double>();

        for( int i = 0; i < lp.size(); i++){
            valForCash = (lp.get(i).getVolumeL()*lp.get(i).getCoverageM())/lp.get(i).getCost();
           dblArry.add(valForCash);

        }
        System.out.println("callingsortarr");
        sortArray(dblArry);
        dblArry.stream().forEach(System.out::println);


    }
    public static ArrayList<Double> valueArray(double res){
        ArrayList<Double> resultList = new ArrayList<Double>();
        resultList.add(res);


        return resultList;
    }

    public static void sortArray(ArrayList<Double> dblArr){
        double swapNum = 0;
        for(int c = 0 ; c < dblArr.size(); c++){
            for (int i = 0; i< dblArr.size()-1; i++) {
                if (dblArr.get(i)> dblArr.get(i+1) ) {
                   swapNum = dblArr.get(i+1);
                   dblArr.set(i+1,dblArr.get(i));
                   dblArr.set(i,swapNum);


                }
            }
            }
        System.out.println("order");
        dblArr.stream().forEach(System.out::println);
        System.out.println("end");
            }
}
