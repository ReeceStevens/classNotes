import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram {
    public static void main(String [] args) {
        int [] test = {1,2,3,4,5};
        System.out.println(Arrays.toString(test));
        int [] test2 = remove(test,3);
        System.out.println(Arrays.toString(test2));

        int a = (int)  (Math.abs(2.0) + 3.0);
        char c1 = 34;
        
        Scanner keyboard = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int sc1 = (int)keyboard.nextDouble();
        System.out.println("You entered " + sc1);

        String word = "";
        System.out.print("Enter a word: ");
        while (!word.equals("stop")) {
            word = keyboard.next();
            System.out.println(word);

        }
    }


    public static int [] remove (int[] inArray, int val) {
        int l = inArray.length;
        int index = -1;
        for (int i = 0; i < l; i += 1) {
            if (val == inArray[i]){
                index = i;
                break;
            }
        }
        int [] newArray;
        if (index < 0) 
            newArray = Arrays.copyOf(inArray, l);
        else {
            newArray = Arrays.copyOf(inArray, l-1);
            for (int i = index+1; i < l; i++) {
                newArray[i-1] = inArray[i];
            }
        // This changes the input array.
        }
        return newArray;
    }
    /*
     * Pseudo-code for insertion sort
     * FOR i = 1 to length(a) - 1
     *      j - 1
     *      WHILE j > 0 AND a[j] < a[j-1]
     *          swap a[j] with a[j-1]
     *          j --
     */
}
