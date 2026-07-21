import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        System.out.println("===== ADD TASKS =====");

        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter Task " + i + ": ");
            String task = input.nextLine();

            tasks.add(task);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("task.txt"))) {

            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }

            System.out.println("\nTasks saved successfully.\n");

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

        System.out.println("===== TASKS LOADED FROM FILE =====");

        try (BufferedReader reader = new BufferedReader(new FileReader("task.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {

                System.out.println(line);

            }

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

        scanner.close();
    }
}
