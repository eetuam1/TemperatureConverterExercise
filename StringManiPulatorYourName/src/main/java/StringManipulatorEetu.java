public class StringManipulatorEetu {

    public String ReverseManipulate(String input) {
       if (input == null) {
           return null;
       }
       return new StringBuilder(input).reverse().toString();
    }

    public String CapitalizeManipulate(String input) {
        if (input == null) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}