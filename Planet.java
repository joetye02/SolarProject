public class Planet{
    private double distance;
    private double angle;
    private double diameter;
    private String colour;
    private double centreOfRotationAngle;
    private double centreOfRotationDistance;
    
    public Planet(double dist, double ang, double diam, String col, double centRotAng, double centRotDist){
        distance = dist;
        angle = ang;
        diameter = diam;
        colour = col;
        centreOfRotationAngle = centRotAng;
        centreOfRotationDistance = centRotDist;
    }
}