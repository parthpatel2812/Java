package Class_8;

public class HW_Substract_String {


	public static void main(String[] args) {

		String s1 = "The quick brown for jumps";
		String s2 = "The brown jumps";
		// System.out.println(s1.substring(s2.length(),s1.length()));

		String[] s3 = method(s1, s2);

		for (String y : s3)
			System.out.print(y + " ");
	}

	public static String[] method(String b1, String b2) {
		String[] a1 = b1.split(" ");
		String[] a2 = b2.split(" ");

		String[] a3 = new String[5];

		int x = 0;

		for (int i = 0; i < a2.length; i++) {
			for (int j = 0; j < a1.length; j++) {
				if (a2[i].equals(a1[j])) {
					a1[j] ="";
				}
			}

		}
		return a1;
	}
}
