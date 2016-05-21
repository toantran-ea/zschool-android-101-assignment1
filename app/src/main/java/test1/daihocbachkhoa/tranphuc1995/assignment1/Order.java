package test1.daihocbachkhoa.tranphuc1995.assignment1;

/**
 * Created by tran_phuc on 5/20/2016.
 */
public class Order {
    private String checkBeverages;
    private String numberOfOrder;

    public Order(String checkBeverages, String numberOfOrder) {
        this.checkBeverages = checkBeverages;
        this.numberOfOrder = numberOfOrder;
    }

    public String getCheckBeverages() {
        return checkBeverages;
    }

    public void setCheckBeverages(String checkBeverages) {
        this.checkBeverages = checkBeverages;
    }

    public String getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(String numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }
}
