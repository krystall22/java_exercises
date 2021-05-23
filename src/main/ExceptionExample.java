package main;

public class ExceptionExample {

	public static void main(String[] args) {

		try {
			int[] arr = new int[5];
			arr[5] = 4;
			System.out.println("arr[5]" + arr[5]);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Khoi lenh finally van duoc thuc thi");
		}
		System.out.println("Finished");

		/*
		 * try { int[] arr = new int[5]; arr[5] = 4; System.out.println("arr[5]" +
		 * arr[5]); } catch (NullPointerException ex) { System.out.println(ex); }
		 * finally { System.out.println("Khoi lenh Finally luon duoc thuc thi"); }
		 * System.out.println("Finished");
		 */

		/*
		 * try { int res = 10 / 2; System.out.println("10/2 =" + res); } finally {
		 * System.out.println("Khoi lenh finally luon duoc thuc thi"); } ;
		 * System.out.println("Finished");
		 */

		/*
		 * try { try { int zero = 0; int average = 10 / zero;
		 * System.out.println("Average =" + average); } catch (ArithmeticException ex) {
		 * System.out.println(ex); } System.out.println("Continue..."); int[] arr = new
		 * int[5]; arr[5] = 4; System.out.println("arr[5] " + arr[5]); } catch
		 * (ArrayIndexOutOfBoundsException ex) { System.out.println(ex); }
		 * System.out.println("Finished");
		 */

		/*
		 * try { int[] arr = new int[5]; arr[5] = 4; System.out.println("arr[5]" +
		 * arr[5]);
		 * 
		 * int zero = 0; int average = 10 / zero; System.out.println("average =" +
		 * average);
		 * 
		 * String obj = null; System.out.println(obj.length()); } catch
		 * (NullPointerException ex) { System.out.println(ex); } catch
		 * (ArrayIndexOutOfBoundsException ex) { System.out.println(ex); } catch
		 * (ArithmeticException ex) { System.out.println(ex); }
		 * System.out.println("Finished");
		 */

	}

}
