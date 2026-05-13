import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class counter {

    public static void main(String[] args){
        Random rand=new Random();
        int num=rand.nextInt(20)+1;
        Scanner sc=new Scanner(System.in);
        
        int counter=0;
        ArrayList<Integer> guesses =new ArrayList<>();


        while(true){
            System.out.println("enter a guess (1-20):");
        int guess=sc.nextInt();
        guesses.add(guess);
        counter++;
        if(guess==num){
            System.out.println("correct");
            break;
        }
        else if(guess>num){
         System.out.println("too high");
    
}
        else{
            System.out.println("too low");
}

}
        
        System.out.println("number of attempts :"+counter);
        System.out.println("your guesses were :"+guesses);
        

        
    }
}