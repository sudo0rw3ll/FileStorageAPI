package baluni.filestorage;

import java.io.File;
import java.util.List;

public abstract class MyFileStorage {

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
    public abstract boolean createFile(String fileName);

    /** Method for file upload
     *
     *  Input parameters are destination path which will
     *  be used for file upload and a list of files
     *  to be uploaded.
     * */
    void fileUpload(String destination, List<File> files){
        return;
    }

    /** Method for file deletion
     *
     *  Input parameter is a List of files
     *  to be deleted.
     * */
    void deleteFiles(List<File> files){
        return;
    }

    /** Method for directory deletion
     *
     * Input parameter is a list of directories
     * to be deleted.
     */
    void deleteDirectories(List<File> directories){
        return;
    }

    /** Method for moving files from source to destination
     *
     *  Input parameters are Strings which represent
     *  source from which files are being moved to
     *  the destination source which is provided
     *  as a second argument.
     *
     * */
    void moveFiles(String source, String destination){
        return;
    }

    /** Method for content download
     *
     *  Input parameter is a String which represents
     *  a path to the directory which files we want to
     *  download or it's a path to the file we want to
     *  download.
     **/
    void download(String destinationPath, String sourcePath){
        return;
    }

    /**Method fpr renaming files
     *
     * Input parameters are the old and new name of the
     *  file.
     * @param oldFileName
     * @param newFileName
     */

    void rename(String oldFileName, String newFileName){
        return;
    }

    //pretrazivanje skladista

    /**Method for listing all the files for a specific folder
     * Input parameter is the name of the folder.
     *
     */
    void listFilesInDir(String dirPath){
        return;
    }

    /**Method for listing all the files from all the folders
     * in a specfic folder
     * @param dirPath
     */
    void listFilesInSubDir(String dirPath){
        return;
    }

    /**Method for listing all the files in a specific folder
     * and from it's subdirectories
     *
     * @param dirPath
     */
    void listFiles(String dirPath){
        return;
    }

    /**Method for listing all the files with a certain extention
     *
     * @param extention
     */
    void listFilesForExtension(String extention){

    }

    /**Method for listing  files that contain  a string
     *
     * @param pattern
     */
    void listFilesForName(String pattern){
        return;
    }

    boolean listDirForNames(String dirPath, List<String> patterns){
        return false;
    }

    void findDirectoryOfFile(String fileName){
        return;
    }

    void sort(boolean byName, boolean creationDate, boolean dateModified,
              boolean asc, boolean desc){
        return;
    }

    void listFileByDate(){
        return;
    }

    void filterData(boolean byPath,boolean byName,boolean bySize,boolean byCreationDate
    ,boolean byModificationDate, boolean byExtension){
        return;
    }


}
