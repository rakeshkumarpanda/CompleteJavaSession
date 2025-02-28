package string;

public class StringComparision {
    public static void main(String[] args) {

        //Creating the String objects
        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        String s4 = new String("java");
        String s5 = "selenium";
        String s6 = new String("test");
        s1 = "python";
        String s7 = s2;
//        s2 = "c#";
        String s8 = "Java";

//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);
//        System.out.println(s7);

        //With the equals i.e. == operator the addresses are being compared
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
//        System.out.println(s1==s4);
//
//        System.out.println(s2==s3);
//        System.out.println(s2==s4);
//
//        System.out.println(s3==s4);

        //Comparing the content of the string
        System.out.println(s2.equals(s3));
        System.out.println(s4.equals(s3));
        System.out.println(s3.equals(s8));//false due to case-sensitive
        System.out.println(s3.equalsIgnoreCase(s8));//true


    }
}
