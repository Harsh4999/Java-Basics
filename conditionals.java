class conditionals{
	public static void main(String[] args){
		int a=10,b=20,c=30;
		int ans = (a>b)?(a>c)?a:c:(b>c)?b:c;
		System.out.println("Greatest number = " + ans);
		
		int grade=92;
		if(grade>40){
			if(grade>50){
				if(grade>70){
					if(grade>90){
						System.out.println("Grade A");
					}else{
						System.out.println("Grade B");
					}
				}else{
					System.out.println("Grade C");
				}
			}else{
				System.out.println("Grade D");
			}
		}					
	}
}