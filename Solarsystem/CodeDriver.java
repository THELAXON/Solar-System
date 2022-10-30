import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CodeDriver{

    public static void main(String[] args) 
    {
       
        double anglechanges =0;
        SolarSystem mySolarSystem = new SolarSystem(1500, 1500);

        Star sun = new Star(mySolarSystem,0,0,100,"YELLOW",0,0,0,0);

        Planetaryobj mercury = new Planetaryobj(mySolarSystem, 125, 265, 20, "#ada8a5", 1, 0, 0, 0);
        Planetaryobj venus = new Planetaryobj(mySolarSystem,175,225,30,"#FFC649", 0.75,0,0,0);
        Planetaryobj earth = new Planetaryobj(mySolarSystem,225,60,35,"#4f4cb0", 0.5,0,0,0);
        Planetaryobj mars = new Planetaryobj(mySolarSystem,275,35,25,"#451804", 0.25,0,0,0);
        Planetaryobj jupiter = new Planetaryobj(mySolarSystem,400,70,55,"#bcafb2", 0.125,0,0,0);
        Planetaryobj saturn = new Planetaryobj(mySolarSystem,475,130,50,"#ead6b8", 0.0625,0,0,0);
        Planetaryobj uranus = new Planetaryobj(mySolarSystem,525,40,45,"#e1eeee", 0.03125,0,0,0);
        Planetaryobj neptune = new Planetaryobj(mySolarSystem,550,190,40,"#4B70DD", 0.0152625,0,0,0);


        Planetaryobj earthmoon = new Planetaryobj(mySolarSystem,30,60,4,"WHITE", 0.6,225,60, 0.5);
        Planetaryobj marsmoon = new Planetaryobj(mySolarSystem,30,60,4,"WHITE", 0.35,275,35, 0.25);
        Planetaryobj marsmoon1 = new Planetaryobj(mySolarSystem,30,120,4,"WHITE", 0.35,275,35, 0.25);

        List<Planetaryobj> asteroids = new ArrayList<>();
       // List<Planetaryobj> asteroids1 = new ArrayList<>();

        for(int i=0;i<200;i++)
        {
            Random rand = new Random(); //instance of random class
            int upperbound = 60;
            int random = rand.nextInt(upperbound);
            asteroids.add(new Planetaryobj(mySolarSystem,290 + random ,35+anglechanges,3,"DARK_GRAY", 0.25,0,0,0));
            //asteroids1.add(new Planetaryobj(mySolarSystem,350,35+anglechanges,3,"DARK_GRAY", 0.25,0,0,0));
            anglechanges+=5;
        }

        while(true){
            sun.create();
            mercury.orbit();
            venus.orbit();
            earth.orbit();
            mars.orbit();
            jupiter.orbit();
            saturn.orbit();
            uranus.orbit();
            neptune.orbit();

            earthmoon.orbit();
            marsmoon.orbit();
            marsmoon1.orbit();

            for(int i=0;i<200;i++)
            {
                asteroids.get(i).orbit();
                //asteroids1.get(i).orbit();
            }

            mySolarSystem.finishedDrawing();
        }
        
    }
}
