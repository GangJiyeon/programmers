public class ex6 {
    
    public static void main(String[] args) {

        int[] prices = new int[5];
        prices[0] = 1;
        prices[1] = 2;
        prices[2] = 3;
        prices[3] = 2;
        prices[4] = 3;

        int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length-1; i++){
            
            for(int index=i+1; index<prices.length; index++){
                if(prices[i]<=prices[index]){
                    answer[i] = answer[i] + 1;
                }

            }
            
        }

        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
        
    }
}
