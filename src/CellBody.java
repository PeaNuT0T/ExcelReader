public class CellBody {
	
	String word;  //ֵ
	CellBody father;  //�������
	int level;  //��
	int rowNum; //�к�
	int number; //���
	public CellBody(String theword, int num, int lev, int shuzi)
	{
		word = theword;
		father = null;
		level = lev;
		rowNum = num;
		number = shuzi;
	}
	public CellBody(String theword, CellBody thefather, int lev, int num, int shuzi)
	{
		word = theword;
		father = thefather;
		level = lev;
		rowNum = num;
		number = shuzi;
	}
	
	public CellBody getFather()
	{
		return father;
	}
	public void setFather(CellBody f)
	{
		father = f;
	}
	
	public String getWord()
	{
		return word;
	}
	public void setWord(String worD)
	{
		word = worD;
	}
	
	public int getCol()
	{
		return level;
	}
	public void setCol(int leVel)
	{
		level = leVel;
	}
	
	public int getRow()
	{
		return rowNum;
	}
	public void setRow(int num)
	{
		rowNum = num;
	}
	
	public int getNum()
	{
		return number;
	}
	public void setNum(int n)
	{
		number = n;
	}
}
