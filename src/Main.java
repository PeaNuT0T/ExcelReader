import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
import com.alibaba.fastjson.JSON;


public class Main {
    public final static String File_Path = "C:\\Users\\97687\\Desktop\\target.xlsx";  //路径
    public static void main(String[] args) throws IOException, InvalidFormatException {
    Main main = new Main();
        // 从Excel文件中创建一个工作簿
        Workbook workbook = WorkbookFactory.create(new File(File_Path));
        //迭代行与列
        Iterator<Sheet> sheetIterator = workbook.sheetIterator();
        // 取得第一页
        Sheet sheet = workbook.getSheetAt(0);
        // 创建一个格式化工具
        DataFormatter dataFormatter = new DataFormatter();
        List<CellBody> cellArray = new ArrayList<CellBody>();
        List<CellBody> fatherCellArray = new ArrayList<CellBody>();
        List<CellBody> cellArray0 = new ArrayList<CellBody>();
        List<CellBody> cellArray1 = new ArrayList<CellBody>();
        List<CellBody> cellArray2 = new ArrayList<CellBody>();
        List<CellBody> cellArray3 = new ArrayList<CellBody>();
        List<CellBody> cellArray4 = new ArrayList<CellBody>();
        List<CellBody> cellArray5 = new ArrayList<CellBody>();
        List<CellBody> cellArray6 = new ArrayList<CellBody>();
        List<CellBody> cellArray7 = new ArrayList<CellBody>();
        Iterator<Row> rowIterator = sheet.rowIterator();

        
        
        int cellNumber = 0;//序列号
        
      //迭代每行
        while (rowIterator.hasNext()) 
        {
        	int col = 0; //表示列并分级
            Row row = rowIterator.next();//下一行
            Iterator<Cell> cellIterator = row.cellIterator();
            int rowNum = 0;
            while (cellIterator.hasNext()) 
            {
                Cell cell = cellIterator.next();
                if (cell.getStringCellValue() != null && cell.getStringCellValue().length() != 0)
                {
                	String cellValue = cell.getRichStringCellValue().getString();//读取单元格内容
                	CellBody store = new CellBody(cellValue, rowNum, col, cellNumber);
                	CellBody target = new CellBody(cellValue, store, rowNum, col, cellNumber);	
                	int fatherIndex = col - 1;
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
					                if (col == 0) {
										cellArray0.add(target);
									}
									if (col == 1) {
										cellArray1.add(target);
									}
									if (col == 2) {
										cellArray2.add(target);
									}
									if (col == 3) {
										cellArray3.add(target);
									}
									if (col == 4) {
										cellArray4.add(target);
									}
									if (col == 5) {
										cellArray5.add(target);
									}
									if (col == 6) {
										cellArray6.add(target);
									}
									if (col == 7) {
										cellArray7.add(target);
									}
                cellArray.add(target);
                cellNumber++;
                }
                col++;
               }
            	rowNum++;
              }
        
        //for (int i = 0; i < cellArray.size(); i++) {
			System.out.println(cellArray.get(5633).getWord());  //输出所有父类信息
		//}	
       
        workbook.close(); // 关闭工作簿
    }
    
//可以使用此函数来打印出每个单元格的信息
    private String printCellValue(Cell cell) 
    {
        return(cell.getRichStringCellValue().getString());
    }

}