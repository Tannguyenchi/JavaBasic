public class MegaBytesConverter {
//    MegaBytes Converter
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        /* printMegaBytesAndKiloBytes: The method should not return anything (void)
                                       and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
    - Input: - an int parameter has the name "kiloBytes"
    - Output: - If the parameter kiloBytes is less than 0 then print the text "Invalid Value".
              - Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
                    + XX represents the original value kiloBytes.
                    + YY represents the calculated megabytes.
                    + ZZ represents the calculated remaining kilobytes.
    */
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
//            1 MB = 1024 KB
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(10_000);
    }
}
