import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordCount {
    private static String CATALOGUE = "C:\\Users\\User\\IdeaProjects\\WordCount\\src\\main\\java\\Test.txt";

    public static void main(String[] args) throws FileNotFoundException {
        getWordCount(CATALOGUE);

    }

    public static void getWordCount(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        Map<String, Integer> occurrences = new HashMap<>();

        while (scanner.hasNext()) {

            List<String> list = new ArrayList<String>(Arrays.asList(scanner.next().split(" ")));
            for (String word : list) {
                Integer oldCount = occurrences.get(word);
                occurrences.put(word, oldCount == null ? 1 : oldCount + 1);

            }


        }
        System.out.println(occurrences);
        scanner.close();

    }
}
