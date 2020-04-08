
/*
* @author sandeep kolli
*/

import java.util.Arrays;

public class YahtZee{
    public static int rollDice(){
        double randomNumber=Math.random();
        return (int)(randomNumber*6)+1;}

    public static int[] keepRolling(){
        int count=1;
        int [] diceArr = new int[6];
        while(true){
            for(int i=0;i<6;i++){
                diceArr[i]=rollDice();
            }
            Arrays.sort(diceArr);
            if(diceArr[0]==diceArr[diceArr.length-1]){
                break;
            }
            else count=count+1;
        }
        int [] returnValue = new int[2];
        returnValue[0]=count;
        returnValue[1]=diceArr[0];
    return returnValue;
    }
    
    public static void main(String[] args){
        int [] finalVal = keepRolling();
        System.out.println("After rolling "+ finalVal[0]+ " Times, we got equal number on all dices, and the number is: "+ finalVal[1]);
    }
}