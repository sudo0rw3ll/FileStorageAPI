package baluni.filestorage;

import baluni.model.Fajl;

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
     * */
    public abstract boolean createDirectory(String destination, String creationPattern);

    /**
     * Method for file creation
     *
     *
     * Input parameter is a fileName (including extension).
     *
     * */
    public abstract boolean createFile(String path, String fileName);

    public abstract void buildPath(String path);

    /** Method for file upload
     *
     *  Input parameters are destination path which will
     *  be used for file upload and a list of files
     *  to be uploaded.
     * */
    public abstract void fileUpload(String destination, List<Fajl> files);

    /** Method for file deletion
     *
     *  Input parameter is a List of files
     *  to be deleted.
     * */
    public abstract void deleteFiles(List<Fajl> files);

    /** Method for directory deletion
     *
     * Input parameter is a list of directories
     * to be deleted.
     */
    public abstract void deleteDirectories(List<Fajl> directories);

    /** Method for moving files from source to destination
     *
     *  Input parameters are Strings which represent
     *  source from which files are being moved to
     *  the destination source which is provided
     *  as a second argument.
     *
     * */
    public abstract void moveFiles(String source, String destination);

    /** Method for content download
     *
     *  Input parameter is a String which represents
     *  a path to the directory which files we want to
     *  download or it's a path to the file we want to
     *  download.
     **/
    public abstract void download(String destinationPath, String sourcePath);

    /**Method fpr renaming files
     *
     * Input parameters are the old and new name of the
     *  file.
     * @param oldFileName
     * @param newFileName
     */

    public abstract boolean rename(String oldFileName, String newFileName);

    //pretrazivanje skladista

    /**Method for listing all the files for a specific folder
     * Input parameter is the name of the folder.
     *
     */
    public abstract List<Fajl> listFilesInDir(String dirPath);

    /**Method for listing all the files from all the folders
     * in a specfic folder
     * @param dirPath
     */
    public abstract List<Fajl> listFilesInSubDir(String dirPath);

    /**Method for listing all the files in a specific folder
     * and from it's subdirectories
     *
     * @param dirPath
     */
    public abstract List<Fajl> listFiles(String dirPath);

    /**Method for listing all the files with a certain extention
     *
     * @param extention
     */
    public abstract List<Fajl> listFilesForExtension(String extention);

    /**Method for listing  files that contain  a string
     *
     * @param pattern
     */
    public abstract List<Fajl> listFilesForName(String pattern);

    public abstract boolean listDirForNames(String dirPath, List<String> patterns);

    public abstract Fajl findDirectoryOfFile(String fileName);

    public abstract List<Fajl> sort(List<Fajl> fileList, boolean byName, boolean creationDate, boolean dateModified,
              boolean asc);

    public abstract List<Fajl> listFileByDate(String date, String dirPath);

    public abstract List<Fajl> listFilesBetweenDates(String startDate, String endDate, String dirPath);

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
}
