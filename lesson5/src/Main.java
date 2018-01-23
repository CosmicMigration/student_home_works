import shop2.Most_city;
import shop2.Shop;
import shop2.goods.Booots;
import shop2.goods.Dress;

public class Main {

    private static Booots boots;
    private static Dress dress;

    public static void main(String[] args) {

        Most_city most_city = new Most_city();

        Shop shop = new Shop();
        shop.setName("Butik");

        Booots anotherBoots = new Booots();
        anotherBoots.setDeveloper("Chreschatic st.", 49000, "Kuiv");
        shop.setBoot(anotherBoots);

        most_city.addShopToShops(shop);

        Shop shop1 = new Shop();
        shop1.setName("good Shop");

        most_city.addShopToShops(shop1);


        most_city.showOneShop("good Shop");

    }

}
