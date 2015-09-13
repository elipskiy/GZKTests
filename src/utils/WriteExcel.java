/*package utils;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import java.io.File;
import java.io.IOException;



public class WriteExcel {
    public static void main(String[] args) throws IOException, RowsExceededException, WriteException{

        File fExcel = new File("createExcel.xls");

        WritableWorkbook writableBook = Workbook.createWorkbook(fExcel);

        writableBook.createSheet("Data",0);

        WritableSheet writableSheet = writableBook.getSheet(0);

        //Label data1 = new Label(0,0,"new");
        //writableSheet.addCell(data1);

        //Label data2 = new Label(0,1,"new");
        //writableSheet.addCell(data2);

        writableBook.write();
        writableBook.close();
    }

}*/
