import java.io.*;

public class Reader {
    public String read(String filename) {
        String inputFileName = "src/main/resources/" + filename;
        StringBuilder buffer = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }
}
