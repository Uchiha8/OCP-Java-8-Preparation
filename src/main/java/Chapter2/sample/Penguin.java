package Chapter2.sample;

public class Penguin {
    private final Flippers flippers;
    private final WebbedFeet webbedFeet;

    public Penguin(Flippers flippers, WebbedFeet webbedFeet) {
        this.flippers = flippers;
        this.webbedFeet = webbedFeet;
    }

    public void flap() {
        this.flippers.flap();
    }

    public void kick() {
        this.webbedFeet.kick();
    }
}
