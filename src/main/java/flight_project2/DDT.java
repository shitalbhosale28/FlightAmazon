package flight_project2;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class DDT {
    String username;
    String password;


    public void ddt() throws IOException {
        FileInputStream f1 = new FileInputStream("C:\\Users\\amolb\\eclipse-workspace\\Selenium\\EXCEL\\Data.xlsx");
        Workbook w1 = WorkbookFactory.create(f1);
        Sheet s1 = w1.getSheet("logindetails");
        Row r1 = s1.getRow(0);
        Cell c1 = r1.getCell(0);
        username = c1.getStringCellValue();
        password = w1.getSheet("logindetails").getRow(0).getCell(1).getStringCellValue();

    }

}
