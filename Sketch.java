import processing.core.PApplet;

public class Sketch extends PApplet {
	/**
  * Description: A program Sketch.java that draws a house with windows and trees. But it will now be able to resize.
  * Author: Brady So
  */
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    // Background to Sky Blue
    background(51, 153, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
 
    // Drawing the house (square)
    // Divide original number by 1000 for width, 500 for height
    fill(153, 0, 0);
    rect((float) (width * .17), (float) (height * .27), (float) (width * 0.22), (float) (height * .4));

    // Drawing the door (rectangle)
    fill(153, 102, 0);
    rect((float) (width * .252), (float) (height * .46), (float) (width * .05), (float) (height * .14));

    // Drawing windows (squares)
    // divide original number by 1000 for width, 500 for height
    fill(204, 204, 204);
    rect((float) (width * .32), (float) (height * .314), (float) (width * .04), (float) (height * .08));
    rect((float) (width * .195), (float) (height * .314), (float) (width * .04), (float) (height * .08));
    rect((float) (width * .195), (float) (height * .46), (float) (width * .03), (float) (height * .06));
    rect((float) (width * .325), (float) (height * .46), (float) (width * .03), (float) (height * .06));
    
    // Drawing grass (foreground)
    // Divide original number by 1000 for width, 500 for height
    fill(0, 204, 0); 
    rect((float) (width * 0), (float) (height * .56), width, height);

    // Drawing the roof (triangle)
    fill(102, 51, 0);
    // Divide original number by 1000 for width, 500 for height
    triangle((float) (width * .272), (float) (height * .09), (float) (width * .407), (float) (height * .29), (float) (width * .157) , (float) (height * .29));

    // Drawing the trees (Circles & rectangles)
    // Divide original number by 1000 for width, 500 for height
    fill(51, 0 ,0);
    rect((float)(width * .025), (float)(height * .2), (float)(width * .05), (float)(height * .36));
    fill(0, 153, 0);
    ellipse((float) (width * .05), (float) (height * .2), (float) (width * .09), (float) (height * .1));
    fill(51, 0 ,0);
    rect((float) (width * .485), (float) (height * .2), (float) (width * .05), (float) (height * .36));
    fill(0, 153, 0);
    ellipse((float) (width * .51), (float) (height * .2), (float) (width * .09), (float) (height * .1));
  }
}