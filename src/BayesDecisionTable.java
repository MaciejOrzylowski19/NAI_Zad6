import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;

public class BayesDecisionTable extends DecisionTable{



    public BayesDecisionTable(File file, String sep) throws FileNotFoundException {
        super(file, sep);
    }

}
