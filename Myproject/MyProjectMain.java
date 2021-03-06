import java.util.*;
import java.io.File;
public class MyProjectMain {
	public static void addFile() {
		Scanner sc = new Scanner(System.in);
		try{
				
			System.out.println("");
			System.out.print("\nPlease enter the name of the file- ");
			String name = sc.next();
		     
	        File myObj = new File("./files/" + name.toLowerCase() + ".txt");
	        if (myObj.createNewFile()) {
	          System.out.println("File created: " + myObj.getName());
	        } else {
	          System.out.println("\n\nFile already exists.\n\n");
	        }
	      } catch (Exception e) {
	        System.out.println("An error occurred.\n\n");
	        sc.next();
	        addFile();
	      }
	}
	public static void deleteFile() {
		Scanner sc = new Scanner(System.in);
		try {
		
		System.out.println("");
		System.out.print("\nPlease enter the name of the file to delete- ");
		String name = sc.next();
		
			 File myObj = new File("./files/" + name + ".txt");
			 if(myObj.delete()) {
				 System.out.println("\n\nFile has been deleted\n\n");
			 }
			 else {
				 System.out.println("\n\nFile does not exist\n\n");
			 }
		}catch(Exception e) {
			System.out.println("\n\nAn error occured.\nPlease enter a valid file name\n\n");
			sc.next();
		}
		
	}
	public static ArrayList<String> fileLists() {
		File folder = new File("./files");
		File[] listOfFiles = folder.listFiles();
		int n = listOfFiles.length;
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
		  
		    list.add(listOfFiles[i].getName());
		  
		}
		Collections.sort(list);
		return list;
	}
	
	public static void searchFile() {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("\nPlease enter the name of File to search - ");
		String name = sc.next();
		name = name + ".txt";
		int flag=0;
		ArrayList<String> list = fileLists();
		for(String filename : list) 
			if(filename.equals(name)) {
				flag=1;
				System.out.println("\n\nFile "+name+" is present in the directory.\n\n\n");
			}
		if(flag==0) {
			System.out.println("\n\nFile "+name+" is not present in the directory.");
		}
		}
		catch(Exception e){
			sc.next();
			System.out.println("\n\nAn error Occured.\nPlease enter a valid File name.\n\n\n");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			while(true) {
		
			try{
				System.out.println("--------  LockedMe.com  --------");
				System.out.println("");
				System.out.println("            developed by- Ishaan Gautam");
				System.out.println("       Email - ishaangautam1998@gmail.com");
				System.out.println();
				System.out.println();
				System.out.println("-----------MAIN MENU-----------"); 
				System.out.println("");
				System.out.println("PLEASE SELECT AN OPTION FROM THE MENU");
				System.out.println("");
				System.out.println("Press - 1  to show the Files");
				System.out.println("");
				System.out.println("Press - 2  for more options");
				System.out.println("");
				System.out.println("Press - 3  to exit the application ");
				System.out.println("");
				System.out.print("Input - ");
				
				
				int a = sc.nextInt();
				if (a==1) {
					while(true) {
					ArrayList<String> list = fileLists();
					System.out.println("\n\nFiles - \n\n");
					for(String filename : list) 
						System.out.println(filename);
					
					try {
						System.out.println("");
						System.out.println("Press 1 to go back." );
						System.out.print("\nInput - ");
						int b =  sc.nextInt();
						if (b==1) {
							break;
						}
						else {
							System.out.println("Please press 1 if you need to go to main menu.");
						}
						
					}catch(Exception e) {
						System.out.println("\n\nPlease give a valid input.\n\n");
						sc.next();
					}
					}
				}
				
				else if(a==2) {
					while(true) {
						System.out.println("\n\nPLEASE SELECT AN OPTION FROM THE MENU");
						System.out.println("");
						System.out.println("Press - 1  to add a File");
						System.out.println("");
						System.out.println("Press - 2  to delete a File");
						System.out.println("");
						System.out.println("Press - 3  to search a File ");
						System.out.println("");
						System.out.println("Press - 4  to go back to Main Menu ");
						System.out.println("");
						System.out.println("Input - ");
						try{
							int c= sc.nextInt();
						
							if(c==1) {
								addFile();
							}
							else if(c==2) {
								deleteFile();
							}
							else if(c==3) {
								searchFile();
							}
							else if(c==4) {
								break;
							}
							else {
								System.out.println("\n\nPlease enter a valid number from the menu\n\n");
							}
						}catch(Exception e) {
							System.out.println("\n\nAn error occured. Please give a valid input\n\n");
							sc.next();
						}
					}
					
				}
				else if(a==3) {
					System.out.println("\n\nThank you for using the application\n\n");
					break;
				}
				else {
					System.out.println("\n\nPlease select one of the options from the Menu\n\n");
					
				}
			
			
			}
			catch(Exception e) {
				System.out.println("\n\nPlease enter a valid integer number as input.\n\n");
				sc.next();
			}	
		}

	}

}
