package Chapter7.review;

public class ReadInventoryThread extends Thread {
    public void run() {
        System.out.println("Printing Zoo records");
    }

    public static void main(String[] args) {
        ReadInventoryThread readInventoryThread = new ReadInventoryThread();
        readInventoryThread.start();
    }
}
