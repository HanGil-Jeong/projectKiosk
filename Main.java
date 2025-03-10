import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String choiceNumber = "";

        while (!choiceNumber.equals("0")){
            Kiosk menu = new Kiosk();
            choiceNumber = scanner.next();
            Kiosk menuChoice = new Kiosk(choiceNumber);
        }
    }
}
