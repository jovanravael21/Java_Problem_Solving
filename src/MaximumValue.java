import java.util.ArrayList;

public class MaximumValue {
    public static void main(String[] args){
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(23);
        numList.add(8);
        numList.add(5);
        numList.add(35);
        numList.add(8);

        int maxValue = numList.get(0);
        int currentValue;
        for(int i = 0; i < numList.size(); i++){
            currentValue = numList.get(i);
            if(currentValue >= maxValue){
                maxValue = numList.get(i);
                System.out.print(maxValue + " ");
            }
        }
    }
}
