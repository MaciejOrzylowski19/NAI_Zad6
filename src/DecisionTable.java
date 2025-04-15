import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecisionTable {


    private List<List<String>> values;

    public DecisionTable(File file, String sep) throws FileNotFoundException {

        BufferedReader br = new BufferedReader(new FileReader(file));

        this.values = new ArrayList<>();
        br.lines().forEach( a -> this.values.add(Arrays.asList(a.split(sep))));

    }

    public List<String> getValuesForAtribute(int row) {
        List<String> t = new ArrayList<>();
        for (List<String> l : values) {
            t.add(l.get(row));
        }
        return t;
    }
}
