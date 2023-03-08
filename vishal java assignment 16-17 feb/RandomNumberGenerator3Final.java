import java.util.*;

public class RandomNumberGenerator3Final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for number of students
        System.out.print("How many students are there? ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Ask user for names of students
        String[] names = new String[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student : " + (i+1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Generate random numbers=
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= numStudents; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);

        // Display random numbers and student names
        System.out.println("Here are the randomly assigned student numbers:");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d. %s%n", numbers.get(i), names[i]);
        }

        // Ask user if they want to shuffle names again
        String answer = "y";
        while (answer.equalsIgnoreCase("y")) {
            System.out.print("Do you want to shuffle the names again? (y/n) ");
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                Collections.shuffle(Arrays.asList(names));
                System.out.println("Here are the randomly shuffled names:");
                for (int i = 0; i < numStudents; i++) {
                    System.out.printf("%d. %s%n", numbers.get(i), names[i]);
                }
            }
        }

        scanner.close();
        System.out.println("The Students are arranged in random seats");
    }
}
