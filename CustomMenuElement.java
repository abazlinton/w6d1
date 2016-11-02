import javax.swing.*; 
import java.awt.*;
import java.util.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;


class CustomMenuElement extends AbstractAction implements MenuElement {

  // private String label;

  // public CustomMenuElement( String label ){
  //   this.label = label;
  // }

  public Component getComponent(){
    JLabel label = new JLabel( "test" );
    return label;


  }

  public MenuElement[] getSubElements(){
    return new MenuElement[0];

  }

  public void actionPerformed(ActionEvent action){
    System.out.println("ACTION!");

  }

  public void menuSelectionChanged(boolean isIncluded){
      System.out.println("Selection changed!");

  }

  public void processKeyEvent(KeyEvent event, MenuElement[] path, MenuSelectionManager manager){

  }

  public void processMouseEvent(MouseEvent event, MenuElement[] path, MenuSelectionManager manager){
    {
      System.out.println(event);
    }


  }


}