package study.advance.DataStructure.Generics;

import java.util.ArrayList;
import java.util.List;

class Family{
	private int FamilyId;

	public Family(int familyId) {
		FamilyId = familyId;
	}

	public int getFamilyId() {
		return FamilyId;
	}

	@Override
	public String toString() {
		return "Family [FamilyId=" + FamilyId + "]";
	}
	
	public void info() {
		System.out.println("Family [FamilyId=" + getFamilyId() + "]");
	}
}

class Name extends Family{
	private int personId;

	public Name(int personId, int FamilyId) {
		super(FamilyId);
		this.personId = personId;
	}

	public int getPersonId() {
		return personId;
	}

	@Override
	public String toString() {
		return "Name [personId=" + personId + "]";
	}
	
	public void info() {
		System.out.println("Name [personId=" + getPersonId() + "]");
	}

	

}

public class WildCardsGenerics {

	public static void main(String[] args) {		
		
		List<Family> list = new ArrayList<Family>();
		
		list.add(new Family(12));
		list.add(new Family(14));
		list.add(new Family(2));
		list.add(new Family(21));
		list.add(new Family(13));
		list.add(new Name(2, 12));
		
		display(list);
	}


	//private static void display(List<? extends Family> list) {
	private static void display(List<? super Name> list) {
		//for (Family element : list) {
		for (Object element : list) {
			System.out.println(element);
			//element.info();
		}
		
	}
//	
//	Console Display
//	Family [FamilyId=12]
//	Family [FamilyId=14]
//	Family [FamilyId=2]
//	Family [FamilyId=21]
//	Family [FamilyId=13]
//	Name [personId=2]

	
}
