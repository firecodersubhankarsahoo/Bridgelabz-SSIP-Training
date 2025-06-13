import java.util.*;

public class rocket_launch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter=sc.nextInt();
        while(counter>0){
            System.out.println(counter);
            if(counter==1){
                System.out.println("Launch the rocket!!!!");
            }
            counter--;
        }

    }
}
