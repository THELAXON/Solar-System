public class Planetaryobj extends Solarobject{

    public Planetaryobj(SolarSystem mysolarsystem, double distance, double angle, double diameter, String colour, double velocity,double centredistance, double centreangle,double centrevelocity)
    {
        super(mysolarsystem,distance, angle,diameter,colour,velocity,centredistance,centreangle,centrevelocity);
    } 
    public void orbit()
    {
        mysolarsystem.drawSolarObjectAbout(distance,angle += velocity,diameter,colour,centredistance, centreangle+=centrevelocity);
    }

    public void moon()
    {
        mysolarsystem.drawSolarObjectAbout(distance,angle += velocity,diameter,colour,centredistance, centreangle+=centrevelocity);
    }
}