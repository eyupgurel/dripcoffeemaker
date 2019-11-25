package alienstar.elegant.dripcoffeemaker;

public interface Heater {
    void heat(int targetDegree);
    boolean onTarget(int targetDegree);
}
