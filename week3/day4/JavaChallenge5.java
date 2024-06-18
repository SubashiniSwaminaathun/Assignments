package week3.day4;


public class JavaChallenge5 {

	public static void main(String[] args) {
		
		int inp=19,rem1,rem2=0,rem3=0,rem4=0,rem5=0,num1,num2,num3=0,tot;
		
	while(inp>1) {
			rem1=inp%10;
			//System.out.println("Rem1 : "+rem1);
			rem2=inp/10;
			if(rem2>=10) {
				rem4=rem2%10;
				rem5=rem2/10;
				num2=(rem4*rem4);
				//System.out.println("Num2 :"+num2);
			}
			else {
				num2=rem2*rem2;
				//System.out.println("Num2 :"+num2);
			}
			//System.out.println("Rem2 : "+rem2);
			if(inp>=100) {
				rem3=rem2/10;		
			}
			//System.out.println("Rem3 : "+rem3);
			
			num1=rem1*rem1;
			//System.out.println("Num1 :"+num1);
			
			
			num3=rem3*rem3;
			//System.out.println("Num3 :"+num3);
			tot=num1+num2+num3;
			//System.out.println("Total : "+tot);
						
			inp=tot;
			//System.out.println("INPUT : "+inp);
			
			
	}
		if(inp==1) {
			System.out.println("Happy number");
		}
		else {
			System.out.println("Not happy number");
		}
	}

}
