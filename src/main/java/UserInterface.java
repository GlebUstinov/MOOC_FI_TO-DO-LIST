import java.util.Scanner;
public class UserInterface {

    private TodoList list;
    private Scanner scan;

    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = scan.nextLine();
            
            if (input.equals("stop")) { break; }
            
            if (input.equals("add")) {
                System.out.println("To add: ");
                String task = scan.nextLine();
                this.list.add(task);
            }

            if (input.equals("list")) {
                this.list.print();
            }

            if (input.equals("remove")) {
                System.out.println("Which one is removed? ");
                int numOfTask = Integer.valueOf(scan.nextLine());
                this.list.remove(numOfTask);
            }
        }
    }
}
