package Recursive;

public class CU1901 {

    public static void StringReverse(String n) {
        if(n.length() == 0) {
            return;
        }

        else {
            System.out.print(n.chatAt(n));
            StringReverse(n - 1);
        }
        
    }

    public static void main(String[] args) {
        StringReverse("Hello, World!");
    }
}
