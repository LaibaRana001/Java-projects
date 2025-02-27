import java.util.*;

public class CodeAnalyzer {
    // List of Java keywords for easy identification
    private static final Set<String> JAVA_KEYWORDS = new HashSet<>(Arrays.asList(
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue",
            "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "if", "goto",
            "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", "private",
            "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
            "throw", "throws", "transient", "try", "void", "volatile", "while"
    ));

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Java statement: ");
        String codeLine = sc.nextLine();
        sc.close();

        // Splitting the input into tokens
        String[] words = codeLine.split("\\s+");

        for (String word : words) {
            if (JAVA_KEYWORDS.contains(word)) {
                System.out.println(word + " → Java Keyword");
            } else if (word.matches("\\d+")) {
                System.out.println(word + " → Numeric Value");
            } else if (word.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
                System.out.println(word + " → Identifier (Variable Name)");
            } else {
                System.out.println(word + " → Symbol / Operator");

                // Input example for code testing
                //int number = 10;

            }
        }
    }
}
