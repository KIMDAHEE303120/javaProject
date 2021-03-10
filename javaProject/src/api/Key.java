package api;
//hashcode() 메소드

public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	//해시코드의 메소드를 Key클래스에 추가해야 KeyExample에서 읽을때 'new key(1)'의 값이 저장한 'new key(1)'의 값과 같아짐 
	@Override
	public int hashCode() {
		return number;
	}

}
