public class SpacedLogger implements Logger {

    /**
    * This method is used to display a String that adds
    * spaces between each character of a String argument
    * @param value, the first parameter served as basis for the output
    */  
    @Override
    public void Log(String value) {
        String result = "";
        for (int i = 0; i < value.length(); i++) {
            result = result + value.charAt(i) + " ";
        }
        System.out.println(result);

    }

    /**
    * This method is used to display a String that adds
    * spaces between each character of a String argument
    * but with “ERROR:” preceding the spaced out input.
    * @param value, the first parameter served as basis for the output
    */  
    @Override
    public void Error(String value) {
        String result = "ERROR: ";
        for (int i = 0; i < value.length(); i++) {
            result = result + value.charAt(i) + " ";
        }
        System.out.println(result);
    }

}