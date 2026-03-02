// Problem: Demonstrate String manipulation in Java
// Day: 04
// Phase: Java Foundations
// Concepts: String creation, concatenation, charAt

class StringOperationsDemo {
    public static void main(String args[]) {

        String str = "  Java Programming  ";
        String str2 = "java programming";

        // 1️⃣ length()
        System.out.println("Length: " + str.length());

        // 2️⃣ trim()
        String trimmed = str.trim();
        System.out.println("After trim: '" + trimmed + "'");

        // 3️⃣ toUpperCase()
        System.out.println("Uppercase: " + trimmed.toUpperCase());

        // 4️⃣ toLowerCase()
        System.out.println("Lowercase: " + trimmed.toLowerCase());

        // 5️⃣ charAt()
        System.out.println("Character at index 2: " + trimmed.charAt(2));

        // 6️⃣ substring()
        System.out.println("Substring (0 to 4): " + trimmed.substring(0, 4));

        // 7️⃣ contains()
        System.out.println("Contains 'Prog': " + trimmed.contains("Prog"));

        // 8️⃣ equals()
        System.out.println("Equals str2: " + trimmed.equals(str2));

        // 9️⃣ equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + trimmed.equalsIgnoreCase(str2));

        // 🔟 replace()
        System.out.println("Replace Java with Python: " + trimmed.replace("Java", "Python"));

        // 1️⃣1️⃣ indexOf()
        System.out.println("Index of 'Programming': " + trimmed.indexOf("Programming"));

        // 1️⃣2️⃣ lastIndexOf()
        System.out.println("Last index of 'a': " + trimmed.lastIndexOf('a'));

        // 1️⃣3️⃣ startsWith()
        System.out.println("Starts with Java: " + trimmed.startsWith("Java"));

        // 1️⃣4️⃣ endsWith()
        System.out.println("Ends with ming: " + trimmed.endsWith("ming"));

        // 1️⃣5️⃣ split()
        String words[] = trimmed.split(" ");
        System.out.println("Words after split:");
        for(String word : words) {
            System.out.println(word);
        }

        // 1️⃣6️⃣ concat()
        System.out.println("Concat example: " + trimmed.concat(" Language"));

    }
}