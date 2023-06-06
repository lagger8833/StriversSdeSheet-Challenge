import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class PascalTriangle {
	public static ArrayList<Long> generateRow(int row){
		long ans = 1;
		ArrayList<Long> res = new ArrayList<>();
		res.add((long) 1);
		for(int i=1; i<row; i++){
			ans *= (row - i);
			ans /= i;
			res.add(ans);
		}
		return res;
	}
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
		ArrayList<ArrayList<Long>> res = new ArrayList<>();
		for(int i=1; i<=n; i++){
			res.add(generateRow(i));
		}
		return res;
	}
	public static void main(String [] args){
		int n = 5;
		ArrayList<ArrayList<Long>> res = printPascal(n);
		for(ArrayList<Long> r : res){
			for(long l : r){
				System.out.print(l);
			}
			System.out.println();
		}
	}
}
