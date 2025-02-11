package com.mygdx.game.Phase3;

import com.mygdx.game.Vector;

public class ShootInHoleDirection {

    public static Vector shootInHoleDir(double holeX, double holeY, double x, double y){
        double absX = Math.abs(holeX - x);
        double absY = Math.abs(holeY - y);

        double cosO = (holeX-x)/Math.sqrt(absX*absX + absY*absY);
        double sinO = (holeY-y)/Math.sqrt(absX*absX + absY*absY);

        double xStart = x;
        double yStart = y;

        double magnitude = Math.sqrt((holeX-x)*(holeX-x) + (holeY-y) * (holeY-y));
        double Vx = (5 * cosO)/magnitude;
        double Vy = (5 * sinO)/magnitude;

//        double Vx = 5 * cosO;
//        double Vy = 5 * sinO;

        Vector toHole = new Vector(xStart, yStart, 0, null, Vx, Vy);
        return toHole;
    }
}
