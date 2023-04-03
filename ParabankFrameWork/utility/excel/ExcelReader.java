package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	public Object[][] gettestdata(String SheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("G:\\Testing Videos\\FrameWork_TestData.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet(SheetName);
		
		Object[][] data=new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
		for(int i=0;i<sh.getLastRowNum();i++)
		{
			for(int j=0;j<sh.getRow(0).getLastCellNum();j++)
			{
				data[i][j]=sh.getRow(i+1).getCell(j).toString();
				System.out.println(data[i][j]);
			}
		}
		return data;
	}
	
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		ExcelReader e=new ExcelReader();
//		System.out.println(e.gettestdata());
//	}
}
