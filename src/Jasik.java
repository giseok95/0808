
public class Jasik extends Bumo {
	@Override
	 public void makeMoney() { //부모보다 접근제한자가 높아야 된다.
		System.out.println("나는 자식의 메소드입니다.");
	}
}
