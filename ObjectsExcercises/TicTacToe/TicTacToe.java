package TicTacToe;

import java.util.Scanner;

public class TicTacToe{
	private static char player1Sign;
	private static char player2Sign;
	private static char playerSign;
	private static int turn=0;
	private static char[][] ticTacToeTable={{'-','-','-'},
									  		{'-','-','-'},
									  		{'-','-','-'}};
	private static Scanner scanner;


	public static void main(String args[]){
		scanner = new Scanner(System.in);
		ticTacToeMenu();									//Display game instructions
		initialDisplayTable();								//Display initial table
		for(int i=1;i<=9;i++){
 			turn++;											//Switch players
			if(turn==1||turn==3||turn==5||turn==7||turn==9)
				{
				playerSign=player1Sign;
				System.out.print("Player's 1 turn. ");
				}
			else
				{
				playerSign=player2Sign;
				System.out.print("Player's 2 turn. ");
				}

			System.out.println("Give the position of your next move");

			//Scanner scanner = new Scanner(System.in);
			int posSelection=scanner.nextInt();

  			while(checkIfPosTaken(posSelection)){           //Check if position taken
				System.out.println("This position is already taken.Try again!");
				posSelection=scanner.nextInt();
			}
  			//scanner.close();
  			modifyDisplayTable(posSelection,playerSign);	//Draw table
  			checkIfVictory();								//Check if Victory at every round
		}
		System.out.println("You are both so good! Nobody won!");
		System.exit(0);


	}

	public static void ticTacToeMenu(){
		System.out.println("In this game there are two players to participate.");
		System.out.println("The first one chooses 'X' or 'O' and the second one takes the other.");
		System.out.println("The first player now has to enter 1 for 'X' or 0 for 'O'");
		//Scanner scanner = new Scanner(System.in);
		int xoSelection=scanner.nextInt();
		while((xoSelection!=0)&&xoSelection!=1){ //The player definetely has to enter either 1 or 0 in order to continue
		    System.out.println("Enter 0 or 1");
		    xoSelection=scanner.nextInt();
		}
		//scanner.close();
		if(xoSelection==1){
			System.out.println("The first player has chosen 'X'");
			System.out.println("and the second player has chosen 'O'\n");
			player1Sign='X'; //Ginetai apo tin arxi antistoixisi twn metavlitwn player1Sign kai player2Sign me ta simvola 'X' kai 'O'
			player2Sign='O'; //gia na min xreiazetai na ginetai sti sinexeia kafe fora elegxos tis eisodou tou xristi ean einai valid.
		}else{               //Aplos otan erxetai i seira tou kathenos, tha leei ti thesi pou epithimei na valei to simvolo tou.
			System.out.println("The first player has chosen 'O'");
			System.out.println("and the second player has chosen 'X'\n");
			player1Sign='O';
			player2Sign='X';
		}

		System.out.println("The positions allowed to be chosen are as indicated by the numbers");
		System.out.println("1 2 3");
		System.out.println("4 5 6");
		System.out.println("7 8 9\n");
		System.out.println("Start the game!");
	}

	public static void initialDisplayTable(){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(ticTacToeTable[i][j]);
			}
			System.out.print("\n");
		}
		//System.out.print("\n");
	}

	public static void modifyDisplayTable(int a,char playerSign){
		switch(a){
			case 1:
				{
				if(playerSign=='X')
					ticTacToeTable[0][0]='X';
				else
					ticTacToeTable[0][0]='O';
				}
				break;
			case 2:
				{
				if(playerSign=='X')
					ticTacToeTable[0][1]='X';
				else
					ticTacToeTable[0][1]='O';
				}
				break;
			case 3:
				{
				if(playerSign=='X')
					ticTacToeTable[0][2]='X';
				else
					ticTacToeTable[0][2]='O';
				}
				break;
			case 4:
				{
				if(playerSign=='X')
					ticTacToeTable[1][0]='X';
				else
					ticTacToeTable[1][0]='O';
				}
				break;
			case 5:
				{
				if(playerSign=='X')
					ticTacToeTable[1][1]='X';
				else
					ticTacToeTable[1][1]='O';
				}
				break;
			case 6:
				{
				if(playerSign=='X')
					ticTacToeTable[1][2]='X';
				else
					ticTacToeTable[1][2]='O';
				}
				break;
			case 7:
				{
				if(playerSign=='X')
					ticTacToeTable[2][0]='X';
				else
					ticTacToeTable[2][0]='O';
				}
				break;
			case 8:
				{
				if(playerSign=='X')
					ticTacToeTable[2][1]='X';
				else
					ticTacToeTable[2][1]='O';
				}
				break;
			case 9:
				{
				if(playerSign=='X')
					ticTacToeTable[2][2]='X';
				else
					ticTacToeTable[2][2]='O';
				}
				break;
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(ticTacToeTable[i][j]);
			}
			System.out.print("\n");
		}

	}

	public static boolean checkIfPosTaken(int a){
		switch(a){
			case 1:

				if(ticTacToeTable[0][0]=='X'||ticTacToeTable[0][0]=='O'){
					return true;
				}else{
					return false;
				}
			case 2:
				if(ticTacToeTable[0][1]=='X'||ticTacToeTable[0][1]=='O'){
					return true;
				}else{
					return false;
				}
			case 3:
				if(ticTacToeTable[0][2]=='X'||ticTacToeTable[0][2]=='O'){
					return true;
				}else{
					return false;
				}
			case 4:
				if(ticTacToeTable[1][0]=='X'||ticTacToeTable[1][0]=='O'){
					return true;
				}else{
					return false;
				}
			case 5:
				if(ticTacToeTable[1][1]=='X'||ticTacToeTable[1][1]=='O'){
					return true;
				}else{
					return false;
				}
			case 6:
				if(ticTacToeTable[1][2]=='X'||ticTacToeTable[1][2]=='O'){
					return true;
				}else{
					return false;
				}
			case 7:
				if(ticTacToeTable[2][0]=='X'||ticTacToeTable[2][0]=='O'){
					return true;
				}else{
					return false;
				}
			case 8:
				if(ticTacToeTable[2][1]=='X'||ticTacToeTable[2][1]=='O'){
					return true;
				}else{
					return false;
				}
			case 9:
				if(ticTacToeTable[2][2]=='X'||ticTacToeTable[2][2]=='O'){
					return true;
				}else{
					return false;
				}
		}
		return false;
	}

	public static void checkIfVictory(){		//Function for conditions of victory
		for (int i=0;i<3;i++){
			if( ticTacToeTable[i][0]==ticTacToeTable[i][1]&&ticTacToeTable[i][1]==ticTacToeTable[i][2]&&ticTacToeTable[i][2]=='X' ||
				ticTacToeTable[i][0]==ticTacToeTable[i][1]&&ticTacToeTable[i][1]==ticTacToeTable[i][2]&&ticTacToeTable[i][2]=='O'){
				System.out.println("Victory! You won!");
				System.exit(0);					//Terminate game immediatelly after victory
			}else if(ticTacToeTable[0][i]==ticTacToeTable[1][i]&&ticTacToeTable[1][i]==ticTacToeTable[2][i]&&ticTacToeTable[2][i]=='X' ||
					 ticTacToeTable[0][i]==ticTacToeTable[1][i]&&ticTacToeTable[1][i]==ticTacToeTable[2][i]&&ticTacToeTable[2][i]=='O'){
				 	 System.out.println("Victory! You won!");
					 System.exit(0);
			}else if(ticTacToeTable[0][0]==ticTacToeTable[1][1]&&ticTacToeTable[1][1]==ticTacToeTable[2][2]&&ticTacToeTable[2][2]=='X' ||
					 ticTacToeTable[0][0]==ticTacToeTable[1][1]&&ticTacToeTable[1][1]==ticTacToeTable[2][2]&&ticTacToeTable[2][2]=='O' ||
					 ticTacToeTable[0][2]==ticTacToeTable[1][1]&&ticTacToeTable[1][1]==ticTacToeTable[2][0]&&ticTacToeTable[2][0]=='X' ||
					 ticTacToeTable[0][2]==ticTacToeTable[1][1]&&ticTacToeTable[1][1]==ticTacToeTable[2][0]&&ticTacToeTable[2][0]=='O'){
				 	System.out.println("Victory! You won!");
					System.exit(0);
			}else
				return;
		}
	}


}
