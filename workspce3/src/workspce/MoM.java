package workspce;

class SutdaCard{
		boolean isKwang;
		int num;
		public SutdaCard() {
			num=1;
			isKwang=true;		//this(1,true)
		}
		public SutdaCard(boolean isKwang, int num) {
			this.num=num;
			this.isKwang=isKwang;
		}
		String info() {
			if(isKwang) {
				return num + "k";
			}
			else return num+"";
			
			//return num+(isKwang?"":""); 3Ç× ¿¬»êÀÚ·Î ÇØµµ´ï.
		}
	
}
	

public class MoM {
	public static void main(String[] args) {
		
		SutdaCard[] show=new SutdaCard[2];
		
		SutdaCard card1= new SutdaCard(false,3);
		SutdaCard card2= new SutdaCard();
		
		System.out.println(card1.info());//3
		System.out.println(card2.info());//±¤

	}
	
	}
