public class Snake_ladder{
public static void main(String[] args){
System.out.println("Welcome to the simple Snake & Ladder Game");
	// Starting Position of Player
int player_position = 0;
	// printing the random Variable(1-6) as dies 
int random = (int)(Math.random()*6) + 1;
	// Checking for random values to set Ladder and Snake
int check = (int)(Math.random()*3);
	// the function of ladder and snake	
if ( check == 1 )
	// Ladder
	player_position += random;
else if ( check == 2 )
	// Snake
	player_position -= random;
else
	// remains same position 
	player_position = player_position;

System.out.println(" Position of Player : " +player_position);
//System.out.println(" Random variables from 1 - 6 : "+random+"\t"+check);
}
}

