import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Products {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> al = new ArrayList<Product>();
        System.out.println("\t\nProductos disponible\n");
        al.add(new Product(1, "Samsung", 10000));
        al.add(new Product(2, "Apple", 20000));
        al.add(new Product(3, "Nokia", 30000));
        al.add(new Product(4, "Sony", 40000));
        al.add(new Product(5, "LG", 50000));
        for (Product p : al) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }
        System.out.println("\n\nDigite el nombre del producto a buscar:");
        String name = sc.nextLine();
        
        // Buscar usando la expresion lambda
        Optional<Product> productFound = al.stream().filter(prod -> name.equalsIgnoreCase(prod.name)).findFirst();
        if (productFound.isPresent()) {
            System.out.println("Producto encontrado");
            System.out.println(productFound.get());
        } else {
            System.out.println("Producto no encontrado");
        }
        sc.close();
    }
}

class Product {
    String name;
    int price;
    int id;

    //constructor
    Product(int i, String name, int price) {
        this.id = i;
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return String.format("Producto [name= %s, price= %s, id= %s]", name, price, id);
    }

}