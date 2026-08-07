public class PrinterService {

    // Only one employee can use the printer at a time
    public synchronized void printDocument(
        String employeeName,
        String documentName
    ) {

        System.out.println(
            employeeName +
            " started printing " +
            documentName
        );

        try {

            Thread.sleep(1000);

        } catch (InterruptedException e) {

            System.out.println(
                "Printing was interrupted."
            );
        }

        System.out.println(
            employeeName +
            " completed printing " +
            documentName
        );

        System.out.println();
    }
}