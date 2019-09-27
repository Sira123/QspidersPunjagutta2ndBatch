package Frame_design;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation{
	
	
	// Method to read  String data from excel sheet 
	public static String readStringData(String sheetName, int rowNum, int cellNum)
	{
		
		try
		{ 
			// Opening  excel file in read mode 
			FileInputStream fis= new FileInputStream("G:\\\\TestData/UserData.xlsx");
			Workbook w1= WorkbookFactory.create(fis);
			
			// getting string type data from excel sheet
			return (w1.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue());
		}
		
		catch(Exception e)
		{
			return "File Not Found";
			
		}
	
	}
	
	
	// Method to write String data to excel sheet 
		public static void writeStringData(String sheetName, int rowNum, int cellNum, String data)
		{
			
			try
			{ 
				// Opening  excel file in read mode 
				FileInputStream fis= new FileInputStream("G:\\\\TestData/UserData.xlsx");
				Workbook w1= WorkbookFactory.create(fis);
				
				// getting string type data from excel sheet
			   w1.getSheet(sheetName).getRow(rowNum).createCell(cellNum).setCellValue(data);
			  
			   
			   // Opening excel file in write mode
			   FileOutputStream fos= new FileOutputStream("G:\\TestData/UserData.xlsx");
			   
			   
			   // Saving the data written on the original file
			     w1.write(fos); 
			  
			    
			
			}
			
			catch(Exception e)
			{
				System.out.println("File not found");
				
			}
		
		}
		
		
		// Method for reading number data from excel sheet
		public static long readNumberData(String sheetName, int rowNum, int cellNum)
		{
			
			try
			{ 
				// Opening  excel file in read mode 
				FileInputStream fis= new FileInputStream("G:\\TestData/UserData.xlsx");
				Workbook w1= WorkbookFactory.create(fis);
				
				// getting string type data from excel sheet
				return ((long)w1.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue());
			}
			
			catch(Exception e)
			{
				return  101;
				
			}
		
		}
		
		
	

		// Method to write Number data to excel sheet 
			public static void writeNumberData(String sheetName, int rowNum, int cellNum, Long data)
			{
				
				try
				{ 
					// Opening  excel file in read mode 
					FileInputStream fis= new FileInputStream("");
					Workbook w1= WorkbookFactory.create(fis);
					
					// getting string type data from excel sheet
				   w1.getSheet(sheetName).getRow(rowNum).createCell(cellNum).setCellValue(data);
				  
				   
				   // Opening excel file in write mode
				   FileOutputStream fos= new FileOutputStream("G:\\TestData/UserData.xlsx");
				   
				   
				   // Saving the data written on the original file
				     w1.write(fos); 
				  
				    
				
				}
				
				catch(Exception e)
				{
					System.out.println("File not found");
					
				}
			
			}
			
	
	
	
}

