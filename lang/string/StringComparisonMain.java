package lang.string;

public class StringComparisonMain {
    // 문자열 비교
    public static void main(String[] args) {

        String str1 = "Hello, Java!";
        String str2 = "hello, java!";
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2)); // false
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2)); // true, 대소문자 구분없이 비교
        System.out.println("'b' compareTo 'a': " + "b".compareTo("a"));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2));
        System.out.println("str1 starts with 'hello': " + str1.startsWith("Hello")); // 접두사
        System.out.println("str1 ends with 'java!': " + str1.endsWith("Java!")); // 접미사



    }
}
