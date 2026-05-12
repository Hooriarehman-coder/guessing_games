import java.util.Random;

public class RandomNumberGenerator {
    int generateNumber() {

    Random random=new Random();
    int num=random.nextInt(20)+1;
    return num;
    }
    
}
