import processing.core.*;
public class GUI1 extends PApplet
{
	public PImage background;
	public String url;
	public void setup()
	{
		size(200,200);
		url = "https://cdn.pixabay.com/photo/2017/12/15/13/51/polynesia-3021072__340.jpg";
		background = loadImage(url);
	}
	public void draw()
	{
		background.resize(0,height);
		image(background,0,0);
		int [] color = sunColorSec(second());
		fill(color[0],color[1],color[2]);
		ellipse(width/4,height/5,width/4,height/5);
		arc(width/4,height/5,width/8,height/10,0,PI);
		noFill();
	}
	public int[] sunColorSec(float seconds)
	{
		int rgb[] = new int[3];
		float diffFrom30 = Math.abs(30-seconds);
		float ratio =  diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		return rgb;
	}
}
