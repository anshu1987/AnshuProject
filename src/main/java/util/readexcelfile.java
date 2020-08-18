package util;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class readexcelfile {

       public static void main(String[] args) throws IOException {
           readExcelFile();
       }

        public static void readExcelFile() throws IOException {
            String filePath = System.getProperty("user.dir")+"/src/main/resources/excelfile/Book1.xlsx";
            System.out.println(filePath);
            File file = new File(filePath);
            System.out.println("Name of the file" +file.getName());
            System.out.println("Path of the file" +file.getPath());
            FileInputStream fileName = new FileInputStream(file);
            Workbook mybook = null;
            String fileextension = file.getName().substring(file.getName().indexOf("."));
            System.out.println(fileextension);
            if (fileextension.equals(".xlsx")){
                mybook = new XSSFWorkbook(fileName);
            }
            Sheet mySheet =  mybook.getSheet("Sheet1");

            //Find number of rows in excel file
            int rowCount = mySheet.getLastRowNum() - mySheet.getFirstRowNum();
            System.out.println(rowCount);
            for (int i =0;i < rowCount+1 ; i++){
                Row row = mySheet.getRow(i);
                System.out.println(row.getLastCellNum());
                for (int j = 0; j < row.getLastCellNum(); j++) {
                    //Print Excel data in console
                    System.out.print(row.getCell(j).toString()+"| ");
                }
                System.out.println();

            }



        }

}
