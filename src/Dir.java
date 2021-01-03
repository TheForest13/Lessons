import java.io.File;

public class Dir {
    public static void main(String[] args) {
        File dir = new File("DirTest");
        dir.mkdir();
        File f = new File("Filetest.txt");
        if (dir.isDirectory()){
            String[] dirContents = dir.list();
            for (int i =0; i < dirContents.length; i++){
                System.out.println(dirContents[i]);
            }
        }

    }
}
