public class EmployeeThread extends Thread {

    private PrinterService printerService;
    private String documentName;

    public EmployeeThread(
        String employeeName,
        PrinterService printerService,
        String documentName
    ) {

        super(employeeName);

        this.printerService =
            printerService;

        this.documentName =
            documentName;
    }

    @Override
    public void run() {

        printerService.printDocument(
            getName(),
            documentName
        );
    }
}