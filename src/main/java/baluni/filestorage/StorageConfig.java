package baluni.filestorage;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StorageConfig {

    private String storageName;
    private long defaultStorageSize;
    private List<String> forbiddenExtensions;
    private Map<String, Integer> foldersWithCapacity;

    //dirPaths[0] = "askdkask"
    //allowedPerPath[0] = "10"

    public StorageConfig(){
        this.storageName = "defaultStorage";
        this.defaultStorageSize = 1073741824; //1GB
        this.forbiddenExtensions = new ArrayList<>();
        forbiddenExtensions.add(".exe");
        forbiddenExtensions.add(".vba");
        forbiddenExtensions.add(".png");
        foldersWithCapacity = new HashMap<String, Integer>();
    }

    // Config builder
    public StorageConfig(String storageName, long defaultStorageSize, List<String> forbiddenExtensions){
        this.storageName = storageName;
        this.defaultStorageSize = defaultStorageSize;
        this.forbiddenExtensions = forbiddenExtensions;
        this.foldersWithCapacity = new HashMap<String, Integer>();
    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public long getDefaultStorageSize() {
        return defaultStorageSize;
    }

    public void setDefaultStorageSize(long defaultStorageSize) {
        this.defaultStorageSize = defaultStorageSize;
    }

    public List<String> getForbiddenExtensions() {
        return forbiddenExtensions;
    }

    public void setForbiddenExtensions(List<String> forbiddenExtensions) {
        this.forbiddenExtensions = forbiddenExtensions;
    }

    public Map<String, Integer> getFoldersWithCapacity() {
        return foldersWithCapacity;
    }
}
