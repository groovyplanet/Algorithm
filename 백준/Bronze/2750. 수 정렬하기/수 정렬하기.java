import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List <Integer>list = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			int x = Integer.parseInt(br.readLine());
			list.add(x);
		}
		Collections.sort(list);


		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}


}
