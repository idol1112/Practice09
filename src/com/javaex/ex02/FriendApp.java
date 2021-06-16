package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.javaex.ex01.Rectangle;

public class FriendApp {

    public static void main(String[] args) {
    	
    	List<Friend> fList = new ArrayList<Friend>();
    	
    	Friend f01 = new Friend();
    	Friend f02 = new Friend();
    	Friend f03 = new Friend();
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("친구를 3명 등록해 주세요");
    	f01.setName(sc.next());
    	f01.setHp(sc.next());
    	f01.setSchool(sc.next());
    	
    	f02.setName(sc.next());
    	f02.setHp(sc.next());
    	f02.setSchool(sc.next());
    	
    	f03.setName(sc.next());
    	f03.setHp(sc.next());
    	f03.setSchool(sc.next());
    	
    	fList.add(f01);
    	fList.add(f02);
    	fList.add(f03);
    	
    	listAllDraw(fList);
    	
    	
    	sc.close();
    }
    public static void listAllDraw(List<Friend> list) {
		
		//내용작성 
		for(Friend f : list) {
			f.draw();
		}
	}

}
