package baluni;

import baluni.implementation.LocalStorageImpl;

public class Main {
    public static void main(String[] args) {
        LocalStorageImpl localStorage = new LocalStorageImpl();

        boolean isOk = localStorage.createStorage("C:\\Users\\Vid\\Desktop\\joka");

        if(isOk){
            System.out.println("Vazi");
        }else{
            System.out.println("Tuga");
        }
    }
}
