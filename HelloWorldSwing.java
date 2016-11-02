// package start;
 
/*
 * HelloWorldSwing.java requires no other files. 
 */
import javax.swing.*;        
import java.awt.*;
import java.util.*; 

public class HelloWorldSwing {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Add the ubiquitous "Hello World" label.
        // JLabel label = new JLabel("Hello World");
        // frame.getContentPane().add(label);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem newFile = new JMenuItem("New File");
        CustomMenuElement testCustomMenuElement = new CustomMenuElement();
        menu.add( testCustomMenuElement );
        menu.add( newFile );
        menuBar.add( menu );


        frame.setJMenuBar(menuBar);

 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
