
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<Student>();

        while (true) {
            System.out.println("name: ");
            String temp = reader.nextLine();
            if (temp.isEmpty()) {
                break;
            } else {
                System.out.println("student number: ");
                String temp2 = reader.nextLine();
                list.add(new Student(temp, temp2));
            }

        }

        for (Student std : list) {
            System.out.println(std);
        }
        
        System.out.println("Give search term: ");
        System.out.println("Result: ");
        String temp3=reader.nextLine();
        for (Student std : list) {
            if(std.getName().contains(temp3)) System.out.println(std);
        }
        
    }

}