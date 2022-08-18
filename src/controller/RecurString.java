//feito em conjunto com outra aluna 

package controller;

public class RecurString {
	
	public RecurString() {
		
		super();
	}
   //ponto de parada
	public String invertiString(String N, int ind ) {
		if (ind == 0) {
			return "";
		}
  //função do termo anterior
		return Npalavra ( ind-1, ind)+invertiString(N, ind - 1);
	}
}
