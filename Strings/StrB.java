import java.util.*;
public class StrB {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Football");
        System.out.println("After performing insert function on the string");
        str.insert(0 , 'R');
        System.out.println(str);
        System.out.println("After performing set function on the string");
        str.setCharAt(1 , 'o');
        System.out.println(str);
    }
}