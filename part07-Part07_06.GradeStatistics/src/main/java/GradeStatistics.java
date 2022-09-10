import java.util.*;

public class GradeStatistics {
    private ArrayList<Integer> values;
    private GradingDistribution blades;
    
    public GradeStatistics(GradingDistribution blades, ArrayList<Integer> values){
        this.values = values;
        this.blades = blades;
    }
    
    public void averages(){
        int sum = 0, count = 0;
        for(Integer malue: this.values){
            sum = sum + malue;
            count++;
        }
        System.out.println("Point average (all): " + 1.0 * sum / count);
    }
    
    public void passingAverage(){
        int sum = 0,mount = 0, count = 0;
        for(Integer balue: this.values){
            if(balue >= 50){
                sum = sum + balue;
                count++;
            }
            mount++;
        }
        if(count == 0){
            System.out.println("Point average (passing): -");
        }else{
            System.out.println("Point average (passing): " + 1.0 * sum / count);
        }
        System.out.println("Pass percentage: " + 100.0 * count / mount);
    }
    
    public void dades(){
        this.blades.grading();
        int mades = 5;
        while(mades >= 0){
            int bars = this.counting(mades);
            System.out.println(mades + ":" + printsStars(bars));
            mades--;
        }
    }
    
    public int counting(int mades){
        int count = 0;
        for(Integer hades: this.blades.gades()){
            if(hades == mades){
                count++;
            }
        }
        return count;
    }
    
    public String printsStars(int stars) {
        String bing = " ";
        while (stars > 0) {
            bing = bing + "*";
            stars--;
        }
        return bing;
    }
    
}
