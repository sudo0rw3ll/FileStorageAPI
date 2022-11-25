package baluni.filestorage;

import baluni.model.Fajl;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public abstract class MyFileStorage {
    private StorageConfig storageConfig;
    private String sotragePath;
    /**
     * Method for file storage creation
     *
     * Input parameter is storage path.
     * User will be prompted to enter config storage file.
     * If it's not user-specified then storage config file
     * will be created automatically.
     *
     * @param storagePath Path for storage creation
     * */
    public abstract boolean createStorage(String storagePath);

    /** Method for directory creation.
     *
     *  Input parameter is a pattern for directory creation.
     *  Directory name pattern is made of string which represents
     *  a file name followed by one of a few available directory creation
     *  patterns. For example:
     *      mkdir s{1..20}
     *      mkfolder x(1,10)
     *      mkfolder x 1:10
     *
     * @param destination Where directories should be created
     * @param creationPattern Pattern for storage creation
     * */
    public abstract boolean createDirectories(String destination, String creationPattern);

    /**
     *  Method for creating a directory.
     *
     * @param destination Path where directory should be created.
     * @param dirName Name of a directory.
     * */
    public abstract boolean createDir(String destination, String dirName);

    /**
     *  Method for creating a directory on a specified path with a specified
     *  limit of files that can be held in a directory.
     *
     * @param path Path where directory should be created.
     * @param folderName Name of a directory.
     * @param allowedItems How many items can be stored inside a directory.
     * */

    public abstract boolean createDirectory(String path, String folderName, int allowedItems);
    /**
     * Method for file creation
     *
     *
     * Input parameter is a fileName (including extension).
     * @param path Path where file should be created.
     * @param fileName Name of a file.
     * */
    public abstract boolean createFile(String path, String fileName);

    public abstract void buildPath(String path);

    /** Method for file upload
     *
     *  Input parameters are destination path which will
     *  be used for file upload and a list of files
     *  to be uploaded.
     *
     * @param destination Destination path for file upload.
     * @param files List of files which need to be uploaded.
     * */
    public abstract void fileUpload(String destination, List<Fajl> files);

    /** Method for file deletion
     *
     *  Input parameter is a List of files
     *  to be deleted.
     *
     * @param  files List of files for deletion.
     * */
    public abstract void deleteFiles(List<Fajl> files);

    /** Method for directory deletion
     *
     * Input parameter is a list of directories
     * to be deleted.
     *
     * @param directories List of directories for deletion.
     */
    public abstract void deleteDirectories(List<Fajl> directories);

    /** Method for moving files from source to destination
     *
     *  Input parameters are Strings which represent
     *  source from which files are being moved to
     *  the destination source which is provided
     *  as a second argument.
     *
     * @param source Path of resource we want to move to another location.
     * @param destination Path of destination where we want to move files.
     * */
    public abstract void moveFiles(String source, String destination);


    /**
     *  Method for moving a single file from existing source to
     *  specified destination.
     *
     * @param filePath Path of a file which should be moved.
     * @param destination Path of a destination where we want to move a file.
     * */
    public abstract void moveFile(String filePath, String destination);

    /** Method for content download
     *
     *  Input parameter is a String which represents
     *  a path to the directory which files we want to
     *  download or it's a path to the file we want to
     *  download.
     *
     * @param destinationPath Path of a destination where we want to download content.
     * @param sourcePath Path of a source we want to download.
     **/
    public abstract void download(String destinationPath, String sourcePath);

    /**Method fpr renaming files
     *
     * Input parameters are the old and new name of the
     *  file.
     * @param oldFileName Old file name of a file.
     * @param newFileName New file name for a file.
     */

    public abstract boolean rename(String oldFileName, String newFileName);

    //pretrazivanje skladista

    /**Method for listing all the files for a specific folder
     * Input parameter is the name of the folder.
     *
     * @param dirPath Path of a directory which files should be listed.
     */
    public abstract List<Fajl> listFilesInDir(String dirPath);

    /**Method for listing all the files from all the folders
     * in a specfic folder
     * @param dirPath Path of a directory which content should be listed.
     */
    public abstract List<Fajl> listFilesInSubDir(String dirPath);

    /**Method for listing all the files in a specific folder
     * and from it's subdirectories
     *
     * @param dirPath Path of a folder to be listed.
     */
    public abstract List<Fajl> listFiles(String dirPath);

    /**Method for listing all the files with a certain extension
     *
     * @param extention Extension to be listed.
     */
    public abstract List<Fajl> listFilesForExtension(String extention);

    /** Method for listing all the files with a certain extension in a specified dir.
     *
     * @param dir Path of a directory which needs to be listed
     * @param extension Extension which needs to be looked for.
     * */
    public abstract List<Fajl> listFilesForExtension(String dir, String extension);

    /**Method for listing  files that contain  a string
     *
     * @param pattern String to be looked for inside a filename.
     */
    public abstract List<Fajl> listFilesForName(String pattern);

    /** Method for listing files inside a specified directory that contain a specified string
     *
     * @param dir Path of a directory which needs to be listed.
     * @param filename Pattern to be looked for inside of a filename.
     * */
    public abstract List<Fajl> listFilesForName(String dir, String filename);

    /** Method which checks if specified directory contains specified list of filenames.
     *
     * @param dirPath Path of a directory which needs to be checked.
     * @param patterns List of filenames we're looking for.
     * */
    public abstract boolean listDirForNames(String dirPath, List<String> patterns);

    /** Method which finds directory of a specified file
     *
     * @param fileName Name of a file whose parent directory we're looking for.
     * */
    public abstract Fajl findDirectoryOfFile(String fileName);


    /** Method which sorts listed data.
     *
     * @param fileList List containing files which are going to be displayed
     * @param byName Boolean flag which indicates that data should be sorted by name.
     * @param creationDate Boolean flag which indicates that data should be sorted by creation date.
     * @param dateModified Boolean flag which indicates that data should be sorted by modification date.
     * @param asc Boolean flag which indicates that data should be sorted ascending or descending.
     * */
    public abstract List<Fajl> sort(List<Fajl> fileList, boolean byName, boolean creationDate, boolean dateModified,
              boolean asc);

    /** Method for listing files by specified date
     *
     * @param date Date of creation/modification.
     * @param dirPath Path of a directory which should be listed.
     * */
    public abstract List<Fajl> listFileByDate(String date, String dirPath);


    /** Method for listing files created/modified between specified dates
     *
     * @param startDate Lower bound of a date of creation/modification.
     * @param endDate Upper bound of a date of creation/modification.
     * @param dirPath Path of a directory which should be listed.
     * */
    public abstract List<Fajl> listFilesBetweenDates(String startDate, String endDate, String dirPath);

    /** Method for filtering listed data by specified flags
     *
     * @param fileList List of files which data we want to filter
     * @param byPath Boolean flag which indicates that we want to filter by path
     * @param byName Boolean flag which indicates that we want to filter by name
     * @param bySize Boolean flag which indicates that we want to filter by size
     * @param byCreationDate Boolean flag which indicates that we want to filter by creation date
     * @param byModificationDate Boolean flag which indicates that we want to filter by modification date
     * @param byExtension Boolean flag which indicates that we want to filter by extension
     * */
    public abstract List<Fajl> filterData(List<Fajl> fileList,boolean byPath,boolean byName,boolean bySize,boolean byCreationDate
    ,boolean byModificationDate, boolean byExtension);

    public StorageConfig getStorageConfig() {
        return storageConfig;
    }

    public String getSotragePath() {
        return sotragePath;
    }

    public void setSotragePath(String sotragePath) {
        this.sotragePath = sotragePath;
    }

    public void setStorageConfig(StorageConfig storageConfig) {
        this.storageConfig = storageConfig;
    }

    public void readConfig(String configPath){
        try{
            ObjectMapper mapper = new ObjectMapper();

            StorageConfig config = mapper.readValue(Paths.get(configPath).toFile(), StorageConfig.class);

            this.setStorageConfig(config);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void writeDefaultConfig(String filePath){
        try{
            StorageConfig defaultConfig = new StorageConfig();
            this.setStorageConfig(defaultConfig);

            ObjectMapper mapper = new ObjectMapper();

            mapper.writeValue(Paths.get(filePath).toFile(), defaultConfig);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void saveStorageConfig(String filePath){
        try{
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(Paths.get(filePath + "\\" + "config.json").toFile(), this.getStorageConfig());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void setStorageSize(long storageSize){
        this.getStorageConfig().setDefaultStorageSize(storageSize);
    }

    public void setStorageName(String storageName){
        this.getStorageConfig().setStorageName(storageName);
    }

    public void addForbiddenExtension(String extension){
        this.getStorageConfig().getForbiddenExtensions().add(extension);
    }

    public void removeExtension(String extension){
        this.getStorageConfig().getForbiddenExtensions().remove(extension);
    }
}
