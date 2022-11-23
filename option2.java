import java.util.Scanner;

public class option2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Введите имя пользователя");
            Scanner console = new Scanner(System.in);
            String name = console.nextLine();
            System.out.println("Hello " + name);
        }
    }
}
