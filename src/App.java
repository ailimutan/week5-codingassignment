public class App {

    public static void main(String[] args) {

        AsteriskLogger asteriskLogger = new AsteriskLogger();
        SpacedLogger spacedLogger = new SpacedLogger();

        String testSampleOne = "Hello";
        String testSampleTwo = "Hello World";
        
        
        display(testSampleOne, asteriskLogger, spacedLogger);
        System.out.println("\n========== TESTING PART  ==========\n");
        display(testSampleTwo, asteriskLogger, spacedLogger);
         
    }
    /**
     * This method is used to display different outputs
     * of log and error methods of both AsteriskLogger
     * and SpacedLogger.
     * @param value, the first parameter served as basis for the outputs
     * @param AsteriskLogger, instance of AsteriskLogger class
     * @return SpacedLogger, , instance of SpacedLogger class
     */
    public static void display(String value, AsteriskLogger asteriskLogger, SpacedLogger spacedLogger) {

        System.out.println("---------------------------------------------------------------");
        System.out.println("STRING VALUE:\n" + value);
        System.out.println("---------------------------------------------------------------");
        System.out.println("\n============  AsteriskLogger's LOG Method ==========\n");
        asteriskLogger.Log(value);

        System.out.println("\n============  AsteriskLogger's ERROR Method ========\n");
        asteriskLogger.Error(value);

        System.out.println("\n============  SpacedLogger's LOG Method ============\n");
        spacedLogger.Log(value);

        System.out.println("\n============  SpacedLogger's ERROR Method ==========\n");
        spacedLogger.Error(value);
       
    }

}