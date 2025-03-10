import java.util.ArrayList;
import java.util.List;

public class Kiosk {

    List<MenuItem> menuList = new ArrayList<>();

    public Kiosk(){
        menuList.add(new MenuItem("ShackBurger ", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuList.add(new MenuItem("SmokeShack  ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuList.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuList.add(new MenuItem("Hamburger   ", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        int count = 1;
        System.out.println("[ SHAKESHACK MENU ]");
        for(MenuItem menuItem : menuList){
            System.out.println(count + ". " + menuItem.foodName + " | W " + menuItem.price + " | " + menuItem.foodIntro);
            count++;
        }
        System.out.println("0. 종료      | 종료");
    }

    public Kiosk(String choiceNumber) {
        switch (choiceNumber) {
            case "1":
                System.out.println("선택한 메뉴 : 1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
                System.out.println("");
                break;
            case "2":
                System.out.println("선택한 메뉴 : 2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
                System.out.println("");
                break;
            case "3":
                System.out.println("선택한 메뉴 : 3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
                System.out.println("");
                break;
            case "4":
                System.out.println("선택한 메뉴 : 4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");
                System.out.println("");
                break;
            case "0":
                System.out.println("프로그램 종료");
                break;
            default:
                System.out.println("잘못 누르셨습니다.");
                System.out.println("");

        }
    }
}
