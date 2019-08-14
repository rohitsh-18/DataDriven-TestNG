package utils;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.testng.annotations.DataProvider;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class TestDataProvider {

    @DataProvider(name = "login")
    public static Object[][] testDataGenerator() throws Exception {
        Object[][] arrayExcelData = null;
        try {
            FileInputStream fs = new FileInputStream("./src/main/resources/testdata/test_data.xls");
            Workbook wb = Workbook.getWorkbook(fs);

            Sheet sh = wb.getSheet("Login");

            int totalNoOfCols = sh.getColumns();
            int totalNoOfRows = sh.getRows();

            arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];

            for (int i= 1 ; i < totalNoOfRows; i++) {
                for (int j=0; j < totalNoOfCols; j++) {
                    arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        return arrayExcelData;
    }



}
