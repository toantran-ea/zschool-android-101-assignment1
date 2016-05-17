package test1.daihocbachkhoa.tranphuc1995.assignment1;

/**
 * Created by tran_phuc on 5/16/2016.
 */
public class Beverages {
    private String drinkName;
    private int imgBeverages;

    public Beverages(String drinkName, int imgBeverages) {
        this.setDrinkName(drinkName);
        this.setImgBeverages(imgBeverages);
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public int getImgBeverages() {
        return imgBeverages;
    }

    public void setImgBeverages(int imgBeverages) {
        this.imgBeverages = imgBeverages;
    }
}
