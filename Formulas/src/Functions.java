
public class Functions {
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
