package alienstar.elegant.dripcoffeemaker.di;

import alienstar.elegant.dripcoffeemaker.ElectricHeater;
import alienstar.elegant.dripcoffeemaker.Heater;
import alienstar.elegant.dripcoffeemaker.Pump;
import alienstar.elegant.dripcoffeemaker.Thermosiphon;
import dagger.Module;
import dagger.Provides;

@Module
public class DripCoffeeModule {
    /**
     *
     * @return Heater
     * provideHeater method is @Provides annotated in returning
     * Heater type therefore Heater type came to be graph resident.
     *
     */
    @Provides
    static Heater provideHeater() {
        return new ElectricHeater();
    }

    /**
     *
     * @param pump
     * @return Pump
     * providePump method is also @Provides annotated in returning
     * Pump type. But we can not confirm Pump type's graph residency
     * before Thermosiphon type's graph residency affirmation because
     * providePump method take Thermosiphon type as input parameter.
     * We must resolve Thermosiphon type in the first place.
     */
    @Provides
    static Pump providePump(Thermosiphon pump) {
        return pump;
    }
}
