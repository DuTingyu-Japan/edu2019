package edu20191116.day2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo2 {

	public static void main(String[] args) {
		// 1. 编写一个方法。去除List集合中的重复元素。
		// 2. 取出一个字符串中字母出现的次数。如："asjkdhasjkdhasd" a(2)b(1)k(2)...
		// 3. 写一个排序算法，排序List<String名字>
		// 4. 打印99乘法表，输入多少，打印多少

		/* 第1题 */
		// editList();

		/* 第2题 */
		// countWord("asjkdhasjkdhasd");

		/* 第3题 */
		editListByLetter();

		/* 第4题 */
		printMuilti(9);
	}
//	public static void editList() {
//		List<String> list = new ArrayList<String>();
//		list.add("tom");
//		list.add("jerry");
//		list.add("tom");
//			
//		for(String s : list) {
//			for(String a : list) {
//				if(a.equals(s));
//				list.remove(a);
//			}
//		}
//		for(String r : list) {
//			System.out.println(r);
//		}
//	}

	// 取出一个字符串中字母出现的次数。如："asjkdhasjkdhasd" a(2)b(1)k(2)...
	public static void countWord(String str) {
		char[] arry = str.toCharArray();
		System.out.println(arry);
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (char result : arry) {
			String s = String.valueOf(result);
			System.out.println(result);
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		for (String key : map.keySet()) {
			System.out.println("key = " + key + " and value =" + map.get(key));
		}
	}

	// 3. 写一个排序算法，排序List<String名字>
	public static void editListByLetter() {
		List<String> list = new ArrayList<String>();
		list.add("tom");
		list.add("jerry");
		list.add("alice");
		list.add("ab");
		list.add("az");
		list.add("cindy");

		list.sort(new Comparator<String>() {
			public int compare(String orderBefore, String orderAfter) {
				String str1 = orderBefore.toLowerCase();
				String str2 = orderAfter.toLowerCase();
				// 如果前面的值大返回1，如果后面的大于前面的返回-1，或者等于前面的返回0.
				return str1.compareTo(str2);// a-z
			}
		});
		System.out.println("排序后:" + list);
	}

	// 4. 打印99乘法表，输入多少，打印多少
	public static void printMuilti(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				int result = i * j;
				System.out.print(j + "*" + i + "=" + result + " ");
			}
			System.out.println("");
		}
	}
}
