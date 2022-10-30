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

//         komanda bi trebalo da izgleda ovako mkdir C:\\Users\\Vid\\Desktop\\joka s{1..20}

        boolean dirOk = localStorage.createDirectory("C:\\Users\\Vid\\Desktop\\joka","s{10..25}");

        if(dirOk){
            System.out.println("Method ended successfully");
        }else{
            System.out.println("Error has occured");
        }
    }
}
