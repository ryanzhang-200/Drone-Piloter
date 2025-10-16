package model.drone;

public class motor {
    private double power; // 0.0 to 1.0

    public void setPower(double power) {
        this.power = Math.max(0.0, Math.min(1.0, power)); // clamp
    }

    public double getPower() {
        return power;
    }
}
