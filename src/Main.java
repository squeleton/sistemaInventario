import static java.io.Reader.*;

void main(){
    menu();
}

static void menu(){
    System.out.println("------------------------------------------------");
    System.out.println("   Bienvenido al Sistema de Inventario Helper!   ");
    System.out.println("------------------------------------------------");
    System.out.println("1. Ver Inventario");
    System.out.println("2. Venta");
    System.out.println("3. Añadir Producto");
    System.out.println("4. Buscar Producto");
    System.out.println("5. Actualizar Inventario");

    action();
}

static void action(){
    //Tomar la opcion del usuario
    Scanner reader = new Scanner(System.in);
    System.out.println("Opción: ");
    String option = reader.next(); //Obetener los numeros como String para evitar errores de ingreso.


    //Manejar la opción
    switch (option){
        case "1" -> goInventory();
        case "2" -> goSell();
        case "3" -> addProduct();
        case "4" -> lookProduct();
        case "5" -> updateProduct();
        default -> optionFailure();
    }

}

//Ir al inventario
static void goInventory(){
    System.out.println("Inventario");
}

//Venta
static void goSell(){
    System.out.println("Venta");
}

//Añadir un Producto
static void addProduct(){
    System.out.println("Añadir Producto");
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
static void optionFailure(){
    System.out.println("Lo ingresado no es una opcion valida, intenta nuevamente.");
    menu();
}