package main.java.org.FileParser;

import java.io.File;

/**
 * Calculate number and size of files in folder
 */
public class FileParser {

    String path;
    Integer directoriesNumber;
    Integer filesNumber;
    Integer filesLength;
    FileParser(String path) {

        directoriesNumber = 0;
        filesNumber = 0;
        filesLength = 0;
        this.path = path;
    }
    public void parseDirectory(String path) {

        File folder = new File(path);
        File[] listFiles = folder.listFiles();
        for(int i = 0; i < listFiles.length; i++){
            if(listFiles[i].isFile()){
                filesNumber++;
                filesLength += (int)listFiles[i].length();
            }
            else {
                directoriesNumber++;
                parseDirectory(listFiles[i].getPath());
            }
        }
    }
    public void showInfo() {

        parseDirectory(path);
        System.out.println("Number of file in directory : " + filesNumber);
        System.out.println("Size of files in directory : " + filesLength);
        System.out.println("Number of folders in directory : " + directoriesNumber);
    }
}
