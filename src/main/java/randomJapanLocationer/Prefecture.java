package randomJapanLocationer;

import java.util.Arrays;

enum Prefecture {
		北海道("北海道", 1),
		青森県("青森県", 2),
		岩手県("岩手県", 3),
		宮城県("宮城県", 4),
		秋田県("秋田県", 5),
		山形県("山形県", 6),
		福島県("福島県", 7),
		茨城県("茨城県", 8),
		栃木県("栃木県", 9),
		群馬県("群馬県", 10),
		埼玉県("埼玉県", 11),
		千葉県("千葉県", 12),
		東京都("東京都", 13),
		神奈川県("神奈川県", 14),
		新潟県("新潟県", 15),
		富山県("富山県", 16),
		石川県("石川県", 17),
		福井県("福井県", 18),
		山梨県("山梨県", 19),
		長野県("長野県", 20),
		岐阜県("岐阜県", 21),
		静岡県("静岡県", 22),
		愛知県("愛知県", 23),
		三重県("三重県", 24),
		滋賀県("滋賀県", 25),
		京都府("京都府", 26),
		大阪府("大阪府", 27),
		兵庫県("兵庫県", 28),
		奈良県("奈良県", 29),
		和歌山県("和歌山県", 30),
		鳥取県("鳥取県", 31),
		島根県("島根県", 32),
		岡山県("岡山県", 33),
		広島県("広島県", 34),
		山口県("山口県", 35),
		徳島県("徳島県", 36),
		香川県("香川県", 37),
		愛媛県("愛媛県", 38),
		高知県("高知県", 39),
		福岡県("福岡県", 40),
		佐賀県("佐賀県", 41),
		長崎県("長崎県", 42),
		熊本県("熊本県", 43),
		大分県("大分県", 44),
		宮崎県("宮崎県", 45),
		鹿児島県("鹿児島県", 46),
		沖縄県("沖縄県", 47),
		;

	private String prefectureName;
	private int prefectureNumber;

	private Prefecture(String prefectureName, int prefectureNumber) {
		this.prefectureName = prefectureName;
		this.prefectureNumber = prefectureNumber;
	}

	static Prefecture getPrefecture(int targetNumber){
		return Arrays.stream(Prefecture.values())
				.filter(Prefectures -> Prefectures.getPrefectureNumber() == targetNumber)
				.findFirst()
				.orElse(null);
	}

	String getPrefectureName() {
		return this.prefectureName;
	}

	int getPrefectureNumber() {
		return this.prefectureNumber;
	}

	String getPrefectureNumberString() {
		String prefectureNumberString =  String.valueOf(this.prefectureNumber);
		if(this.prefectureNumber < 10) {
			prefectureNumberString = "0" + prefectureNumberString;
		}
		return prefectureNumberString;
	}
}
