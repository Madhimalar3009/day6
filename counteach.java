import java.util.Scanner;

public  class counteach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next();

        for (int i = 0; i < word.length(); i++) {
    char ch = word.charAt(i);
    int count = 0;

    if (word.indexOf(ch) != i) {
        continue;
    }

    for (int j = 0; j < word.length(); j++) {
        if (ch == word.charAt(j)) {
            count++;
        }
    }

    System.out.println(ch + " = " + count);
}
}
}