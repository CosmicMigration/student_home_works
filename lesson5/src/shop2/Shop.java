package shop2;

import shop2.goods.Booots;
import shop2.goods.Dress;

public class Shop {

  private Booots boot;

  private Dress dress;

  private String name;


    public Shop() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        public Shop(Booots boot, Dress dress) {
        this.boot = boot;
        this.dress = dress;
    }

    public Booots getBoot() {
        return boot;
    }

    public void setBoot(Booots boot) {
        this.boot = boot;
    }

    public Dress getDress() {
        return this.dress;
    }

    public void setDress(Dress dress) {
        this.dress = dress;
    }
}
