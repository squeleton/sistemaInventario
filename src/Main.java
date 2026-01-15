import static java.io.Reader.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
            case "4" -> lookProduct(inventory);
            case "5" -> updateProduct();
            default -> optionFailure(inventory);
        }

    }

    //Ir al inventario
    static void goInventory(List<Product> inventory){
        for(Product p : inventory){
            System.out.println("ID"+ p.getId() + " - Producto: " + p.getName() + " - Stock: " + p.getQuantity() + " - Precio: " + p.getPrice());
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

        String id = takeInput("Identificador del producto: ");
        String name = takeInput("Nombre del Producto: ");
        String brand = takeInput("Marca del Producto: ");
        int quantity = takeIntInput("Cantidad en Stock: ");
        int price = takeIntInput("Precio x Unidad: ");

        Product newProduct = new Product(id,name,brand,quantity,price);
        inventory.add(newProduct);
        menu(inventory);


    }

    //Buscar un Producto
    static void lookProduct(List<Product> inventory){
        String lookedProduct = takeInput("Que producto buscas (ID): ");
        for(int i = 0; inventory.size() > i; i++){
            if(Objects.equals(inventory.get(i).getId(), lookedProduct)){
                Product p = inventory.get(i);
                System.out.println("ID"+ p.getId() + " - Producto: " + p.getName() + " - Stock: " + p.getQuantity() + " - Precio: " + p.getPrice());

            }else{
                System.out.println("No se encontro este producto.");
            }
            menu(inventory);
        }
    }

    //Actualizar un Producto
    static void updateProduct(){

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