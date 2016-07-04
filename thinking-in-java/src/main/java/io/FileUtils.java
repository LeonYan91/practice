package io;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author yanliang
 */
public class FileUtils {

    private static int BUFFER_LENGTH = 1024;

    /**
     * compress a file or files under source directory into a zip file to under des
     * @param source
     * @param des
     */
    public static void compressFilesToZip(String source,String des) throws IOException {

        File sourceFile = new File(source);

        //destination output stream
        FileOutputStream fos = new FileOutputStream(des+File.separator + sourceFile.getName()+".zip");
        ZipOutputStream zos = new ZipOutputStream(fos);

        writeZipOutStream(new File(source),zos,source);
        zos.close();

    }

    private static void writeZipOutStream(File file,ZipOutputStream zos,String source) throws IOException{

        int length = 0;
        byte[] buffer = new byte[BUFFER_LENGTH];
        String fileAbsPath = file.getAbsolutePath();
        System.out.println(fileAbsPath);
        if (file.isFile()){
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            ZipEntry entry = new ZipEntry(fileAbsPath.substring(source.length() + 1, fileAbsPath.length()));
            zos.putNextEntry(entry);

            while ((length = bis.read(buffer)) != -1)
                zos.write(buffer,0,length);
            //close resource
            bis.close();
            zos.closeEntry();
        }else if (file.isDirectory()){
            File[] files = file.listFiles();
            //the directory maybe empty
            if (files != null && files.length > 0){
                for (File f : files)
                    writeZipOutStream(f,zos,source);
            }else {
                //if it's a empty directory,still create a entry for a empty directory
                ZipEntry entry = new ZipEntry(fileAbsPath.substring(source.length() + 1, fileAbsPath.length())+File.separator);
                zos.putNextEntry(entry);
                zos.closeEntry();
            }

        }
    }

}
