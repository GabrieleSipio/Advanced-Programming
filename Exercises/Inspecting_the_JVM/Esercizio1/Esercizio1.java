import java.util.*;
import java.util.Arrays;


public class Esercizio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] strArr = new String[3];
        for (int i = 0; i < 3; i++) {
            strArr[i] = scanner.nextLine();
        }
        Arrays.sort(strArr);
        for (String element : strArr) {
            if (element.length()%2 == 0) {
                System.out.println(element);
            }
        }
    }

}
