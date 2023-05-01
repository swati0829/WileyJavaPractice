package Wiley_core_java;

class PracticeProblem {
    static long calc(int... prices) {
        long sum = 0;
        for(int i = 0;i<prices.length;++i) {
            sum += prices[i];
        }

        return sum;
    }

    public static void main(String... args) {
        long totalPrice = calc(10000, 5000, 2000, 40000);

        System.out.println("Total Price is :" + totalPrice );
        if(totalPrice > 10000) {
            long discount = (totalPrice*10)/100;
            totalPrice -= discount;
            System.out.print("Total price after discount is : " + totalPrice);
        }
    }
}