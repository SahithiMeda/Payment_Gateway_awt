import java.util.*;
import java.util.Map.Entry;    
class DATA { 

 int Card_Number[]=new int[3];
 int Grocery,Shopping,Medical,Bill,CVV;  
int number;
int  rec=0;
String password;
int gift;
static Map<String,DATA> map=new HashMap<String,DATA>();
int capacity=0;
 int count1;
 int count2;
static String S[][];
public DATA(String password,int []Card_Numbers, int CVV, int Grocery,int Shopping, int Medical, int Bill,int rec,String [][]St,int counts,int gift,int count) {    
        this.gift=gift;
	this.password=password;
	this.rec=rec;
	S=St;
	this.count1=counts;
	this.count1=counts;
	for(int i=0;i<3;i++) {
		if(Card_Numbers[i]!=0) {
	Card_Number[i] = Card_Numbers[i];
	capacity++;
		}
	}
    this.Grocery = Grocery;    
    this.Shopping = Shopping;    
    this.Bill=Bill;
    this.Medical = Medical;    
    this. CVV =  CVV;    
}   
static void Scratch (String A,int B) {
	
	for(Entry<String, DATA> entry:map.entrySet()){    
	       String key=entry.getKey();  
	        DATA b=entry.getValue(); 
	        if(key.contentEquals(A) ) {
	        	
	        	b.rec=b.rec+B;
	        	
	        }
	}
}
	        
static int filled (String A) {
	int c=0;
	for(Entry<String, DATA> entry:map.entrySet()){    
	       String key=entry.getKey();  
	        DATA b=entry.getValue();  
	        if(key.contentEquals(A) ) {
	        	c= b.capacity;    
	        	break;
	        	
	        	}
	        }
	    return c;		
}
static Boolean Check_Key(String A) {
	for(Entry<String, DATA> entry:map.entrySet()){    
	       String key=entry.getKey();  
	       if(key.contentEquals(A)) {
	    	   return true;
	    	   }
	       }
	return false;
	
}

static void newLoad(String A,String B) {
	int Array[]= {0,0,0};
	int count=0;
	String S[][]=new String [10][4];
	DATA b1=new DATA(B,Array,0,0,0,0,0,0,S,count,0,0); 
	map.put(A,b1);  
	
}
 static void Load() {
	 int count=0;
	 String S[][]=new String [10][4];
    //Creating Books    
	int Array1[]= {101000000,0,0};
	int Array2[]= {101000000,1010002300,0};
	int Array3[]={101000000,1010002300,1010002311};
	int Array4[]= {12345600, 12345670, 12345678};
	int Array5[]= {123456009, 123456709, 123456789};
	int Array6[]= {92345600, 92345670, 92345678};
    DATA b1=new DATA("JAVAPROJECT",Array1,111,1000,5000,500,2500,2000,S,count,0,0);    
    DATA b2=new DATA("hello",Array2,111,1200,4000,1000,1000,1500,S,count,0,0);    
    DATA b3=new DATA("hello",Array1,111,1200,4000,500,2500,500,S,count,0,0);    
    DATA b4=new DATA("Sahithi",Array3,111,1200,4000,500,2500,1000,S,count,0,0);   
    DATA b5=new DATA("Apoorva", Array4, 987, 2000,1500,0,3000, 1000,S,count,0,0);
    DATA b6=new DATA("Naimisha", Array5, 654, 2500,3000,1000,0, 1000,S,count,0,0);
    DATA b7=new DATA("Kiara", Array6, 321,2345,4567,6789,1234,1000,S,count,0,0);
    //Adding Books to map   
    map.put("Sahithi",b1);  
    map.put("Anitha",b2);
    map.put("Suresh",b4); 
    map.put("Apoorva",b3); 
    map.put("Rahul",b5);
    map.put("Divya",b6);
    map.put("Alia",b7);
}
 static void Rc(String A,int B) {
	 for(Entry<String, DATA> entry:map.entrySet()){    
	       String key=entry.getKey();  
	        DATA b=entry.getValue();  
	        if(key.contentEquals(A) ) {
	        	
	        	b.rec=b.rec+B;
	        }
	 }
 }
 static void ADD(String A,int card) {
	 for(Entry<String, DATA> entry:map.entrySet()){    
	       String key=entry.getKey();  
	        DATA b=entry.getValue();  
	        if(key.contentEquals(A) ) {
	        	b.Card_Number[b.capacity]=card;
	        	b.capacity=b.capacity+1;
	        }
	        	
	        }
	 
 }
 static void change(String key,int a) {
	 if(a!=0) {
	 for(Entry<String, DATA> entry:DATA.map.entrySet()){
		 
		 String KEY=entry.getKey();  
		 DATA b=entry.getValue();
		 int A[]= {b.Card_Number[0],b.Card_Number[1],b.Card_Number[2]};
	        if(KEY.contentEquals(key) ) {
	    for ( int i=0;i<3;i++) {
     	if(b.Card_Number[i] ==a ) {
     		A[i]=0;
     		b.capacity=b.capacity-1;
     		DATA b1=new DATA(b.password,A,b.CVV,b.Grocery,b.Medical,b.Shopping,b.Bill,b.rec,b.S,b.count1,b.count2,b.gift);  
     		 map.put(key, b1);
     	}
     		 
     	}
     		
     	
	        }}
	 }
	 
 }
 static void IOU(String A,String B[]) {
	 for(Entry<String, DATA> entry:map.entrySet()){  
		
	       String key=entry.getKey();  
	        DATA b=entry.getValue();  
	        if(key.contentEquals(A)){
	        	
	        	
	         int a=b.count1;
	         System.out.println(a);
	         for(int j=0;j<2;j++) {
	        	 b.S[a][j]=B[j];
	        	
	         }
	       
	        }}
	
 }
 static void UOME(String A,String B[]) {
	 for(Entry<String, DATA> entry:map.entrySet()){  
		 System.out.println("enterer");
	       String key=entry.getKey();  
	        DATA b=entry.getValue();  
	        if(key.contentEquals(A)){
	        	
	         int a=b.count2;
	         for(int j=2;j<4;j++) {
	        	 b.S[a][j]=B[j];
	         }
	         b.count2=b.count2+1;
	         DATA C=new DATA(b.password,b.Card_Number,b.CVV,b.Grocery,b.Shopping,b.Medical,b.Bill,b.rec,b.S ,b.count1,b.count2,b.gift);
	         map.replace(key,C);
	         
	        }}
	
 }
 static Boolean check_LOGIN (String A,String B) {
	 int c=0;
	 for(Entry<String, DATA> entry:map.entrySet()){    
	       String key=entry.getKey();  
	        DATA b=entry.getValue();  
	        if(key.contentEquals(A) && b.password.contentEquals(B)) {
	        	c=1;
	        	break;
	        	}
	        }
	 
	 if(c==1)
	     return true;
	 else
		 return false;
	 
	 
 }
  
public static void main(String[] args) {    
    //Creating map of Books    
    
      Load();
      newLoad("app", "apps");
    //Traversing map  
//    for(Entry<String, DATA> entry:map.entrySet()){    
//       String key=entry.getKey();  
//        DATA b=entry.getValue();  
//        change("Anitha",101000000);
//        System.out.println(key+" Details:");  
//        System.out.println(b.password+" "+b.Card_Number[0]+" "+b.Grocery+" "+b.Shopping+" "+b.Medical);   
      
    } 
String[]A= {"a","100","b","12"};

       
 
}    
