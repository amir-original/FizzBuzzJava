import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void should_return_1_if_the_number_is_1() {
        //  Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //  When
        String result = fizzBuzz.play(1);

        //  Then
        Assertions.assertThat(result).isEqualTo("1");
    }

    @Test
    void should_return_2_if_the_number_is_2() {
        //  Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //  When
        String  result = fizzBuzz.play(2);

        //  Then
        Assertions.assertThat(result).isEqualTo("2");
    }

    @Test
    void should_return_4_if_the_number_is_4() {
        //  Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //  When
        String result = fizzBuzz.play(4);

        //  Then
        Assertions.assertThat(result).isEqualTo("4");
    }

    @Test
    void should_return_Fizz_if_the_number_is_3() {
        //  Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //  When
        String result = fizzBuzz.play(3);

        //  Then
        Assertions.assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void should_return_Fizz_if_the_number_is_6() {
        //  Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //  When
        String result = fizzBuzz.play(6);

        //  Then
        Assertions.assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void should_return_Fizz_if_the_number_is_9() {
        //  Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //  When
        String result = fizzBuzz.play(9);

        //  Then
        Assertions.assertThat(result).isEqualTo("Fizz");
    }

    @Test
    void should_return_Buzz_if_the_number_is_5() {
        //  Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //  When
        String result = fizzBuzz.play(5);

        //  Then
        Assertions.assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void should_return_Buzz_if_the_number_is_10() {
        //  Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //  When
        String result = fizzBuzz.play(10);

        //  Then
        Assertions.assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void should_return_Buzz_if_the_number_is_20() {
        //  Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //  When
        String result = fizzBuzz.play(20);

        //  Then
        Assertions.assertThat(result).isEqualTo("Buzz");
    }

    @Test
    void should_return_FizzBuzz_if_the_number_is_15() {
        //  Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //  When
        String result = fizzBuzz.play(15);

        //  Then
        Assertions.assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    void should_return_FizzBuzz_if_the_number_is_30() {
        //  Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //  When
        String result = fizzBuzz.play(30);

        //  Then
        Assertions.assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    void should_return_FizzBuzz_if_the_number_is_45() {
        //  Given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //  When
        String result = fizzBuzz.play(45);

        //  Then
        Assertions.assertThat(result).isEqualTo("FizzBuzz");
    }
}
