import javax.swing.*;
import java.awt.*;

/**
 *
 * @author rbary
 */
public class LayoutView extends JFrame {
    public LayoutView (){
        super();
        
        Container pan = this.getContentPane();
        
        FlowLayout flowlayout = new FlowLayout();
        GridLayout gridlayout = new GridLayout(2,3);
        BorderLayout borderlayout = new BorderLayout();
        JPanel paneld = new JPanel(flowlayout);
        
        JSlider myslider = new JSlider(0,10);
        
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3"); 
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6"); 
        
        /*pan.add(button1);
        pan.add(button2);
        pan.add(button3);
        pan.add(button4);
        pan.add(button5);
        //pan.add(button6);
        pan.add(myslider);*/
        
        
   
        pan.add(button3,borderlayout.PAGE_END);
        pan.add(button4,borderlayout.PAGE_START);
        pan.add(button2,borderlayout.LINE_START);
        pan.add(button1,borderlayout.CENTER);
        paneld.add(button5);
        paneld.add(button6);
        //pan.add(button5,paneld); 
   
        //pan.setLayout(flowlayout);
        //pan.setLayout(gridlayout);
        //pan.setLayout(borderlayout);
        
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}
