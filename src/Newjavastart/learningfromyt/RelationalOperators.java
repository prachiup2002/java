package Newjavastart.learningfromyt;

public class RelationalOperators {
    /* = means assignment operator
       == means compaire two values
       != means not equal too
       < less than
       > greater than
       <= less than equal too
       >= greater than equal too
    * */
    public static void main(String[] args) {
        int x = 6;
        int y = 5;
        boolean result = x < y;
        System.out.println(result);
        //why we got the output false because
        //the value of x is 6
        // and value of y is 5
        //so 6 is not smaller than 5
        //that's why we got false

        int a = 6;
        int  b = 5;
        boolean result1 = a > b;
        System.out.println(result1);
         /*know this make sense because
         6 is greater than 5
         it will give output as true
         * */
        int c = 6;
        int d = 6;
        boolean result2 = c < d;
        System.out.println(result2);
        /* so in this case it will print false
        because how it is possible 6 is greater tan 6
        doesn't make sense
        * */
        int e = 6;
        int g = 6;
        boolean result3 = e >= g;
        System.out.println(result3);
        /* here we use less than equal too
        now it will give the right answer
        so if we want to check the value is smaller than
        or grater than equal to we can check it like this way
        * */
        int f = 6;
        int j = 7;
        boolean result4 = f != j;
        System.out.println(result4);
        /* to check not equal too
           it will give true because 6 is not equal to 7
        * */
        int p = 6;
        int q = 7;
        boolean result5 = p == q;
        System.out.println(result5);
        /* it is for
        * */
    }
}
