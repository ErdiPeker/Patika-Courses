package InsuranceCompany;

import java.util.Date;

public abstract class Insurance {
    private String name;
    private double price;
    private Date startDate;
    private Date endDate;

    public Insurance(String name, double price, Date startDate, Date endDate) {
        this.name = name;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public abstract void calculate();
}

class HealthInsurance extends Insurance {

    public HealthInsurance(double price, Date startDate, Date endDate) {
        super("HealthInsurance", price, startDate, endDate);
    }

    @Override
    public void calculate() {

    }
}

class ResidenceInsurance extends Insurance {

    public ResidenceInsurance(double price, Date startDate, Date endDate) {
        super("ResidenceInsurance", price, startDate, endDate);
    }

    @Override
    public void calculate() {

    }
}

class TravelInsurance extends Insurance {

    public TravelInsurance(double price, Date startDate, Date endDate) {
        super("TravelInsurance", price, startDate, endDate);
    }

    @Override
    public void calculate() {

    }
}

class CarInsurance extends Insurance {

    public CarInsurance(double price, Date startDate, Date endDate) {
        super("CarInsurance", price, startDate, endDate);
    }

    @Override
    public void calculate() {

    }
}