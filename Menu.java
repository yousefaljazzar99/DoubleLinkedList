
package datastructurepro;

 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Menu extends JFrame implements ActionListener,MenuListener{
    Student st;
    JMenuBar mb;
    JTextArea output=new JTextArea();
    JMenu add,delet,print,exit;
    JMenuItem creat,insertatFits,insetrAfterFirst,insertLast,dFromHead,dAfterFirst,dLast,pSorted,pUnSorted;
    Container c;
    JButton d;
    
    
    public Menu(){
    	super("Data Structure Project");
        c=getContentPane();
        c.setBackground(Color.black);
        c.add(mb=new JMenuBar(),BorderLayout.NORTH);
        mb.add(add=new JMenu("ADD"));
        mb.add(delet=new JMenu("Delete"));
        mb.add(print=new JMenu("Print"));
        mb.add(exit=new JMenu("Exit"));
        add.add(creat=new JMenuItem("Create"));
        add.add(insertatFits=new JMenuItem("insert at Fits"));
        add.add(insetrAfterFirst=new JMenuItem("insert After First"));
        add.add(insertLast=new JMenuItem("insert Last"));
        delet.add(dFromHead=new JMenuItem("delete From Head"));
        delet.add(dAfterFirst=new JMenuItem("delete After First"));
        delet.add(dLast=new JMenuItem("dLast"));
        print.add(pSorted=new JMenuItem("print Sorted"));
        print.add(pUnSorted=new JMenuItem("print UnSorted"));
        
     //////////////////////////////////////////////////////////  make the item enabel or not ////////////////////////
        checkMenue();
////////////////////////////////////////////////////////////////////////////
        creat.addActionListener(this);
        insertatFits.addActionListener(this);
        insetrAfterFirst.addActionListener(this);
        insertLast.addActionListener(this);
        dFromHead.addActionListener(this);
        dLast.addActionListener(this);
        dAfterFirst.addActionListener(this);
        pSorted.addActionListener(this);
        pUnSorted.addActionListener(this);
        exit.addMenuListener(this);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    //////////////////////////////////////////////////// Action  Listener//////////////////////////////
    @Override
     public void actionPerformed(ActionEvent e){
     	if(e.getSource()==creat){
     	   mainInterface mi=new mainInterface();
           this.setVisible(false);
           mi.moreF.setVisible(false);mi.moreB.setVisible(false);mi.moreL.setVisible(false);
           mi.addS.setVisible(true);
           mi.addOnceF.setVisible(false);mi.addOnceB.setVisible(false);mi.addOnceL.setVisible(false);
           }
       
        ///////////////////////////////////////////  insert at first  ///////////////////////////////////
        
         if(e.getSource()==insertatFits){mainInterface mi=new mainInterface();//this.setVisible(false);
         mi.addOnceB.setVisible(false);mi.addOnceL.setVisible(false);mi.moreB.setVisible(false);mi.moreL.setVisible(false);
         }
     	
     	///////////////////////////////////////////// insert after first  ////////////////////////////////
     	 if (e.getSource()==insetrAfterFirst){mainInterface mi=new mainInterface();//this.setVisible(false);
         //doublyLinkedList.insertAfterFirst(st);
         mi.moreF.setVisible(false);mi.moreL.setVisible(false);mi.addOnceF.setVisible(false);mi.addOnceL.setVisible(false);
         }

/////////////////////////////////////////////// insert Last  //////////////////////////////////////////////
         if (e.getSource()==insertLast){mainInterface mi=new mainInterface();//this.setVisible(false);
         //doublyLinkedList.insertLast(st);
         mi.moreF.setVisible(false);mi.moreB.setVisible(false);mi.addOnceF.setVisible(false);mi.addOnceB.setVisible(false);
         }
//////////////////////////////////////////////////////// delet  from head//////////////////////////////////////
         if(e.getSource()==dFromHead){
            mainInterface.doublyLinkedList.removeFirst();
            checkMenue();
            JOptionPane.showMessageDialog(null,"Deleted is Compleat");
        }
        ///////////////////////////////////////////  delet from last  ///////////////////////////////
        else if(e.getSource()==dLast){
            mainInterface.doublyLinkedList.removeLast();
            checkMenue();
            JOptionPane.showMessageDialog(null,"Deleted is  Compleat");

        }
        else if(e.getSource()==dAfterFirst){
            mainInterface.doublyLinkedList.removeAfterfirst();
            checkMenue();
            JOptionPane.showMessageDialog(null,"Deleted is  Compleat");
        }
         if(e.getSource()==pUnSorted){
             				
            // System.out.println(doublyLinkedList.printUnSorted());
             output.setText("Id\tFName\tLName\tMid\tFinal\tTotal\tGrade\n");
				output.append(mainInterface.doublyLinkedList.printUnSorted());
				JOptionPane.showMessageDialog(null,output);
         }
         else if(e.getSource()==pSorted){
             output.setText("Id\tFName\tLName\tMid\tFinal\tTotal\tGrade\n");
				output.append(mainInterface.doublyLinkedList.printSorted());
				JOptionPane.showMessageDialog(null,output);
         }
         
     }
     //////////////////////////////////////////////////// Menu Listener  /////////////////////////////////////
     
    @Override
     public void menuSelected(MenuEvent me) {
        if(me.getSource()==exit){
            System.exit(0);
        }
    }

    @Override
    public void menuDeselected(MenuEvent me) {}

    @Override
    public void menuCanceled(MenuEvent me) {}
    
    public void checkMenue(){
        if(mainInterface.doublyLinkedList.isEmbty()){
        creat.setEnabled(true);
        insertatFits.setEnabled(false);
        insetrAfterFirst.setEnabled(false);
        insertLast.setEnabled(false);
        delet.setEnabled(false);
        print.setEnabled(false);
     }
             else{
                 creat.setEnabled(false);
        insertatFits.setEnabled(true);
        insetrAfterFirst.setEnabled(true);
        insertLast.setEnabled(true);
        delet.setEnabled(true);
        print.setEnabled(true);
             }
    }
}
