import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


        List<String> labels = Arrays.asList( new String[]{"y","y","y","n","n","y", "y", "s"});

        var o = Utils.calculatePriors(labels);

        for (String l : o.keySet()) {
            System.out.println(l + ": " + o.get(l));
        }

    }
}