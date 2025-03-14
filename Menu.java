import java.util.ArrayList;
import java.util.List;

public class Menu implements Screen {

    // 버거메뉴 정보 저장할 List 생성
    List<MenuItem> burgerMenuList = new ArrayList<>();
    List<MenuItem> menuCategoryList = new ArrayList<>();

    public Menu() {
        // 메뉴 카테고리 정보를 List로 받을 생성자 생성
        menuCategoryList.add(new MenuItem("Burger"));
        menuCategoryList.add(new MenuItem("Drink"));
        menuCategoryList.add(new MenuItem("Dessert"));

        // 버거 메뉴 정보를 List로 받을 생성자 생성
        MenuItem ShackBurger = new MenuItem("ShackBurger ", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem SmokeShack = new MenuItem("SmokeShack ", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem Cheeseburger = new MenuItem("Cheeseburger ", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem Hamburger = new MenuItem("Hamburger ", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        burgerMenuList.add(ShackBurger);
        burgerMenuList.add(SmokeShack);
        burgerMenuList.add(Cheeseburger);
        burgerMenuList.add(Hamburger);
    }


    @Override
    public void showMenuCategory() {
        int choiceMenuCategory = 1; // 선택 번호 생성
        System.out.println("[ MAIN MENU ]");
        for (MenuItem menuItem : menuCategoryList) { // for문을 활용하여 리스트 조회
            //리스트 속성 출력
            System.out.println(choiceMenuCategory + ". " + menuItem.foodName);
            choiceMenuCategory++;
        }
        System.out.println("0. 종료      | 종료");
    }

    @Override
    public void showBurgerMenu() {
        int choiceBurgerMenu = 1; // 선택 번호 생성
        System.out.println("[ SHAKESHACK MENU ]");
        for (MenuItem menuItem : burgerMenuList) { // for문을 활용하여 리스트 조회
            //리스트 속성 출력
            System.out.println(choiceBurgerMenu + ". " + menuItem.foodName + " | W " + menuItem.price + " | " + menuItem.foodIntro);
            choiceBurgerMenu++;
        }
        System.out.println("0. 뒤로가기");
    }
}
