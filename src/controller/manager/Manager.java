package controller.manager;

import model.Product;
import storage.ReadAndWrite;

import java.util.*;


public class Manager {
    List<Product> listProduct;

    public Manager() {
        listProduct = new ArrayList<>();
    }


    public void addProduct(Product product){
        listProduct.add(product);
        write();
    }
    public void removeProduct(int index){
        listProduct.remove(index);
    }
    public void showProduct(){
        for (Product pro : listProduct) {
            System.out.println(pro);
        }
    }
    public void searchProduct(String id){
        for (Product pro : listProduct) {
            if (pro.getIdProduct().equalsIgnoreCase(id)){
                System.out.println(pro);
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }

    public void sortProduct(){
        listProduct.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                }
                return 0;
            }
        });
        showProduct();
    }


    public void write(){
        ReadAndWrite.write(listProduct,ReadAndWrite.FILE_NAME);
    }

    public void readFile(){
       listProduct = (List<Product>) ReadAndWrite.read(ReadAndWrite.FILE_NAME);
    }


}
