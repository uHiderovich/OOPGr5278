package Classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;



public class MarkerLogger {
    private static File log;
    private static FileWriter fileWriter;

    public void initLogFileWriter() {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/log.txt");
            log = new File(pathFile);
            log.createNewFile();
            fileWriter = new FileWriter(log);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String createLog(String message) {
        StringBuilder stringBuilder = new StringBuilder();
        String date = new SimpleDateFormat("y-M-dd HH:mm").format(new Date());

        stringBuilder.append(date).append(" ").append(message).append("\n");

        return stringBuilder.toString();
    }

    public void writeLog(String message) {
        try {
            fileWriter.write(createLog(message));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeFileWriter() {
        try {
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
