public class  SnakeLadder{

	static final int NoChance = 0;
	static final int Ladder = 1;
	static final int Snake = 2;
	static int Position = 0;

// main method
	public static void main(String[] args) {

		System.out.println("Start Position is Zero");
// while loop
             while (Position < 100) {
                 // Roll a die
                int die = (int) (Math.random() * 6) + 1;
		System.out.println("The Dice Number is " + die);
                 // gets A ladder or Snake or NoChannce
		int option = (int) Math.floor(Math.random() * 10) % 3;



			if (option == Ladder) {
					Position = Position + die;
				System.out.println(" Got a Ladder");
			}
			else if (option == Snake) {

                                       if (Position > 0 && (Position - die) >= 0) {
					Position = Position - die;
					System.out.println("Snake Bites");
                           }

			}
			else {
				System.out.println("NoChance");
			}

             }
                      System.out.println(" " + Position);

	}
}
