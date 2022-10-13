public class Driver{
        static SolarSystem s = new SolarSystem(1000, 1000);

    public static void main(String[] args){
        
        int orbitAngle1 = 0;//The angles of which earth and mars are around the sun;
        int orbitAngle2 = 0;
        //drawPlanets();
        while(true){
            

            s.drawSolarObject(0, 0, 100, "ORANGE");// Represents the Sun
            s.drawSolarObjectAbout(200, orbitAngle1, 20, "RED", 30, 70);// Represents Mars
            s.drawSolarObjectAbout(400, orbitAngle2, 30, "BLUE",100, 100);// Represents Earth

            if (orbitAngle1 == 360){orbitAngle1 = 0;}// The Angle of orbit for both Mars and Earth cannot exceed 360
            if (orbitAngle1 == 360){orbitAngle1 = 0;}
            orbitAngle1 ++;
            orbitAngle2 += 5;//Earth orbits quicker
            s.finishedDrawing();
        }
        
    }

}