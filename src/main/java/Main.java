import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int carsInQueue=5;
        Queue<Integer> str_queue = new LinkedList<>();
        for(int i=0;i<5;i++){
            str_queue.add(i);
        }
        int processedCars=0;
        while (!str_queue.isEmpty()){
            int randomNum = ThreadLocalRandom.current().nextInt(0, 1 + 1);
            if(randomNum==1){str_queue.add(randomNum);}
            processedCars++;

            System.out.println(str_queue.size()+" cars in queue car "+ processedCars +" are processed");
            str_queue.remove();

        }
        processedCars++;
        System.out.println(str_queue.size()+" cars in queue car "+ processedCars +" are processed");
    }
}
