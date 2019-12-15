import java.awt.FontMetrics;

public class Alphabet {

	
	public static void main(String[] args) {
		Alphabet aa = new Alphabet();
		/*
		 String str = 	  " # "+"\n";
				str =str+ "# #"+"\n";
				str =str+ "###"+"\n";
				str =str+ "# #"+"\n";
				str =str+ "# #";
		
	 String str = "##"+"\n";
		str =str+ "# #"+"\n";
		str =str+ "## "+"\n";
		str =str+ "# #"+"\n";
		str =str+ "## ";		
		   
		   System.out.println("Le caractere est : "+aa.caracter(str));		
	*/	
    String      str = "  #"+"\n";
			str =str+ "  #"+"\n";
			str =str+ "# #"+"\n";
			str =str+ "# #"+"\n";
			str =str+ " #";		
				
	   System.out.println("Le caractere est : "+aa.caracter(str));
		
	}
	
	
	public char caracter(String chaine) {
		
		char str[][] = new char [3][5];
		int ligne = 0;
		int position = 0;
		for(int i=0; i<chaine.length(); i++) {
			if(chaine.charAt(i)=='\n') {
				ligne++;
				position = 0;
				System.out.println("");
			}
			else 
			{
				System.out.print(chaine.charAt(i));
			 	str[position][ligne]=chaine.charAt(i);
			 	position++;
			}
		}
		System.out.println("\n");
		
		int valeur = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				if(str[i][j]=='#') {
					valeur =  valeur + (int) Math.pow(i+1, j+1);
				}
			}
		}
		
		System.out.println(valeur);
		
		switch(valeur) {
		          case 374:return 'A';
		          case 137:return 'B';
		          case 283:return 'C';
		          case 156:return 'D';
		          
		          case 320:return 'E';
		          case 45 :return 'F';
		          case 391:return 'G';
		          case 376:return 'H';
		          case 62 :return 'I';
		          case 154:return 'J';
		          
		}
		
		
		return '0';
	}
	
}
