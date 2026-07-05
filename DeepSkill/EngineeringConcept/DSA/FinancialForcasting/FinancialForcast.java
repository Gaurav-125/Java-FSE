public class FinancialForcast {

    public static double futurevalue(double currentValue, double growthRate, int years){

        if(years==0) return currentValue;

        return futurevalue(currentValue, growthRate, years-1)*(1+growthRate);
    }
    public static void main(String[] args) {
        double currentValue=1000;
        double growthRate=0.10;
        int years=3;

        double result=futurevalue(currentValue, growthRate, years);
        System.out.println(result);
    }
}
