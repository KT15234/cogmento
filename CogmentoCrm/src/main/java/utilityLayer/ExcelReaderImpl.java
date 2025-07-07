package utilityLayer;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import IHelper.IExcelReader;
import baseLayer.BaseClass;

public class ExcelReaderImpl extends BaseClass implements IExcelReader {
	private XSSFSheet sheet;
	public ExcelReaderImpl(String excelPath, String SheetName) {
		try {
			sheet = new XSSFWorkbook(new FileInputStream(excelPath)).getSheet(SheetName);

		} catch (Exception e) {
			e.getLocalizedMessage();
		}
	}

	public Object getSpecificSheetData(int rows, int columns) {
		XSSFCell cells = sheet.getRow(rows).getCell(columns);

		if (cells.getCellType() == XSSFCell.CELL_TYPE_STRING) {
			return cells.getStringCellValue();
		} else if (cells.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
			return cells.getRawValue();
		} else if (cells.getCellType() == XSSFCell.CELL_TYPE_FORMULA) {
			return cells.getCellFormula();
		} else if (cells.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
			return cells.getBooleanCellValue();
		} else if (cells.getCellType() == XSSFCell.CELL_TYPE_BLANK) {
			return " ";
		} else {
			return null;
		}
	}

	@Override
	public Object[][] getAllSheetTestData() {
		int totalRows=sheet.getLastRowNum()+1;
		int totalColoumns=sheet.getRow(0).getLastCellNum();
		Object[][]data=new Object[totalRows][totalColoumns];
		for(int i=1;i<totalRows;i++) {
			for(int j=1;j<totalColoumns;j++) {
				data[i - 1][j] = getSpecificSheetData(i, j);
			}
		}
		return data;
		
		
	}

	@Override
	public Object[][] getAllSheetTestData(int startRow, int endRow) {
		int tatalRows=endRow -startRow;
		int totalColumns=sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[tatalRows][totalColumns];

		int k = 0;

		for (int i = endRow; i < tatalRows; i++) {
			for (int j = 0; j < totalColumns; j++) {
				data[k][j] = getSpecificSheetData(i, j);
			}

			k++;
		}
	
		return data;
	}


	@Override
	public Object[][] getAllSheetTestData(int startRow, int endRow, int startColumn, int endColumn) {
		int totalRows = endRow - startRow;

		int totalColumns = endColumn - startColumn;

		Object[][] data = new Object[totalRows][totalColumns];

		int k = 0;

		for (int i = startRow; i < endRow; i++) {
			int p = 0;

			for (int j = startColumn; j < endColumn; j++) {
				data[k][p] = getSpecificSheetData(i, j);

				p++;
			}

			k++;
		}

		return data;
	}

}