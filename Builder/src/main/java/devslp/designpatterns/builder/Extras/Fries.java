package devslp.designpatterns.builder.Extras;

import devslp.designpatterns.builder.Items.Item;
import devslp.designpatterns.builder.Packings.Cardboard;
import devslp.designpatterns.builder.Packings.Packing;

public class Fries implements Item {
    @Override
    public String name() {
        return "Fries";
    }

    @Override
    public Packing packing() {
        return new Cardboard();
    }

    @Override
    public double price() {
        return 15.0;
    }
}
