package Lesson9.task1;

import java.util.Optional;

public class TestDrive {
    public static void main(String[] args) {
        Storage<Product, Long> productLongStorage = new MapStorage<>();

        productLongStorage.save(new Product(11, "MacBook", "Apple's notebook", 2000));
        productLongStorage.save(new Product(15, "Lenovo", "Lenovo's notebook", 1500));

        Optional<Product> product = productLongStorage.findById(12L);
        System.out.println(product);
        Optional<Product> product1 = productLongStorage.findById(15L);
        if (product1.isPresent()) {
            System.out.println(product1.get());
        }
    }
}

//Optional.empty
//Product{id=15, name='Lenovo', description='Lenovo's notebook', price=1500}
