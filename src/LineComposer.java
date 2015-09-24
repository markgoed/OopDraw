import java.awt.Point;

/**
 * Written By: Mark Goedegebure
 * Class MyLine for drawing lines is derived from our 'base' class AbstractShape
 */
public class LineComposer implements ShapeComposer {
	
	private MyLine line;

	@Override
	public void create(int x, int y) {
		line = new MyLine();
		line.setStart(new Point (x, y));
	}

	@Override
	public void expand(int x, int y) {
		line.setEnd (new Point(x, y));

	}

	@Override
	public void complete(int x, int y) {
		line.setEnd (new Point(x, y));

	}
}

// Class cLine ends
