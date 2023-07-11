package com.kh.poem;

import java.util.Scanner;
// 강정대
public class AnthologyRun {
	public static void main(String[] args) {
		AnthologyFunction aFunc = new AnthologyFunction();
		end :
		while(true) {
			Scanner sc = new Scanner(System.in);
			int choice = aFunc.printMenu();
			
			switch(choice) {
			case 1 :
				switch(aFunc.seasonMenu()) {
				case 1 : aFunc.spring(); break; 
				case 2 : aFunc.summer(); break;
				case 3 : aFunc.fall(); break;
				case 4 : aFunc.winter(); break;
				default : System.out.println("번호를 잘못 입력하셨습니다");break;
				}
				break;
			case 2 :
				switch(aFunc.weatherMenu()) {
				case 1 : aFunc.sunny(); break;
				case 2 : aFunc.rain(); break;
				case 3 : aFunc.cloud(); break;
				case 4 : aFunc.snow(); break;
				default : System.out.println("번호를 잘못 입력하셨습니다");break;
				}
				break;
			case 3 :
				switch(aFunc.emotionMenu()) {
				case 1 : aFunc.happiness(); break;
				case 2 : aFunc.sad(); break;
				case 3 : aFunc.flutter(); break;
				case 4 : aFunc.angry(); break;
				default : System.out.println("번호를 잘못 입력하셨습니다");break;
				}
				break;
			case 4 : break;
			case 5 : System.out.println("프로그램이 종료되었습니다."); break end;
			default: aFunc.printMenu(); break;
			}
		}
	}
}
