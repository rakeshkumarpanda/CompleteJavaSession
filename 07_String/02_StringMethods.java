package string;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "java is difficult";
        String s2 = "test";
        String s3 = "automation";
        String s4 = "Python";
        String s10 = " ";
        String s11 = "        java is easy          ";
        String s12 = "My name is Rakesh and I am the Java Trainer";
        String s13 = "My name is %s and I am %d years old";

        //Finding the length of the given String
        System.out.println(s1.length());//17
        System.out.println("=============");

        //Concat
        //1st approach
        String s5 = s2+s3;
        System.out.println(s5);//testautomation
        //2nd Approach
        String s6 = s2.concat(s3);
        System.out.println(s6);//testautomation
        System.out.println("===============");

        //To convert into lower case
        System.out.println(s4.toLowerCase());
        System.out.println("===============");//python

        //To convert into upper case
        System.out.println(s4.toUpperCase());
        System.out.println("===============");//PYTHON

        //Get the char at the desired position
        System.out.println(s3.charAt(4));
        System.out.println("===============");//m

        //Fetching the part of the given string
        System.out.println(s3.substring(2));//tomation
        System.out.println(s3.substring(3, 7));//omat
        System.out.println("===============");

        //Converting the string into character arrays
        char[] chars = s2.toCharArray();
        for (int i=0; i<chars.length; i++){
            System.out.print(chars[i]+"\t");//t    e   s   t
        }
        System.out.println();
        System.out.println("===============");

        //Verifying the desired substring is present in the given string
        System.out.println(s1.contains("difficult"));//true
        System.out.println(s1.contains("python"));//false
        System.out.println("===============");

        //Verifying the String is ended up with the desired substring
        System.out.println(s1.endsWith("cult"));//true
        System.out.println(s2.endsWith("cult"));//false
        System.out.println("===============");

        //Verifying the String is started with the desired substring
        System.out.println(s1.startsWith("java"));//true
        System.out.println(s1.startsWith("Java"));//false
        System.out.println("===============");

        //Verifying whether the given character is present in the string or not
        //If present then fetch the index
        //In the below method it'll fetch the very first occurrence of the given char
        System.out.println(s2.indexOf('t'));//0
        System.out.println(s2.indexOf('t', 1));//3
        System.out.println(s2.indexOf('a'));//-1
        System.out.println("===============");

        //Fetching the last occurrence of the given char
        System.out.println(s3.lastIndexOf('a'));//5
        System.out.println(s3.lastIndexOf('a', 7));//5
        System.out.println("===============");


        //Replacing the given substring
        //1st approach
        System.out.println(s1.replace("difficult", "easy"));
        //2nd Approach
        System.out.println(s12.replace("Rakesh", "Vidhi")
                .replace("Java", "Selenium"));
        //3rd Approach
        System.out.println(String.format(s13, "Tom", 30));
        System.out.println("===============");

        //Verify whether the string is empty
        System.out.println(s10.isEmpty());//It considers the spaces as well
        System.out.println(s10.isBlank());//If the string contains all the spaces then also it'll consider nothing
        System.out.println("===============");

        //Removing the prefixed and suffixed spaces
        System.out.println(s11.trim());
        System.out.println("===============");

        //Splitting the string
        String[] words = s1.split(" ");
        for (String word: words)
            System.out.println(word);


    }
}
