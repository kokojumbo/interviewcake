/**
 * Created by kmg on 2016-02-26.
 */
public class CakeThief16 {

    class CakeType {

        int weight;
        int value;

        public CakeType(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

    }

    public int maxDuffelBagValue(CakeType[] cakeTypes, int weightCapacity) {

        int maxValueAtCapacities[] = new int[weightCapacity + 1];


        for (int currentCapacity = 0; currentCapacity <= weightCapacity; currentCapacity++) {
        int currentMaxVal = 0;
            for (CakeType cakeType : cakeTypes) {
                if(cakeType.weight <= currentCapacity){

                    int max = Math.max(cakeType.value, maxValueAtCapacities[currentCapacity - cakeType.weight]);

                    currentMaxVal = Math.max(max,maxValueAtCapacities[currentCapacity]);

                }


            }
            maxValueAtCapacities[currentCapacity] = currentMaxVal;
        }

        return maxValueAtCapacities[weightCapacity];
    }


}
