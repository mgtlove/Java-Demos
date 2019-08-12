import java.util.Scanner;

public class While_For_Loops {
    /* 
    While Loop
    While loop iterates indefinitely, while its conditions are valid*, and stops upon a 
    violation of the defined conditions.
    */
        static void whileExample1(){
            //example using an int, hardcoded
            int condition = 0;
            System.out.println("While Loop 1 Example");
            while (condition < 7) {
                System.out.println("Condition is set to:" + condition);
                condition++;}
        }

        static void whileExample2(Scanner userInput){
            //example using a string, user input (Uncomment to run)
            boolean condition = true;
            System.out.println("\nWhile Loop 2 Example");
                while (condition) {
                    System.out.println("Condition is set to:" + condition);
                    System.out.println("Enter 'false' to terminate loop:");
                    condition = userInput.nextBoolean();
                }
        }

    /*
    do while loop
    do while loop executes the loop block at least once, then checks the condition of the 
    loop for further iterations
    example using a bool, user input (Uncomment to run)
    */

        static void doWhileExample(Scanner userInput){
            boolean condition = false;
            System.out.println("\nDo While Loop Example");
            do {
                System.out.println("Condition is set to: " + condition);
                System.out.println("Enter 'false' to terminate loop, True to continue looping:");
                condition = userInput.nextBoolean();
            } while (condition);
        }

    /*For Loops
    For Loops iterated over a specified duration.
    For example, you might want to iterate over each element in an array. 
    So you could do the size of the array as a basis for the number of times to 
    iterate the for loop
    */

        static void forLoopExample1(){
            int arraySize = 5;
            System.out.println("\nFor Loop 1 Example");
            for (int i = 0; i < arraySize; i++){
            //print each element number of array
                System.out.println(i);}
            //compared to the while loop using the integer iterator, the for loop is a bit more 
            //straightforward in most cases.
        }

        static void forEachExample(){
            //For Each Loop
            //Easier way to iterate through an array or vector
            System.out.println("\nFor Each Loop Example");
            System.out.println("You are now printing the contents of the 'Baseball Array:'");
            String[] baseball = {"Astros", "Yankees", "Red Sox", "Rangers"};
            for (String i : baseball){
            //print contents of each element in array
                System.out.println(i);}
        }


        static void forLoopExample2(){
            //Example incrementing other than ++ or --
            System.out.println("\nFor Loop Example 2");
            System.out.println("You are now printing numbers outside the ++ iterator");
            int arraySize = 20;
            for (int i = 0; i <= arraySize; i +=2){
            //print every other number through 20, in this case even numbers
                System.out.println(i);}
        }

    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
    
        //Running of each example. Comment out functions to hide from output.
        whileExample1();
        whileExample2(userInput);
        doWhileExample(userInput);
        forLoopExample1();
        forLoopExample2();
        forEachExample();
        userInput.close();
        System.out.println("\nYou have completed this tutorial run");
    }   
}