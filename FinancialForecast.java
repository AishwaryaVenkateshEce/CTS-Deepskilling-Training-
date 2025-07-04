public class FinancialForecast {
    public static double futureValueRecursive(double presentValue,double growthRate,int years){
        if(years==0){
            return presentValue;
        }
        return futureValueRecursive(presentValue,growthRate,years-1)*(1+growthRate);
    }
    public static double futureValueIterative(double presentValue,double growthRate,int years){
        double result=presentValue;
        for(int i=0;i<years;i++){
            result*=(1+growthRate);
        }
        return result;
    }
    public static void main(String[]args){
        double presentValue=1000.0;
        double growthRate=0.05;
        int years=5;
        double recursiveResult=futureValueRecursive(presentValue,growthRate,years);
        double iterativeResult=futureValueIterative(presentValue,growthRate,years);
        System.out.printf("Future Value (Recursive) after %d years:Rs.%.2f%n",years,recursiveResult);
        System.out.printf("Future Value (Iterative) after %d years:Rs.%.2f%n",years,iterativeResult);
    }
}
