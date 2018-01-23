package shop2;

public class Most_city {

    private int shopCountInShops = 10;
    private Shop[] shops;

    public Most_city() {
        this.shops = new Shop[shopCountInShops];
    }



    public Most_city(Shop[] shops) {
        this.shops = shops;
    }

    public Shop[] getShops() {
        return shops;
    }

    public void setShops(Shop[] shops) {
        this.shops = shops;
    }


    public void addShopToShops(Shop shop){
        for (int i = 0;i<shops.length;i++ ) {
            if(shops[i]==null){
                shops[i] = shop;
                break;
            }
        }

    }

    public void showAllShops(){
        for (Shop shop : shops) {
            if (shop != null) {
                System.out.println(shop.getName());
            }
        }
    }
    public void showOneShop(String name){
        for (Shop sh : shops) {
            if(sh!=null && sh.getName() == name){
                System.out.println(sh.getName());
            }
        }
    }
}
