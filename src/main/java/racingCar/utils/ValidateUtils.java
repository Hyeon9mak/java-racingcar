package racingCar.utils;

public class ValidateUtils {

    public static void validateCarNames(String[] carNames) {
        for (String carName : carNames) {
            validateCarName(carName);
        }
    }

    private static void validateCarName(String carName) {
        validateCarNameLength(carName);
        validateCarNameNotEmpty(carName);
    }

    private static void validateCarNameLength(String carName) {
        if (carName.length() >= 1 && carName.length() <= 5) {
            return;
        }
        throw new RuntimeException("[에러] 자동차 이름은 1자 이상 5자 이하여야 합니다.");
    }

    private static void validateCarNameNotEmpty(String carName) {
        if (!carName.isEmpty()) {
            return;
        }
        throw new RuntimeException("[에러] 자동차 이름은 공백이 안됩니다.");
    }

    public static int validateRacingRoundCount(String input) {
        int count = validateInteger(input);
        validateNotNegitive(count);
        return count;
    }

    private static void validateNotNegitive(int count) {
        if(count > 0){
            return;
        }
        throw new RuntimeException("[에러] 시도횟수는 자연수이어야 합니다.");
    }

    private static int validateInteger(String count) {
        return Integer.parseInt(count);
    }
}
