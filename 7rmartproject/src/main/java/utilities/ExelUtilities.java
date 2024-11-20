package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import constants.Constants;

public class ExelUtilities {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
	public static String getStringData(int i,int j,String sheet1) throws IOException
	{
		String filepath=Constants.TESTDATAFILE;//constants is a class static method calling classname.variable name
		//constant is class name and testdatafile is variable name
		f=new FileInputStream(filepath);//filepath is a variablename
		w=new XSSFWorkbook(f);
		s=w.getSheet("sheet1");
		XSSFRow r=s.getRow(i);
		XSSFCell c=r.getCell(j);
		return c.getStringCellValue();
	}
	    public static String getIntegerData(int i,int j,String sheet1) throws IOException
		{
		String filepath=Constants.TESTDATAFILE;
		f=new FileInputStream(filepath);
		w=new XSSFWorkbook(f);
		s=w.getSheet("sheet1");
		XSSFRow r=s.getRow(i);
		XSSFCell c=r.getCell(j);
		int x=(int) c.getNumericCellValue();
		return String.valueOf(x);
	}
	}//apache poi is collection of external library ie.red and write from excel notpad word
//dependecys meansexternal java librry (class and interface)
