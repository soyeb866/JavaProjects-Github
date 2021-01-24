package study.advance.DataStructure.Generics;

class data5<T extends Comparable<T>> implements Comparable<T>{
	private T myVariable;

	public data5(T myVariable) {
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "data5 [myVariable=" + myVariable + "]";
	}

	@Override
	public int compareTo(T o) {
		return o.compareTo(getMyVariable());
	}
	
}

public class ComparableInterface {

	public static void main(String[] args) {
		data5<Integer> obj = new data5<>(1);	
		System.out.println(obj.compareTo(1));		
	}

}
