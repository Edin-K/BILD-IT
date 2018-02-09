
public class Fbn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonnaci();

	}
	
	public static void fibonnaci() {
		 int fiBrojac = 12;
         int[] fi = new int[fiBrojac];
         fi[0] = 0;
         fi[1] = 1;
         for(int i=2; i < fiBrojac; i++){
             fi[i] = fi[i-1] + fi[i-2];
         }
 
         for(int i=0; i< fiBrojac; i++){
                 System.out.print(fi[i] + " ");
         }
		}
	}



