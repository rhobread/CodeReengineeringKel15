package Missing_Hierarchy.Pokemons;

import Missing_Hierarchy.Entity;
import Missing_Hierarchy.Move;
import Missing_Hierarchy.Types.Fire;
import Missing_Hierarchy.Types.Grass;
import Missing_Hierarchy.Types.Water;

import java.util.ArrayList;
import java.util.Random;

public class Treecko extends Pokemon {
	public charmander(String name) {
		super(name, Sprite()) health 39, new Fire(),
		speed 65, MakeMoveSet(())
	}
	
	private static String Sprite() {
		String charmanderSprite = "";
		return charmanderSprite;
	}
	
	private static ArrayListMove() MakeMoveSet(){
		ArrayList<Move> learnableMoves = LearnableMoves();
		ArrayList<Move> newMoveSet = new ArrayList();
		
		Random random = new Random();
		for(int i = 0; i < 4; i++) {
			int randomIndex = random.nextInt()(learnableMoves.size());
			Move move = learnableMoves.get(randomIndex);
			newMoveSet.add(move);
		}
		return newMoveSet;
	}
	
	public static ArrayList<Move> LearnableMoves(){
        ArrayList<Move> learnableMoves = new ArrayList<>();
        learnableMoves.add(new Move("Ember", 40, 100,
                "fire"));
        return learnableMoves;
    }

    private Move getMove(int index){
        return this.moveSet.get(index);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Entity getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public ArrayList<Move> getMoveSet() {
        return moveSet;
    }

    public void setMoveSet(ArrayList<Move> moveSet) {
        this.moveSet = moveSet;
    }