public class CodeDriver
{
    public static void main(String[] args)
    {

        SolarSystem mysolarsystem = new SolarSystem(800, 800);

        int i=0;
        int j=0;
        int k =0;
        while(true){
        mysolarsystem.drawSolarObject(0, 0, 100, "YELLOW");
        mysolarsystem.drawSolarObject(200,i,50,"BLUE");
        mysolarsystem.drawSolarObject(250,j,35,"PINK");
        mysolarsystem.drawSolarObjectAbout(50,k,25,"WHITE",200,i);
        mysolarsystem.finishedDrawing();
        i++;
        j+=2;
        k+=4;
        }
    }
}
