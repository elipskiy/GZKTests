package utils;

import java.io.*;

/**
 * Created by makovskiy on 21.01.2015.
 */
public class WriterReader {

    public void Write(String pass,String fileName) {
//        String pass = "";
        try {

//            String content = "This is the content to write into file";

            File file = new File(fileName);

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(pass);
            bw.close();

//            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
//        return pass;
    }

    public String Reader(String fileName) {
        String pass = "";
        try {
            File stockInputFile = new File(fileName);
//            File StockOutputFile = new File("C://Out.txt");

                     /*
                      * Constructor of FileInputStream throws FileNotFoundException if
                      * the argument File does not exist.
                      */

            FileInputStream fis = new FileInputStream(stockInputFile);
//            FileOutputStream fos = new FileOutputStream(StockOutputFile);
            int count;

            while ((count = fis.read()) != -1) {
//                fos.write(count);
                pass += Character.toString((char)count);
            }
            fis.close();
//            fos.close();
        } catch (FileNotFoundException e) {
            System.err.println("FileStreamsReadnWrite: " + e);
        } catch (IOException e) {
            System.err.println("FileStreamsReadnWrite: " + e);
        }

        return pass;
    }
}
