package Newjavastart.learningfromyt;

public class TypeConversionAndCasting {
    //akshat
    //byte<int<long<float<double
    //in this table if we go left to right is called explict convert(casting)
    //but when we go right to left is called implicit(conversion)
    public static void main(String[] args){

        //int a =12;
       // byte k = a;
        //System.out.println(k);
        //in this code when we run it will give loosy


        //float f = 5.6;
       // int t = f ;
        // in this case it will again give lossy error

        float f= 5.6f;
        int t= (int)f;
        System.out.println(t);
        //in this it will run also it loss the data 5.6 to 5
        //this is called explicitly conversion (casting)
        //type promotion

        byte b = 10;
        byte a = 40;
        int result = b*a;
        System.out.println(result);
        //so in this case if we multiply byte to byte and if goes out of range
        //so java automaticaly convered byte into int because of large size of byte*byte
    }
}
