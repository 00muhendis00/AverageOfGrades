import java.util.Scanner;
public class MyProject {
		public static void main(String[] args) {
			int Math,Fizik,Chemistry,Turkish,History,Music;

	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter your math grade ");
	        Math = input.nextInt();

	        System.out.print("enter your math grade ");
	        Fizik = input.nextInt();

	        System.out.print("Enter your chemistry grade ");
	        Chemistry = input.nextInt();

	        System.out.print("Enter your history grade ");
	        History = input.nextInt();

	        System.out.print("Enter your turkish grade ");
	        Turkish = input.nextInt();
	        
	        System.out.print("Enter your music grade ");
	        Music = input.nextInt();

	        double avg = (Math + Fizik + Chemistry + History + Turkish + Music) / 6;
	        System.out.print("Average = " + avg);
			
	        boolean result = avg > 60;
	       String output  = result ? " Passed the class!" : "Failed the class";
	       System.out.println(output);
	         
		}
	}