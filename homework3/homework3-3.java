import java.util.*;

class Untitled {
	//作答部分sort()
	public static void sort(ArrayList<Integer> list){
		int l = list.size();
		for(int i=l-1;i>0;i--){
			for(int j=0;j<=i-1;j++){
				if(list.get(j)>list.get(j+1)){
					int box = list.get(j);
					list.set(j,list.get(j+1));
					list.set((j+1),box);
				}
			}
		}
		System.out.println(list);
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		for(int i=0;i<10;i++){
			int num = random.nextInt(20);
			list.add(num);
		}
		
		System.out.println(list);
		sort(list);
	}
}