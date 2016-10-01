import java.util.*;

/**
 * Created by Marcin Gumkowski on 2016-09-09.
 */
public class TemperatureTracker7 {

    public Integer tempsCounter = 0;
    public Map<Integer, Integer> tempsCount = new HashMap<Integer, Integer>();
    Integer max = Integer.MIN_VALUE;
    Integer min = Integer.MAX_VALUE;
    Double sum = 0.0;
    List<Integer> mode = new ArrayList<Integer>();
    Integer maxCount = 0;

    public Integer insert() {

        Random r = new Random();
        int x = r.nextInt();
        tempsCounter++;
        if (tempsCount.containsKey(x)) {
            tempsCount.put(x, tempsCount.get(x) + 1);
        } else {
            tempsCount.put(x, 1);
        }
        if (tempsCount.get(x).equals(maxCount)) {
            mode.add(x);
        }

        if (tempsCount.get(x) > maxCount) {
            maxCount = tempsCount.get(x);
            mode.clear();
            mode.add(x);
        }

        if (x < min) {
            min = x;
        }
        if (x > max) {
            max = x;
        }
        sum += x;
        return x;
    }

    public Integer getMax() {
        return max;
    }

    public Integer getMin() {
        return min;
    }

    public Double getMean() {
        return sum / tempsCounter;
    }

    public Integer getMode() {
        return mode.get(0);
    }


}
