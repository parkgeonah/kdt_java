package accessModifier01;
//7번 : 접근 제한자
public class SamePackge {

	// 다른 클래스
	public void printAccess() {
	Parents  p = new Parents();
	System.out.println(p.defaultVar);
	System.out.println(p.protectedVar);
	System.out.println(p.defaultVar);
//	System.out.println(p.priaviteVar);
//	같은 패키지 내 다른 클래스에서  private 접근 제한자의 필드 접근 불가
		}
	}
	

