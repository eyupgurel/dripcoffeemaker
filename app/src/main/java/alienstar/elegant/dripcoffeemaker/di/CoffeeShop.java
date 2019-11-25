package alienstar.elegant.dripcoffeemaker.di;

import alienstar.elegant.dripcoffeemaker.CoffeeMaker;
import dagger.Component;

@Component(modules=DripCoffeeModule.class)
public interface CoffeeShop {
    CoffeeMaker maker();
}
