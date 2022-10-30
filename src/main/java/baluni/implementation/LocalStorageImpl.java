package baluni.implementation;

import baluni.filestorage.MyFileStorage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LocalStorageImpl extends MyFileStorage {

    @Override
    public boolean createStorage(String storagePath) {
        File file = new File(storagePath);
        //check if storage already exists on given path
        if(file.isDirectory() && file.exists()){
            System.out.println("Storage with this name already exists, try using another name.");
            return false;
        }

        boolean fwdSlash = false;
        File config = null;

        if(!storagePath.startsWith("C:\\")){
            fwdSlash = true;
        }

        if(file.mkdir()){
            System.out.println("Do you want to specify the path of config file [yes/no]? ");
            Scanner scanner = new Scanner(System.in);

            String choice = scanner.nextLine();

            if(choice.equalsIgnoreCase("no")){
                System.out.println("Okay, default config will be created");
                if(!fwdSlash){
                    System.out.println(storagePath + "\\" + "default_config.json");
                    try {
                        config = new File(storagePath + "\\" + "default_config.json");
                        config.createNewFile();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }else {
                    try {
                        config = new File(storagePath + "/" + "default_config.json");
                        config.createNewFile();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }

            if(choice.equalsIgnoreCase("yes")) {
                System.out.println("Enter storage path: ");
                String configFilePath = scanner.nextLine();

                if(configFilePath.isEmpty()){
                    System.out.println("Path of config file empty, creating default config");

                    if(!fwdSlash) {
                        try {
                            config = new File(storagePath + "\\" + "default_config.json");
                            config.createNewFile();
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                    }else{
                        try {
                            config = new File(storagePath + "/" + "default_config.json");
                            config.createNewFile();
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                    }
                }else{
                    System.out.println("Creating specific config");
                }
            }

            System.out.println("Local storage has been created successfully!");
            return true;
        }

        return false;
    }

    @Override
    public boolean createFile(String fileName) {

        return false;
    }

    @Override
    public boolean createDirectory(String destination, String creationPattern) {
        //mkdir C:\\Users\\Vid\\Desktop\\s{12..00}



        return false;
    }
}
