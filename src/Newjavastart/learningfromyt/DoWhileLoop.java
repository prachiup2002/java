package Newjavastart.learningfromyt;

public class DoWhileLoop {
    public static void main(String[] args){
        int i = 1;
        do{
            System.out.println("hi"+ i);
            i++;
        }while(i<=4);
    }
}/*The main purpose of a do-while loop is
 to make sure the code block runs at least once,
 even if the condition is false at the beginning.
*/
/*in this code if we give i = 1
with the condition of while i<=4
it will work print hi1 and soo on
but when we change the value i = 5 it will not run
soo for atleast once run the code we use
do while loop
if the conditon is false it will atleast run once
than out while loop ends
i = 5.
The do block runs first anyway → prints "hi5".
Then i++ → now i = 6.
Condition check: i <= 4 → false (6 ≤ 4 is not true).
Loop stops.
* */
