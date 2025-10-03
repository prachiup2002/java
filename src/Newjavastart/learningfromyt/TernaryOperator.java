package Newjavastart.learningfromyt;

public class TernaryOperator {
    public static void main(String[] args) {
       // int n = 4;
        /*if the value is even it is divisible by 2 and gives ans 0
        it will print 10
        but if it is false it will give 20 as a result
        * */
        int n = 4;
        int result = 0;

       // if (n % 2 == 0)
        //    result =10;
       // else
        //    result = 20;
        //insted of using if else we can use
        //ternary operator
        // ?: this is how it looks and works
        result = n%2==0? 10 : 20;
        //both ifelse and ternary operator works same
        // but turery operater saves time and space
        // it is not suitable for all it is only for few cases
        System.out.println(result);
    }
}
