 
package datastructurepro;

public class Student {
   public int id;
   public String fname;
   public String lname;
   public int mid;
   public int fi;
   public int total;
   public String grade;
   
   public Student(int id,String fname,String lname,int mid,int fi,int total,String grade){
       this.id=id;
       this.fname=fname;
       this.lname=lname;
       this.mid=mid;
       this.fi=fi;
       this.total=total;
       this.grade=grade;
   }

    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getFname() {
        return fname;
    }

    
    public void setFname(String fname) {
        this.fname = fname;
    }

    
    public String getLname() {
        return lname;
    }

   
    public void setLname(String lname) {
        this.lname = lname;
    }

   
    public int getMid() {
        return mid;
    }

  
    public void setMid(int mid) {
        this.mid = mid;
    }

  
    public int getFi() {
        return fi;
    }

    
    public void setFi(int fi) {
        this.fi = fi;
    }

   
    public int getTotal() {
        return total;
    }

    
    public void setTotal(int total) {
        this.total = total;
    }

   
    public String getGrade() {
        return grade;
    }

   
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    public String print(){
    	String s=" "; 
  		s+=getId()+"\t"+getFname()+"\t"+getLname()+"\t"+getMid()+"\t"+getFi()+"\t"+getTotal()+"\t"+getGrade(); 
     	return s;
} 
}
