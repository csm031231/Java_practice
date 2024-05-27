package chap5;
abstract class PainMap{
	protected String keyArray [];
	protected String valueArray [];
	 abstract String get(String key);
	   abstract void put(String key, String value);
	   abstract String delete(String key);
	   abstract int length();
	}

class Dictionary extends PainMap{
	   
   protected int size;
	   
   public Dictionary(int size) {
      super.keyArray=new String[10];
      super.valueArray=new String[10];
      this.size=size;
   }
	   
   String get(String key) {
      int i;
      for(i=0; i<this.size; i++) 
         if(key.equals(super.keyArray[i])) 
            return super.valueArray[i];
      return null;	      
   } 
   void put(String key, String value) {
      int i;
      for(i=0; i<this.size; i++) {
         if(key.equals(super.keyArray[i])) {
            super.valueArray[i]=value;
            break;
         }
         else if(super.keyArray[i]==null) {
            super.keyArray[i]=key;
            super.valueArray[i]=value;
            break;
            }	      
         }
      }
   String delete(String key) {
      int i=0;
      String temp = null;
      
      for(i=0;i<this.size;i++) {
         if(super.keyArray[i].equals(key)) {
            temp=super.valueArray[i];
            super.keyArray[i]=null;
            super.valueArray[i]=null;
            break;
         }
      }
      return temp;
   }
   int length() {
      int count=0;
      for(int i=0; i<this.size; i++) {
         if(super.keyArray[i]!=null)
            count++;
      }
      return count;
   }
	   
}

public class num10 {
	 public static void main(String[] args) {
	      Dictionary dic=new Dictionary(10);
	      dic.put("황기태", "자바");
	      dic.put("이재문","파이선");
	      dic.put("이재문","C++");
	      System.out.println("이재문의 값은 "+dic.get("이재문"));
	      System.out.println("황기태의 값은 "+dic.get("황기태"));
	      dic.delete("황기태");
	      System.out.println("황기태의 값은 "+dic.get("황기태"));
	   }
}
