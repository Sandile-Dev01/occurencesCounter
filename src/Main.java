import java.util.Arrays;

public class Main{
    public static void main(String[] args) {

        char[] letters = {'A', 'A', 'B', 'C', 'D'};
        int count = countOccurences(letters, 'A');
        System.out.println(count);
    }
    public static int countOccurences(
            char [] letters, char searchLetter){
        int count = 0;
        for (char letter: letters){
            if(letter == searchLetter){
                count++;
            }
        }
        return count;
    }

}