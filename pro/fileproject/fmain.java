package fileproject;
import java.io.*;
import java.util.Scanner;
class fmain{
	public static void main(String args[]){
		std ppr = new std("ppr");
		std pr = new std("pr");
		std sec = new std("sec");
		std hsec = new std("hsec");
		
		Scanner obs = new Scanner(System.in);
		Scanner obi = new Scanner(System.in);
		int choice;
		String s,id;

		System.out.println("\nEnter choice 1: set details 2: get details 3: update details 4: delete details 5: exit");
		choice = obi.nextInt();

		switch(choice){
			case 1:{
				System.out.println("\nEnter std name to set details : ");
				s = obs.nextLine();

				if(s.equals("ppr")) ppr.setDetails();
				else if(s.equals("pr")) pr.setDetails();
				else if(s.equals("sec")) sec.setDetails();
				else hsec.setDetails();

				System.out.println("\nDetails stored succesfully ");
				break;
			}

			case 2:{
				System.out.println("\nEnter std name to get details : ");
				s = obs.nextLine();

				if(s.equals("ppr")) ppr.getDetails();
				else if(s.equals("pr")) pr.getDetails();
				else if(s.equals("sec")) sec.getDetails();
				else hsec.getDetails();
			
				System.out.println("\nThank you");
				break;
			}

			case 3:{
				System.out.println("\nPress 1) update teacher  2) update student 3) exit");
				choice = obi.nextInt();
				System.out.println("\nEnter std : ");
				s = obs.nextLine();
				System.out.println("\nEnter teacher/stud id : ");
				id = obs.nextLine();
				switch(choice){
					case 1:{
						
						if(s.equals("ppr")) ppr.updateTeach(id);
						else if(s.equals("pr")) pr.updateTeach(id);
						else if(s.equals("sec")) sec.updateTeach(id);
						else hsec.updateTeach(id);
						break;
					
					}

					case 2:{

						if(s.equals("ppr")) ppr.updateStud(id);
						else if(s.equals("pr")) pr.updateStud(id);
						else if(s.equals("sec")) sec.updateStud(id);
						else hsec.updateStud(id);
						break;
					}

					case 3:{
						System.out.println("\nBye");
					}
				}
				break;
			}

			case 4:{
				System.out.println("\nPress 1) delete teacher  2) delete student 3) exit");
				choice = obi.nextInt();
				System.out.println("\nEnter std : ");
				s = obs.nextLine();
				System.out.println("\nEnter teacher/stud id : ");
				id = obs.nextLine();

				switch(choice){
					case 1:{
						
						if(s.equals("ppr")) ppr.deleteTeach(id);
						else if(s.equals("pr")) pr.deleteTeach(id);
						else if(s.equals("sec")) sec.deleteTeach(id);
						else hsec.deleteTeach(id);
						break;
					
					}

					case 2:{

						if(s.equals("ppr")) ppr.deleteStud(id);
						else if(s.equals("pr")) pr.deleteStud(id);
						else if(s.equals("sec")) sec.deleteStud(id);
						else hsec.deleteStud(id);
						break;
					}

					case 3:{
						System.out.println("\nBye");
					}
				}
				break;
			}

			case 5:{
				System.out.println("Bye");
			}
		}
	}
}