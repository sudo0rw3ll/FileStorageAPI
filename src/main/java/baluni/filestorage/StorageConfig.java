package baluni.filestorage;

import java.util.List;

public class StorageConfig {

    private String storageName;
    private long defaultStorageSize;
    private int allowedNumberOfFiles;
    private List<String> forbiddenExtensions;
    // Config builder
    public StorageConfig(String storageName, long defaultStorageSize, int allowedNumberOfFiles, List<String> forbiddenExtensions){
        this.storageName = storageName;
        this.defaultStorageSize = defaultStorageSize;
        this.allowedNumberOfFiles = allowedNumberOfFiles;
        this.forbiddenExtensions = forbiddenExtensions;
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

    public int getAllowedNumberOfFiles() {
        return allowedNumberOfFiles;
    }

    public void setAllowedNumberOfFiles(int allowedNumberOfFiles) {
        this.allowedNumberOfFiles = allowedNumberOfFiles;
    }

    public List<String> getForbiddenExtensions() {
        return forbiddenExtensions;
    }

    public void setForbiddenExtensions(List<String> forbiddenExtensions) {
        this.forbiddenExtensions = forbiddenExtensions;
    }
}
