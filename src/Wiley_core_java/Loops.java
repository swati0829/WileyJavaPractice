package Wiley_core_java;

class Loops{
    public static void main(String... args) {

        for(int i = 0;i<10;++i) {
            for(int j = 1;j<10;++j) {
                System.out.println("i = " + i + " j = " + j);
            }
        }

        System.out.println("Printing numbers 1-10 using while loop");
        int i = 0;
        while(i <= 10) {
            System.out.println("i = " + i);
            ++i;
        }

    } 
}