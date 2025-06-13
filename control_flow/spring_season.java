import java.util.*;

public class spring_season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month=sc.nextInt();
        int date=sc.nextInt();
        //3--march
        //6-- june
        if((month==3&&date>=20)||(month==6&&date<=20)||(month>3&&month<6)){
            System.out.println("Its a Spring Season”");
        }else {
            System.out.println("its not a spring season");
        }

    }
}
