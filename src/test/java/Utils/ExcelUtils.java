package Utils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {
    public static Object[] readRowData(String filePath, String sheetName, int rowNumber) throws IOException {
        FileInputStream file = new FileInputStream(filePath);
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheet(sheetName);

        if (sheet == null) {
            throw new IllegalArgumentException("Sheet " + sheetName + " does not exist in " + filePath);
        }

        Row row = sheet.getRow(rowNumber);
        Object[] data = new Object[row.getLastCellNum()];
        for (int i = 0; i < row.getLastCellNum(); i++) {
            data[i] = row.getCell(i) != null ? row.getCell(i).toString() : "";
        }

        workbook.close();
        file.close();
        return data;
    }

}

