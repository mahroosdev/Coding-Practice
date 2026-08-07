public class StudentThread extends Thread {

    private String studentName;

    private int mark1;
    private int mark2;
    private int mark3;

    private SharedReport report;

    public StudentThread(
        String studentName,
        int mark1,
        int mark2,
        int mark3,
        SharedReport report
    ) {

        this.studentName = studentName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.report = report;
    }

    @Override
    public void run() {

        int total =
            mark1 + mark2 + mark3;

        double average =
            total / 3.0;

        report.writeResult(
            studentName,
            total,
            average
        );
    }
}