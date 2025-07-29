import java.util.ArrayList;

public class vowels {
    public static void main(String[] args){
        String name = "Jovan Ravael";
        int nameLength = name.length();
        int numVowels = 0;
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('i');
        vowels.add('u');
        vowels.add('e');
        vowels.add('o');
        System.out.println(nameLength);
        for(int i = 0; i < nameLength; i++){
            char currentAlphabetic = name.toLowerCase().charAt(i);
            if(vowels.contains(currentAlphabetic)){
                numVowels += 1;
            }
        }
        System.out.println(numVowels);
    }
}
