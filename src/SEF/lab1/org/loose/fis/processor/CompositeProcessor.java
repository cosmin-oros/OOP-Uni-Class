package SEF.lab1.org.loose.fis.processor;

import SEF.lab1.org.loose.fis.document.Document;

import java.util.List;

public class CompositeProcessor implements Processor {

    private List<Processor> processors;

    public CompositeProcessor(List<Processor> processors) {
        this.processors = processors;
    }

    @Override
    public int process(List<Document> documents) {
        int count = 0;
        for (Processor processor : processors) {
            count += processor.process(documents);
        }
        return count;
    }
}