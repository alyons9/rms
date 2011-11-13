/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.FoodListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * @Class Name: viewBreakfastMenuActionListener
 * @author Jamel Jenkins
 */
public class viewAddMenuActionListener implements ActionListener {
    
    private JScrollPane foodPane;
    private JPanel Tablet;
    
    public viewAddMenuActionListener(JScrollPane foodPane, JPanel panel){
        this.foodPane = foodPane;
        Tablet = panel;
    }
    
    public void actionPerformed(ActionEvent e){
            foodPane.setVisible(true);
            foodPane.setSize(524, 200);
            foodPane.setLocation(170, 500);
            foodPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            foodPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
            //home2.setVisible(false);
            Tablet.add(foodPane);
            //repaint();
        }
}
