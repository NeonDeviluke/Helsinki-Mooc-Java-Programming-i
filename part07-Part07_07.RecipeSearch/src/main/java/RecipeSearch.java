
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String file = scanner.nextLine();
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        ArrayList<RecipeList> meta = new ArrayList<>();
        
        while(true){
            System.out.println("Enter command: ");
            String value = scanner.nextLine();
            
            if(value.equals("stop")){
                break;
            }
            
            if(value.equals("list")){
                gine(file, meta);
                System.out.println("Recipes: ");
                for(RecipeList list: meta){
                    System.out.println(list);
                }
            }
            
            if(value.equals("find name")){
                gine(file, meta);
                mine(scanner, meta);
            }
            
            if(value.equals("find cooking time")){
                gine(file, meta);
                time(scanner, meta);
            }
            
            if(value.equals("find ingredient")){
                gine(file, meta);
                ingd(scanner, meta);
            }
        }
    }
    
    public static void ingd(Scanner scanner, ArrayList<RecipeList> meta){
        System.out.println("Ingredient: ");
        String ing = scanner.nextLine();
        System.out.println("Recipes: ");
        for(RecipeList value: meta){
            for(String malue: value.getIngredients()){
                if(malue.equals(ing)){
                    System.out.println(value);
                }
            }
        }
    }
    
    public static void time(Scanner scanner, ArrayList<RecipeList> meta){
        System.out.println("Max cooking time: ");
        int time = scanner.nextInt();
        System.out.println("Recipes: ");
        for(RecipeList value: meta){
            if(value.getTime() <= time){
                System.out.println(value);
            }
        }
    }
    
    public static void mine(Scanner scanner, ArrayList<RecipeList> meta){
        System.out.println("Searched word: ");
        String name = scanner.nextLine();
        System.out.println("Recipes: ");
        for(RecipeList value: meta){
            if(value.getName().contains(name)){
                System.out.println(value);
            }
        }
    }
    
    public static void gine(String file, ArrayList<RecipeList> meta){
        try(Scanner banner = new Scanner(Paths.get(file))){
            while(banner.hasNextLine()){
                String name = banner.nextLine();
                int time = Integer.valueOf(banner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while(true){
                    String ingredient = banner.nextLine();
                    if(ingredient.equals("")){
                        meta.add(new RecipeList(name, time , ingredients));
                        break;
                    }
                    
                    if(!(banner.hasNextLine())){
                        ingredients.add(ingredient);
                        meta.add(new RecipeList(name, time , ingredients));
                        break;
                    }
                    ingredients.add(ingredient);
                }
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    } 
}

