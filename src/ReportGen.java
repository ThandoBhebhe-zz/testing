public interface ReportGen {
    default void generateReport(){
        System.out.println("generating report");
    }
}
