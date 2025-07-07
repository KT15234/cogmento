package IHelper;

public interface IExcelReader {

	Object[][] getAllSheetTestData();

	Object[][] getAllSheetTestData(int startRow, int endRow);

	Object[][] getAllSheetTestData(int startRow, int endRow, int startColumn, int endColumn);

}
