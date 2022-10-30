public class Star extends Solarobject{

    public Star(SolarSystem mysolarsystem, double distance, double angle, double diameter, String colour, double velocity,double centredistance, double centreangle,double centrevelocity){
        super(mysolarsystem,distance, angle,diameter,colour,velocity,centredistance,centreangle,centrevelocity);
    } 
    public void create(){
        mysolarsystem.drawSolarObject(distance,angle,diameter,colour);
    }

}