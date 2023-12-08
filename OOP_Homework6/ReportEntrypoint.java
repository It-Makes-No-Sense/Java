package OOP_Homework6;

import java.util.HashMap;
import java.util.Map;

public class ReportEntrypoint {
    private final Map<String, ReportGenerator> reportGenerators;

    public ReportEntrypoint() {
        reportGenerators = new HashMap<>();
        reportGenerators.put("pdf", new ReportGeneratorPDF());
        reportGenerators.put("json", new ReportGeneratorJson());
        reportGenerators.put("xml", new ReportGeneratorXML());
    }

    public Report create(Document document, String reportType) {
        ReportGenerator reportGenerator = reportGenerators.get(reportType.toLowerCase());
        if (reportGenerator == null) {
            throw new IllegalArgumentException("Wrong report type!");
        }
        return reportGenerator.generateReport(document);
    }
}
