package OOP_Homework6;

public class ReportGeneratorPDF implements ReportGenerator {
    @Override
    public Report generateReport(Document document) {
        String header = "PDF report\n";
        String reportData = header + document.getData();
        return new Report(reportData);
    }
}
