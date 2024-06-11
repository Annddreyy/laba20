import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        MathOperator operator = MathOperator.getInstance();
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Введите x: ");
        double x = in.nextDouble();
        
        System.out.println("Введите y: ");
        double y = in.nextDouble();
        
        double result = operator.operation(x, y);
        System.out.println(result);
    }
}

class MathOperator {
    private static MathOperator operator = new MathOperator();
    public static MathOperator getInstance() {
        return operator;
    }
    public double operation(double x, double y) {
        return 2 * x + 3 / y;
    }
}