import static java.io.Reader.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        List<Product> productsList = new ArrayList<>();
        menu(productsList);



    }

    static void menu(List<Product> inventory){
        System.out.println("------------------------------------------------");
        System.out.println("   Bienvenido al Sistema de Inventario Helper!   ");
        System.out.println("------------------------------------------------");
        System.out.println("1. Ver Inventario");
        System.out.println("2. Venta");
        System.out.println("3. Añadir Producto");
        System.out.println("4. Buscar Producto");
        System.out.println("5. Actualizar Inventario");

        action(inventory);
    }

    static void action(List<Product> inventory){
        //Tomar la opcion del usuario
        Scanner reader = new Scanner(System.in);
        System.out.println("Opción: ");
        String option = reader.next(); //Obetener los numeros como String para evitar errores de ingreso.


        //Manejar la opción
        switch (option){
            case "1" -> goInventory(inventory);
            case "2" -> goSell();
            case "3" -> addProduct(inventory);
            case "4" -> lookProduct();
            case "5" -> updateProduct();
            default -> optionFailure(inventory);
        }

    }

    //Ir al inventario
    static void goInventory(List<Product> inventory){
        for(Product p : inventory){
            System.out.println(p.getId());
            System.out.println(p.getName());
            System.out.println(p.getBrand());
            System.out.println(p.getQuantity());
            System.out.println(p.getPrice());
        }
        menu(inventory);
    }

    //Venta
    static void goSell(){
        System.out.println("Venta");
    }

    //Añadir un Producto
    static void addProduct(List<Product> inventory){

        System.out.println("-----------------------");
        System.out.println(" !Ingresa un Producto! ");
        System.out.println("-----------------------");

        int id = takeIntInput("Identificador del producto: ");
        String name = takeInput("Nombre del Producto: ");
        String brand = takeInput("Marca del Producto: ");
        int quantity = takeIntInput("Cantidad en Stock: ");
        int price = takeIntInput("Precio x Unidad: ");

        Product newProduct = new Product(id,name,brand,quantity,price);
        inventory.add(newProduct);
        menu(inventory);


    }

    //Buscar un Producto
    static void lookProduct(){
        System.out.println("Datos de un producto por ID");
    }

    //Actualizar un Producto
    static void updateProduct(){
        System.out.println("Actualizar un producto (esto incluye eliminarlo pero hay que añadir un justificativo)");
    }

    //Forma temporal de manejar el misinput
    static void optionFailure(List<Product> inventory){
        System.out.println("Lo ingresado no es una opcion valida, intenta nuevamente.");
        menu(inventory);
    }



    static String takeInput(String text){
        Scanner reader = new Scanner(System.in);
        System.out.println(text);
        return reader.next();
    }

    static int takeIntInput(String text){
        Scanner reader = new Scanner(System.in);
        System.out.println(text);
        return reader.nextInt();
    }
}