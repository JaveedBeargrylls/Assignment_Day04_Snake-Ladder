public class Snake_ladder{
public static final int ladder = 1;
public static final int snake = 2;
public static final int winning_points = 100;
public static void main(String[] args){
System.out.println("Welcome to the simple Snake & Ladder Game");
	// Starting Position of Player
int player_position = 0;
int count = 1;
	// printing the random Variable(1-6) as dies 
for ( int dice = 0; player_position < winning_points; dice++ ){
int random = (int)(Math.random()*6) + 1;
	// Checking for random values to set Ladder and Snake
int check = (int)(Math.random()*3);
	// the function of ladder and snake
int result = 0;	
switch ( check ){
	case ladder:
		result += random;
		break;
	case snake:
		result -= random;
		break;
	default:
		result = 0;

}
	player_position += result;
if ( player_position < 0 ){
	player_position = 0;}
count++;
}
System.out.println(" Winning Position of Player : " +player_position+ " WINNNER "+"\t"+count);
//System.out.println(" Random variables from 1 - 6 : "+random+"\t"+check);
}
}

