package Newjavastart.learningfromyt;

public class WhileLoop {
    public static void main(String[] args){
        int i = 1; // outer loop starts (i = 1)
        while(i<=4){ // outer loop condition
            System.out.println("hi" + i);
            int j = 1;// inner loop starts fresh every time outer loop runs
            while(j<=3){// inner loop conditon
                System.out.println("hello" + j);
                j++;
            }
            i++;
        }
        System.out.println("bye" + i);
    }
}
/*this is called as a nested while loop
how it is working
we have initalized the value of in i = 1
then we apply while loop
so inside the while loop we pu a condition
if i is less than equal to 4 (i<=4)
than print hi 1
and inside while loop there is one more while lopp
which is called a nested loop
then it will check the condition for j
(j=1;) and there is a condition if j is less than = to 3(j<=3)
than print hello 3 times
and also the whole program is incrementing the value i++ and j++
Outer loop runs 4 times (i=1 to 4).
Inner loop runs 3 times (j=1 to 3) for each outer loop.
So total "hello" = 4 × 3 = 12 times.

* */