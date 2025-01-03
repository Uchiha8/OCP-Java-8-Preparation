package Chapter7.sample;

public class Main {
    public static void main(String[] args) {
        double[] scores = {85.5, 90.0, 78.5, 88.0};
        Runnable task = new CalculateAvg(scores);
        Runnable task2 = () -> {
            double sum = 0;
            for (double score : scores) {
                sum += score;
            }
            double average = sum > 0 ? sum / scores.length : 0;
            System.out.println("Average score from lambda expression: " + average);
        };
        Thread thread = new Thread(task);
        thread.start();
        thread = new Thread(task2);
        thread.start();
    }
}
