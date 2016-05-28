package main.java.org.FileParser;

/**
 * Show number of files in folder
 */
public class FilesFolders {

    public static void main(String...args) {

        if(args.length != 0) {
            FileParser fileParser = new FileParser(args[0]);
            fileParser.showInfo();
        } else {
            System.out.println("Pass the path of directory as an argument!");
        }
    }
}
