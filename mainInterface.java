
package datastructurepro;

 import java.awt.event.*;
 import java.awt.*;
 import javax.swing.*;

public class mainInterface extends JFrame implements ActionListener{
   static DoubleLinkedList doublyLinkedList = new DoubleLinkedList();
    Student st;
    JLabel id,fname,lname,mid,fin;
    JTextArea output=new JTextArea();
    JTextField tid,tfname,tlname,tmid,tfin,total,grade;
    JButton cancele,moreF,moreL,moreB,clear,addS,addOnceF,addOnceB,addOnceL;
    Container c;
    
    public mainInterface(){
        
     super("Main Interface");
  
     c=getContentPane();
     c.setLayout(null);
     c.setBackground(Color.GREEN);
     id=new JLabel("ID");
     fname=new JLabel("First Name");
     lname=new JLabel("Last Name");
     mid=new JLabel("Mid Term Mark");
     fin=new JLabel("Final Mark");
     id.setBounds   (20,20,100,20);
     fname.setBounds(20,60,100,20);
     lname.setBounds(20,100,100,20);
     mid.setBounds  (20,140,100,20);
     fin.setBounds  (20,180,100,20);
     tid=new JTextField();tfname=new JTextField(); tlname=new JTextField();tmid=new JTextField();tfin=new JTextField();total=new JTextField();grade=new JTextField();
     tid.setBounds(140,20,100,20);tfname.setBounds(140,60,100,20);tlname.setBounds(140,100,100,20);tmid.setBounds(140,140,100,20);tfin.setBounds(140,180,100,20);total.setBounds(70,220,100,20);grade.setBounds(180,220,100,20);
     total.setEditable(false);grade.setEditable(false);
     moreF=new JButton("More");moreB=new JButton("More");moreL=new JButton("More");cancele=new JButton("Cancele");clear=new JButton("Clere");addS=new JButton("ADD");
     addOnceF=new JButton("Add Once");addOnceB=new JButton("Add Once");addOnceL=new JButton("Add Once");
     addOnceF.setBounds(300,220,100,20);addOnceB.setBounds(300,220,100,20);addOnceL.setBounds(300,220,100,20);
     moreF.setBounds(40,260,70,20);moreL.setBounds(40,260,70,20);moreB.setBounds(40,260,70,20);clear.setBounds(130,260,70,20);cancele.setBounds(220,260,100,20);addS.setBounds(300,220,100,20);
     c.add(id);c.add(fname);c.add(lname);c.add(mid);c.add(fin);
     c.add(tid);c.add(tfname);c.add(tlname);c.add(tmid);c.add(tfin);c.add(total);c.add(grade);
     c.add(cancele);c.add(moreF);c.add(moreB);c.add(moreL);c.add(clear);c.add(addS);c.add(addOnceF);c.add(addOnceB);c.add(addOnceL);
 
     addS.setVisible(false);
     clear.addActionListener(this);
     cancele.addActionListener(this);
     moreF.addActionListener(this);
     moreB.addActionListener(this);
     moreL.addActionListener(this);
     addS.addActionListener(this);
     addOnceF.addActionListener(this);
     addOnceB.addActionListener(this);
     addOnceL.addActionListener(this);
     
//////////////////////////////////////////////////////////////////////////////////////////////////////////
     setSize(600,350);
     setVisible(true);
             setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==cancele){
            this.setVisible(false);
            Menu mn=new Menu();
            mn.setVisible(true);
        }
       else if(e.getSource()==clear){
            tid.setText(null);tfname.setText(null);
            tlname.setText(null);tmid.setText(null);
            tfin.setText(null);total.setText(null);
            grade.setText(null);
        }
       
       //////////////////////////////////////////////////////////  Add in Create item///////////////////
        if(e.getSource()==addS){
            Menu Mn=new Menu();
           Mn.setVisible(false);
                   try{
       try{
                    if(doublyLinkedList.ID(tid.getText())&&doublyLinkedList.checkname(tfname.getText())&&doublyLinkedList.checkMid(tmid.getText())&&doublyLinkedList.checkFinl(tfin.getText())){

                int x,y; 
                    x=Integer.parseInt(tmid.getText());
                    y=Integer.parseInt(tfin.getText());
                int t=x+y;
                if(t>=90)
                    grade.setText("Excellent");
                else if(t>=80)
                    grade.setText("Very Good");
                else if(t>=70)
                    grade.setText("Good");
                else if(t>=60)
                    grade.setText("Pass");
                else if(t<60)
                    grade.setText("fail");
                
                    total.setText(Integer.toString(t));    
                   JOptionPane.showMessageDialog(null,"The Total and  grade is shown");
                }
                    
                    }catch(Exception e1){
                    //JOptionPane.showMessageDialog(null, e);
                    }                
                        st=new Student(Integer.parseInt(tid.getText()),tfname.getText(),tlname.getText(),
                                    Integer.parseInt(tmid.getText()),Integer.parseInt(tfin.getText()),
                                    Integer.parseInt(total.getText()),
                                    grade.getText());       
                   }catch(Exception exception){
                       JOptionPane.showMessageDialog(null, "Please insert the required data", "Alert", JOptionPane.ERROR_MESSAGE);
                       return;
                   }
           doublyLinkedList.creatNode(st);
           Mn.checkMenue();
           this.setVisible(false);
           Mn.setVisible(true);
        }
        
        
        
       //////////////////////////////////////////////////////  More  /////////////////////////////////
       
        if(e.getSource()==moreF){
          try{
              try{
                    if(doublyLinkedList.ID(tid.getText())&&doublyLinkedList.checkname(tfname.getText())&&doublyLinkedList.checkMid(tmid.getText())&&doublyLinkedList.checkFinl(tfin.getText())){

                int x,y; 
                    x=Integer.parseInt(tmid.getText());
                    y=Integer.parseInt(tfin.getText());
                int t=x+y;
                if(t>=90)
                    grade.setText("Excellent");
                else if(t>=80)
                    grade.setText("Very Good");
                else if(t>=70)
                    grade.setText("Good");
                else if(t>=60)
                    grade.setText("Pass");
                else if(t<60)
                    grade.setText("fail");
                
                    total.setText(Integer.toString(t));    
                    JOptionPane.showMessageDialog(null,"The Total and  grade is shown");
                }
                    
                    }catch(Exception e1){
                    //JOptionPane.showMessageDialog(null, e);
                    }
                        st=new Student(Integer.parseInt(tid.getText()),tfname.getText(),tlname.getText(),
                                    Integer.parseInt(tmid.getText()),Integer.parseInt(tfin.getText()),
                                    Integer.parseInt(total.getText()),
                                    grade.getText());
              
                   }catch(Exception exception){
                       JOptionPane.showMessageDialog(null, "Please insert the required data", "Alert", JOptionPane.ERROR_MESSAGE);
                       return;
                   }
           doublyLinkedList.insertFirst(st);
           tid.setText(null);tfname.setText(null);
            tlname.setText(null);tmid.setText(null);
            tfin.setText(null);total.setText(null);
            grade.setText(null);
           }
            if(e.getSource()==moreL){
                   try{
                       try{
                    if(doublyLinkedList.ID(tid.getText())&&doublyLinkedList.checkname(tfname.getText())&&doublyLinkedList.checkMid(tmid.getText())&&doublyLinkedList.checkFinl(tfin.getText())){

                int x,y; 
                    x=Integer.parseInt(tmid.getText());
                    y=Integer.parseInt(tfin.getText());
                int t=x+y;
                if(t>=90)
                    grade.setText("Excellent");
                else if(t>=80)
                    grade.setText("Very Good");
                else if(t>=70)
                    grade.setText("Good");
                else if(t>=60)
                    grade.setText("Pass");
                else if(t<60)
                    grade.setText("fail");
                
                    total.setText(Integer.toString(t));    
                    JOptionPane.showMessageDialog(null,"The Total and  grade is shown");
                }
                    
                    }catch(Exception e1){
                    //JOptionPane.showMessageDialog(null, e);
                    }
                        st=new Student(Integer.parseInt(tid.getText()),tfname.getText(),tlname.getText(),
                                    Integer.parseInt(tmid.getText()),Integer.parseInt(tfin.getText()),
                                    Integer.parseInt(total.getText()),
                                    grade.getText());
                     
                   }catch(Exception exception){
                       JOptionPane.showMessageDialog(null, "Please insert the required data", "Alert", JOptionPane.ERROR_MESSAGE);
                       return;
                   }
           doublyLinkedList.insertLast(st);
           tid.setText(null);tfname.setText(null);
            tlname.setText(null);tmid.setText(null);
            tfin.setText(null);total.setText(null);
            grade.setText(null);
           }
            if(e.getSource()==moreB){
                   try{
                       try{
                    if(doublyLinkedList.ID(tid.getText())&&doublyLinkedList.checkname(tfname.getText())&&doublyLinkedList.checkMid(tmid.getText())&&doublyLinkedList.checkFinl(tfin.getText())){

                int x,y; 
                    x=Integer.parseInt(tmid.getText());
                    y=Integer.parseInt(tfin.getText());
                int t=x+y;
                if(t>=90)
                    grade.setText("Excellent");
                else if(t>=80)
                    grade.setText("Very Good");
                else if(t>=70)
                    grade.setText("Good");
                else if(t>=60)
                    grade.setText("Pass");
                else if(t<60)
                    grade.setText("fail");
                
                    total.setText(Integer.toString(t));    
                    JOptionPane.showMessageDialog(null,"The Total and  grade is shown");
                }
                    
                    }catch(Exception e1){
                    //JOptionPane.showMessageDialog(null, e);
                    }
                        st=new Student(Integer.parseInt(tid.getText()),tfname.getText(),tlname.getText(),
                                    Integer.parseInt(tmid.getText()),Integer.parseInt(tfin.getText()),
                                    Integer.parseInt(total.getText()),
                                    grade.getText());
                   }catch(Exception exception){
                       JOptionPane.showMessageDialog(null, "Please insert the required data", "Alert", JOptionPane.ERROR_MESSAGE);
                       return;
                   }
           doublyLinkedList.insertAfterFirst(st);
           tid.setText(null);tfname.setText(null);
            tlname.setText(null);tmid.setText(null);
            tfin.setText(null);total.setText(null);
            grade.setText(null);
           }
//////////////////////////////////////////////////////////////////////////////////////////////////////
        if(e.getSource()==addOnceF){
                   try{
                       try{
                    if(doublyLinkedList.ID(tid.getText())&&doublyLinkedList.checkname(tfname.getText())&&doublyLinkedList.checkMid(tmid.getText())&&doublyLinkedList.checkFinl(tfin.getText())){

                int x,y; 
                    x=Integer.parseInt(tmid.getText());
                    y=Integer.parseInt(tfin.getText());
                int t=x+y;
                if(t>=90)
                    grade.setText("Excellent");
                else if(t>=80)
                    grade.setText("Very Good");
                else if(t>=70)
                    grade.setText("Good");
                else if(t>=60)
                    grade.setText("Pass");
                else if(t<60)
                    grade.setText("fail");
                
                    total.setText(Integer.toString(t));    
                    JOptionPane.showMessageDialog(null,"The Total and  grade is shown");
                }
                    
                    }catch(Exception e1){
                    //JOptionPane.showMessageDialog(null, e);
                    }
                        st=new Student(Integer.parseInt(tid.getText()),tfname.getText(),tlname.getText(),
                                    Integer.parseInt(tmid.getText()),Integer.parseInt(tfin.getText()),
                                    Integer.parseInt(total.getText()),
                                    grade.getText());
                   }catch(Exception exception){
                       JOptionPane.showMessageDialog(null, "Please insert the required data", "Alert", JOptionPane.ERROR_MESSAGE);
                       return;
                   }
           doublyLinkedList.insertFirst(st);
           this.setVisible(false);
           //Mn.setVisible(true);
            }
           else if(e.getSource()==addOnceL){
                   try{
                       try{
                    if(doublyLinkedList.ID(tid.getText())&&doublyLinkedList.checkname(tfname.getText())&&doublyLinkedList.checkMid(tmid.getText())&&doublyLinkedList.checkFinl(tfin.getText())){

                int x,y; 
                    x=Integer.parseInt(tmid.getText());
                    y=Integer.parseInt(tfin.getText());
                int t=x+y;
                if(t>=90)
                    grade.setText("Excellent");
                else if(t>=80)
                    grade.setText("Very Good");
                else if(t>=70)
                    grade.setText("Good");
                else if(t>=60)
                    grade.setText("Pass");
                else if(t<60)
                    grade.setText("fail");
                
                    total.setText(Integer.toString(t));    
                    JOptionPane.showMessageDialog(null,"The Total and  grade is shown");
                }
                    
                    }catch(Exception e1){
                    //JOptionPane.showMessageDialog(null, e);
                    }
                        st=new Student(Integer.parseInt(tid.getText()),tfname.getText(),tlname.getText(),
                                    Integer.parseInt(tmid.getText()),Integer.parseInt(tfin.getText()),
                                    Integer.parseInt(total.getText()),
                                    grade.getText());
                   }catch(Exception exception){
                       JOptionPane.showMessageDialog(null, "Please insert the required data", "Alert", JOptionPane.ERROR_MESSAGE);
                       return;
                   }
           doublyLinkedList.insertLast(st);
           this.setVisible(false);
           //Mn.setVisible(true);
           }
           else if(e.getSource()==addOnceB){
                   try{
                     try{
                    if(doublyLinkedList.ID(tid.getText())&&doublyLinkedList.checkname(tfname.getText())&&doublyLinkedList.checkMid(tmid.getText())&&doublyLinkedList.checkFinl(tfin.getText())){

                int x,y; 
                    x=Integer.parseInt(tmid.getText());
                    y=Integer.parseInt(tfin.getText());
                int t=x+y;
                if(t>=90)
                    grade.setText("Excellent");
                else if(t>=80)
                    grade.setText("Very Good");
                else if(t>=70)
                    grade.setText("Good");
                else if(t>=60)
                    grade.setText("Pass");
                else if(t<60)
                    grade.setText("fail");
                
                    total.setText(Integer.toString(t));    
                    JOptionPane.showMessageDialog(null,"The Total and  grade is shown");
                }
                    
                    }catch(Exception e1){
                    //JOptionPane.showMessageDialog(null, e);
                    }
                       st=new Student(Integer.parseInt(tid.getText()),tfname.getText(),tlname.getText(),
                                    Integer.parseInt(tmid.getText()),Integer.parseInt(tfin.getText()),
                                    Integer.parseInt(total.getText()),
                                    grade.getText());
                          
                   }catch(Exception exception){
                       JOptionPane.showMessageDialog(null, "Please insert the required data", "Alert", JOptionPane.ERROR_MESSAGE);
                       return;
                   }
           doublyLinkedList.insertAfterFirst(st);
           this.setVisible(false);

           }
        }
    }

