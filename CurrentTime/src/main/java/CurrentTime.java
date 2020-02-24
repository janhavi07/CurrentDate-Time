import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class CurrentTime {
    public static void main(String[] args) throws IOException {
        LocalDateTime current = LocalDateTime.now();
        Calendar now = Calendar.getInstance();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formatted = current.format(formatter);
        System.out.println("Hey Janhavi Parte , this is the Current Date and Time : " + formatted);
        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/janhavi.parte/Desktop/Projects/CurrentTime/src/main/resources/CurrentDateTimeFile.txt"));
        writer.write(formatted);
        writer.close();
    }
}
