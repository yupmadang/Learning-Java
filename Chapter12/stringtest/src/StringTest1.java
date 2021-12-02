public class StringTest1 {
    public static void main(String[] args) throws Exception {
        String str1 = new String("abc");
        String str2 = new String("abc");
        String javaStr = new String("java");
        String androidStr = new String("android");

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));

        System.out.println("\n");

        System.out.println(javaStr);
        System.out.println(System.identityHashCode(javaStr));

        javaStr = javaStr.concat(androidStr);

        System.out.println(javaStr);
        System.out.println(System.identityHashCode(javaStr));

    }
}
