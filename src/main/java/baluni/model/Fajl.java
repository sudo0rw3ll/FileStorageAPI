package baluni.model;

import java.time.LocalDate;

public class Fajl {

    private String path;
    private String fileName;
    private String extension;
    private LocalDate creationDate;
    private LocalDate modificationDate;
    private long fileSize;

    public Fajl(String fileName, String extension, String path, LocalDate creationDate, LocalDate modificationDate, long fileSize){
        this.fileName = fileName;
        this.extension = extension;
        this.path = path;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
        this.fileSize = fileSize;
    }

    public Fajl(String fileName, String extension, String path){
        this.fileName = fileName;
        this.extension = extension;
        this.path = path;
        this.creationDate = LocalDate.now();
        this.modificationDate = LocalDate.now();
        this.fileSize = 0;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(LocalDate modificationDate) {
        this.modificationDate = modificationDate;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String toString(){
        return "File " + this.fileName + "." + this.extension + " " + this.path;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)
            return false;

        if(!(obj instanceof Fajl))
            return false;

        Fajl fajl=(Fajl)obj;
        return fajl.fileName.equalsIgnoreCase(this.fileName)
                && fajl.extension.equalsIgnoreCase(this.extension)
                && fajl.path.equalsIgnoreCase(this.path);
    }
}
