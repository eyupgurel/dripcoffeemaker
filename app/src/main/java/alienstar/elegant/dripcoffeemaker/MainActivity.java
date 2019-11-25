package alienstar.elegant.dripcoffeemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import alienstar.elegant.dripcoffeemaker.di.CoffeeShop;
import alienstar.elegant.dripcoffeemaker.di.DaggerCoffeeShop;
import alienstar.elegant.dripcoffeemaker.di.DripCoffeeModule;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * DaggerCoffeeShop is Dagger 2 generated class implementing
         * our CoffeeShop interface. It gives us a handy builder. Our
         * component needs DripCoffeeModule instance as a parameter.
         * We supply the required parameters before finally calling the
         * build function. Now we have the implementation of component
         * interface CoffeeShop at hand. All injections are made in wiring
         * needy types. Isn't that cool ?
         */
        CoffeeShop coffeeShop = DaggerCoffeeShop.builder().
                                                          dripCoffeeModule(new DripCoffeeModule()).build();
        coffeeShop.maker().brew();
    }
}
