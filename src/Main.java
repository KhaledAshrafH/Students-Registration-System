import java.io.BufferedWriter;
import java.io.File;
import java.lang.reflect.Array;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static class CSVFileHelper {
        public List<String> readLinesFromCSVFile(String path) throws IOException {
            Path filePath = Paths.get(path);
            List<String> results = new ArrayList<>();

            try (BufferedReader buffer = Files.newBufferedReader(filePath, Charset.defaultCharset())) {
                String line = "";
                while ((line = buffer.readLine()) != null) {
                    results.add(line);
                }

            }
            return results;
        }

        public void writeLinesToCSVFile(String path, String... lines) throws IOException {
            Path filePath = Paths.get(path);
            try (BufferedWriter buffer = Files.newBufferedWriter(filePath,
                    Charset.defaultCharset(),
                    StandardOpenOption.APPEND)) {
                for (String line : lines) {
                    buffer.append(line);
                    buffer.newLine();
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String dirPath = "C:\\Users\\5aleda4rf\\IdeaProjects\\students_registration_system\\app\\data\\batch";
        String filePathStr = "C:\\Users\\5aleda4rf\\IdeaProjects\\students_registration_system\\app\\data\\batch\\database.csv";
        while (true) {
            System.out.println("1- Add student data\n" +
                    "2- Add batch students data\n" +
                    "3- Exit");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Enter the data in the following order (NAME, ID, COURSES)");
                String name, courses, id;
                input.nextLine();
                name = input.nextLine();
                id = input.nextLine();
                courses = input.nextLine();
                new CSVFileHelper().writeLinesToCSVFile(filePathStr,
                        name + "," + id + "," + courses);
                System.out.println(courses);
            } else if (choice == 2) {
                File dir = new File(dirPath);
                String[] children = dir.list();
                assert children != null;
                System.out.println("The Available Files:-");
                for (String child : children)
                    if (child.contains("verified"))
                        System.out.println(child);
                System.out.println("Enter 'Yes' if you want choose one of these files, otherwise 'No'");
                String checkApprove = input.next();
                if (checkApprove.equalsIgnoreCase("yes")) {
                    System.out.print("Enter File Name: ");
                    String fileName = input.next();
                    String filePath = dirPath + "/" + fileName;
                    System.out.println(filePath);
                    List<String> list = new CSVFileHelper().readLinesFromCSVFile(filePath);
                    for (String line : list) {
                        new CSVFileHelper().writeLinesToCSVFile(filePathStr,
                                line);
                    }
                    System.out.println("Data Added Successfully From " + fileName + " to database.csv");
                }
            } else if (choice == 3) {
                System.out.println("System closed Successfully.");
                break;
            } else {
                System.out.println("This number not valid .. Enter correct number!");
            }
        }
        List<String> list = new CSVFileHelper().readLinesFromCSVFile(filePathStr);
        System.out.println(list.get(3));
    }
}