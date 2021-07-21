package Exercise1;

public class Main {
    public static void main(String[] args) {
        Product pro1 = new Product(01, "007", 750);
        Product pro2 = new Product(02, "002", 250);
        Product pro3 = new Product(03, "003", 350);
        Product pro4 = new Product(04, "009", 550);
        ProductManager Hanh = new ProductManager();
        Hanh.add(pro1);
        Hanh.add(pro2);
        Hanh.add(pro3);
        Hanh.add(pro4);
        Hanh.sortUp();
        Hanh.displayList();
        Hanh.sortDown();
        Hanh.displayList();
    }
}