import java.awt.Color;
public class LogicaRGB {
	private int r;
	private int g;
    private int b; 
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}
    public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void setColores(int r,int g,int b){
        this.r = r; 
        this.g = g; 
        this.b = b; 
    }
	public Color insertarcolores(){
        return new Color(r,g,b);


    }
	public void limpiar() {
		this.r = 0;
		this.g = 0;
		this.b = 0;
		
	}


}
