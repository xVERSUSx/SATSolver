package satSolver;

/**
 * @authors Alberto Sabater Bailon, 546297
 * 			Victor Sanchez Ballabriga, 602665
 */
public class Literal implements Cloneable{

	public String literal;
	public boolean isNegative;

	/**
	 * Constructor with a String
	 */
	public Literal (String var) {
		if(var.contains("-")){
			this.isNegative = true;
			this.literal = var.substring(1,var.length());
		}else{
			this.isNegative = false;
			this.literal = var;
		}
	}
	
	/**
	 * Constructor with explicit arguments
	 */
	public Literal (String literal, boolean isNegative) {
		this.literal = literal;
		this.isNegative = isNegative;
	}
	
	public String getLiteral() {
		return literal;
	}

	public void setLiteral(String literal) {
		this.literal = literal;
	}

	public boolean isNegative() {
		return isNegative;
	}

	public void setNegative(boolean isNegative) {
		this.isNegative = isNegative;
	}

	@Override
	public String toString() {
		if(isNegative){
			return "-" + literal;
		}else{
			return "" + literal;
		}
	}
	
	public boolean equals (Literal l) {
		if(literal.equals(l.getLiteral()) && isNegative == l.isNegative()){
			return true;
		}else{
			return false;
		}
	}

}
