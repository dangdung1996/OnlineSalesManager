package storage;

import java.io.*;

public class ReadAndWrite {
    public static final String FILE_NAME = "dataProduct.dat";

    public static Object read(String fileName){
        Object obj = null;
        try{
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } return obj;
    }

    public static void write(Object obj, String fileName) {
        try{
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
