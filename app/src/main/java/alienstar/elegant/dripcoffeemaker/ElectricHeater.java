package alienstar.elegant.dripcoffeemaker;


import android.util.Log;

/**
 * ElectricHeater class implements Heater interface but its constructor is
 * not annotated with @Inject. Therefore Heater is not in object graph yet.
 * In order to be so Heater type must be the return type of a @Provides
 * annotated method inside @Module
 */
public class ElectricHeater implements Heater {
    private static final String TAG = "DripCoffeeMaker";
    private static final int AMBIENT_TEMP = 22;
    /**
     * ambientTemperature better be injected for a more
     * realistic application but for our current purpose it
     * suffices to hard code.
     */
    private int ambientTemperature = AMBIENT_TEMP;
    @Override
    public void heat(int targetDegree) {
        while(!onTarget(targetDegree)){
            ambientTemperature++;
            Log.d(TAG, "heat:  ambientTemperature: " + ambientTemperature);
        }
    }

    @Override
    public boolean onTarget(int targetDegree) {
        return ambientTemperature==targetDegree;
    }
}
