import java.util.*;
import java.lang.*;

class Play_With_Computer {
	final static int WONPOINT = 100;
	static Random rand = new Random();
	static Scanner sc = new Scanner(System.in);
	static char rollDice;
	static int playerPosition;
	static int computerPosition;
	static int playerDice;
	static int computerDice;
	static String Name;
	static int Snake_Mouth_Position[] = new int[8];
	static int Snake_Tail_Position[] = new int[8];
	static int Ladder_Up_Position[] = new int[8];
	static int Ladder_Down_Position[] = new int[8];
	int flag = 0;
	char Level;
	int ctr = 0;

//setGame()
	void setGame() {
		System.out.print("-------------------------->SET GAME<------------------------------- \n");
		System.out.print("         Levels :   1 - EASY     2 - MEDIUM     3 - HARD \n \n");
		System.out.print("Choose a Level (1 | 2 | 3 ) : ");
		Level = sc.next().charAt(0);

		while (Level != '1' && Level != '2' && Level != '3') {
			System.out.print("Choose a valid Level (1 | 2 | 3 ) : ");
			Level = sc.next().charAt(0);
		}
		System.out.print(" \nEnter Your Name : ");
		Name = sc.next();
	}

	void SnakesAndLaddersPosition() {

		if (Level == '1') {
			//Snake Mouth Position Setting
			Snake_Mouth_Position[0] = rand.nextInt(99 - 95) + 95;
			Snake_Mouth_Position[1] = rand.nextInt(65 - 60) + 60;
			Snake_Mouth_Position[2] = rand.nextInt(35 - 30) + 30;

			//Snake Tail Position Setting
			Snake_Tail_Position[0] = rand.nextInt(26 - 24) + 24;
			Snake_Tail_Position[1] = rand.nextInt(56 - 51) + 51;
			Snake_Tail_Position[2] = rand.nextInt(19 - 15) + 15;
		}

		else if (Level == '2') {
			//Snake Mouth Position Setting
			Snake_Mouth_Position[0] = rand.nextInt(99 - 98) + 98;
			Snake_Mouth_Position[1] = rand.nextInt(87 - 81) + 81;
			Snake_Mouth_Position[2] = rand.nextInt(59 - 55) + 55;
			Snake_Mouth_Position[3] = rand.nextInt(38 - 32) + 32;
			Snake_Mouth_Position[4] = rand.nextInt(19 - 15) + 15;

			//Snake Tail Position Setting
			Snake_Tail_Position[0] = rand.nextInt(56 - 51) + 51;
			Snake_Tail_Position[1] = rand.nextInt(78 - 72) + 72;
			Snake_Tail_Position[2] = rand.nextInt(42 - 41) + 41;
			Snake_Tail_Position[3] = rand.nextInt(29 - 26) + 26;
			Snake_Tail_Position[4] = rand.nextInt(9 - 6) + 6;

		} else {
			//Snake Mouth Position Setting
			Snake_Mouth_Position[0] = rand.nextInt(99 - 98) + 98;
			Snake_Mouth_Position[1] = rand.nextInt(96 - 92) + 92;
			Snake_Mouth_Position[2] = rand.nextInt(74 - 71) + 71;
			Snake_Mouth_Position[3] = rand.nextInt(65 - 62) + 62;
			Snake_Mouth_Position[4] = rand.nextInt(42 - 41) + 41;
			Snake_Mouth_Position[5] = rand.nextInt(69 - 65) + 65;
			Snake_Mouth_Position[6] = rand.nextInt(26 - 24) + 24;
			Snake_Mouth_Position[7] = rand.nextInt(19 - 15) + 15;

			//Snake Tail Position Setting
			Snake_Tail_Position[0] = rand.nextInt(56 - 51) + 51;
			Snake_Tail_Position[1] = rand.nextInt(45 - 41) + 41;
			Snake_Tail_Position[2] = rand.nextInt(36 - 32) + 32;
			Snake_Tail_Position[3] = rand.nextInt(26 - 22) + 22;
			Snake_Tail_Position[4] = rand.nextInt(29 - 26) + 26;
			Snake_Tail_Position[5] = rand.nextInt(19 - 15) + 15;
			Snake_Tail_Position[6] = rand.nextInt(19 - 15) + 15;
			Snake_Tail_Position[7] = rand.nextInt(9 - 6) + 6;
		}


		if (Level == '1') {
			//Ladder Down Position Setting
			Ladder_Down_Position[0] = rand.nextInt(9 - 6) + 6;
			Ladder_Down_Position[1] = rand.nextInt(69 - 65) + 65;;
			Ladder_Down_Position[2] = rand.nextInt(87 - 81) + 81;

//Laddet Up Position Setting
			Ladder_Up_Position[0] = rand.nextInt(87 - 81) + 81;
			Ladder_Up_Position[1] = rand.nextInt(96 - 92) + 92;
			Ladder_Up_Position[2] = rand.nextInt(99 - 96) + 96;
		}

		else if (Level == '2') {
			//Ladder Down Position Setting
			Ladder_Down_Position[0] = rand.nextInt(19 - 15) + 15;
			Ladder_Down_Position[1] = rand.nextInt(38 - 37) + 37;
			Ladder_Down_Position[2] = rand.nextInt(59 - 51) + 51;
			Ladder_Down_Position[3] = rand.nextInt(69 - 65) + 65;
			Ladder_Down_Position[4] = rand.nextInt(86 - 81) + 81;

			//Ladder Up Position Setting
			Ladder_Up_Position[0] = rand.nextInt(86 - 81) + 81;
			Ladder_Up_Position[1] = rand.nextInt(42 - 41) + 41;
			Ladder_Up_Position[2] = rand.nextInt(86 - 81) + 81;
			Ladder_Up_Position[3] = rand.nextInt(96 - 92) + 92;
			Ladder_Up_Position[4] = rand.nextInt(99 - 96) + 96;
		}

		else {
			//Ladder Down Position Setting
			Ladder_Down_Position[0] = rand.nextInt(9 - 6) + 6;
			Ladder_Down_Position[1] = rand.nextInt(26 - 24) + 24;
			Ladder_Down_Position[2] = rand.nextInt(38 - 36) + 36;
			Ladder_Down_Position[3] = rand.nextInt(45 - 41) + 41;
			Ladder_Down_Position[4] = rand.nextInt(59 - 54) + 54;
			Ladder_Down_Position[5] = rand.nextInt(69 - 68) + 68;
			Ladder_Down_Position[6] = rand.nextInt(78 - 72) + 72;
			Ladder_Down_Position[7] = rand.nextInt(86 - 81) + 81;

			//Ladder Up Position Setting
			Ladder_Up_Position[0] = rand.nextInt(87 - 81) + 81;
			Ladder_Up_Position[1] = rand.nextInt(96 - 92) + 92;
			Ladder_Up_Position[2] = rand.nextInt(78 - 74) + 74;
			Ladder_Up_Position[3] = rand.nextInt(69 - 65) + 65;
			Ladder_Up_Position[4] = rand.nextInt(87 - 81) + 81;
			Ladder_Up_Position[5] = rand.nextInt(78 - 74) + 74;
			Ladder_Up_Position[6] = rand.nextInt(96 - 95) + 95;
			Ladder_Up_Position[7] = rand.nextInt(99 - 92) + 92;
		}
	}

	void SnakesAndLaddersPositionPrint() {
		System.out.print(" \n----------->SNAKES POSITION 🐍🐍 | LADDERS POSITION 🪜🪜<----------- \n");
		if (Level == '1') {
			for (int i = 0; i < 3; i++) {
				if (i == 0) {
					System.out.println("               " + Snake_Mouth_Position[i] + "    to   " + Snake_Tail_Position[i] + "     |    0" + Ladder_Down_Position[i] + "    to    " + Ladder_Up_Position[i]);
				} else {
					System.out.println("               " + Snake_Mouth_Position[i] + "    to   " + Snake_Tail_Position[i] + "     |    " + Ladder_Down_Position[i] + "    to    " + Ladder_Up_Position[i]);
				}
			}
		} else if (Level == '2') {
			for (int i = 0; i < 5; i++) {
				if (i == 0) {
					System.out.println("               " + Snake_Mouth_Position[i] + "    to   " + Snake_Tail_Position[i] + "     |    " + Ladder_Down_Position[i] + "    to    " + Ladder_Up_Position[i]);
				} else if (i == 4) {
					System.out.println("               " + Snake_Mouth_Position[i] + "    to   0" + Snake_Tail_Position[i] + "     |    " + Ladder_Down_Position[i] + "    to    " + Ladder_Up_Position[i]);
				} else {
					System.out.println("               " + Snake_Mouth_Position[i] + "    to   " + Snake_Tail_Position[i] + "     |    " + Ladder_Down_Position[i] + "    to    " + Ladder_Up_Position[i]);
				}
			}
		} else {
			for (int i = 0; i < 8; i++) {
				if (i == 0) {
					System.out.println("               " + Snake_Mouth_Position[i] + "    to   " + Snake_Tail_Position[i] + "     |    0" + Ladder_Down_Position[i] + "    to    " + Ladder_Up_Position[i]);
				} else if (i == 7) {
					System.out.println("               " + Snake_Mouth_Position[i] + "    to   0" + Snake_Tail_Position[i] + "     |    " + Ladder_Down_Position[i] + "    to    " + Ladder_Up_Position[i]);
				} else {
					System.out.println("               " + Snake_Mouth_Position[i] + "    to   " + Snake_Tail_Position[i] + "     |    " + Ladder_Down_Position[i] + "    to    " + Ladder_Up_Position[i]);
				}
			}
		}

		System.out.print("------------------------------------------------------------------- \n");
	}

	void RollDice() {
		System.out.print(" \n----------------------->Roll The Dice<-----------------------------\n");

		System.out.print(" \n            "+ Name + "'s Turn (Enter character " + "R" + " or " + "r" + " ) : ");

		rollDice = sc.next().charAt(0);
		while (rollDice !=  'R' && rollDice != 'r') {
			System.out.print("               Enter Valid Character R or r : ");
			rollDice = sc.next().charAt(0);
		}
		playerDice = rand.nextInt(6 - 1) + 1;
		playerPosition += playerDice;
		System.out.println("                     Your Dice Score : " + playerDice);
		
		for (int I = 0; I< 8; I++) {
					if (Level == '1' && I < 3) {
						if (playerPosition == Snake_Mouth_Position[I]) {
							System.out.println(" \n        --------->Oops, " + Name + "(👨🏻‍💻) Swallowed By Snake🐍<---------");
							}
							else if (playerPosition == Ladder_Down_Position[I]){
							System.out.println(" \n            ----->Hurry, " + Name + "(👨🏻‍💻) Climb Up The Ladder🪜<-----");
							}
					}
				  else if (Level == '2' && I < 5) {
						if (playerPosition == Snake_Mouth_Position[I]) {
							System.out.println(" \n        --------->Oops, " + Name + "(👨🏻‍💻) Swallowed By Snake🐍<---------");
							}
							else if (playerPosition == Ladder_Down_Position[I]){
							System.out.println(" \n            ----->Hurry, " + Name + "(👨🏻‍💻) Climb Up The Ladder🪜<-----");
							}
					} else {
							if (playerPosition == Snake_Mouth_Position[I]) {
							System.out.println(" \n        --------->Oops, " + Name + "(👨🏻‍💻) Swallowed By Snake🐍<---------");
							}
							else if (playerPosition == Ladder_Down_Position[I]){
							System.out.println(" \n            ----->Hurry, " + Name + "(👨🏻‍💻) Climb Up The Ladder🪜<-----");
							}
				}
				}
		System.out.print("\n                   Computer's Turn (Wait) : ");
		computerDice = rand.nextInt(6 - 1) + 1;
		computerPosition += computerDice;
	
	try//Thread
	{
		for ( int k =0; k < 5; k++)
		{
			Thread.sleep(501);//501 milisecond Screen Stopping
		}
	}
			catch(Exception expn){ }
			
			if(rand.nextInt(9 - 6) + 6 % 2 == 0)
			{
		System.out.println("R \n                   Computer's Dice Score : " + computerDice);
			}
			else
			{
				System.out.println("r \n                   Computer's Dice Score : " + computerDice);
			}
		
		for (int I = 0; I< 8; I++) {
					if (Level == '1' && I < 3) {
							if( computerPosition == Snake_Mouth_Position[I]) {
							System.out.println(" \n       -------->Computer(💻) Swallowed By Snake🐍<---------");
							}
							else if (computerPosition == Ladder_Down_Position[I]){
							System.out.println(" \n       -------->Computer(💻) Climb Up The Ladder🪜<-------");
							}
					}
				  else if (Level == '2' && I < 5) {
						
							if( computerPosition == Snake_Mouth_Position[I]) {
							System.out.println(" \n       -------->Computer(💻) Swallowed By Snake🐍<---------");
							}
							else if (computerPosition == Ladder_Down_Position[I]){
							System.out.println(" \n       -------->Computer(💻) Climb Up The Ladder🪜<-------");
							}
					} else {
							if( computerPosition == Snake_Mouth_Position[I]) {
							System.out.println(" \n       -------->Computer(💻) Swallowed By Snake🐍<---------");
							}
							else if (computerPosition == Ladder_Down_Position[I]){
							System.out.println(" \n       -------->Computer(💻) Climb Up The Ladder🪜<-------");
							}
				}
				}
				
		if (flag != 1) {
			PlayerAndComputerPosition();
			IsWon();
		} else {
		}
	}
	
	void PlayerAndComputerPosition() {
		if (playerPosition > WONPOINT) {
			playerPosition -= playerDice;
		}

		if (computerPosition > WONPOINT) {
			computerPosition -= computerDice;
		}

		//playerPosition With Snake_Tail_Position
		for (int i = 0; i < 8; i++) {
			if (Level == '1' && i < 3) {
				if (playerPosition == Snake_Mouth_Position[i]) {
					playerPosition = Snake_Tail_Position[i];
				}
					else if (computerPosition == Snake_Mouth_Position[i]) {
						computerPosition = Snake_Tail_Position[i];
					}
				}
			else if (Level == '2' && i < 5) {
				if (playerPosition == Snake_Mouth_Position[i]) {
					playerPosition = Snake_Tail_Position[i];
				}
					else if (computerPosition == Snake_Mouth_Position[i]) {
						computerPosition = Snake_Tail_Position[i];
					}
				}
			else {
				if (playerPosition == Snake_Mouth_Position[i]) {
					playerPosition = Snake_Tail_Position[i];
				}
					else if (computerPosition == Snake_Mouth_Position[i]) {
						computerPosition = Snake_Tail_Position[i];
					}
				}
			}

		//playerPosition With Ladder
		for (int i = 0; i < 8; i++) {
			if (Level == '1' && i < 3) {
				if (playerPosition == Ladder_Down_Position[i]) {
					playerPosition = Ladder_Up_Position[i];
				}
					else if (computerPosition == Ladder_Down_Position[i]) {
						computerPosition = Ladder_Up_Position[i];
					}
			}

			else if (Level == '2' && i < 5) {
				if (playerPosition == Ladder_Down_Position[i]) {
					playerPosition = Ladder_Up_Position[i];
				}
					else if (computerPosition == Ladder_Down_Position[i]) {
						computerPosition = Ladder_Up_Position[i];
					}
				}else {
				if (playerPosition == Ladder_Down_Position[i]) {
					playerPosition = Ladder_Up_Position[i];
				}
					else if (computerPosition == Ladder_Down_Position[i]) {
						computerPosition = Ladder_Up_Position[i];
					}
				}
			}
			
		//player position display
		System.out.println("\n--------------------->Player's Position<---------------------------");
		for (int i = 0; i < 2; i++) {
			if (i == 0) {
				System.out.println(" \n                         YOU -> " + Name + " = " + playerPosition);
			} else {
				System.out.println("                         COMPUTER" + " = "  + computerPosition);
			}
		}
	}

	void IsWon() {
		if (playerPosition == WONPOINT) {
			System.out.println("\n---------------------👏👏👏👏WINNER👏👏👏👏------------------------------- \n");
			System.out.println("                          CONGRATS " + Name);

			System.out.println("\n---------------------👏👏👏👏WINNER👏👏👏👏------------------------------- \n");

			flag = 1;
		}
		if (computerPosition == WONPOINT) {
			System.out.println("\n--------------------------------WINNER----------------------------- \n");
			System.out.println("                              " + "COMPUTER \n");
			System.out.println("                            YOU LOSE !!!!!☹️☹️☹️☹️");
			System.out.println("\n--------------------------------------------------------------------------- \n");
			flag = 1;
		}
	}
}

class Play_With_friends {

	final static int WONPOINT = 100;
	static Random rand = new Random();
	static Scanner sc = new Scanner(System.in);
	static int n = 100;
	static char rollDice;
	static int playerPosition[] = new int[n];
	static int diceScore[] = new int[n];
	static String Names[] = new String[n];
	static int Snake_Mouth_Position[] = new int[8];
	static int Snake_Tail_Position[] = new int[8];
	static int Ladder_Up_Position[] = new int[8];
	static int Ladder_Down_Position[] = new int[8];
	int flag = 0;
	char Level;
	int Count;
	int Snake_flag = 0;
	int Ladder_flag = 0;

//setGame()
	void setGame() {
		System.out.print("-------------------------->SET GAME<------------------------------- \n");

		System.out.print("         Levels :   1 - EASY     2 - MEDIUM     3 - HARD \n \n");
		System.out.print("Choose a Level (1 | 2 | 3 ) : ");
		Level = sc.next().charAt(0);

		while (Level != '1' && Level != '2' && Level != '3') {
			System.out.print("Choose a valid Level (1 | 2 | 3 ) : ");
			Level = sc.next().charAt(0);
		}
	}
	//setPlayer()
	void SetPlayer() {
		System.out.print(" \nEnter no. of Players : ");
		n = sc.nextInt();
		while(n < 0 | n > 96)
		{
			System.out.println("Enter Valid no. of Players : ");
			n = sc.nextInt();
		}
		System.out.println(" \nEnter players Names : ");
		for (int i = 0; i < n; i++) {
			System.out.print("player " + (i + 1) + " : ");
			Names[i] = sc.next();
		}
	}

	void SnakesAndLaddersPosition() {

		if (Level == '1') {
			//Snake Mouth Position Setting
			Snake_Mouth_Position[0] = rand.nextInt(99 - 95) + 95;
			Snake_Mouth_Position[1] = rand.nextInt(65 - 60) + 60;
			Snake_Mouth_Position[2] = rand.nextInt(35 - 30) + 30;

			//Snake Tail Position Setting
			Snake_Tail_Position[0] = rand.nextInt(26 - 24) + 24;
			Snake_Tail_Position[1] = rand.nextInt(56 - 51) + 51;
			Snake_Tail_Position[2] = rand.nextInt(19 - 15) + 15;
		}

		else if (Level == '2') {
			//Snake Mouth Position Setting
			Snake_Mouth_Position[0] = rand.nextInt(99 - 98) + 98;
			Snake_Mouth_Position[1] = rand.nextInt(87 - 81) + 81;
			Snake_Mouth_Position[2] = rand.nextInt(59 - 55) + 55;
			Snake_Mouth_Position[3] = rand.nextInt(38 - 32) + 32;
			Snake_Mouth_Position[4] = rand.nextInt(19 - 15) + 15;

			//Snake Tail Position Setting
			Snake_Tail_Position[0] = rand.nextInt(56 - 51) + 51;
			Snake_Tail_Position[1] = rand.nextInt(78 - 72) + 72;
			Snake_Tail_Position[2] = rand.nextInt(42 - 41) + 41;
			Snake_Tail_Position[3] = rand.nextInt(29 - 26) + 26;
			Snake_Tail_Position[4] = rand.nextInt(9 - 6) + 6;

		} else {
			//Snake Mouth Position Setting
			Snake_Mouth_Position[0] = rand.nextInt(99 - 98) + 98;
			Snake_Mouth_Position[1] = rand.nextInt(96 - 92) + 92;
			Snake_Mouth_Position[2] = rand.nextInt(74 - 71) + 71;
			Snake_Mouth_Position[3] = rand.nextInt(65 - 62) + 62;
			Snake_Mouth_Position[4] = rand.nextInt(42 - 41) + 41;
			Snake_Mouth_Position[5] = rand.nextInt(69 - 65) + 65;
			Snake_Mouth_Position[6] = rand.nextInt(26 - 24) + 24;
			Snake_Mouth_Position[7] = rand.nextInt(19 - 15) + 15;

			//Snake Tail Position Setting
			Snake_Tail_Position[0] = rand.nextInt(56 - 51) + 51;
			Snake_Tail_Position[1] = rand.nextInt(45 - 41) + 41;
			Snake_Tail_Position[2] = rand.nextInt(36 - 32) + 32;
			Snake_Tail_Position[3] = rand.nextInt(26 - 22) + 22;
			Snake_Tail_Position[4] = rand.nextInt(29 - 26) + 26;
			Snake_Tail_Position[5] = rand.nextInt(19 - 15) + 15;
			Snake_Tail_Position[6] = rand.nextInt(19 - 15) + 15;
			Snake_Tail_Position[7] = rand.nextInt(9 - 6) + 6;
		}


		if (Level == '1') {
			//Ladder Down Position Setting
			Ladder_Down_Position[0] = rand.nextInt(9 - 6) + 6;
			Ladder_Down_Position[1] = rand.nextInt(69 - 65) + 65;;
			Ladder_Down_Position[2] = rand.nextInt(87 - 81) + 81;

//Laddet Up Position Setting
			Ladder_Up_Position[0] = rand.nextInt(87 - 81) + 81;
			Ladder_Up_Position[1] = rand.nextInt(96 - 92) + 92;
			Ladder_Up_Position[2] = rand.nextInt(99 - 96) + 96;
		}

		else if (Level == '2') {
			//Ladder Down Position Setting
			Ladder_Down_Position[0] = rand.nextInt(19 - 15) + 15;
			Ladder_Down_Position[1] = rand.nextInt(38 - 37) + 37;
			Ladder_Down_Position[2] = rand.nextInt(59 - 51) + 51;
			Ladder_Down_Position[3] = rand.nextInt(69 - 65) + 65;
			Ladder_Down_Position[4] = rand.nextInt(86 - 81) + 81;

			//Ladder Up Position Setting
			Ladder_Up_Position[0] = rand.nextInt(86 - 81) + 81;
			Ladder_Up_Position[1] = rand.nextInt(42 - 41) + 41;
			Ladder_Up_Position[2] = rand.nextInt(86 - 81) + 81;
			Ladder_Up_Position[3] = rand.nextInt(96 - 92) + 92;
			Ladder_Up_Position[4] = rand.nextInt(99 - 96) + 96;
		}

		else {
			//Ladder Down Position Setting
			Ladder_Down_Position[0] = rand.nextInt(9 - 6) + 6;
			Ladder_Down_Position[1] = rand.nextInt(26 - 24) + 24;
			Ladder_Down_Position[2] = rand.nextInt(38 - 36) + 36;
			Ladder_Down_Position[3] = rand.nextInt(45 - 41) + 41;
			Ladder_Down_Position[4] = rand.nextInt(59 - 54) + 54;
			Ladder_Down_Position[5] = rand.nextInt(69 - 68) + 68;
			Ladder_Down_Position[6] = rand.nextInt(78 - 72) + 72;
			Ladder_Down_Position[7] = rand.nextInt(86 - 81) + 81;

			//Ladder Up Position Setting
			Ladder_Up_Position[0] = rand.nextInt(87 - 86) + 86;
			Ladder_Up_Position[1] = rand.nextInt(96 - 92) + 92;
			Ladder_Up_Position[2] = rand.nextInt(78 - 74) + 74;
			Ladder_Up_Position[3] = rand.nextInt(69 - 65) + 65;
			Ladder_Up_Position[4] = rand.nextInt(87 - 81) + 81;
			Ladder_Up_Position[5] = rand.nextInt(78 - 74) + 74;
			Ladder_Up_Position[6] = rand.nextInt(96 - 95) + 95;
			Ladder_Up_Position[7] = rand.nextInt(99 - 92) + 92;
		}
	}

	void SnakesAndLaddersPositionPrint() {
		System.out.print(" \n----------->SNAKES POSITION 🐍🐍 | LADDERS POSITION 🪜🪜<----------- \n");
		if (Level == '1') {
			for (int i = 0; i < 3; i++) {
				if (i == 0) {
					System.out.println("               " + Snake_Mouth_Position[i] + "    to   " + Snake_Tail_Position[i] + "     |    0" + Ladder_Down_Position[i] + "    to    " + Ladder_Up_Position[i]);
				} else {
					System.out.println("               " + Snake_Mouth_Position[i] + "    to   " + Snake_Tail_Position[i] + "     |    " + Ladder_Down_Position[i] + "    to    " + Ladder_Up_Position[i]);
				}
			}
		} else if (Level == '2') {
			for (int i = 0; i < 5; i++) {
				if (i == 0) {
					System.out.println("               " + Snake_Mouth_Position[i] + "    to   " + Snake_Tail_Position[i] + "     |    0" + Ladder_Down_Position[i] + "    to    " + Ladder_Up_Position[i]);
				} else {
					System.out.println("               " + Snake_Mouth_Position[i] + "    to   " + Snake_Tail_Position[i] + "     |    " + Ladder_Down_Position[i] + "    to    " + Ladder_Up_Position[i]);
				}
			}
		} else {
			for (int i = 0; i < 8; i++) {
				if (i == 0) {
					System.out.println("               " + Snake_Mouth_Position[i] + "    to   " + Snake_Tail_Position[i] + "     |    0" + Ladder_Down_Position[i] + "    to    " + Ladder_Up_Position[i]);
				} else if (i == 7) {
					System.out.println("               " + Snake_Mouth_Position[i] + "    to   0" + Snake_Tail_Position[i] + "     |    " + Ladder_Down_Position[i] + "    to    " + Ladder_Up_Position[i]);
				} else {
					System.out.println("               " + Snake_Mouth_Position[i] + "    to   " + Snake_Tail_Position[i] + "     |    " + Ladder_Down_Position[i] + "    to    " + Ladder_Up_Position[i]);
				}
			}
		}

		System.out.print("------------------------------------------------------------------- \n");
	}

	void RollDice() {
		System.out.print(" \n----------------------->Roll The Dice<-----------------------------\n");

		for (int i = 0; i < n; i++) {
			System.out.print(" \n           " + Names[i] + "'s Turn (Enter character " + "R" + " or " + "r" + " ) : ");

			rollDice = sc.next().charAt(0);

			while (rollDice !=  'R' && rollDice != 'r') {
				System.out.println("\n           Enter Valid Character R or r : ");
				rollDice = sc.next().charAt(0);
			}
			diceScore[i] = rand.nextInt(6 - 1) + 1;
			playerPosition[i] += diceScore[i];
			System.out.println("                     dice Score = " + diceScore[i]);

			for (int I = 0; I< n; I++) {
				for (int k = 0; k < 8; k++) {
					if (Level == '1' && I < 3) {
						if (playerPosition[I] == Snake_Mouth_Position[k]) {
							System.out.println(" \n        --------->Oops, Swallowed By Snake🐍<---------");
							}
							else if (playerPosition[I] == Ladder_Down_Position[k]){
							System.out.println(" \n            ----->Hurry, Climb Up The Ladder🪜<-----");
						}
					} else if (Level == '2' && I < 5) {
					if (playerPosition[I] == Snake_Mouth_Position[k]) {
							System.out.println(" \n        --------->Oops, Swallowed By Snake🐍<---------");
							}
							else if (playerPosition[I] == Ladder_Down_Position[k]){
							System.out.println(" \n            ----->Hurry, Climb Up The Ladder🪜<-----");
						}
					} else {
						if (playerPosition[I] == Snake_Mouth_Position[k]) {
							System.out.println(" \n        --------->Oops, Swallowed By Snake🐍<---------");
							}
							else if (playerPosition[I] == Ladder_Down_Position[k]){
							System.out.println(" \n            ----->Hurry, Climb Up The Ladder🪜<-----");
						}
					}
				}
				}

			if (flag != 1) {
				PlayerPosition();
				IsWon();
			}
		}
	}

	void PlayerPosition() {
		for (int i = 0; i < n; i++) {
			if (playerPosition[i] > WONPOINT) {
				playerPosition[i] -= diceScore[i];
			}
		}

		//playerPosition With Snake_Tail_Position
		for (int i = 0; i < n; i++) {
			if (Level == '1') {
				if (playerPosition[i] == Snake_Mouth_Position[0]) {
					playerPosition[i] = Snake_Tail_Position[0];
				} else if (playerPosition[i] == Snake_Mouth_Position[1]) {
					playerPosition[i] = Snake_Tail_Position[1];
				} else if (playerPosition[i] == Snake_Mouth_Position[2]) {
					playerPosition[i] = Snake_Tail_Position[2];
				}
			} else if (Level == '2') {
				if (playerPosition[i] == Snake_Mouth_Position[0]) {
					playerPosition[i] = Snake_Tail_Position[0];
				} else if (playerPosition[i] == Snake_Mouth_Position[1]) {
					playerPosition[i] = Snake_Tail_Position[1];
				} else if (playerPosition[i] == Snake_Mouth_Position[2]) {
					playerPosition[i] = Snake_Tail_Position[2];
				} else if (playerPosition[i] == Snake_Mouth_Position[3]) {
					playerPosition[i] = Snake_Tail_Position[3];
				} else if (playerPosition[i] == Snake_Mouth_Position[4]) {
					playerPosition[i] = Snake_Tail_Position[4];
				}  else {
				}
			}

			else {
				if (playerPosition[i] == Snake_Mouth_Position[0]) {
					playerPosition[i] = Snake_Tail_Position[0];
				} else if (playerPosition[i] == Snake_Mouth_Position[1]) {
					playerPosition[i] = Snake_Tail_Position[1];
				} else if (playerPosition[i] == Snake_Mouth_Position[2]) {
					playerPosition[i] = Snake_Tail_Position[2];
				} else if (playerPosition[i] == Snake_Mouth_Position[3]) {
					playerPosition[i] = Snake_Tail_Position[3];
				} else if (playerPosition[i] == Snake_Mouth_Position[4]) {
					playerPosition[i] = Snake_Tail_Position[4];
				} else if (playerPosition[i] == Snake_Mouth_Position[5]) {
					playerPosition[i] = Snake_Tail_Position[5];
				} else if (playerPosition[i] == Snake_Mouth_Position[6]) {
					playerPosition[i] = Snake_Tail_Position[6];
				} else if (playerPosition[i] == Snake_Mouth_Position[7]) {
					playerPosition[i] = Snake_Tail_Position[7];
				}
			}
		}

		//playerPosition With Ladder
		for (int i = 0; i < n; i++) {
			if (Level == '1') {
				if (playerPosition[i] == Ladder_Down_Position[0]) {
					playerPosition[i] = Ladder_Up_Position[0];
				} else if (playerPosition[i] == Ladder_Down_Position[1]) {
					playerPosition[i] = Ladder_Up_Position[1];
				} else if (playerPosition[i] == Ladder_Down_Position[2]) {
					playerPosition[i] = Ladder_Up_Position[2];
				}
			} else if (Level == '2') {
				if (playerPosition[i] == Ladder_Down_Position[0]) {
					playerPosition[i] = Ladder_Up_Position[0];
				} else if (playerPosition[i] == Ladder_Down_Position[1]) {
					playerPosition[i] = Ladder_Up_Position[1];
				} else if (playerPosition[i] == Ladder_Down_Position[2]) {
					playerPosition[i] = Ladder_Up_Position[2];
				} else if (playerPosition[i] == Ladder_Down_Position[3]) {
					playerPosition[i] = Ladder_Up_Position[3];
				} else if (playerPosition[i] == Ladder_Down_Position[4]) {
					playerPosition[i] = Ladder_Up_Position[4];
				}
			} else {
				if (playerPosition[i] == Ladder_Down_Position[0]) {
					playerPosition[i] = Ladder_Up_Position[0];
				} else if (playerPosition[i] == Ladder_Down_Position[1]) {
					playerPosition[i] = Ladder_Up_Position[1];
				} else if (playerPosition[i] == Ladder_Down_Position[2]) {
					playerPosition[i] = Ladder_Up_Position[2];
				} else if (playerPosition[i] == Ladder_Down_Position[3]) {
					playerPosition[i] = Ladder_Up_Position[3];
				} else if (playerPosition[i] == Ladder_Down_Position[4]) {
					playerPosition[i] = Ladder_Up_Position[4];
				} else if (playerPosition[i] == Ladder_Down_Position[5]) {
					playerPosition[i] = Ladder_Up_Position[5];
				} else if (playerPosition[i] == Ladder_Down_Position[6]) {
					playerPosition[i] = Ladder_Up_Position[6];
				} else if (playerPosition[i] == Ladder_Down_Position[7]) {
					playerPosition[i] = Ladder_Up_Position[7];
				}
			}
		}
		//player position display
		System.out.println("\n       ----------:::::Player's Position:::::------------ \n");
		for (int i = 0; i < n; i++) {
			Count = 1;
			if (diceScore[i] > 0) {
				System.out.println("CURRENT :                    " + Names[i] + " = " + playerPosition[i]);
			} else {
				System.out.println("                             " + Names[i] + " = " + playerPosition[i]);
			}
			if (i == n - 1) {
				System.out.print("------------------------------------------------------------------- ");
			}
			Count ++;
			diceScore[i] = 0;
		}
	}


	void IsWon() {
		for (int i = 0; i < n; i++) {
			if (playerPosition[i] == WONPOINT) {
				System.out.println("\n---------------------👏👏👏👏WINNER👏👏👏👏------------------------------- \n");
				System.out.println("                          CONGRATS " + Names[i]);
				System.out.println("\n---------------------👏👏👏👏WINNER👏👏👏👏------------------------------- \n");
				flag = 1;
				break;
			}
			if (flag == 1)
				break;
		}
	}
}

public class SnakeNLadderGame{
	public static void main(String[] args) {
		System.out.println("                 Welcome To SNACK AND LADDER GAME \n-------------------------------------------------------------------\n");
		System.out.println("Application Type : Console Game");
		System.out.println("Version : 1.0.1 LTS");
		System.out.println("Developer : GHANSHYAM VAJA");
		System.out.println("-------------------------------------------------------------------");
		char playWith;

		Scanner sc = new Scanner(System.in);
		System.out.println("\n       1 - play With Computer         2 - play With friends");
		System.out.print(" \nEnter Your choice (1 | 2) : ");
		playWith = sc.next().charAt(0);

		while (playWith != '1' && playWith != '2') {
			System.out.print(" \nEnter Your choice (1 | 2) : ");
			playWith = sc.next().charAt(0);
		}
		System.out.println(" \n::::::::::::🏁🏁🏁🏁---->WINPOINT : 100<----🏁🏁🏁🏁::::::::::::::::::::: \n");
		if (playWith == '1') {
			Play_With_Computer obj = new Play_With_Computer();
			int i = 1;

			while (obj.flag != 1) {
				if (i == 1) {
					obj.setGame();
					obj.SnakesAndLaddersPosition();
				}
				obj.SnakesAndLaddersPositionPrint();
				if (i == 1) {
					System.out.print("\n-------------------::Lets Start The Game::------------------------- ");
				}
				obj.RollDice();
				//obj.PlayerPosition();
				//obj.IsWon();
				i = 2;
			}
		}

		else {
			Play_With_friends obj2 = new Play_With_friends();
			int k = 1;
			while (obj2.flag != 1) {
				if (k == 1) {
					obj2.setGame();
					obj2.SetPlayer();
					obj2.SnakesAndLaddersPosition();
				}
				obj2.SnakesAndLaddersPositionPrint();
				if (k == 1) {
					System.out.print("\n-------------------::Lets Start The Game::------------------------- ");
				}
				obj2.RollDice();
				k = 2;
			}
		}
	}
}