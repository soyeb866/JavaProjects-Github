package study.advance.DataStructure.map;

import java.util.Map;
import java.util.TreeMap;

/*
How to initialize TreeMap and assign to Map interface
*/


class CodeName<K,V> implements Comparable<CodeName<K,V>>{
	private Integer codeNo;
	private String codeName;
	
	public CodeName() {
	}
	
	public CodeName(Integer codeNo, String codeName) {
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
	public int compareTo(CodeName<K,V> o) {
		String code1 = codeNo.toString().concat(codeName);
		String code2 = o.getCodeNo() + o.getCodeName();
		return code1.compareTo(code2);
	}
}

public class TreeMapL1 {

	public static void main(String[] args) {
		
		Map<CodeName<Integer, String>, String> treeMap = new TreeMap<>();
		treeMap.put(new CodeName<Integer,String>(01,"Kanon"), "Civil Engineer");
		treeMap.put(new CodeName<Integer,String>(01,"Kanon"), "Civil Engineer-2"); //over-ride 
		treeMap.put(new CodeName<Integer,String>(02,"Soyeb"), "Software Engineer");
		treeMap.put(new CodeName<Integer,String>(03,"Zahir"), "Unemployed");
		
		for (Map.Entry<CodeName<Integer, String>, String> member : treeMap.entrySet()) {
			System.out.println(member.getKey().getCodeName() + " " 
					+member.getKey().getCodeNo()+" - " + member.getValue());
		}
	}

}
