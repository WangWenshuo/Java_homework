package third;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

public class Notebook {
	
	private LinkedList recoder;
	
	public Notebook(LinkedList<Object> recoder) {
		super();
		this.recoder = recoder;
	}
	
	public Object getRecoder(int i){
		return recoder.get(i-1);
		
	}
	public void printAllRecoder(){
		Iterator iterator = recoder.iterator();
		int i=1;
		for (Object string : recoder) {
			System.out.println(i+":"+string);
			i++;
		}
	}
	
	public int getRecoderAmount(){
		return recoder.size();
	}
	
	public void deleteOne(int i){
		recoder.remove(i-1);
	}
	public void deleteAll(){
		int length = recoder.size();
		int i=0;
		while(i<length){
			deleteOne(i);
			i++;
		}
		
	}
	
	public boolean addOne(Object t){
		return recoder.add(t);
	}
	
	public boolean addMany(Collection<Object> a){
		return recoder.addAll(a);
	}
	
}
