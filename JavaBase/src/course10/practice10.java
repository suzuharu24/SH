package course10;

import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("予約したい曜日と時間帯を入力してください");
		System.out.println("例：金曜日の午前、午後、夜間");
		String x = stdIn.next();
		switch (x) {
		case "月曜日の午前":
		case "月曜日の午後":
		case "月曜日の夜間":
		case "火曜日の午後":
		case "火曜日の夜間":
		case "水曜日の午前":
		case "水曜日の午後":
		case "木曜日の午前":
		case "木曜日の午後":
		case "木曜日の夜間":
		case "金曜日の午後":
		case "金曜日の夜間":
		case "土曜日の午前":
			System.out.println("予約できます。");
			break;
		case "日曜日の午前":
		case "日曜日の午後":
		case "日曜日の夜間":
		case "火曜日の午前":
		case "水曜日の夜間":
		case "金曜日の午前":
		case "土曜日の午後":
		case "土曜日の夜間":
			System.out.println("休診の為予約できません。");
			break;
		default:
			System.out.println("例のように曜日と時間を入力してください。");
		}

	}

}
