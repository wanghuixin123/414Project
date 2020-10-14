package main;

import java.util.ArrayList;

public class Result {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr=new ArrayList();
		arr.add(50);
		arr.add(60);
		arr.add(20);
		arr.add(90);
		arr.add(30);
		Whx whx = new Whx();
//		Lml lmi = new Lmi();
//		Rxy rxy = new Rxy();
//		Mxy mxy = new Mxy();
		Whx.out(arr);
//		Lml.out(arr);
//		Rxy.out(arr);
//		Mxy.out(arr);
		//1，对成绩进行排序
		//2，求平均分，
		//3，统计区间：0-20：xx个，21-40：xx个
		//4，最大值最小值
	}

}
