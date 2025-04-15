import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {



    public static Map<String, Double> calculatePriors(List<String> labels) {


        HashMap<String, Integer> countedMap = new HashMap<>();
        List<String> distincL = labels.stream().distinct().toList();

        for (String label : distincL) {
            countedMap.put(label, 0);
        }

        labels.forEach(a -> countedMap.put(a, countedMap.get(a) + 1));
        HashMap<String, Double> priors = new HashMap<>();

        for (String label : countedMap.keySet()) {
            priors.put(label, (double)countedMap.get(label) / labels.size());
        }
        return priors;
    }





}
