import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 스캐너 선언
        Scanner scanner = new Scanner(System.in);

        String choiceNumber;
        // do-while문 활용 Kiosk 반복 실행
        do {
            // Kiosk클래스 menu 인스턴스화
            Kiosk menu = new Kiosk();
            choiceNumber = scanner.next();
            Kiosk menuChoice = new Kiosk(choiceNumber);
        } while (!choiceNumber.equals("0"));
    }
}
