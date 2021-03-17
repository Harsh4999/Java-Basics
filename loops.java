class loops{
	public static void main(String[] args){
		int i,q=7,j;
/*		for(i = 'A'/'A';i<='d';i++){
			System.out.println("\n"+i);
		}
*/		
		switch(q){
			case 1:{
					for(i=1;i<5;i++){
						for(j=1;j<=i;j++){
							System.out.println(j);
						}
						System.out.println("\n");
					}
					break;
			}
			case 2:{
					for(i=0;i<5;i++){
						for(int sp=5-i;sp>0;sp--){
							System.out.print(" ");
						}
						for(j=0;j<=i;j++){
							System.out.print("* ");
						}
						System.out.println("\n");
					}
					break;	
				
			}
			case 3:{
					int a=0,b=1,c=0;
					System.out.println("\n" + 0);
					System.out.println("\t" + 1);
					while(c<=30){
						c=a+b;
						System.out.println("\t" + c);
						a=b;
						b=c;
					}
					break;
			}
			case 4:{
					int h=47,k=2,p=0;
					do{
						if(h%k==0){
							p=1;
							break;
						}
						k++;
					}while(k<h);
					if(p==1){
							System.out.println("\nPrime numeber");
					}else{
							System.out.println("\nNot Prime");
					}
					break;
			}
			case 5:{
					int n=4,pro=1;
					for(i=n;i>0;i--){
						pro=pro*i;
					}
					System.out.println(pro);
					break;
			}
			case 6:{
					int l=333,v,z,rev=0;
					z=l;
					while(l>0){
						v = l%10;
						rev = (rev*10) + v;
						l = l/10;
					}
					if(rev == z){
						System.out.println("Palidrome");
					}else{
						System.out.println("Not Palidrome");
					}
					break;
			}
			case 7:{
					System.out.println(4 & 2);
					System.out.println(4 | 2);
					System.out.println(4 ^ 2);
					System.out.println(5 >> 1);
					System.out.println(5 << 1);
					break;
			}
			default:{
					System.out.println("\nInvalid");
			}
		}
	}
}