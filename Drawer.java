/* Code for lecture 5 
 * Name:pondy
 */

import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** Draws little pictures on the graphics pane
 */
public class Drawer{

    public void faceWithHat1(){
        UI.setColor(Color.orange); // set color to orange
        UI.fillOval(200,100,100, 150);// draw oval @(200,100)  100x150 
        UI.setColor(Color.green);// set color to green
        UI.fillRect(205,90, 90, 50);// draw rectangle   @(200,90)     100x50
        UI.drawLine(180,140, 320, 140);// draw line            (180,140)   to  (320, 140)
    }

    public void faceWithHat2(){
        double x = 250;    // horizontal center of face
        double y = 180;    // vertical center of face
        double faceWd = 100;    
        double faceHt = 150;    

        //face
        UI.setColor(Color.orange);    
        UI.fillOval(x - faceWd / 2, y - faceHt / 2, faceWd, faceHt);

        //hat
        UI.setColor(Color.green);    
        UI.fillRect(x - (0.96 * faceWd) / 2, y - 0.25 * faceHt - (0.3 * faceHt), 0.96 * faceWd, 0.3 * faceHt); // hat crown
        UI.drawLine(x - 0.8 * 0.96 * faceWd, y - 0.25 * faceHt, x + 0.8 * 0.96 * faceWd, y - 0.25 * faceHt);//brim 
    }

    public void faceWithHat3(){
        double x = 250;    // horizontal center of face
        double y = 180;    // vertical center of face
        double faceWd = 100;    
        double faceHt = 150;    
        double faceLeft = x - faceWd / 2;
        double faceTop  = y - faceHt / 2;
        double hatHt =  0.3 * faceHt;    
        double hatWd  = 0.96 * faceWd;
        double hatLeft  = x - hatWd / 2;
        double hatBot  = y - 0.25 * faceHt;
        double hatTop  = hatBot - hatHt;
        double brimLt = x - 0.8 * hatWd;    
        double brimRt = x + 0.8 * hatWd;  

        // face
        UI.setColor(Color.orange);    
        UI.fillOval(faceLeft, faceTop, faceWd, faceHt);  

        //hat
        UI.setColor(Color.green);    
        UI.fillRect(hatLeft, hatTop, hatWd, hatHt); // hat crown
        UI.drawLine(brimLt, hatBot, brimRt, hatBot);//brim 
    }

    /** Draw an orange face with a brimmed hat*/
    public void faceWithHat4(double x, double y, double faceWd, double faceHt){
        double faceLeft = x - faceWd / 2;
        double faceTop  = y - faceHt / 2;
        double hatHt =  0.3 * faceHt;    
        double hatWd  = 0.96 * faceWd;
        double hatLeft  = x - hatWd / 2;
        double hatBot  = y - 0.25 * faceHt;
        double hatTop  = hatBot - hatHt;
        double brimLt = x - 0.8 * hatWd;    
        double brimRt = x + 0.8 * hatWd; 

        // face
        UI.setColor(Color.orange);    
        UI.fillOval(faceLeft, faceTop, faceWd, faceHt);

        // hat
        UI.setColor(Color.green);    
        UI.fillRect(hatLeft, hatTop, hatWd, hatHt); // hat crown
        UI.drawLine(brimLt, hatBot, brimRt, hatBot);//brim 
    }

    /** Draw an orange face with a brimmed hat*/
    public void faceWithHat5(double x, double y, double faceWd, double faceHt, Color colorFace, Color colorHat){
        double faceLeft = x - faceWd / 2;
        double faceTop  = y - faceHt / 2;
        double hatHt =  0.3 * faceHt;    
        double hatWd  = 0.96 * faceWd;
        double hatLeft  = x - hatWd / 2;
        double hatBot  = y - 0.25 * faceHt;
        double hatTop  = hatBot - hatHt;
        double brimLt = x - 0.8 * hatWd;    
        double brimRt = x + 0.8 * hatWd; 

        // face
        UI.setColor(colorFace);    
        UI.fillOval(faceLeft, faceTop, faceWd, faceHt);

        // hat
        UI.setColor(colorHat);    
        UI.fillRect(hatLeft, hatTop, hatWd, hatHt); // hat crown
        UI.drawLine(brimLt, hatBot, brimRt, hatBot);//brim 
    }

    public void faceWithHatStandard(double x, double y, double faceWd, double faceHt) {
        faceWithHat5(x, y, faceWd, faceHt, Color.orange, Color.green);
    }

    /** Draw four faces */
    public void fourFaces(){
        UI.clearGraphics();
        this.faceWithHatStandard(100, 200, 70, 110);
        this.faceWithHatStandard(250, 200, 70, 90);
        this.faceWithHat5(400, 200, 50, 130, Color.black, Color.red);
        this.faceWithHat5(550, 200, 90, 150, Color.DARK_GRAY, Color.blue);
    }

    public void clear(){
        UI.initialise();
        UI.clearGraphics();
    }

}
