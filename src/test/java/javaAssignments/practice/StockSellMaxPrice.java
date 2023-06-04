package javaAssignments.practice;

import org.testng.annotations.Test;

public class StockSellMaxPrice {
    @Test
    public void test() {
        int price[] = {100, 180, 260, 310,40, 535, 695};
        int profit=0;
        for (int i=1;i<price.length;i++){
            if(price[i-1]<price[i]){
                profit+=price[i]-price[i-1];
            }
        }
        System.out.println("Profit is : "+profit);
    }
}
