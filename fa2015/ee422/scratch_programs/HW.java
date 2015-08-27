public class HW {
    public static void main (String [] args) {
        System.out.println("Hello, world");

        int a = 2;
        int b = 3;
        double c = 3.0;
            
        System.out.println(b*c);
        System.out.println(b*b);
        System.out.println("a = " + a + ", c = " + c);
        // Order of operations! Jave will evaulate from left to right.
        System.out.println(a + b + "a = " + a + ", c = " + c + a);

        String hw = "Hello, World!";
        // Java doesn't modify the existing memory location, it just makes a whole new one and reassigns
        // the variable hw to that location.
        hw = "hello";


        System.out.println(hw.length());
        System.out.println(hw);

        a += 3;
        hw += " world";
        // 0, 1, 2 will be printed. Three will not be printed.
        System.out.println(hw.substring(13,16));
        
    }
}
