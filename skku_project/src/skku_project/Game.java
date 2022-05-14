package skku_project;

public interface Game {
	public void printBoard();
	public void initObjects();
	public void movePlayer();
	public void moveGhost();
	public boolean isFinish();
}
