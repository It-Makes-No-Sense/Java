package OOP_Homework6;

public class ReportGeneratorJson implements ReportGenerator {
    @Override
    public Report generateReport(Document document) {
        String header = "JSON report\n";
        String reportData = header + document.getData();
        return new Report(reportData);
    }
}
