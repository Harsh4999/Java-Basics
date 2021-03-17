class mathOperations{
	public static void main(String args[]){
		double a,b,c,x,y,z;
		a=10;
		b=20;
		c=30;
		x=10;
		y=20;
		z=30;
		double ans;
		ans = ((2*a*b) + (2*b*c) + (2*c*a))/((x*x*y*y) + (y*y*z*z) + (z*z*x*x));
		System.out.println("ans1 = " + ans);
		System.out.println("\n");

		ans = (Math.pow((1-(y*y*y)),(1/2)))/(Math.pow((1-(x*x*x*x)),(1/4)));
		System.out.println("ans2 = " + ans);
		System.out.println("\n");

		ans = (Math.pow((a+b+c),(x+y)));
		System.out.println("ans3 = " + ans);
		System.out.println("\n");

		ans = (Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3)) - (3*a*b*c);
		System.out.println("ans4 = " + ans);
		System.out.println("\n");
	
		byte bi;
		int i = 129;
		bi = (byte)i;
		System.out.println(bi);
	}
}

		