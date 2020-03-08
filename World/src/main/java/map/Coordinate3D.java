package map;

/**
 * 
 * @author Felipe Mardones
 *
 */
public class Coordinate3D extends Coordinate {
	private int z;
	
	public Coordinate3D() {
		this(10, 10, 10);
	}
	
	public Coordinate3D(int x, int y, int z) {
		super(x, y);
		this.setZ(z);
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(super.toString());
		stringBuilder.append("[ z = ").append(this.getZ()).append(" ]\n");
		return stringBuilder.toString();
	}
}
