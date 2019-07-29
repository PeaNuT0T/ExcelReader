import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.*;



public class Main {
    public static final String File_Path = "C:\\Users\\97687\\Desktop\\target.xlsx";
    public static void main(String[] args) throws IOException, InvalidFormatException {
    Main main = new Main();
        // 从Excel文件中创建一个工作簿
        Workbook workbook = WorkbookFactory.create(new File(File_Path));

        // 显示文件页数
        //System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
        //迭代行与列
        Iterator<Sheet> sheetIterator = workbook.sheetIterator();
        //while (sheetIterator.hasNext()) 
        //{
            //Sheet sheet = sheetIterator.next();
            //System.out.println("=> " + sheet.getSheetName());
        //}

        // 取得第一页
        Sheet sheet = workbook.getSheetAt(0);

        // 创建一个格式化工具
        DataFormatter dataFormatter = new DataFormatter();

        List<CellBody> cellArray = new ArrayList<CellBody>();
        List<Cell> fatherCellArray = new ArrayList<Cell>();
        List<Cell> cellArray0 = new ArrayList<Cell>();
        List<Cell> cellArray1 = new ArrayList<Cell>();
        List<Cell> cellArray2 = new ArrayList<Cell>();
        List<Cell> cellArray3 = new ArrayList<Cell>();
        List<Cell> cellArray4 = new ArrayList<Cell>();
        List<Cell> cellArray5 = new ArrayList<Cell>();
        List<Cell> cellArray6 = new ArrayList<Cell>();
        List<Cell> cellArray7 = new ArrayList<Cell>();
        Iterator<Row> rowIterator = sheet.rowIterator();
        //父类信息
        //String store = "";
        
        
        
      //迭代每行
        while (rowIterator.hasNext()) 
        {
        	int col = 0; //表示列并分级
            Row row = rowIterator.next();//下一行
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) 
            {
                Cell cell = cellIterator.next();
                if (cell.getStringCellValue() != null && cell.getStringCellValue().length() != 0)
                {
                	String cellValue = cell.getRichStringCellValue().getString();//读取单元格内容
                	//store = cellValue;
							if (col == 0) {
								cellArray0.add(cell);
							}
							if (col == 1) {
								cellArray1.add(cell);
							}
							if (col == 2) {
								cellArray2.add(cell);
							}
							if (col == 3) {
								cellArray3.add(cell);
							}
							if (col == 4) {
								cellArray4.add(cell);
							}
							if (col == 5) {
								cellArray5.add(cell);
							}
							if (col == 6) {
								cellArray6.add(cell);
							}
							if (col == 7) {
								cellArray7.add(cell);
							}
					
					
				int fatherIndex = col - 1;
                CellBody target = new CellBody(cellValue, cell, col);
                
                	if(col!=0)
                	{
	                	if (fatherIndex == 0) {
							target.setFather(cellArray0.get(cellArray0.size() - 1));
						}
						if (fatherIndex == 1) {
							target.setFather(cellArray1.get(cellArray1.size() - 1));
						}
						if (fatherIndex == 2) {
							target.setFather(cellArray2.get(cellArray2.size() - 1));
						}
						if (fatherIndex == 3) {
							target.setFather(cellArray3.get(cellArray3.size() - 1));
						}
						if (fatherIndex == 4) {
							target.setFather(cellArray4.get(cellArray4.size() - 1));
						}
						if (fatherIndex == 5) {
							target.setFather(cellArray5.get(cellArray5.size() - 1));
						}
						if (fatherIndex == 6) {
							target.setFather(cellArray6.get(cellArray6.size() - 1));
						}
						if (fatherIndex == 7) {
							target.setFather(cellArray7.get(cellArray7.size() - 1));
						}
                	}
               
                fatherCellArray.add(target.getFather());
                cellArray.add(target);
                }
                col++;
               }
                
                
              }
                
            
            
        
        
        for (int i = 0; i < cellArray0.size(); i++) {
			System.out.println(main.printCellValue(cellArray2.get(i)));
		}
        CellBody testCell = cellArray.get(2);
        CellBody testCellF = cellArray.get(1);
        
        	
        
        // 关闭工作簿
        workbook.close();
    }
    
//可以使用此函数来打印出每个单元格的信息
    private String printCellValue(Cell cell) 
    {
        return(cell.getRichStringCellValue().getString());
    }
}
