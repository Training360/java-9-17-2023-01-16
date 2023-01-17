package inference;

import javax.xml.bind.JAXBContext;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class InferenceDemo {

    public static void main(String[] args) throws Exception {
        // Ne használjuk List szót a változónévben
        // List<String> nameList = new ArrayList<>();

        List<String> names = new ArrayList<>();

        // Példa, hogy mikor használjuk a var szót
        var context = JAXBContext.newInstance(InferenceDemo.class);
        var unmarshaller = context.createUnmarshaller();
        var demo = unmarshaller.unmarshal(new StringReader("<xml></xml>"));

        // var használata kollekcióknál
        //List<Integer> numbers = new ArrayList<>();
        var numbers = new ArrayList<Integer>();
        // A numbers változó típusa ArrayList

        // Labda kifejezésben nem tudja kitalálni a típust
        var operation = (Function<String, Integer>) i -> 5;
    }
}
