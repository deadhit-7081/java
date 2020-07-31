package maps;

import processing.core.PApplet;
import processing.core.PGraphics;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.AbstractMapProvider;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.utils.MapUtils;

public class EarthquakeCityProvider extends PApplet
{
	private UnfoldingMap map;
	public void setup()
	{
		size(950,600,OPENGL);
		map = new UnfoldingMap(this,200,50,700,500,new Google.GoogleMapProvider());
		map.zoomToLevel(1);
		MapUtils.createDefaultEventDispatcher(this, map);
		Location valLoc = new Location(-38.14f,-73.03f);
		SimplePointMarker val = new SimplePointMarker(valLoc);
		map.addMarker(val);
		val.setColor(color(255, 0, 0, 100));
	}
	public void draw()
	{
		background(255,200,100);
		map.draw();
	}
}
