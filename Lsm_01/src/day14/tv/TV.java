package day14.tv;

interface TV {
void powerOn();
void powerOff();
}

class STV implements TV{
	public void powerOn() {
		System.out.println("STV on");
	}
		public void powerOff() {
			System.out.println("STV off");
	}
		}

class LTV implements TV{
	public void powerOn() {
	System.out.println("LTV on");	
	}
	public void powerOff() {
		System.out.println("LTV off");	
	}
	
}
class ITV implements TV{
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
	System.out.println("ITV off");	
	}@Override
	public void powerOn() {
		// TODO Auto-generated method stub
	System.out.println("ITV on");	
	}
}