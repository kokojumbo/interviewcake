/**
 * Created by kmg on 2015-12-16.
 */
public class FindDuplicate40 {


    //tablica wejsciowa zawiera wskazniki na pozycje innych elementów w tablicy tworzac linkedlist
    public int findDuplicate(int[] intArray) {

        int n = intArray.length - 1;

        int positionInCycle = n + 1;
        //znalezienie się w cyklu
        for (int i = 0; i < n; i++) {
            positionInCycle = intArray[positionInCycle - 1];
        }


        //znalezienie długości cyklu
        int cycleLength = 0;
        int positionInCycleRemembered = positionInCycle;
        for (int i = 0; i < n; i++) {
            positionInCycle = intArray[positionInCycle - 1];
            cycleLength++;
            if (positionInCycle == positionInCycleRemembered) {
                break;
            }
        }

        //znalezienie pierwszego elementu cyklu
        int startPointer = n + 1;
        int endPointer = n + 1;
        for (int i = 0; i < cycleLength; i++) {
            endPointer = intArray[endPointer - 1];
        }

        while(intArray[startPointer - 1] != intArray[endPointer - 1]){
            startPointer = intArray[startPointer - 1];
            endPointer = intArray[endPointer - 1];
        }

        return endPointer;
    }

}
