public class MenuItem {

    // MenuItem 속성 생성
    String foodName;
    double price;
    String foodIntro;

    // MenuItem 생산자 생성
    MenuItem(String foodName, double price, String foodIntro){
        this.foodName = foodName;
        this.price = price;
        this.foodIntro = foodIntro;

    }

    MenuItem(String foodName){
        this.foodName = foodName;
    }



}
