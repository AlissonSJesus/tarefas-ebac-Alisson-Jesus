import java.util.ArrayList;
import java.util.Arrays;

public class ListNames {
    ArrayList<String> handleNames(String names) {
        String[] primaryNames = names.trim().split(",");
        return new ArrayList<>(Arrays.asList(primaryNames));
    }
}
