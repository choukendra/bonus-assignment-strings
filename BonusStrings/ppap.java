import java.util.Scanner;
        
public class ppap {    
    public static void main(String[] args) {
        System.out.print("I have a ");
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        System.out.print("I have a ");
        String input2 = scanner.nextLine();
        String input2a = "";
        if (input2.length() == 0) {
            input2a = "NULL";
        }
        else if (input2.length() == 1) {
            input2a = input2.toUpperCase();
        }
        else {
            input2a = input2.substring(0,1).toUpperCase() + input2.substring(1);
        }
        System.out.println("Uh! " + input2a + " " + input1);
    }
    
    
}