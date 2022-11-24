package baluni.filestorage;

public class StorageManager {
    private static MyFileStorage storage = null;

    public static void initStorage(MyFileStorage fileStorage){
        storage = fileStorage;
    }

    public static MyFileStorage makeStorage(String rootPath){
        storage.createStorage(rootPath);
        return storage;
    }
}
