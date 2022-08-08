
public class Student {
	private String hakbun,name;
	private int kor,eng,mat,edp,tot;
	private double avg;
	private char grede;

	public Student() {} //Default Constructor 기본생성자

	public Student(String hakbun, String name, int kor, int eng, int mat, int edp) { //source -generate using field
		this.hakbun = hakbun;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.edp = edp;
	}//오버로딩
//source -generate getter setter 
	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEdp() {
		return edp;
	}

	public void setEdp(int edp) {
		this.edp = edp;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public char getGrede() {
		return grede;
	}

	public void setGrede(char grede) {
		this.grede = grede;
	}

	@Override  //source -generate toString
	public String toString() {
		return String.format("%-10s%10s%5d%5d%5d5d/t/t%5d%8.2f%5c",
				hakbun, name, kor, eng, mat, edp, tot, avg, grede);
	}
	
	
	
}
