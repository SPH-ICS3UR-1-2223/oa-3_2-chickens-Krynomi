public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
    	double eggcount = 0;
    	double dailyAverage = 0;
    	double monthlyAverage = 0;
    	double monthlyProfit = 0;
    	
    	//Monday
    	eggcount+= 100;
    	
    	//Tuesday
    	eggcount+= 121;
    	
    	//Wednesday
    	eggcount+= 117;
    	
    	dailyAverage= eggcount/3;
    	monthlyAverage = dailyAverage * 30;
    	monthlyProfit = monthlyAverage * 0.18;
    	
    	
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
