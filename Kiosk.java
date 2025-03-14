
public class Kiosk {

    Menu menu = new Menu();

    Kiosk(String choiceNumber) {
        if (choiceNumber.equals("1")) {
            menu.showBurgerMenu();
        }
    }
}
