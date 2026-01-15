public class Product {
    //Atributos de la clase (expandible)
    private int id;
    private String name;
    private String brand;
    private int quantity;
    private int price;

    public Product(int id,String name, String brand, int quantity, int price){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
    }

    //Getters
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public String getBrand(){
        return this.brand;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public int getPrice(){
        return this.price;
    }

    //Setters
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setPrice(int price){
        this.price = price;
    }

}
