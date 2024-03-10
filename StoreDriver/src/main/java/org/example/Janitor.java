package org.example;

public class Janitor extends AbstractStoreEmployee{
    public Janitor(double numberOfHoursWorked, double hourlyRate,String storeDetails, String associateName) {
        super(numberOfHoursWorked, hourlyRate, storeDetails, 0, associateName);
    }



    /**
     * Returns calculated Pay of the Sales Associate. The calculated pay is the
     * sum of basePay, commission and the product of number of hours worked and
     * hourly rate.
     *
     * @return - This method returns Payment of the Sales Associate.
     */
    @Override
    public double calculatePay() {
        return super.getNumberOfHoursWorked() * super.getHourlyRate();
    }

    @Override
    public boolean checkPromotionEligibility() {
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
