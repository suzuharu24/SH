package course10;

import java.util.Scanner;

public class practice09 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("予約したい曜日を入力してください");
		String x = stdIn.next();
		switch (x) {
		case "月曜日":
		case "水曜日":
		case "木曜日":
		case "土曜日":
			System.out.println("予約できます。");
			break;
		case "日曜日":
		case "火曜日":
		case "金曜日":
			System.out.println("休診の為予約できません。");
			break;
		default:
			System.out.println("正しい曜日を入力してください。");
		}

	}

}
