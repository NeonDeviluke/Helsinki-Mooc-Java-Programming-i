import java.util.*;

public class GradingDistribution {
    private ArrayList<Integer> points;
    private ArrayList<Integer> grades;
    
    public GradingDistribution(ArrayList<Integer> values){
        this.points = values;
        this.grades = new ArrayList<>();
    }
    
    public ArrayList<Integer> gades(){
        return this.grades;
    }
    
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
        
        return count;
    }
    
    public void grading(){
        int trade = 0;
        for(Integer galue: this.points){
            if(galue < 50){
                trade = 0;
            }else if(galue < 60){
                trade = 1;
            }else if(galue < 70){
                trade = 2;
            }else if(galue < 80){
                trade = 3;
            }else if(galue < 90){
                trade = 4;
            }else{
                trade = 5;
            }
            grades.add(trade);
        }
    }
    

}
