package string;

public class CamelCase {
    public static void main(String[] args) {
//        String s1 = "Java Is EaSy";
//        String s1 = "test jAVa bOOk";
        String s1 = "a bE-caT%DOG$eGg";
        String res = "";
        String[] words = s1.split("[^a-zA-Z0-9]");
        res = words[0].toLowerCase();
        for (int i = 1; i < words.length; i++) {
            String lowerCase = words[i].substring(0, 1).toUpperCase();
            String upperCase = words[i].substring(1).toLowerCase();
            res += lowerCase + upperCase;
        }
        System.out.println(res);
    }
}
