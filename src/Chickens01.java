public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
    	
    	//Monday
    	int chickenCount = 8;
    	int eggsPerChicken = 4;
    	int totalEggs = (chickenCount * eggsPerChicken);
    	
    	//Tuesday
    	chickenCount++;
    	totalEggs+=chickenCount * eggsPerChicken;
    	
    	//Wednesday
    	chickenCount = chickenCount/2;
    	totalEggs+=chickenCount * eggsPerChicken;
    
        System.out.println(totalEggs);
    }   
}
