public class FizzBuzz {

    public String play(int number) {
        String result = String.valueOf(number);
        if(ayaBar5BakhshPazirAst(number) && !ayaBar3BakhshPazirAst(number)){
            result = "Buzz";
        }else if(ayaBar3BakhshPazirAst(number) && !ayaBar5BakhshPazirAst(number)){
            result = "Fizz";
        }else if(ayaBar3BakhshPazirAst(number) && ayaBar5BakhshPazirAst(number)){
            result = "FizzBuzz";
        }
        return result;
    }

    private static boolean ayaBar3BakhshPazirAst(int number) {
        return number % 3 == 0;
    }

    private static boolean ayaBar5BakhshPazirAst(int number) {
        return number % 5 ==0;
    }
}
