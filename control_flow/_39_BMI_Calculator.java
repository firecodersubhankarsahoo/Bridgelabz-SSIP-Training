import java.util.*;

public class _39_BMI_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        double heightCm = input.nextDouble();
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        System.out.println("BMI: " + bmi);

    }
}
