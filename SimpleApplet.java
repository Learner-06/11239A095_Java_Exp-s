import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="SimpleApplet.class" width="300" height="200">
</applet>
*/

public class SimpleApplet extends Applet {
    
    // The paint() method is used to display text or graphics on the applet window
    public void paint(Graphics g) {
        g.drawString("Hello! This is my first Applet Program!", 50, 100);
    }
}
