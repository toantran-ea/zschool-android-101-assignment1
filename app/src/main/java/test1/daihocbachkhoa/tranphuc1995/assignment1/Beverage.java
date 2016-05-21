package test1.daihocbachkhoa.tranphuc1995.assignment1;

/**
 * Created by tran_phuc on 5/16/2016.
 */
public class Beverage {
    private String drinkName;
    private int imageBeverage;

    public Beverage(String drinkName, int imgBeverages) {
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
        return imageBeverage;
    }

    public void setImgBeverages(int imgBeverages) {
        this.imageBeverage = imgBeverages;
    }
}
