/*
 * Polymorphism의 조건
 * 1.Method's Override
 * 2.Object Cast
 *  1)Value type
 *      a.자동형변환, Implicit conversion, Promotion: 小->大
 *      b.강제형변환, Explicit conversion, Demotion:大->小 ()연산자를 사용
 *  2)Object type
 *  	a.자동형변환, Implicit conversion, Promotion: 자식이 부모로 형변환 (항상성공)
 *  	b.강제형변환, Explicit conversion, Demotion:부모가 자식으로 형변환:강제적만 가능하며, 될 때가 있고 안 될 때가 있다.
 */
public class PolymorphismDemo {//다형성
		public static void main(String[] args) {
			Test t = new Demo(); //자식은 부모의 주소를 받을 수 있다.
			
//			Test t= new Test();
//			Demo d = new Demo();
//			if(t instanceof Demo) {//부모객체가 자식객체로 형변환이 가능한지 여부 : instanceof
//				d= (Demo)t;
//			}
//			else {
//				System.out.println("형변환 불가능");
//			}
		}

}

class Test{} //부모
class Demo extends Test{} //자식
