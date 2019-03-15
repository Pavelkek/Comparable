package comparable;

import java.util.Comparator;

class ProductComparatorCount implements Comparator<Product> {
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