
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i = 1; i <= number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int a = size - 1, b = 1;
        for(int i = 0; i < size; i++){
            printSpaces(a);
            a = a - 1;
            printStars(b);
            b = b + 1;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int x = height - 1, y = 1;
        for(int i = 0; i < height; i++){
            printSpaces(x);
            x--;
            printStars(y);
            y += 2;
        }
        int z = height - 2;
        for(int i = 0; i < 2; i++){
            printSpaces(z);
            printStars(3);
            
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
