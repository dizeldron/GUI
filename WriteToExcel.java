package NextLevel;
import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class WriteToExcel {

    public static void main(String[] args) {

        Workbook workbook = new XSSFWorkbook();
        Sheet newSheet = workbook.createSheet("Absolutelity new sheet ");

        Row row = newSheet.createRow(0);
        row.createCell(0).setCellValue("Blur ");
        row.createCell(1).setCellValue("1999 ");

        Row row1 = newSheet.createRow(1);
        row.createCell(0).setCellValue("Guano Apes ");
        row.createCell(1).setCellValue("1997 ");

        try{
            FileOutputStream fileOut = new FileOutputStream("d:\\Java\\write.xlsx");
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("File been done!");

        }
        catch (Exception e){
            System.out.println("Smth go wrong ");
        }




        }

    }

