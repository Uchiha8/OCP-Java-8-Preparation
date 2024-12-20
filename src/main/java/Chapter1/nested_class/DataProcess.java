package Chapter1.nested_class;

public class DataProcess {
    private interface Validator {
        boolean validator(String data);
    }

    static class LengthValidator implements Validator {

        @Override
        public boolean validator(String data) {
            return data.length() > 5;
        }
    }

    static class RegexValidator implements Validator {

        @Override
        public boolean validator(String data) {
            return data.matches("\\d+");
        }
    }

    public boolean process(String data) {
        Validator validator = new LengthValidator();
        return validator.validator(data);
    }

    public static void main(String[] args) {
        DataProcess dataProcess = new DataProcess();
        System.out.println(dataProcess.process("Hellos"));
    }
}
