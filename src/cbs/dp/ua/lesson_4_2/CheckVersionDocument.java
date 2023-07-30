package cbs.dp.ua.lesson_4_2;

public class CheckVersionDocument {

    public AbstractHandler checkDoc (String version) {
        switch (version) {
            case "xml":
                return new XMLHandler();
            case "doc":
                return new DOCHandler();
            case "txt":
                return new TXTHandler();
            default:
                return new NOTDocumet();
        }
    }
}
