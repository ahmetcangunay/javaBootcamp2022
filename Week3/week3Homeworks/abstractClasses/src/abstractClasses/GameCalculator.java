package abstractClasses;

// If we have abstract method, it has no default body(calculations)
// The classes which implements abstract method, it must include this method and override it.

public abstract class GameCalculator {

	public abstract void calculatePoint();

	public final void gameOver() {

		System.out.println("Game Over!");

	}

}
