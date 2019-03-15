/*
 * Класс Product
 * version - 1.0
 * Авторское право: все мое.
 */
package comparable;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Программа содержит 2 класса
 * имплеминтирующих интерфейс компаратора.
 * Первый реализует метод сравнения по
 * полю name, второй по полю count.
 * Сортировка идет по цепочке,
 * сначала по количеству,
 * потом по названию.
 * @version 1.0 15 Apr 2019
 * @author Pavel Samotaev
 */
public final class Product {
    private String name;
    private int count;
    public Product(final String name, final int count) {
        this.name = name;
        this.count = count;
    }
    public String getName() {
        return name;
    }
    public int getCount() {
        return count;
    }
    public static void main(final String[] args) {
        final int[] count = {100, 111};
        Comparator<Product> productComparator = new ProductComparatorCount().thenComparing(new ProductComparatorName());
        Set<Product> strings = new TreeSet<>(productComparator);
        strings.add(new Product("Ноутбук", count[0]));
        strings.add(new Product("Телефон", count[0]));
        strings.add(new Product("Наушники", count[0]));
        strings.add(new Product("Телевизор", count[1]));
        for (Product s : strings) {
            System.out.println(s.getName() + " "  + s.getCount());
        }
    }

}


