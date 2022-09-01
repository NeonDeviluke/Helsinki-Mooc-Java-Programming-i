public class Fitbyte {
    private int age;
    private int restingrate;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingrate = restingHeartRate;
    }
    
    public double maximumHeartRate(){
        return 206.3 - (0.711 * age);
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        return ((maximumHeartRate() - restingrate) * (percentageOfMaximum) + restingrate); 
    }
}
