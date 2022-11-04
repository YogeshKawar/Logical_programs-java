package HMSUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HMSUtilityClass {
public static String getTD(int rowindex, int colindex) throws Throwable {
	FileInputStream file = new FileInputStream("admin.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("admin");
	
	String data = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
	return data;
	
}
}
