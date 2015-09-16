import java.awt.Graphics2D;

public interface ShapeComposer

{
	/**
	 * Written By: Mark Goedegebure
	 */
	public void create(int x, int y);

	public void expand(int x, int y);

	public void complete(int x, int y);

	public void Draw(Graphics2D g);

}
/**
 * public abstract void setEnd(Point pt); public Point getStart() { return
 * ptStart; } public Point getEnd() { return ptEnd; } public abstract void
 * Draw(Graphics2D g); } // Base class cShape ends
 */