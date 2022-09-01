
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Song)){
            return false;
        }
        
        Song newcompared = (Song) compared;
        
        if(this.artist.equals(newcompared.artist) &&
           this.name.equals(newcompared.name) &&
           this.durationInSeconds == newcompared.durationInSeconds) 
           {
               return true;
           }
        return false;
    }

}
