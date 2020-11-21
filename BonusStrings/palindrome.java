public class palindrome {    
    public static void main(String[] args) {
        String str = "sadsf"; //put in palindrome tests here 
        boolean answer = true;
        str = str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        for (int i = 0; i <= str.length()/2 && answer; i++){
            if(str.substring(i, i+1).equals(str.substring(str.length()-i-1, str.length()-i)))
              answer = true;
            else
              answer = false;
        }
        
        System.out.print(str + "is a palindrome: " + answer); 
    }
}