package mock.sample;

public class TaskBase {
    int getStatusCode(Object object) throws NullPointerException {
        if (object != null) {
            return 1;
        }
        return 0;
    }
}
