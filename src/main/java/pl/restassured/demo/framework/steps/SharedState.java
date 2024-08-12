package pl.restassured.demo.framework.steps;

public class SharedState {
    private String notedStartPrice;
    private String notedMonthlyPrice;

    public String getNotedStartPrice() {
        return notedStartPrice;
    }

    public void setNotedStartPrice(String notedStartPrice) {
        this.notedStartPrice = notedStartPrice;
    }

    public String getNotedMonthlyPrice() {
        return notedMonthlyPrice;
    }

    public void setNotedMonthlyPrice(String notedMonthlyPrice) {
        this.notedMonthlyPrice = notedMonthlyPrice;
    }
}