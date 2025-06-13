import java.util.*;

public class can_person_vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println("the age of the person is "+age);
        if(age>=18){
            System.out.println("the person can vote ");
        }else{
            System.out.println("the person can't vote");
        }

    }
}
