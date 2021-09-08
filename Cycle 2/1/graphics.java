package graphics;
interface graphics
{
	public float area(float x,float y);
}
class Square implements graphics
{
	public float area(float x,float y)
	{
		return(x*x);
	}
}
class Rectangle implements graphics
{
	public float area(float x,float y)
	{
		return(x*y);
	}
}
class Triangle implements graphics
{
	public float area(float x,float y)
	{
		return((x*y)/2);
	}
}
class Circle implements graphics
{
	public float area(float x,float y)
	{
		return(3.14f*x*x);
	}
}