package program.FileConcept;

// In this program, we accepts a file or directory name from
// command line arguments. Then the program will check if
// that file or directory physically exist or not and
// it displays the property of that file or directory.
import java.io.*;

// Displaying file property
class FileProperty
{
    public static void main(String[] args) {
        //accept file name or directory name through command line args
        //String fname =args[0];

        //pass the filename or directory name to File object
        File f = new File("/Users/surakum2/IdeaProjects/JAVA/src/program/FileConcept/file2.txt");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
            create a file and write to it in Java

        PrintWriter writer = null;
        try {
            writer = new PrintWriter("/Users/surakum2/IdeaProjects/JAVA/src/program/FileConcept/file1.txt", "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        writer.println("The first line");
        writer.println("The second line");
        writer.close();*/

        //apply File class methods on File object
        System.out.println("File name :"+f.getName());
        System.out.println("Path: "+f.getPath());
        System.out.println("Absolute path:" +f.getAbsolutePath());
        System.out.println("Parent:"+f.getParent());
        System.out.println("Exists :"+f.exists());
        if(f.exists())
        {
            System.out.println("Is writeable:"+f.canWrite());
            System.out.println("Is readable"+f.canRead());
            System.out.println("Is a directory:"+f.isDirectory());
            System.out.println("File Size in bytes "+f.length());
        }
    }
}

