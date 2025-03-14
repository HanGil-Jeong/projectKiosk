import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 스캐너 선언
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();

        menu.showMenuCategory();

        String choiceNumber = "";//
        // while문 활용 Kiosk 반복 실행
        while (!choiceNumber.equals("0")){
            choiceNumber = scanner.next();

        }


    }
}
