package Chapter7.sample;

public class CalculateAvg implements Runnable {
    private double[] scores;

    public CalculateAvg(double[] doubles) {
        this.scores = doubles;
    }

    @Override
    public void run() {
        double sum = 0.0;
        for (Double s : scores) {
            sum += s;
        }
        double average = sum > 0 ? sum / scores.length : 0;
        System.out.println("Average score is: " + average);
    }
}
