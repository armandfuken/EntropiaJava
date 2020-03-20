import java.awt.*;
public class main{
	public static void main(String []args){
		double a=0;
		double b=120;
		double c=190;
		double d=190;
		double x=160;
		//triangular(x,a,b,c);
		 //double zzz = trian(x,a,b,c);
		System.out.println("Triangular   "+triangular(x,a,b,c));
		
		System.out.println("Trapezoide   "+trapezoidal(x,a,55,137,d));
	
        System.out.println("Gausiana   " + gaussian(24,5,15));
        
        System.out.println("Generalized   "+generalized(24,5,15));

        System.out.println("Generalized2   " + generalizedB(24,5,15));
        
        Ventana ventana = new Ventana();
        ventana.setVisible(true);
        
	}
	public static double triangular(double x, double a, double b, double c){
	return Math.max(Math.min( (x-a)/(b-a),(c-x)/(c-b) ),0 );
	//return 1.0;
	}

	public static double trapezoidal(double x, double a, double b, double c, double d){
	return Math.max(    Math.min( Math.min( (x-a)/(b-a),(d-x)/(d-c)),1)         ,0 );
	}

	public static double gaussian(double x, double b, double c){
        double ca= (x-c) / b;
        double ce= Math.pow(ca,2);
        double ci= -0.5 * ce;
        //return Math.exp ();	
        double res = Math.exp(ci);
        return res;
    }
	public static double generalized(double x, double b, double c){
	return 1/ (1 + Math.pow( (x-c)  / b,2));
	
	}
	public static double generalizedB(double x, double b, double c){
	//return 1.1;
	//return 1 / ( 1 + abs((x-c)/b)**2*b);
	double ex=2*b;
	double ab= Math.abs( (x-c)/b);
    return (1 + Math.pow( ab , ex ));
    //return 1/ (1 + Math.pow( ab , ex ));
	}
}


