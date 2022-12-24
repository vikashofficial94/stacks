import java.util.Scanner;
import java.util.*;

public class Source{
    public static void main(String arg[]) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        String ans = "", data = in.nextLine();
        for (char element : data.toCharArray()) {
            s.push(element);
        }
        for (char element : data.toCharArray()) {
            ans += s.pop();
        }
        System.out.print(ans);
    }
}
