package Newjavastart.learningfromyt;

public class LogicalOperators {
    /* x<y == T/F y is greater than x it will give you true or false
       a>b == t/f a is greater than b it will also give you ture or false
       AND operator
       represent as "&"
       & called ampersand
       T T= T
       T F = F
       F T = F
       F F = F

       OR operator
       represent as | pipe
       T T = T
       T F = T
       F T = T
       F F = F

       NOT oprator
       represnt as !
        it will works apposite if the value is true it will print false
        and viceversa
        t = f
        f = t

        we can also use && for compairing to different values
        like a>b && x<y
        same for ||
        but we don't use !! only use !
        */
    public static void main(String []args){
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;
        boolean result = x>y;
        //this will give you true but when we
        boolean result1 = x>y && a>b;
        // this will give you false
        // x is greater than y it is true but
        // a is smaller than b it will false
        // so in and & operator any ans is false it will give false
        // if we change a>b to a<b it will give true ans because both ans is true
        boolean result2 = x>y || a<b;
        /*this || operator always gives true
        if any of the one is true than dosen't matter it will give true
        if both the comdiion is f f than it will give false
        * */
        boolean result3 = x>y;
        System.out.println(!result3);
        // and thi is how ! works gives opposite ans
        // x is greater than y so ans will be true
        // but ! give opposite ans false
    }
}
