import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {
    public static void main(String[] args) throws IOException {
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formatted = current.format(formatter);
        System.out.println("Current Date and Time is: " + formatted);
        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/janhavi.parte/Desktop/CurrentDateTimeFile.txt"));
        writer.write(formatted);
        writer.close();
    }
}
