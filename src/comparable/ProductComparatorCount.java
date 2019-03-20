package comparable;

import java.io.Serializable;
import java.util.Comparator;

class ProductComparatorCount implements Comparator<Product>, Serializable {
    @Override
    public int compare(final Product o1, final Product o2) {
        if (o2.getCount() < o1.getCount()) {
            return -1;
        } else if (o2.getCount() > o1.getCount()) {
            return 1;
        } else {
            return 0;
        }
    }
}