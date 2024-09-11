package Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;



public class Logger {
    private static Logger logger;
    private String filename;

    private BufferedWriter writer;
    private Logger() {
        this.filename = "default.txt";
        openFile();
    }

    private void openFile() {
        try {
            writer = new BufferedWriter(new FileWriter(filename, true)); // Append mode
        } catch (IOException e) {
            System.err.println("Error opening file: " + e.getMessage());
        }
    }
    public static synchronized Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void setFileName(String newFileName) {
        close();
        this.filename = newFileName;
        openFile();
    }
    public void write(String input) {
        try {
            if (writer != null) {
                writer.write(input);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
    public void close() {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            System.err.println("Error closing file: " + e.getMessage());
        }
    }
}
