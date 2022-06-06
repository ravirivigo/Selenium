package properties;
public class int_compare_char {

    public static void main(String[] args) {
        String com = "ad389";
        System.out.println(com.charAt(2));
       char a = com.charAt(2);
       char c = a;
       System.out.println(a);
        int b = 3;
        int n = Character.getNumericValue(a);

        if (b==n) {
            System.out.println("They are similar.\n");

        }
    }
}


