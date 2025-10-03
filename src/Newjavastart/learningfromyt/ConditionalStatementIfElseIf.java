package Newjavastart.learningfromyt;

public class ConditionalStatementIfElseIf {
    public static void main(String[] args){
        int x = 8;
        int y = 7;
        int z = 9;
        if(x>y && x>z) // if this statement is false it will go further statement
            System.out.println(x);
        else if(y>z)  // (y>x && y>z)
            // when we have already check x i ssmaller than y
            //than why we are again checking
            // we can simply check y>z
            // if this one is true it will print
            // if not than go to else contion tha print
            System.out.println(y);
        else
            System.out.println(z);
    }
}
