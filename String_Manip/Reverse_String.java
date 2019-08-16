import java.util.*;

class Chris_Demo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your line: ");
        String userIn = input.nextLine();
        String[] words = userIn.split(" ");
        String reversed = "";
        
        for(String i : words){
            StringBuilder each = new StringBuilder(i);
            each.reverse();
            reversed += each.toString() + " ";
        }
        System.out.println(userIn);
        System.out.println(reversed);   
    }
}