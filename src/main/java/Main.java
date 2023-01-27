import ru.netology.sqr.NumberSquares;


public class Main {
    public static void main(String[] args) {
        NumberSquares service = new NumberSquares();
        int result = service.calcSqrt(200, 300);
        System.out.println("Количество квадратов : " + result);
    }
}
