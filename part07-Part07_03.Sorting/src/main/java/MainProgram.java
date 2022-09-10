import java.util.*;
public class MainProgram {
    
    public static void main(String[] args) {
        // write your test code here
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        /*System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        System.out.println(MainProgram.indexOfSmallestFrom(array, 1));
        System.out.println(Arrays.toString(array));
        */
        MainProgram.sort(array);
    }
    
    public static void sort(int[] array){
        int i = 0;
        for(Integer value: array){
            swap(array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
            i++;
        }
    }
    
    public static void swap(int[] table, int index1, int index2){
        int temp = 0;
        temp = table[index1];
        table[index1] = table[index2];
        table[index2] = temp;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallest = table[startIndex], i = 0, k = 0;
        for(i = startIndex; i < table.length; i++){
            if(smallest > table[i]){
                smallest = table[i];
            }
            
            if(table[i] == smallest){
                k = i;
            }
        }
        return k;
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for(Integer value : array){
            if(smallest > value){
                smallest = value;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest = array[0], i = 0, k = 0;
        for(Integer value : array){
            if(smallest > value){
                smallest = value;
            }
            
            if(array[i] == smallest){
                k = i;
            }
            i++;
        }
        return k;
    }
}
