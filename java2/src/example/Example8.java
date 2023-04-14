package example;

import java.util.*;

public class Example8 {
	//2차배열
	
	String menus[][]={
		{"로켓배송","로켓프래시","쿠팡비즈","골드박스","이벤트","설날","크리스마스"},
		{"Y","Y","Y","Y","Y","N","N"}
	};

	public static void main(String[] args) {
		Example8 ex=new Example8();
		ex.result();
	}
	public void result() {
		System.out.println(Arrays.toString(this.menus[0]));
		int ea = this.menus[0].length;
		int w=0;
		while(w<ea) {
			if(this.menus[1][w].equals("Y")) {
				System.out.println(this.menus[0][w]);
			}
			w++;
		}
	}

}
