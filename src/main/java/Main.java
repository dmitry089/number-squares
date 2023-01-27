import ru.netology.sqr.NumberSquares;


public class Main {
    public static void main(String[] args) {
        NumberSquares service = new NumberSquares();
        int result = service.calcSqrt(1234, 5678);
        System.out.println("Количество квадратов : " + result);
    }
}
