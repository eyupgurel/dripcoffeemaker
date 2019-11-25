package alienstar.elegant.dripcoffeemaker;

import android.util.Log;

import javax.inject.Inject;

/**
 * Coffee maker needs a pump to push hot water up
 * where it drips over ground coffee. It is in need of
 * Heater and Pump.
 */
public class CoffeeMaker {
    private static final String TAG = "DripCoffeeMaker";
    private static final int BEST_BREWING_TEMP = 98;
    private static final int COFFEE_VOLUME_CC = 150;
    /**
     * Pump type is in the graph as well as Heater.
     * Everything is ready for injection. Coffee maker is
     * ready to go.
     */
    public @Inject Heater heater;
    public @Inject Pump pump;

    @Inject
    CoffeeMaker(){}

    /**
     *
     * @return
     */
   public  boolean brew(){
        heater.heat(BEST_BREWING_TEMP);
       Log.d(TAG, "brew: Heater attained target degree");
        return pump.push(COFFEE_VOLUME_CC);
    }

}
