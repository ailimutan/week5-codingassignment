public class AsteriskLogger implements Logger {

    
     /**
     * This method is used to display a String that is in
     * between of three asterisk on either side of String
     * @param value, the first parameter served as basis for the output
     */
    @Override
    public void Log(String value) {
        System.out.println("***" + value + "***");
    }

    
    /**
    * This method is used to display a String that is inside of
    * a box of asterisks, preceded by the word “ERROR:”. 
    * @param value, the first parameter served as basis for the output
    */
    @Override
    public void Error(String value) {
        
        String finalOutput = "***" + "Error: " + value + "***";

        int len = finalOutput.length();
        StringBuilder asteriskBuilder = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            asteriskBuilder.append('*'); //convert the number of asterisks 
                                        //based on the length of the finalOutput
        }

        System.out.println(asteriskBuilder);
        System.out.println(finalOutput);
        System.out.println(asteriskBuilder);

    }

}