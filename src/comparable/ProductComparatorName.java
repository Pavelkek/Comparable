package comparable;

import java.io.Serializable;
import java.util.Comparator;

class ProductComparatorName implements Comparator<Product>, Serializable {
    @Override
    public int compare(final Product o1, final Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
