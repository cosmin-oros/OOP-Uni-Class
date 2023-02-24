package SEF.lab1.org.loose.fis;

import SEF.lab1.org.loose.fis.document.Document;
import SEF.lab1.org.loose.fis.document.Json;
import SEF.lab1.org.loose.fis.document.XML;
import SEF.lab1.org.loose.fis.processor.CompositeProcessor;
import SEF.lab1.org.loose.fis.processor.Processor;
import SEF.lab1.org.loose.fis.processor.SearchProcessor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Document xml = new XML(
                List.of("<tag1>", "value1", "</tag1>", "<tag2>", "value2", "</tag2>")
        );
        Document json = new Json(
                List.of("key1:", "value1", ",", "key2:", "value2", ",", "key3:", "value3")
        );

        Processor sp1 = new SearchProcessor("value1");
        Processor sp2 = new SearchProcessor("value2");
        Processor sp3 = new SearchProcessor("value3");
        Processor cp1 = new CompositeProcessor(List.of(sp1, sp2));
        Processor cp2 = new CompositeProcessor(List.of(sp3, cp1));

        int result = cp2.process(List.of(xml, json));

        System.out.println(result);
    }


}
