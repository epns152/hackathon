package program;

import com.opencsv.CSVReader;
import program.entity.events.Event;

import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    private static String CSV_TABLE = "src/program/int20h-ds-test-dataset.csv";

    public static void main(String[] args) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime timestamp = LocalDateTime.parse("2022-01-17 03:41:56", formatter);
//        System.out.println(timestamp.getHour());
        LineByLine(CSV_TABLE);
    }

    public static void LineByLine(String myfile) {
        try {
            FileReader freader= new FileReader(myfile); //created an object of freader class
            CSVReader creader= new CSVReader(freader);  // created creader object by parsing freader as a parameter
            String[] nextRecord;    // created an array of type String
            creader.readNext(); // skip the first line with column names
            int i = 0;
            while ((nextRecord = creader.readNext()) != null && i < 100) {
                Event event = new Event();
                event.setUserId(nextRecord[0]);
                event.setUserState(nextRecord[1]);
                event.setType(nextRecord[2]);
                event.setProperties(nextRecord[3]);
                event.setTimestamp(nextRecord[4]);
                event.setPlatform(nextRecord[5], nextRecord[6], nextRecord[7]);
                System.out.println(event);
                i++;
            }
            System.out.println();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
