public class  SnakeLadder{

// making variables as static

	static final int NoChance = 0;
	static final int Ladder = 1;
	static final int Snake = 2;
	static int Position1 = 0;
	static int Position2 = 0;
	static int Diecount = 0;
// main method
	public static void main(String[] args) {

		System.out.println("Start Position is Zero");
		boolean Player1 = true;

   // while loop
             while (Position1 < 100 && Position2 < 100) {
		int position = Player1 ? Position1 :Position2 ;
                 // Roll a die

                int die = (int) (Math.random() * 6) + 1;

		System.out.println("The Dice Number is " + die);

                 // gets A ladder or Snake or NoChannce

		int option = (int) Math.floor(Math.random() * 10) % 3;


			if (option == Ladder) {
                                      	if (position <= 100 && (position + die <= 100)){
					position = position + die;

				System.out.println(" Got a Ladder");
                             }
			}
			else if (option == Snake) {

                                        if (position > 0 && (position - die) >= 0) {
					position = position - die;

					System.out.println("Snake Bites");
                           }

			}
			else {
				System.out.println("NoChance");
			}

                        System.out.println("Position of dice is " + position);
   // increment Die Count
			Diecount++;

   // add position value to player
                if (Player1 )
                        Position1 = position;
                else
                        Position2 = position;

   // if one of the player did not get a ladder then another player get chance to play
                if (option != Ladder)
                        Player1 = !Player1;


             }

  // Winner is player who reached 100 first
		System.out.println(Position1>=100? "Player 1 Won" : "Player 2 Won");

		 System.out.println("Total Diecount" + Diecount);
	}
}
