import java.util.Scanner;

public class Merge {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();
        int i = 0;
        while (i < n1 || i < n2) {
            if (i < n1) {
                sb.append(word1.charAt(i));
            }
            if (i < n2) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();
        
        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();
        
        Merge merge = new Merge();
        String result = merge.mergeAlternately(word1, word2);
        
        System.out.println("Merged string: " + result);
        
        scanner.close();
    }
}
