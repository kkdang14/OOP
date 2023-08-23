package JavaBasic;

import java.lang.NumberFormatException;

public class CommandLine {
	public static void main(String[] args) {
		int i;
		double tmp;
		double S = 0.0, M = 0.0;
		for(i=0; i<args.length; i++) {
			try {
				tmp = Double.parseDouble(args[i]);
			}
			catch(NumberFormatException e){
				continue;
			}
			S += tmp;
			M = tmp;
			i++;
			break;
		}
		for(; i<args.length; i++) {
			try {
				tmp = Double.parseDouble(args[i]);
			}
			catch(NumberFormatException e){
				continue;
			}
			S+= tmp;
			if(tmp > M)
				M = tmp;
		}
		System.out.print(M + " " + S);
	}       	
}