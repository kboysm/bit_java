package day17;
//예외처리 클래스는 반드시 ~~익셉션을 상속받아야 함 
public class PriceException extends Exception{
	public PriceException() {super("priceException : 음수 ㄴㄴ");}
	public PriceException(String msg) {
		super(msg);
	}

}
