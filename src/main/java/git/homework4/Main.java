package git.homework4;

public class Main {
    public static void main(String[] args) {
        CalculateService service = new CalculateService();
        System.out.println(service.calculate(100000, 60000, 150000));
    }
}