import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.NumberSquares;

public class NumberSquaresTest {
    @ParameterizedTest
    @CsvSource({
            "10,300,8",
            "100,1000,22",
            "1,500,13",
            "1234,5678,40"

    })
    public void calculateTheSquare(int start, int end, int expected) {
        NumberSquares service = new NumberSquares();

        int actual = service.calcSqrt(start, end);
        System.out.println("Количество квадратов : " + actual);
        Assertions.assertEquals(expected, actual);
    }
}
