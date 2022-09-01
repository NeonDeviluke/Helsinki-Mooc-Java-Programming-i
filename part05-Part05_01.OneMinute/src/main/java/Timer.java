
public class Timer {
    private int hundofsec;
    private int second;

    public Timer() {
        this.hundofsec = 0;
        this.second = 0;
    }
    
    public void advance(){
        this.hundofsec += 1;
        if(hundofsec > 99){
            this.hundofsec = 0;
            this.second += 1;
            if(second > 59){
                this.second = 0;
            }
        }
    }
    
    public String toString() {
        if(second < 10 || hundofsec < 10){
            return "0" + second + ":" + "0" + hundofsec;
        }else{
            return second + ":" + hundofsec;   
        }
    }
    
    
    
    
}
