
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String fName = scan.nextLine();
        System.out.println("Team:");
        String tName = scan.nextLine();
        int count = 0,wincount = 0, losecount = 0;
        try(Scanner banner = new Scanner(Paths.get(fName))){
            while(banner.hasNextLine()){
                String line = banner.nextLine();
                String[] part = line.split(",");
                int p2 = Integer.valueOf(part[2]);
                int p3 = Integer.valueOf(part[3]);
                if(line.contains(tName)){
                    if(tName.equals(part[0]) && p2 > p3){
                        wincount++;
                    }else if(tName.equals(part[1]) && p3 > p2){
                        wincount++;
                    }else{
                        losecount++;
                    }
                    count++;
                }
                
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wincount);
        System.out.println("Losses: " + losecount);
    }

}
