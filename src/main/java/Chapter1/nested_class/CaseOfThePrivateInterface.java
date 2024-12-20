package Chapter1.nested_class;

public class CaseOfThePrivateInterface {
    private interface Secret {
        public void shh();
    }

    class DontTell implements Secret {

        @Override
        public void shh() {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        CaseOfThePrivateInterface caseOfThePrivateInterface = new CaseOfThePrivateInterface();
        DontTell dontTell = caseOfThePrivateInterface.new DontTell();
        dontTell.shh();
    }
}
