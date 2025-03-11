package wrapperClass;

public class IntegerWrapper {
    public static void main(String[] args) {
        int a = 15;
        Integer i1 = a;//Boxing: primitive datatype value assigned to Derived datadatype. This is implicit
//        System.out.println(i1);

        Integer i2 = 30;
        int b = i2;//Unboxing: storing the derived datatype value into the primitive datatypes
//        System.out.println(b);

        int exp = 59900;
        String price = "USD 59,900"; //----> 59900
        String replaced = price.replaceAll("[^0-9]", "");
        System.out.println(replaced);
        //Converting the String into int
        int act = Integer.parseInt(replaced);
        System.out.println(exp == act);

        String price1 = "60000.05";
        //Converting price1 into float
        float f1 = Float.parseFloat(price1);
        System.out.println(f1);
        double d1 = Double.parseDouble(replaced);
        System.out.println(d1);

        String flag1 = "false";
        System.out.println(Boolean.parseBoolean(flag1));
    }
}
