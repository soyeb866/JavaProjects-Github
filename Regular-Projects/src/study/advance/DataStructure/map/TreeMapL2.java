package study.advance.DataStructure.map;

import java.util.Map;
import java.util.TreeMap;

/*
How to initialize TreeMap and assign to Map interface
*/


class CodeName2<K,V> implements Comparable<CodeName2<K,V>>{
	private Integer codeNo;
	private String codeName;
	
	public CodeName2() {
	}
	
	public CodeName2(Integer codeNo, String codeName) {
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
	public int compareTo(CodeName2<K,V> o) {
		String code1 = codeNo.toString().concat(codeName);
		String code2 = o.getCodeNo() + o.getCodeName();
		return code1.compareTo(code2);
	}
}

public class TreeMapL2 {

	public static void main(String[] args) {
		
		Map<CodeName2<Integer, String>, String> treeMap = new TreeMap<>();
		treeMap.put(new CodeName2<Integer,String>(01,"Kanon"), "Civil Engineer");
		treeMap.put(new CodeName2<Integer,String>(01,"Kanon"), "Civil Engineer-2");
		treeMap.put(new CodeName2<Integer,String>(02,"Soyeb"), "Software Engineer");
		treeMap.put(new CodeName2<Integer,String>(03,"Zahir"), "Unemployed");
		
		
		CodeName2<Integer, String> code = null;
		for (Map.Entry<CodeName2<Integer, String>, String> member : treeMap.entrySet()) {
			if(member.getValue().equals("Software Engineer")) {
				code = member.getKey();
			}
		}
		System.out.println(code);
	}

}
