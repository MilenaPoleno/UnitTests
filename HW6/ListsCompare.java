package unittests.HW6;

import java.util.ArrayList;
import java.util.List;

public class ListsCompare {
    public double average(List<Integer> request) {
        return request.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }

    public String compareAverage(List<Integer> listOne, List<Integer> listTwo) {
        double resultListOne = average(listOne);
        double resultListTwo = average(listTwo);

        if (resultListTwo > resultListOne) {
            return "Второй список имеет большее среднее значение";
        } else if (resultListTwo < resultListOne) {
            return "Первый список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}