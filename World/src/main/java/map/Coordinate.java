package map;

public class Coordinate {
	private int x, y;
	
	
	public Coordinate() {
		this(10, 10);
	}

	public Coordinate(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("[ x = ").append(this.getX()).append(" ]\n");
		stringBuilder.append("[ y = ").append(this.getY()).append(" ]\n");
		return stringBuilder.toString();
	}
}