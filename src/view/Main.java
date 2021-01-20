package view;

import controller.manager.Manager;
import model.Product;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.readFile();
        while (true){
            System.out.println("-------- QUẢN - LÝ ---------");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Tìm kiếm theo ID");
            System.out.println("5. Sắp xếp theo giá");
            System.out.println("0. Exit");
            System.out.println("----------");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    manager.addProduct(information());
                break;
                case 2:
                    manager.showProduct();
                    break;
                case 3:
                    try{
                        manager.removeProduct(indexRemove());
                    }catch(IndexOutOfBoundsException e){
                        System.out.println("Nhập sai , Nhập lại đi");
                    }
                    break;
                case 4:
                    manager.searchProduct(searchId());
                    break;
                case 5:
                    manager.sortProduct();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Sai lựa chọn");
                    System.out.println("Nhập lại đi bạn êi");
            }

        }

    }

    private static Product information(){
        System.out.println("Nhập tên:");
        String name = sc.nextLine();
        System.out.println("Mã sản phẩm:");
        String id = sc.nextLine();
        System.out.println("Màu sắc:");
        String color = sc.nextLine();
        System.out.println("kích cỡ:");
        String size = sc.nextLine();
        System.out.println("Nhập giá tiền:");
        double price;
        while(true){
            try{
                price = Double.parseDouble(sc.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Nhập sai giá tiền");
                System.out.println("Nhập lại giá tiền: ");
            }

        }
       return new Product(name, id, color, size, price);
    }
    private static int indexRemove(){
        System.out.println("NHập vị trí cần xóa");
        int index = Integer.parseInt(sc.nextLine());
        return index;
    }
    private static String searchId(){
        System.out.println("Nhập id");
        String id = sc.nextLine();
        return id;
    }
}
