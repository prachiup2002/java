package Newjavastart.learningfromyt;

public class SwitchStatement {
    public static void main(String[]args){
        int n = 8; // n=1 n= 2 n=3 n=4 soo on
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                /*why we use term break because when weare trying to run any middle value
                it will execiute but there is an error is will run along with all the further value
                like if we want to to run 2nd statement we pass n = 2 it will....with further 3
                4 5 6 7  statement than we use break to break the line
                * */

        }
        /* instead of using ifelse we can use switch
        if(n==1)
        System.out.println("Monday");
        else if(n==2)
        System.out.println("Tuesday");
        else if(n==3)
        System.out.println("Wednesday");
        else if(n==4)
        System.out.println("Thursday");
        else if(n==5)
        System.out.println("Friday");
        else if(n==6)
        System.out.println("Saturday");
        else
        System.out.println("Sunday");
        ask question to akshat if me 8 input de rahi hu toh ye mujhe ye kyu ni bol raha ki out of range
        hai ya sahi value dalu kyuki telusko ko vo de raha tha ye warning
        * */

        /*in java 12 it introduced don't use Break key words and also
        : colon at the end of case statement
        know we can simply use ->
        case "saturday" -> System.out.println("Saturday");
        instead of using system.out.println....
        we can use
        case "saturday" -> result = "6am";
        case "monday" -> result = "8am";
        * */
    }
}
