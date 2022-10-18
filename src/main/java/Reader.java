import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    public static int read() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            str = br.readLine();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        int number;
        try {
            number = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            number = -1;
        }
        return number;
    }
}
