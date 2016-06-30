package io;

import java.io.*;

/**
 * mainly for practicing
 *
 * @author yanliang
 */
public class FileCopyUtils {

    /**
     * The size of buffer,use to read and write.
     */
    private static int bufferSize = 1024;

    /**
     * for copying file to a a destination,if source is a directory,
     * it will copy the directory and all files under which to a destination.
     * @param source source file to copy from
     * @param dest destination ,it's actually is the parent directory of file of destination,
     *             so first enter the method,need to concatenate the destination string with real
     *             destination file name provided by source file.
     * @param override is override exist file,or skip it.
     *                 true:do override,false:skip it
     * @throws IOException
     */
    public static void copyFile(File source,String dest,boolean override) throws IOException {

        String fileName = source.getName();
        dest = dest+File.separator+fileName;
        File destFile = new File(dest);
        //whether it's a file a directory
        if (!source.isDirectory()){

            //if destination file exist,skip it
            if (destFile.exists() && !override){
                if (override)
                    destFile.delete();
                else{
                    System.out.println(destFile.getName()+"exist,skip it!");
                    return;
                }
            }

            //since it's just a file,so copy it
            //source stream
            BufferedInputStream bif = new BufferedInputStream(
                    new FileInputStream(source)
            );
            //destination stream
            BufferedOutputStream bof = new BufferedOutputStream(
                    new FileOutputStream(dest)
            );
            byte[] bufBytes = new byte[bufferSize];

            int length = 0;
            while ((length=bif.read(bufBytes,0,bufBytes.length)) > -1)
                bof.write(bufBytes,0,length);

            bof.flush();
            bof.close();
            bif.close();
        }else {
            if (!destFile.exists());{
                destFile.mkdir();
            }
            File[] sourceFileArr = source.listFiles();
            //recurly copy file,if file is dir again,redone such recur
            for (File file : sourceFileArr)
                copyFile(file,dest,override);
        }

    };

    /**
     * overload method for <code>copyFile</code>,more detail see<code>copyFile(File source,String dest,boolean override)</code> with override signature,
     * use this method,override variable is default false(which means skip the exist file)
     * @param source
     * @param dest
     * @throws IOException
     */
    public static void copyFile(File source,String dest) throws IOException {
        copyFile(source,dest,false);
    }

}
