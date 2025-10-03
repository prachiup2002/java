package Newjavastart.learningfromyt;

public class ForLoop {
    public static void main(String[] args){
        // in for loop we can give 3 different statements
        // why? because we use ; semicolon in between each statement
        for(int i = 1; i<=5; i++){
            System.out.println("DAY" + i);
            for(int j = 1; j<=9; j++){
                System.out.println(" "+(j+8)+ "-"+ (j+9));
            }
        }
        /*
A for loop is used when you know how many times you want to repeat something.
It has 3 parts:
Initialization → where the counter starts.
Condition → loop runs while this is true.
Update → changes the counter each time.

Step by Step Explanation:
Outer loop (i)
Starts at i = 1, goes up to i = 5.
So it runs 5 times.
Each time, it prints → "DAY1", "DAY2", … "DAY5".
Inner loop (j)
For every single DAY, j runs from 1 to 9.
Inside, it prints: " 9-10", "10-11", "11-12", … "17-18".
That’s because (j+8) and (j+9) shift the numbers.

        * */
    }
}
