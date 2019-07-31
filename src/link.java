public class link {
int source; //父类序号
int target;//此单元格序号

	public link(int s, int t)
	{
		source = s;
		target = t;
	}

	public int getSource()
	{
		return source;
	}
	public void setSource(int s)
	{
		source = s;
	}
	
	public int getTarget()
	{
		return target;
	}
	public void setTarget(int t)
	{
		target = t;
	}
	
}
