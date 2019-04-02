
package datastructurepro;

import javax.swing.JOptionPane;

public  class DoubleLinkedList {
    private ListNode FirstNode;
	private ListNode LastNode;
	private int length;
        
 public DoubleLinkedList(){
	this.FirstNode=null;
	this.LastNode=null;
	this.length=0;
}
 
 public boolean isEmbty(){
	return length==0; //Or/ FirstNode==0;
}
public int length(){
	return length;
}
//////////////////////////////////////////////////////////////////// insert First /////////////
public void creatNode(Student st){
    ListNode newNode = new ListNode(st);
	if(isEmbty()){
		LastNode = newNode;
	}
	else{
		FirstNode.prev=newNode;
	}
	newNode.next=FirstNode;
	FirstNode = newNode;
	length++;
	System.out.println("adding: " + mainInterface.doublyLinkedList.FirstNode.st.print());
}
public void insertFirst(Student st){
	ListNode newNode = new ListNode(st);
	FirstNode.prev=newNode;
        newNode.next=FirstNode;
        FirstNode=newNode;
	length++;
	System.out.println("adding: " + mainInterface.doublyLinkedList.FirstNode.st.print());
	
}

///////////////////////////////////////////////////// insert last /////////////////////////////////////
public void insertLast(Student st) {
         
        ListNode tmp = new ListNode(st);
        if(LastNode != null) {LastNode.next = tmp;}
        LastNode = tmp;
        if(FirstNode == null) { FirstNode = tmp;}
        length++;
        System.out.println("adding: "+st.print());
    }
///////////////////////////////////////////////////// insert after first ////////////////////////////
public void insertAfterFirst(Student st) {
    if(length==1){
        ListNode newNode =new ListNode(st);
        newNode.prev=FirstNode;
        FirstNode.next=newNode;
        ++length;
        System.out.println("adding: "+st.print());
    }
    else if(length>1){
        ListNode newNode=new ListNode(st);
        		newNode.next=FirstNode.next;
		newNode.prev=FirstNode;
		FirstNode.next.prev=newNode;
		FirstNode.next=newNode;
        length++;
        System.out.println("adding: "+st.print());
    }
    
    }

/////////////////////////////////////////////////// print unsort ///////////////////////////////////////////////////

public  String printUnSorted(){
    String s="";
  
    ListNode temp = FirstNode;
    while(temp != null){
        s += temp.st.print()+"\n";
        //JOptionPane.showMessageDialog(null, "test", s, JOptionPane.ERROR_MESSAGE);
        temp = temp.next;
    }
    
    
    return s;
}


////////////////////////////////////////////////////////// print Sorted  ///////////////////
public String printSorted(){
    String s="";
 ListNode n=null;
 ListNode p=FirstNode;
 Student temp;
 while(p!=null){
     n=p.next;
     while(n!=null){
         if(p.st.getId()<n.st.getId()){
             temp=p.st;
             p.st=n.st;
             n.st=temp;
         }
         n=n.next;
     }
    s+=p.st.print()+"\n";
    p=p.next;
     
 }
 
  return s;
}
///////////////////////////////////////////////////////// Remove First //////////////////////////////////////////////////////////////
    public void  removeFirst() {
        ListNode tmp = FirstNode;
        if(FirstNode==null)
        	return;
        if(FirstNode.next==null){
        	FirstNode=null;
        	LastNode=null;
        }
        else{
        	tmp=FirstNode.next;
        	FirstNode.next=null;
        	tmp.prev=null;
        	FirstNode=tmp;
        }
        length--;
        
    }
    ///////////////////////////////////////////////////// remove after first  //////////////////////////
    public void removeAfterfirst(){
    	if(FirstNode==null)
    		return;
    		if(FirstNode.next==null)
    			return;
    			ListNode temp=FirstNode.next;
    			if(FirstNode.next.next==null){
    				LastNode=FirstNode;
    				FirstNode.next.prev=null;
    				FirstNode.next=null;
    			}
    			else{
    				FirstNode.next.prev=null;
    				FirstNode.next=FirstNode.next.next;
    				FirstNode.next.prev=FirstNode;
    				temp.next=null;
    			}
    			length--;
    			
    }
    //////////////////////////////////////////////////////  Remove Last /////////////////////////////////////////////////////////////
    public void  removeLast() {
    ListNode temp;
    	if(FirstNode==null)
    		return;
    		else{
            for (temp = this.FirstNode; temp.next.next != null;temp = temp.next) {}
            temp.next = null;
        }
        length--;
    }  

 
boolean checkname(String name ) {
        int i = 0;
        while (i < name.length()) {
            char c = name.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <='Z')) {
                ++i;
            } else {
                JOptionPane.showMessageDialog(null, "the name is not correct plz try agan");
                return false;
            }
        }
		
        return true;
	}
	


	boolean ID(String id) {

        ListNode el = FirstNode;

        if (id.matches("[0-9]+")) {
            int id1 = Integer.parseInt(id);
            if (id1 > 0) {
                while (el != null) {
                    if (id1 == el.st.getId()) {
                        JOptionPane.showMessageDialog(null, "the ID is same plz try agan");
                        return false;
                    }
                    el = el.next;
                }
                return true;
            }
            JOptionPane.showMessageDialog(null, "the ID is Negtive1 plz try agan");

            return false;
        }
        JOptionPane.showMessageDialog(null, "the ID is not correct plz try agan");
        return false;

        }
        
	boolean checkMid(String mid){
		if(mid.matches("[0-9]+")){
		int mid1=Integer.parseInt(mid);
				if((mid1>=0)&&(mid1<=60)){
				return true ;
				}
				JOptionPane.showMessageDialog(null, "the MID is betwen 0 to 60");
        return false;
		}
		JOptionPane.showMessageDialog(null, "the MID is not true plz try agan");
        return false;
	}
        
        boolean checkFinl(String fina){
		if(fina.matches("[0-9]+")){
		int final1=Integer.parseInt(fina);
				if((final1>=0)&&(final1<=40)){
				return true ;
				}
				JOptionPane.showMessageDialog(null, "the FINAL is betwen 0 to 40");
        return false;
		}
		JOptionPane.showMessageDialog(null, "the FINAL is not true plz try agan");
        return false;
	}
  }
