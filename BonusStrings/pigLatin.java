public class pigLatin {    
    public static void main(String[] args) {
        String str = "I love genshin impact "; //put in pig latin tests here
        str = str + " ";
        str = str.toLowerCase(); 
        String answer = "";
        String tempWord = "";

        for (int i = 0 ; i < str.length(); i++){
            if (!str.substring(i,i+1).equals(" ")){
                tempWord += str.substring(i,i+1);
            }
            else {
                if(tempWord.length() > 2){
                    String pigWord = "";
                    pigWord = tempWord.substring(1) + tempWord.substring(0,1) + "ay";
                    answer += pigWord + " ";  
                }
                else {
                    answer += tempWord + " ";
                }
                tempWord = "";
            }

        }
        
        System.out.print(str + "in pig latin is: " + answer); 
    }
}