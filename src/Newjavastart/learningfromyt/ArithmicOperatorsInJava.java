package Newjavastart.learningfromyt;

public class ArithmicOperatorsInJava {
    public static void main(String[] args){
        // + - * /
        // when we use / we only get quatent not a reminder
        // for getting remindor we use %
        int num1 = 12;
        int num2 = 13;
        int result = num1 + num2;
        System.out.println(result);
        // addition

        int num3 = 12;
        int num4 = 13;
        int result2 = num3 * num4;
        System.out.println(result2);
        // multiplication

        int num5 = 12;
        int num6 = 13;
        int result3 = num5 - num6;
        System.out.println(result3);
        //substract

        int num7 = 12;
        int num8 = 13;
        int result4 = num7 / num8;
        System.out.println(result4);
        // divide but only give quotient

        int num9 = 13;
        int num10 = 12;
        int result5 = num9 % num10;
        System.out.println(result5);
        // it will give you reminder
        // called as modules

        // increment value

        int num0 = 7;
        num0= num0 + 2 ;
        System.out.println(num0);
        // we can also do in simple way
        int numA = 5;
        numA +=2;
        // -=
        // /=
        System.out.println(numA);
        //works same

        //other method
        int numB= 5;
        numA++;
        // works same increment the value
        // num--; also works for decrement

        // ++num  -- pre increment {first increment then fetch the value}
        // num++ -- post increment {it will first fetch the value of num then increment it }
        // --num -- pre decrement
        //num--  -- post decrement


    }
}
