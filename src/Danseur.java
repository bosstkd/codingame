
public class Danseur {

	
	public static void main(String[] args) {
		
		Danseur d = new Danseur();
		
		System.out.println(d.getPositionAt(100000));
		
	}
	
	
	public int getPositionAt(int n) {
		
		if(n<0 || n>2147483647) throw new IllegalArgumentException("La regle: (0 <= n <= 2147483647) n'ai pas respecter.");
		if(n==0) return 0;
		if(n==1) return 1;
		else if(n==2){
		     return -1;
		}else {
			int nbPas= 0;
			int pasN = -2;
			int pasN_1 = 1;
			int position = -1;
			for(int i=3; i<=n; i++) {
				System.out.println("pn "+pasN+", pn-1 "+pasN_1+", pos "+position);
				nbPas=pasN-pasN_1;
				position = position+nbPas;
				pasN_1 = pasN;
				pasN=nbPas;
			}
			
			return position;
		}

	}
	
	
	
	
}
