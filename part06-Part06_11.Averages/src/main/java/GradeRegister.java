
import java.util.ArrayList;

public class GradeRegister {
    private ArrayList <Integer> points;
    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.points = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.points.add(points);
        this.grades.add(pointsToGrade(points));
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
    
    public double averageOfPoints(){
        int add = 0, count = 0;
        if(this.points.isEmpty()){
            return -1;
        }
        for(Integer value : points){
           add += value;
           count++;
        }
        return 1.0 * add / count;
    }
    
    public double averageOfGrades(){
        int add = 0;
        int count = 0;
        if(grades.isEmpty()){
            return -1;
        }
        for(Integer value: grades){
            add += value;
            count++;
        }
        return 1.0 * add / count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
