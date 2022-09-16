/* Code for Week 3
 * Name:Karsten
 */

import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** Draws little pictures on the graphics pane
 */
public class Blinky{
    
    public static final double X = 300;
    public static final double Y = 400;
    public static final double WD = 50;
    public static final double HT = 50;
    
    public void drawBlinky() {        
        //Blinky's body
        UI.setColor(Color.red);
        UI.fillOval(X, Y-HT-WD/2,WD, WD);
        UI.fillRect(X, Y-HT, WD, HT);
        
        //Blinky's "curtain"
        double yCurtainOval = Y - (WD/2)/4;
        UI.fillOval(X+(WD/4)*0, yCurtainOval, WD/4, WD/4);
        UI.fillOval(X+(WD/4)*1, yCurtainOval, WD/4, WD/4);
        UI.fillOval(X+(WD/4)*2, yCurtainOval, WD/4, WD/4);
        UI.fillOval(X+(WD/4)*3, yCurtainOval, WD/4, WD/4);
        
        //Blinky's eyes
        UI.setColor(Color.white);
        UI.fillOval(X+WD/8,    Y-HT, WD/4, WD/4);
        double xRightEye = X+WD-WD/8-WD/4;
        UI.fillOval(xRightEye, Y-HT, WD/4, WD/4);
        
        //Blinky's pupils
        UI.setColor(Color.black);
        UI.fillOval(X+WD/8,    Y-HT + WD/16, WD/8, WD/8);
        UI.fillOval(xRightEye, Y-HT + WD/16, WD/8, WD/8);
    }
    
    public void drawBlinky2() {
        double left = X; 
        double topRect = Y - HT;
        double topOval = topRect-WD/2;
        
        double yCurtainOval = Y - (WD/2)/4;
        double curtainSize = WD/4;
        
        double eyeSize = WD/4;
        double yEye = topRect;
        double eyeDistanceFromSide = WD/8;
        double xLeftEye = left+eyeDistanceFromSide;
        double xRightEye = left+WD-eyeDistanceFromSide-eyeSize;
        
        double pupilSize = WD/8;
        double yPupil = Y-HT + pupilSize/2;
        double xLeftPupil = xLeftEye;
        double xRightPupil = xRightEye;
                
        //Blinky's body
        UI.setColor(Color.red);
        UI.fillOval(left, topOval, WD, WD);
        UI.fillRect(left, topRect, WD, HT);
        
        //Blinky's "curtain"
        UI.fillOval(left+curtainSize*0, yCurtainOval, curtainSize, curtainSize);
        UI.fillOval(left+curtainSize*1, yCurtainOval, curtainSize, curtainSize);
        UI.fillOval(left+curtainSize*2, yCurtainOval, curtainSize, curtainSize);
        UI.fillOval(left+curtainSize*3, yCurtainOval, curtainSize, curtainSize);
        
        //Blinky's eyes
        UI.setColor(Color.white);
        UI.fillOval(xLeftEye, yEye, eyeSize, eyeSize);
        UI.fillOval(xRightEye, yEye, eyeSize, eyeSize);
        
        //Blinky's pupils
        UI.setColor(Color.black);
        UI.fillOval(xLeftPupil, yPupil, pupilSize, pupilSize);
        UI.fillOval(xRightPupil,yPupil, pupilSize, pupilSize);
    }
    
    public void drawBlinky(double x, double y, double wd, double ht, boolean scared) {
        double left = x; 
        double topRect = y - ht;
        double topOval = topRect-wd/2;
        
        double yCurtainOval = y - (wd/2)/4;
        double curtainSize = wd/4;
        
        double eyeSize = wd/4;
        double yEye = topRect;
        double eyeDistanceFromSide = wd/8;
        double xLeftEye = left+eyeDistanceFromSide;
        double xRightEye = left+wd-eyeDistanceFromSide-eyeSize;
        
        double pupilSize = wd/8;
        double yPupil = y-ht + pupilSize/2;
        double xLeftPupil = xLeftEye;
        double xRightPupil = xRightEye;
                
        //Blinky's body
        if(scared) {
            UI.setColor(Color.BLUE);
        } else {
            UI.setColor(Color.red);
        }
        UI.fillOval(left, topOval, wd, wd);
        UI.fillRect(left, topRect, wd, ht);
        
        //Blinky's "curtain"
        UI.fillOval(left+curtainSize*0, yCurtainOval, curtainSize, curtainSize);
        UI.fillOval(left+curtainSize*1, yCurtainOval, curtainSize, curtainSize);
        UI.fillOval(left+curtainSize*2, yCurtainOval, curtainSize, curtainSize);
        UI.fillOval(left+curtainSize*3, yCurtainOval, curtainSize, curtainSize);
        
        //Blinky's eyes
        UI.setColor(Color.white);
        UI.fillOval(xLeftEye, yEye, eyeSize, eyeSize);
        UI.fillOval(xRightEye, yEye, eyeSize, eyeSize);
        
        //Blinky's pupils
        UI.setColor(Color.black);
        UI.fillOval(xLeftPupil, yPupil, pupilSize, pupilSize);
        UI.fillOval(xRightPupil,yPupil, pupilSize, pupilSize);
    }
 

    public void clear(){
        UI.initialise();
        UI.clearGraphics();
    }

}
