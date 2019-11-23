import java.io.*;
class GuessLetter {
	public static void main(String s[]) throws IOException{

		char ch ,ans ='k';
		System.out.println("I am thinking a Character");
               
		System.out.println("Can you Guess it...please enter");
                
		ch=(char) System.in.read();
		if (ch == ans){
			System.out.println("You are Right");
                }
		else{
			System.out.println("Sorry You Are..");
    			if(ch<ans)
				 System.out.println("too low..");
			
			else
				System.out.println("too high..");

		}

	}
}