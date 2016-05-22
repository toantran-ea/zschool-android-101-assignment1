package test1.daihocbachkhoa.tranphuc1995.assignment1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tran_phuc on 5/22/2016.
 */
public class CreateData {
    public List<Beverage> createDataBeverages() {
        List<Beverage> arlData = new ArrayList<Beverage>();
        Beverage coffee = new Beverage("Coffee", R.drawable.coffee);
        arlData.add(coffee);
        Beverage orange = new Beverage("Pure Orangle Juice", R.drawable.orange);
        arlData.add(orange);
        Beverage carrot = new Beverage("Carrot Juice", R.drawable.carrot);
        arlData.add(carrot);
        Beverage waterMelon = new Beverage("Water Melon Juice", R.drawable.watermelon);
        arlData.add(waterMelon);
        Beverage guava = new Beverage("Guava Juice", R.drawable.guava);
        arlData.add(guava);
        Beverage heniken = new Beverage("Heineken", R.drawable.heineken);
        arlData.add(heniken);
        return arlData;
    }
}
