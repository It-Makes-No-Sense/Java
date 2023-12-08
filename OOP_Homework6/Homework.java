package OOP_Homework6;

/**
 * Класс документ - описывает структуру документа.
 * <p>
 * Нужно спроектировать систему отчетов, которая будет формировать отчеты для документа.
 * <p>
 * 1. Формирование PDF-файла (потенциально может быть несколько типом разметки PDF-файла).
 * 2. Формирование JSON-файла с полями документа.
 * 3. Формирование XML-файла с полями документа.
 * 4. ... потенциально могут добавляться разные типы отчетов.
 * <p>
 * После реализации задать себе 2 вопроса и прикрепить их к сданной ДЗ:
 * 1. Насколько сложно добавить поддержку нового типа отчета?
 * 2. Как будет выглядеть проект, если в нем будет 1000+ типов отчетов?
 */
public class Homework {
    public static void main(String[] args) {
        Document document = new Document("100500");

        ReportEntrypoint reportEntrypoint = new ReportEntrypoint();
        Report reportPdf = reportEntrypoint.create(document, "pdf");
        Report reportJson = reportEntrypoint.create(document, "json");
        Report reportXml = reportEntrypoint.create(document, "xml");
//        Report reportError = reportEntrypoint.create(document, "Error");

        reportPdf.printData();
        reportJson.printData();
        reportXml.printData();
//        reportError.printData();
    }
}
