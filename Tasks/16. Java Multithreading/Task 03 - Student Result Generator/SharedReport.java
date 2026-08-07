public class SharedReport {

    private String report = "";

    // Only one student thread can write at a time
    public synchronized void writeResult(
        String studentName,
        int total,
        double average
    ) {

        report = report +
            "Student Name: " + studentName + "\n" +
            "Total Marks : " + total + "\n" +
            "Average     : " + average + "\n" +
            "-----------------------------\n";
    }

    public String getReport() {
        return report;
    }
}