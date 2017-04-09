/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskandcontact;

/**
 *
 * @author Johnny
 */
import java.text.SimpleDateFormat;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
 
public class ViewCalendarTable extends JFrame {
 
  private DefaultTableModel theModel;
  private Calendar theCalendar = new GregorianCalendar();
  private JLabel theLabel;
  private ViewCalendarCntl theParentViewCalendarCntl= null;
    public ViewCalendarTable(ViewCalendarCntl newParentViewCalendarCntl) {
    theParentViewCalendarCntl = newParentViewCalendarCntl;
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("ViewCalendar");
    this.setSize(300,200);
    this.setLayout(new BorderLayout());
    this.setLocationRelativeTo(null);
    this.setVisible(true);
 
 
    theLabel = new JLabel();
    theLabel.setHorizontalAlignment(SwingConstants.CENTER);
 
    JButton lastMonth = new JButton("<");
    lastMonth.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        theCalendar.add(Calendar.MONTH, -1);
        updateMonth();
      }
    });
 
    JButton nextMonth = new JButton(">");
    nextMonth.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) {
        theCalendar.add(Calendar.MONTH, +1);
        updateMonth();
      }
    });
 
    JPanel thePanel = new JPanel();
    thePanel.setLayout(new BorderLayout());
    thePanel.add(lastMonth,BorderLayout.WEST);
    thePanel.add(theLabel,BorderLayout.CENTER);
    thePanel.add(nextMonth,BorderLayout.EAST);
 
 
    String [] columns = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
    theModel = new DefaultTableModel(null,columns);
    JTable theTable = new JTable(theModel);
    JScrollPane theTablePane = new JScrollPane(theTable);
    
    JButton returnButton = new JButton("Return");
    returnButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt){
            theParentViewCalendarCntl.requestCalendarCntl();
        }
    });
    
    JPanel theReturnPanel = new JPanel();
    theReturnPanel.setLayout(new BorderLayout());
    theReturnPanel.add(returnButton,BorderLayout.CENTER);

    this.add(thePanel,BorderLayout.NORTH);
    this.add(theTablePane,BorderLayout.CENTER);
    this.add(theReturnPanel,BorderLayout.SOUTH);
 
    this.updateMonth();
 
  }
 
    public void updateMonth() {
    theCalendar.set(Calendar.DAY_OF_MONTH, 1);
 
    String month = theCalendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
    int year = theCalendar.get(Calendar.YEAR);
    theLabel.setText(month + " " + year);
 
    int startDay = theCalendar.get(Calendar.DAY_OF_WEEK);
    int numberOfDays = theCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    int weeks = theCalendar.getActualMaximum(Calendar.WEEK_OF_MONTH);
 
    theModel.setRowCount(0);
    theModel.setRowCount(weeks);
 
    int i = startDay-1;
    for(int day=1;day<=numberOfDays;day++){
      theModel.setValueAt(day, i/7 , i%7 );    
      i = i + 1;
    }
 
  }
 
}