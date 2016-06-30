package io;

import java.io.File;
import java.io.IOException;

/**
 * @author yanliang
 */
public class FileCopyDemo {
    public static void main(String[] args) {

        System.out.println(new File("D:"+File.separator+"03-others"+File.separator+"copyTest").exists());
        try {
            FileCopyUtils.copyFile(new File("D:"+File.separator+"03-others"+File.separator+"copyTest"),"D:"+File.separator);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
