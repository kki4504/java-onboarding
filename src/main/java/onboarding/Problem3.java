package onboarding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;

        return answer;
    }
    public static int clapTotal (int number) {
        List<Integer> target = Arrays.asList(3, 6, 9);

        return (int) Arrays.stream(Integer.toString(number).split(""))
                .map(x -> Integer.parseInt(x))
                .filter(x -> target.contains(x)).count();
    }
}
