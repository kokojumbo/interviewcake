/**
 * Created by kmg on 2016-02-26.
 */
public class FindUniqueInDuplicates21 {
    /*
      public int findUniqueDeliveryId(int[] deliveryIds) {

    int uniqueDeliveryId = 0;

    for (int i = 0; i < deliveryIds.length; i++) {
        uniqueDeliveryId ^= deliveryIds[i];
    }

    return uniqueDeliveryId;
    }

    O(n) time and O(1) space
    XOR operation
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 3};


        System.out.println(findUniqueDeliveryId(a));
    }

    public static int findUniqueDeliveryId(int[] deliveryIds) {

        int uniqueDeliveryId = 0;
        uniqueDeliveryId = deliveryIds[0];
        for (int i = 1; i < deliveryIds.length; i++) {
            uniqueDeliveryId ^= deliveryIds[i];
        }

        return uniqueDeliveryId;
    }

}
