package string;

public class FirstLowerRestUpper {
    public static void main(String[] args) {
        String s1 = "Java Is EaSy";
        String res = "";
        String[] words = s1.split(" ");
        for (int i = 0; i < words.length; i++) {
            String lowerCase = words[i].substring(0, 1).toLowerCase();
            String upperCase = words[i].substring(1).toUpperCase();
            res += lowerCase + upperCase + " ";
        }
        System.out.println(res);
    }
}
