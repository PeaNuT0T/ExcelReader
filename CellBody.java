import org.apache.poi.ss.usermodel.*;
public class CellBody {
	
	String word;
	Cell father;
	int level;
	public CellBody(String theword, Cell thefather, int lev)
	{
		word = theword;
		father = thefather;
		level = lev;
	}
	
	public Cell getFather()
	{
		return father;
	}
	
	public String getWord()
	{
		return word;
	}
	public int getCol()
	{
		return level;
	}
	public void setFather(Cell f)
	{
		father = f;
	}
}
