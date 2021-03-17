/* Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte
*/
class typecasting{
	public static void main(String args[]){
		int i = 89;
		int j = 2;
		float ans = (float)i*j; ///narrowing casting
		System.out.println(ans);
		int ans1 = (int)ans; ///widening casting
		System.out.println("ans1 = " + ans);
		
	}

}