package Stolovka123;

/**
 * Created by user on 27.10.2015.
 */
public class Menu {
    public static void main(String[] args) {
        Dish[] dish = new Dish[5];
        dish[0] = new Dish(8, "Борщ", 49);
        dish[1] = new Dish(12, "Картопляне пюре", 121);
        dish[2] = new Dish(18, "Печінка", 130);
        dish[3] = new Dish(20, "Форель", 230);
        dish[4] = new Dish(6, "Гречка", 310);
        for (int i = 0; i < dish.length; i++)
            System.out.println(dish[i]);
    }
}
