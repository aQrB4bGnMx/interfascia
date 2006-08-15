// Interfascia -- ALPHA 001
import processing.core.*;

	
	public IFLabel (String argLabel, int argX, int argY, int size) {
		label = argLabel;
		x = argX;
		y = argY;
		
		if (size > 8 && size < 20) 
			textSize = size;
		else
			textSize = 13;
	}
	
	public void setSize(int size) {
		if (size > 8 && size < 20) 
			textSize = size;
		else
			textSize = 13;
	}
	
	public int getSize() {
		return textSize;
	}
		parent.registerDraw(this);
	}
	}