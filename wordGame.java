import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class wordGame{
	
	public static void main(String args[]){
		
		System.out.println("Welcome to Willie's Word Scramble! Categories will be displayed next to the scrambled word. Good luck!");
		game();
	}
	public static void game(){
	
		int lives = 3;
		int question = 1;
   
		while (lives > 0){
		
			String[] arr = new String[25];
		
			arr[0] = "dog";
			arr[1] = "cat";
			arr[2] = "rat";
			arr[3] = "elephant";
			arr[4] = "zebra";
			arr[5] = "apple";
			arr[6] = "banana";
			arr[7] = "kiwi";
			arr[8] = "watermelon";
			arr[9] = "pineapple";
			arr[10] = "porcupine";
			arr[11] = "salmon";
			arr[12] = "whale";
			arr[13] = "lion";
			arr[14] = "eel";
			arr[15] = "Boston";
			arr[16] = "Chicago";
			arr[17] = "Brooklyn";
			arr[18] = "Chicago";
			arr[19] = "Miami";
			arr[20] = "Russia";
			arr[21] = "Germany";
			arr[22] = "Kenya";
			arr[23] = "Canada";
			arr[24] = "Algeria";
			
			while (question == 1){
   
				Random r = new Random();
				System.out.println("Animals: What is the scrambled word: " + scramble.randomize( r, arr[((Math.random() * (4 - 0)) + 4)] ));
		
				Scanner inputOne = new Scanner(System.in);
				String answerOne = inputOne.next();
		
				if (arr[0].equals(answerOne)){
					System.out.println("Correct!");
					question++;
				}else{
					lives = lives-1;

					System.out.println("Wrong answer, try again (" + lives + " live(s)):");
			
					Scanner inputTwo = new Scanner(System.in);
					String answerTwo = inputTwo.next();
			
					if (arr[0].equals(answerTwo)){
						System.out.println("Correct!");
						question++;
						continue;
					}else{
						lives = lives-1;
						System.out.println("Wrong answer, try again (" + lives + " live(s)):");
				
						Scanner inputThree = new Scanner(System.in);
						String answerThree = inputThree.next();
				
						if (arr[0].equals(answerThree)){
							System.out.println("Correct!");
							question++;
							continue;
						}else{
							lives = lives-1;
							question = 11;
						}
					}
				}
			}
			while (question == 2){
   
				Random r = new Random();
				System.out.println("Animals: What is the scrambled word: " + scramble.randomize( r, arr[1] ));
		
				Scanner i = new Scanner(System.in);
				String a = i.next();
		
				if (arr[1].equals(a)){
					System.out.println("Correct!");
					question++;
					continue;
				}else{
					lives = lives-1;
					if (lives == 0){
						question = 11;
					}
					System.out.println("Wrong answer, try again (" + lives + " live(s)):");
			
					Scanner in = new Scanner(System.in);
					String an = in.next();
			
					if (arr[1].equals(an)){
						System.out.println("Correct!");
						question++;
						continue;
					}else{
						lives = lives-1;
						if (lives == 0){
							question = 11;
						}
						System.out.println("Wrong answer, try again (" + lives + " live(s)):");
				
						Scanner inp = new Scanner(System.in);
						String ans = inp.next();
				
						if (arr[1].equals(ans)){
							System.out.println("Correct!");
							question++;
							continue;
						}else{
							lives = lives-1;
							if (lives == 0){
								question = 11;
							}
						}
					}
				}
			}
			while (question == 3){
   
				Random r = new Random();
				System.out.println("Animals: What is the scrambled word: " + scramble.randomize( r, arr[2] ));
		
				Scanner inpu = new Scanner(System.in);
				String answ = inpu.next();
		
				if (arr[2].equals(answ)){
					System.out.println("Correct!");
					question++;
				}else{
					lives = lives-1;
					if (lives == 0){
						question = 11;
					}
					System.out.println("Wrong answer, try again (" + lives + " live(s)):");
			
					Scanner inputT = new Scanner(System.in);
					String answe = inputT.next();
			
					if (arr[2].equals(answe)){
					System.out.println("Correct!");
					question++;
					}else{
						lives = lives-1;
						if (lives == 0){
							question = 11;
						}
						System.out.println("Wrong answer, try again (" + lives + " live(s)):");
				
						Scanner coding = new Scanner(System.in);
						String right = coding.next();
				
						if (arr[2].equals(right)){
							System.out.println("Correct!");
							question++;
						}else{
							lives = lives-1;
							if (lives == 0){
								question = 11;
							}
						}
					}
				}
			}
			while (question == 4){
   
				Random r = new Random();
				System.out.println("Animals: What is the scrambled word: " + scramble.randomize( r, arr[4] ));
		
				Scanner abc = new Scanner(System.in);
				String def = abc.next();
		
				if (arr[4].equals(def)){
					System.out.println("Correct!");
					question++;
				}else{
					lives = lives-1;
					if (lives == 0){
						question = 11;
					}
					System.out.println("Wrong answer, try again (" + lives + " live(s)):");
			
					Scanner ghi = new Scanner(System.in);
					String jkl = ghi.next();
			
					if (arr[4].equals(jkl)){
					System.out.println("Correct!");
					question++;
					}else{
						lives = lives-1;
						if (lives == 0){
						question = 11;
					}
						System.out.println("Wrong answer, try again (" + lives + " live(s)):");
				
						Scanner mno = new Scanner(System.in);
						String pqr = mno.next();
				
						if (arr[4].equals(pqr)){
							System.out.println("Correct!");
							question++;
						}else{
							lives = lives-1;
							if (lives == 0){
								question = 11;
							}
						}
					}
				}
			}
			while (question == 5){
   
				Random r = new Random();
				System.out.println("Cities: What is the scrambled word: " + scramble.randomize( r, arr[15] ));
		
				Scanner stu = new Scanner(System.in);
				String vwx = stu.next();
		
				if (arr[15].equals(vwx)){
					System.out.println("Correct!");
					question++;
				}else{
					lives = lives-1;
					if (lives == 0){
						question = 11;
					}
					System.out.println("Wrong answer, try again (" + lives + " live(s)):");
			
					Scanner yz = new Scanner(System.in);
					String lad = yz.next();
			
					if (arr[15].equals(lad)){
						System.out.println("Correct!");
						question++;
					}else{
						lives = lives-1;
						if (lives == 0){
							question = 11;
						}
						System.out.println("Wrong answer, try again (" + lives + " live(s)):");
				
						Scanner tyu = new Scanner(System.in);
						String oiu = tyu.next();
				
						if (arr[15].equals(oiu)){
							System.out.println("Correct!");
							question++;
						}else{
							lives = lives-1;
							if (lives == 0){
								question = 11;
							}
						}
					}
				}
			}
			while (question == 6){
   
				Random r = new Random();
				System.out.println("Fruits: What is the scrambled word: " + scramble.randomize( r, arr[6] ));
		
				Scanner lsd = new Scanner(System.in);
				String mnbv = lsd.next();
		
				if (arr[6].equals(mnbv)){
					System.out.println("Correct!");
					question++;
				}else{
					lives = lives-1;
					if (lives == 0){
						question = 11;
					}
					System.out.println("Wrong answer, try again (" + lives + " live(s)):");
			
					Scanner sdfg = new Scanner(System.in);
					String jhkl = sdfg.next();
			
					if (arr[6].equals(jhkl)){
					System.out.println("Correct!");
					question++;
					}else{
						lives = lives-1;
						if (lives == 0){
							question = 11;
						}
						System.out.println("Wrong answer, try again (" + lives + " live(s)):");
				
						Scanner uyt = new Scanner(System.in);
						String poiu = uyt.next();
				
						if (arr[6].equals(poiu)){
							System.out.println("Correct!");
							question++;
						}else{
							lives = lives-1;
							if (lives == 0){
								question = 11;
							}
						}
					}
				}
			}
			while (question == 7){
   
				Random r = new Random();
				System.out.println("Cities: What is the scrambled word: " + scramble.randomize( r, arr[17] ));
		
				Scanner amnd = new Scanner(System.in);
				String iuhj = amnd.next();
		
				if (arr[17].equals(iuhj)){
					System.out.println("Correct!");
					question++;
				}else{
					lives = lives-1;
					if (lives == 0){
						question = 11;
					}
					System.out.println("Wrong answer, try again (" + lives + " live(s)):");
			
					Scanner ajks = new Scanner(System.in);
					String plkj = ajks.next();
			
					if (arr[17].equals(plkj)){
					System.out.println("Correct!");
					question++;
					}else{
						lives = lives-1;
						if (lives == 0){
							question = 11;
						}
						System.out.println("Wrong answer, try again (" + lives + " live(s)):");
				
						Scanner hgdb = new Scanner(System.in);
						String jnmb = hgdb.next();
				
						if (arr[17].equals(jnmb)){
							System.out.println("Correct!");
							question++;
						}else{
							lives = lives-1;
							if (lives == 0){
								question = 11;
							}
						}
					}
				}
			}
			while (question == 8){
   
				Random r = new Random();
				System.out.println("Cities: What is the scrambled word: " + scramble.randomize( r, arr[18] ));
		
				Scanner bvc = new Scanner(System.in);
				String skq = bvc.next();
		
				if (arr[18].equals(skq)){
					System.out.println("Correct!");
					question++;
				}else{
					lives = lives-1;
					if (lives == 0){
						question = 11;
					}
					System.out.println("Wrong answer, try again (" + lives + " live(s)):");
			
					Scanner sbai = new Scanner(System.in);
					String wnd = sbai.next();
			
					if (arr[18].equals(wnd)){
					System.out.println("Correct!");
					question++;
					}else{
						lives = lives-1;
						if (lives == 0){
						question = 11;
					}
						System.out.println("Wrong answer, try again (" + lives + " live(s)):");
				
						Scanner will = new Scanner(System.in);
						String wold = will.next();
				
						if (arr[18].equals(wold)){
							System.out.println("Correct!");
							question++;
						}else{
							lives = lives-1;
							if (lives == 0){
								question = 11;
							}
						}
					}
				}
			}
			while (question == 9){
   
				Random r = new Random();
				System.out.println("Fruits: What is the scrambled word: " + scramble.randomize( r, arr[9] ));
		
				Scanner dog = new Scanner(System.in);
				String alpha = dog.next();
		
				if (arr[9].equals(alpha)){
					System.out.println("Correct!");
					question++;
				}else{
					lives = lives-1;
					if (lives == 0){
						question = 11;
					}
					System.out.println("Wrong answer, try again (" + lives + " live(s)):");
			
					Scanner omega = new Scanner(System.in);
					String beta = omega.next();
			
					if (arr[9].equals(beta)){
					System.out.println("Correct!");
					question++;
					}else{
						lives = lives-1;
						if (lives == 0){
							question = 11;
						}
						System.out.println("Wrong answer, try again (" + lives + " live(s)):");
				
						Scanner charlie = new Scanner(System.in);
						String query = charlie.next();
						
				if (arr[9].equals(query)){
					System.out.println("Correct!");
					question++;
						}else{
							lives = lives-1;
							if (lives == 0){
								question = 11;
							}
						}
					}
				}
			}
			while (question == 10){
   
				Random r = new Random();
				System.out.println("Animals: What is the scrambled word: " + scramble.randomize( r, arr[10] ));
		
				Scanner idea = new Scanner(System.in);
				String cloud = idea.next();
		
				if (arr[10].equals(cloud)){
							System.out.println("You beat the game! Would you like to play again?");
							Scanner inputs = new Scanner(System.in);
							String answers = inputs.next();
				
							if (answers == "yes"){
								question = 1;
							}else{
								question = 13;
								continue;
							}
				}else{
					lives = lives-1;
					if (lives == 0){
						question = 11;
					}
					System.out.println("Wrong answer, try again (" + lives + " live(s)):");
			
					Scanner douglass = new Scanner(System.in);
					String mears = douglass.next();
			
					if (arr[10].equals(mears)){
							System.out.println("You beat the game! Would you like to play again?");
							Scanner inputs = new Scanner(System.in);
							String answers = inputs.next();
				
							if (answers == "yes"){
								question = 1;
							}else{
								question = 13;
								continue;
							}
					}else{
						lives = lives-1;
						if (lives == 0){
						question = 11;
						}
						System.out.println("Wrong answer, try again (" + lives + " live(s)):");
				
						Scanner java = new Scanner(System.in);
						String william = java.next();
				
						if (arr[10].equals(william)){
							System.out.println("You beat the game! Would you like to play again?");
							Scanner inputs = new Scanner(System.in);
							String answers = inputs.next();
				
							if (answers == "yes"){
								question = 1;
							}else{
								question = 13;
								continue;
							}
						}else{
							lives = lives-1;
							if (lives == 0){
								question = 11;
							}
						}
					}
				}
			}
		}
		if (question == 11){
			System.out.println("You lose! Would you like to play again?");
			
				Scanner input = new Scanner(System.in);
				String answer = input.next();
				
				if (answer == "yes"){
					question = 1;
				}
		}
	}
}
