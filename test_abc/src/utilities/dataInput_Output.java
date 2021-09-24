package utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.File;



public class dataInput_Output {

		public static FileInputStream fis;
		public static String exfilepath = "C:\\Users\\n506072\\eclipse-workspace\\test_abc\\src\\Data\\Data.xls";
		public static FileInputStream f;
		public static FileOutputStream fileop;
		public static HSSFWorkbook workbook;
		public static HSSFSheet sheet;
		public static HSSFSheet sheet1;
		public static HSSFCell cell;
		public static HSSFCell cell1;
		public static HSSFCell cell2;
		public static HSSFRow Row;
		public static HSSFRow Row1;
		public static HSSFRow Row2;
		public static String[][] c;
		public static int l=0,i=0,j=0,k=2,t=0;
		
		public static String[][] readexcel() throws Exception {
			try
				{
				    File myFile = new File(exfilepath);
				    fis=new FileInputStream(myFile); 
					workbook = new HSSFWorkbook(fis);
					sheet = workbook.getSheetAt(0);
				
					do
					{
						if(sheet.getRow(k).getCell(0).toString() != "") 
							l++;
						else
							break;
						k++;
					}while(k>0);
	
			
				/*	for(int p=0;;p++) {
					System.out.println(sheet.getRow(0).getCell(p).toString());					
					if(sheet.getRow(0).getCell(p).)
						++t;
					else
						break;
					}
					
					/*Row = sheet.getRow(0);
					
					for(int p=0;;p++) {
						if(Row.getCell(p).toString().equalsIgnoreCase(""))
							break;
						
						else
							++t;
					}*/
					
//					System.out.println(t);
										
					String[][] d = new String [l][10];
					for(j=0;j<l;j++) {	
					for(i=0;i<10;i++) {
							d[j][i] = sheet.getRow(j+2).getCell(i).toString();
							}
						}
					c=d;
				}
				catch (FileNotFoundException e){
					e.printStackTrace();
				}catch (IOException e){
					e.printStackTrace();}
			return c;
		}
		
/*		public static void writetoexceltestCase1(String[] pt,String[] r,String[] h) throws Exception{
			f=new FileInputStream(DataInputOutput.exfilepath);
			workbook=new XSSFWorkbook(f);
			sheet=workbook.getSheetAt(1);
			Row row=sheet.createRow(0);
			Cell cell=row.createCell(0);
			cell.setCellValue("COURSE_NAME");
			Cell cell1=row.createCell(1);
			cell1.setCellValue("RATING");
			Cell cell4=row.createCell(2);
			cell4.setCellValue("No of Hours:");
			for(int i=1;i<=2;i++) {
				Row row1=sheet.createRow(i);
				Cell cell2=row1.createCell(0);
				cell2.setCellValue(pt[i-1]);
				Cell cell3=row1.createCell(1);
				cell3.setCellValue(r[i-1]);
				Cell cell5=row1.createCell(2);
				cell5.setCellValue(h[i-1]);
			}
			DataInputOutput.writeexcel(workbook);
			System.out.println("Written_in_excel_file");
	}*/
		
	

}
