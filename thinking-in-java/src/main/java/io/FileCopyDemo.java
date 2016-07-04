package io;

import java.io.File;
import java.io.IOException;

/**
 * @author yanliang
 */
public class FileCopyDemo {
    public static void main(String[] args) {

        String sourceFilePath = "D:"+File.separator+"03-others"+File.separator+"copyTest";
        File sourceFile = new File(sourceFilePath);
        System.out.println(new File("D:"+File.separator+"03-others"+File.separator+"copyTest").exists());
        try {
//            FileCopyUtils.copyFile(new File("D:"+File.separator+"03-others"+File.separator+"copyTest"),"D:"+File.separator);
            FileUtils.compressFilesToZip(sourceFilePath,"D:"+File.separator);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
