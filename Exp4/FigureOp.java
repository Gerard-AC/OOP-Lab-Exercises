import java.util.*;
class Figure {
	private double dim1;
	private double dim2;
	Figure()
	{
		dim1=0;
		dim2=0;
	}
	Figure(double a, double b) {
		dim1 = a;
		dim2 = b;
	}
	double area(){
		System.out.println("Area for Figure is undefined.");
		return 0;
	}
	final double getDim1(){
		return this.dim1;
	}
	final double getDim2(){
		return this.dim2;
	}
}
class triangle extends Figure
{
	private double dim3;
	triangle()
	{
		super();
		this.dim3=0;
	}
	triangle(double a,double b,double c)
	{
		super(a,b);
		this.dim3=c;
	}
	double area()
	{
		double s=(super.getDim1()+super.getDim2()+this.dim3)/2;
		double a=Math.sqrt(s*(s-getDim1())*(s-getDim2())*(s-this.dim3));
		return a;
	}


}
class rectangle extends Figure
{
	private double dim3;
	private double dim4;
	rectangle()
	{
		super();
		dim3=0;
		dim4=0;
	}
	rectangle(double a,double b,double c,double d)
	{
		super(a,b);
		this.dim3=c;
		this.dim4=d;
	}
	double area()
	{
		return getDim1()*dim4;
	}
}
public class FigureOp {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter dimensions of the rectangle");
		rectangle a=new rectangle(input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble());
		System.out.println("Enter dimensions of the triangle");
		triangle b=new triangle(input.nextDouble(),input.nextDouble(),input.nextDouble());
		System.out.println("Area of rectangle = "+a.area()+" Area of triangle= "+b.area());
		input.close();
	}

}
