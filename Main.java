import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Menu정보를 인스턴스한 후 정보를 받아 그대로 저장
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ShackBurger ", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack  ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger   ", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        String choice = "";
        // while문 활용하여 반복문 실행
        while (!choice.equals("0")) {

            int selectNumber = 1; // 선택 번호 생성
            for (MenuItem menuItem : menuItems) { // for문을 활용하여 menuItems조회
                // menuItems 정보 출력
                System.out.println(selectNumber + ". " + menuItem.foodName + " | W " + menuItem.price + " | " + menuItem.foodItro);
                selectNumber++;
            }
            System.out.println("0. 종료      | 종료");
            // 선택 로직 생성
            choice = scanner.next();
            switch (choice) {
                case "1":
                    System.out.println("선택한 메뉴: 1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                    System.out.println("");
                case "2":
                    System.out.println("선택한 메뉴: 2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                    System.out.println("");
                case "3":
                    System.out.println("선택한 메뉴: 3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                    System.out.println("");
                case "4":
                    System.out.println("선택한 메뉴: 4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                    System.out.println("");
                case "0":
                    System.out.println("프로그램을 종료합니다.");

            }
        }
    }
}
