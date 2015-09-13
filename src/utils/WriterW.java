package utils;

import java.io.*;

/**
 * Created by makovskiy on 15.12.2014.
 */
public class WriterW {

    private File newFile = new File("sww");
//    private File newFile = new File(("C://test.txt"));

    private FileWriter fileW;
    private BufferedWriter buffW ;

    public WriterW()  {

        try {
            fileW = new FileWriter(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        buffW = new BufferedWriter(fileW);

    }

    public String writerRead()
            throws FileNotFoundException, IOException {

//
        String pass= "";

//        BufferedReader br = new BufferedReader (
//                new InputStreamReader(
//                        new FileInputStream( newFile ), "UTF-8"
//                )
//        );
//        String line = null;
//        while ((line = br.readLine()) != null) {
//            //variable line does NOT have new-line-character at the end
//            System.out.println( line );
//            pass = line;
//        }
//        br.close();

        FileInputStream fis = null;
        int i = 0;
        char c;

        try{
            // create new file input stream
            fis = new FileInputStream(newFile);

            // read till the end of the file
            while((i=fis.read())!=-1)
            {
                // converts integer to character
                c=(char)i;
                pass += c;
                // prints character
//                System.out.print(c);
            }
        }catch(Exception ex){
            // if any error occurs
            ex.printStackTrace();
        }finally{

            // releases all system resources from the streams
            if(fis!=null)
                fis.close();
        }

        return pass;
    }


    public void myFileWriter(String text) throws IOException {

                buffW.write(text);
//                buffW.write(text+"\n");

    }

     public void close()  {

        System.out.println("file written");
         try {
             buffW.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
}

