package cbs.dp.ua.lesson_4_2;

public class CheckVersionDocument {

    public AbstractHandler checkDoc (String version) {
        if (version.equals("xml")) {
            return new XMLHandler();
        } else if (version.equals("doc")) {
            return new DOCHandler();
        } else if (version.equals("txt")) {
            return new TXTHandler();
        } else return new NOTDocumet();
    }
}
