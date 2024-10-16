import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadingDataFromExcel {

    //Excel File -- Workbook -- Sheets -- Rows -- Cells
    public static void main (String [] args) throws FileNotFoundException {
        FileInputStream file = new FileInputStream("C:\\Users\\hp\\IdeaProjects\\TestNGDemo_Maven\\TestData\\Data.xlsx");

//        XSSWorkbook wb = new XSSWorkbook(file);
//
//        XSSSheet sheet1 = workbook.getSheet("Sheet1");  // XSSSheet sheet = workbook.getSheetAt(0);
//
//        int totalRows = sheet.getLastRowNum();

//        int totalCells = sheet.getRow(1).getLastCellNum();
//
//        System.out.println("number of rows:" + totalRows);
//
//        System.out.println("number of cells:" + totalCells);

    }
}
