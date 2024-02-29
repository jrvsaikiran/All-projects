package weekone.weektwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderExam {

	@DataProvider(name="testdata")
	public static Object[][] pub(Method m) {
		String[][] testdata = new String[0][];
		String sheetname = m.getName();
		try {
			FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet(sheetname);
			int lastRowNum = sheet.getLastRowNum();
			int lastCellNum = sheet.getRow(0).getLastCellNum();
			System.out.println("Row Count "+lastRowNum);

			System.out.println("Column Count "+lastCellNum);

			testdata = new String[lastRowNum][lastCellNum];
			DataFormatter formate = new DataFormatter();
			for(int i=1;i<=lastRowNum;i++) {
				for(int j=0;j<lastCellNum;j++) {
					testdata[i-1][j] = formate.formatCellValue(sheet.getRow(i).getCell(j));
					System.out.println("The value of row "+(i-1)+" and column "+j+" is : "+testdata[i-1][j]);
				}
			}
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
		System.out.println(testdata);
		return testdata;
	}
	public static Map<Object,Object> map;
    @DataProvider(name="testdataMap")
    public static Object[][] testData(Method m) throws IOException {
        String sheetname = m.getName();
            FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheet(sheetname);
            int lastRowNum = sheet.getLastRowNum();
            int lastCellNum = sheet.getRow(0).getLastCellNum();
            System.out.println("Row Count "+lastRowNum);
            System.out.println("Column Count "+lastCellNum);
			Object[][] obj = new Object[lastRowNum][1];
            DataFormatter formate = new DataFormatter();
		List<Map<Object, Object>> list = new ArrayList<>();

            for(int i=0;i<lastRowNum;i++) {
				map = new LinkedHashMap<>();
                for(int j=0;j<lastCellNum;j++) {
					map.put(formate.formatCellValue(sheet.getRow(0).getCell(j)),formate.formatCellValue(sheet.getRow(i+1).getCell(j)));
					obj[i][1]=map;
                }
				list.add(map);
			}
			System.out.println(list);
			setExcelTable(list);
			getExcelTable();
		System.out.println(getExcelTable());
		return obj;
	}

	public static List<Map<Object, Object>> excelTable;

	public static List<Map<Object, Object>> getExcelTable() {
		return excelTable;
	}

	public static void setExcelTable(List<Map<Object, Object>> excelTable) {
		DataProviderExam.excelTable = excelTable;
	}


	@DataProvider(name="naga",parallel=false)
	public Object[][] ReadExcelTestData() {
//		String sheetName = excelSheet.getName();
		List<Map<String, String>> excelTable = new ArrayList<Map<String,String>>();
		DataFormatter formate = new DataFormatter();
		try {
			FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet mySheet = wb.getSheet("facebook");
			Iterator<Row> rowIterator = mySheet.iterator();  	//no.of records in excel sheet
			//traversing over each row of XLSX file and get all rows into exceltable
			boolean header = true;
			ArrayList<String> keys =null;
			Map<String, String> valueMap =null;
			while(rowIterator.hasNext()) {
				ArrayList<String> values = new ArrayList<>();
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while(cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					values.add(formate.formatCellValue(cell).trim());
				}

				if(header) {
					header=false;
					keys=values;
				}else {
					//convert list of values to map
					valueMap = new LinkedHashMap<String, String>();
					for(int i=0;i<keys.size();i++) {
						valueMap.put(keys.get(i), values.get(i));
					}
					excelTable.add(valueMap);
				}
			}
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}System.out.println("excelTable"+excelTable);
//		setExcelTable(excelTable);
//		return (values);


		return new Object[0][];
	}




	@DataProvider(name="nagapro",parallel=false)
	public void ReadData(Method m) {
//		DataProvider dataProvider = new DataProvider(m.getName());
//		return dataProvider;
	}



//
//	public DataProviderExam(String sheetName) {
////		String sheetName = sheetName.getName();
//		List<Map<String, String>> excelTable = new ArrayList<Map<String,String>>();
//		DataFormatter formate = new DataFormatter();
//		try {
//			FileInputStream fis = new FileInputStream("./testData/TestData.xlsx");
//			XSSFWorkbook wb = new XSSFWorkbook(fis);
//			XSSFSheet mySheet = wb.getSheet(sheetName);
//			Iterator<Row> rowIterator = mySheet.iterator();  	//no.of records in excel sheet
//			//traversing over each row of XLSX file and get all rows into exceltable
//			boolean header = true;
//			ArrayList<String> keys =null;
//			Map<String, String> valueMap =null;
//			while(rowIterator.hasNext()) {
//				ArrayList<String> values = new ArrayList<>();
//				Row row = rowIterator.next();
//				Iterator<Cell> cellIterator = row.cellIterator();
//				while(cellIterator.hasNext()) {
//					Cell cell = cellIterator.next();
//					values.add(formate.formatCellValue(cell).trim());
//				}
//
//				if(header) {
//					header=false;
//					keys=values;
//				}else {
//					//convert list of values to map
//					valueMap = new LinkedHashMap<String, String>();
//					for(int i=0;i<keys.size();i++) {
//						valueMap.put(keys.get(i), values.get(i));
//					}
//					excelTable.add(valueMap);
//				}
//			}
//			weektwo.PaymentTxn[]  paymentList = new weektwo.PaymentTxn[excelTable.size()];
//			int i=0;
//			for(Map<String, String> rw:excelTable) {
//				weektwo.PaymentTxn txn = new weektwo.PaymentTxn(rw);
//				paymentList[i++] = txn;
//			}
////			return (paymentList);
//
//		} catch (FileNotFoundException e) {
//
//		} catch (IOException e) {
//
//		}System.out.println("excelTable"+excelTable);
////		return paymentList;
////		return paymentList;
//
//}





	}




