package study.advance.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data{
	private String data;

	public Data(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Data [data=" + data + "]";
	}
	
}

public class CompareTo {
	public static void main(String[] args) {
		
		List<Data> list = new ArrayList<>();
		list.add(new Data("Soyeb"));
		list.add(new Data("Jesmin"));
		list.add(new Data("Add"));
		
		Collections.sort(list, (Data o1, Data o2)->
		{
			if(o1.getData().length()<o2.getData().length()) {
			return 1;
			}
			else if(o1.getData().length()>o2.getData().length()) {
				return -1;
			}
			else {
				return 0;
			}
		});
		
		for(Data name: list) {
			System.out.println(name.getData());
		}
	}

}
