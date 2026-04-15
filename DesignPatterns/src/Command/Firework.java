package Command;

public class Firework extends Item {

		@Override
		public String toString() {
			return "Firework";
		}
		
		public void useItem() {
			System.out.println("BANG Boom WHIZ!");
		}
}
