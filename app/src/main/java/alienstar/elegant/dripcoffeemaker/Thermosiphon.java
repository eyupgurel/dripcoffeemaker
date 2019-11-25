package alienstar.elegant.dripcoffeemaker;

import android.util.Log;

import javax.inject.Inject;

/**
 * Thermosiphon class implements pump interface. Constructor of
 * Thermosiphon is annotated with @Inject. Single argument of
 * it is already graph resident. Therefore Thermosiphon type is
 * eligible to reside inside object graph. Think resident types as
 * lower established layers of object graph.
 */
public class Thermosiphon implements Pump {
    private static final String TAG = "DripCoffeeMaker";
    private final Heater heater;

    /**
     * @param heater
     * Thermosiphon builds on Heater in the object graph
     */
    @Inject
    Thermosiphon(Heater heater){
        this.heater = heater;
    }
    @Override
    public boolean push(int volume) {
        Log.d(TAG, "Thermosiphon pumping...");
        return heater.onTarget(98);
    }
}
