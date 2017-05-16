/**
 * Created by Marcin Gumkowski on 2016-10-17.
 */
public class TheCakeThief16 {

    public long maxDuffelBagValue(CakeType[] cakeTypes, int weightCapacity) {

        // array to hold the maximum possible value at every
        // integer capacity from 0 to weightCapacity
        // starting each index with value 0 long
        long[] maxValuesAtCapacities = new long[weightCapacity + 1];

        // every integer from 0 to the input weightCapacity
        for (int currentCapacity = 0; currentCapacity <= weightCapacity; currentCapacity++) {
            for (CakeType cakeType : cakeTypes) {
                if (cakeType.weight <= currentCapacity) {
                    maxValuesAtCapacities[currentCapacity] = Math.max(maxValuesAtCapacities[currentCapacity], maxValuesAtCapacities[currentCapacity - cakeType.weight] + cakeType.value);
                }
            }
        }
        return maxValuesAtCapacities[weightCapacity + 1];
    }

    class CakeType {

        int weight;
        int value;

        public CakeType(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

    }
}
