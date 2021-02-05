package study.advance.DataStructure.collection.util;


class Code<K,V> implements Comparable<Code<K,V>>{
	private Integer codeNo;
	private String codeName;
	
	public Code() {
	}
	
	public Code(Integer codeNo, String codeName) {
		this.codeNo = codeNo;
		this.codeName = codeName;
	}

	public Integer getCodeNo() {
		return codeNo;
	}

	public void setCodeNo(Integer codeNo) {
		this.codeNo = codeNo;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	@Override
	public String toString() {
		return "Code [codeNo=" + codeNo + ", codeName=" + codeName + "]";
	}

	@Override
	public int compareTo(Code<K,V> o) {
		String code1 = codeNo.toString().concat(codeName);
		String code2 = o.getCodeNo() + o.getCodeName();
		return code1.compareTo(code2);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeName == null) ? 0 : codeName.hashCode());
		result = prime * result + ((codeNo == null) ? 0 : codeNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code<K,V> other = (Code<K,V>) obj;
		if (codeName == null) {
			if (other.codeName != null)
				return false;
		} else if (!codeName.equals(other.codeName))
			return false;
		if (codeNo == null) {
			if (other.codeNo != null)
				return false;
		} else if (!codeNo.equals(other.codeNo))
			return false;
		return true;
	}
	
	
	
	
}

public class HashCodeEqualMethod {

	public static void main(String[] args) {
		//String name1 = "Soyeb";
		//String name2 = "Soyeb";		
		//System.out.println(name1==name2); //return true
		
//		
//		String name1 = new String("Soyeb");
//		String name2 = new String("Soyeb");
//		
//		System.out.println(name1==name2); //return false
//		
//		System.out.println(name1.hashCode() + " " + name2.hashCode()); //return same hash code
//		
//		System.out.println(name1.equals(name2)); //return true
		
		Code<Integer,String> code1 = new Code<>(1, "Soyeb");
		Code<Integer,String> code2 = new Code<>(1, "Soyeb");
		
		System.out.println(code1.hashCode() + " " + code2.hashCode()); // return different hashcode
		
		System.out.println(code1.equals(code2)); //returns false

	}

}
