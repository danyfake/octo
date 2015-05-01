import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by User on 01.05.2015.
 */
public class Happy_ticket {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the number of ticket: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();

        int n1 = Integer.parseInt(s1);

        if ((n1 < 100000) && (n1 > 999999)){
            System.out.println("Oops, not a ticket");
        }
        else if_happy(n1);

    }

    public static void if_happy(int n){
        int sum1 = half_sum(n % 1000), sum2 = half_sum(n / 1000);
        if (sum1 == sum2) System.out.println("Happy!");
        else System.out.println("Not happy :(");
    }

    //вычисляем сумму трех цифр
    public static int half_sum(int n){
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}
