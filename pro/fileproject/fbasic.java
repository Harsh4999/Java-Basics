package fileproject;
import java.io.*;
import java.util.Scanner;
interface s{
	public String schoolname = "S.N.K";
}
abstract class school implements s{
	String getSchoolName(){
		return schoolname;
	}
	public static int getTotalStudent(){
		return student.tot;
	}
	public static int getTotalTeachers(){
		return teacher.tot;
	}

}
class student extends school{
	String name,std,id;
	int m[] = new int[3];
	int totm;
	public static int tot=0;
	student(String s, String s1, String i){
		name  = s;
		s1 = std;
		i = id;
	}
}
class teacher extends school{
	public static int tot=0;
}
class std extends school{ 
	String std;
	String p,l;
	std(String s){
		std = s;
		p = std + "t.txt";
		l = std + "s.txt";

		try{
			File a = new File(p);
			File b = new File(l);
			if(a.exists() && b.exists()){
				System.out.println("File present: ");
			}else{
			
				if(a.createNewFile() && b.createNewFile()){
					System.out.println("\nNew File for teacher and students of this std created");
				}else{
					System.out.println("\nError in File creation");
				}		
			}
			
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}
	void setDetailsStud(){
		System.out.println("\nEnter student data and if done press 1");
		Scanner obs = new Scanner(System.in);
		Scanner obi = new Scanner(System.in);
		try{
			FileWriter obj = new FileWriter(l,true);
			while(true){
				System.out.println("\nEnter name of stud: ");
				String name = obs.nextLine();
				System.out.println("\nEnter id of stud: ");
				String id = obs.nextLine();
				System.out.println("\nEnter marks of stud 3 subject: ");
				int m[] = new int[3];
				m[0] = obi.nextInt();
				m[1] = obi.nextInt();
				m[2] = obi.nextInt();
				int tot = m[0] + m[1] + m[2];
				String f = name + " " + id + " " + tot + "\n";
				obj.write(f);
				student.tot++;
				System.out.println("\nContinue?");
				int c = obi.nextInt();
				if(c==1){
						obj.close();
						break;
				}
			}
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
	}
	void setDetailsTeach(){
		System.out.println("\nEnter teacher data and if done press 1");
		Scanner obs = new Scanner(System.in);
		Scanner obi = new Scanner(System.in);
		try{
			FileWriter obj = new FileWriter(p,true);
			while(true){
				System.out.println("\nEnter teacher name: ");
				String name = obs.nextLine();
				System.out.println("\nEnter teacher id: ");
				String id = obs.nextLine();
				System.out.println("\nEnter thier salary: ");
				int sal  = obi.nextInt();
				String f = name + " " + id + " " + sal + "\n";
				obj.write(f);
				teacher.tot++;
				System.out.println("\nContinue?");
				int c = obi.nextInt();
				if(c==1){
						obj.close();
						break;
				}
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	void setDetails(){
		setDetailsStud();
		setDetailsTeach();
	}

	void getDetails(){
		System.out.println("\nDetails of the std= " + std + "\n");
		System.out.println("\nDetails of teachers \n");
		try{
			FileReader obj = new FileReader(p);
			BufferedReader d = new BufferedReader(obj);
			StringBuffer s = new StringBuffer();
			String q;
			while((q = d.readLine())!=null){
				s.append(q);
				s.append("\n");
			}
			System.out.println(s);
			obj.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}

		System.out.println("\nDetails of students \n");
		try{
			FileReader obj = new FileReader(l);
			BufferedReader d = new BufferedReader(obj);
			StringBuffer s = new StringBuffer();
			String q;
			while((q= d.readLine())!= null){
				s.append(q);
				s.append("\n");
			}
			System.out.println(s);
			obj.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	void updateTeach(String id){
		Scanner obs  = new Scanner(System.in);
		try{
			File f = new File(p);
			FileReader obj = new FileReader(f);
			BufferedReader d = new BufferedReader(obj);
			String q;
			
			File o  = new File("test.txt");
			FileWriter obj1 = new FileWriter(o);
			
			System.out.println("\nEnter new name of teacher: ");
			String n = obs.nextLine();
			System.out.println("\nEnter new salary of teacher: ");
			String n1 = obs.nextLine();
			String news = n + " " + id + " " + n1;
			while((q = d.readLine())!=null){
				String a[] = q.split(" ");
				for(int i=0;i<a.length;i++){
					if(id.equals(a[i])){
						q = news;
						break;
					}
				}
				q = q+"\n";
				obj1.write(q);
			}
			if(o.renameTo(f)){

			}
			obj1.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}			
	}
	void updateStud(String id){
		Scanner obs = new Scanner(System.in);
		Scanner obi = new Scanner(System.in);
		try{
			int m[] = new int[3];
			File f = new File(l);
			FileReader obj = new FileReader(f);
			BufferedReader d = new BufferedReader(obj);
			String q;

			File o = new File("test.txt");
			FileWriter obj1 = new FileWriter(o);

			System.out.println("\nEnter new name of student: ");
			String n = obs.nextLine();
			System.out.println("\nEnter new marks of student: ");
			m[0] = obi.nextInt();
			m[1] = obi.nextInt();
			m[2] = obi.nextInt();
			int tot = m[0]+m[1]+m[2];
			String news = n + " " + id + " " + tot;

			while((q=d.readLine())!=null){
				String a[] = q.split(" ");
				for(int i=0;i<a.length;i++){
					if(id.equals(a[i])){
						q = news;
						break;
					}
				}
				q=q+"\n";
				obj1.write(q);
			}
			if(o.renameTo(f)){

			}
			obj1.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	void deleteStud(String id){
		try{
			int p=0;
			File f = new File(l);
			FileReader j = new FileReader(f);
			BufferedReader obj = new BufferedReader(j);
			String s;

			File o = new File("test.txt");
			FileWriter obj1 = new FileWriter(o);

			while((s = obj.readLine())!=null){
				String a[] = s.split(" ");
				for(int i=0;i<a.length;i++){
					if(id.equals(a[i])){
						p=1;
						break;
					}
				}
				if(p==1){
					p=0;
					continue;
				}
				s = s+"\n";
				obj1.write(s);
			}
			if(o.renameTo(f)){

			}
			System.out.println("\nStudent deleted");
			obj1.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

	void deleteTeach(String id){
		try{
			String p1 = p;
			int p=0;
			File f = new File(p1);
			FileReader j = new FileReader(f);
			BufferedReader obj = new BufferedReader(j);
			String s;

			File o = new File("test.txt");
			FileWriter obj1 = new FileWriter(o);

			while((s = obj.readLine())!=null){
				String a[] = s.split(" ");
				for(int i=0;i<a.length;i++){
					if(id.equals(a[i])){
						p=1;
						break;
					}
				}
				if(p==1){
					p=0;
					continue;
				}
				s = s+"\n";
				obj1.write(s);
			}
			if(o.renameTo(f)){

			}
			System.out.println("\nTeacher deleted");
			obj1.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
