package main;

import java.util.ArrayList;
import java.util.List;

public class assembleAdjacentChecklist {

    public static List<Integer> assembleAdjacentChecklist(List<Integer> numberPlace, String[] row){
        List<Integer> adjacentChecklist = new ArrayList<>();
        if (numberPlace.get(0) != 0){
            adjacentChecklist.add(numberPlace.get(0) - 1);
        }
        for (Integer integer : numberPlace) {
            adjacentChecklist.add(integer);
        }
        if (numberPlace.get(numberPlace.size() -1) != row.length -1){
            adjacentChecklist.add(numberPlace.get(numberPlace.size()-1) +1);
        }

        return adjacentChecklist;
    }
}
