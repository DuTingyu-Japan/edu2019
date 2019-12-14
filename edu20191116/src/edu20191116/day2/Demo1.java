package edu20191116.day2;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

	public static void main(String[] args) {
		// 1. 编写一个方法。去除List集合中的重复元素。
		// 2. 取出一个字符串中字母出现的次数。如："asjkdhasjkdhasd" a(2)b(1)k(2)...
		countWord("asjkdhasjkdhasd");
		// 3. 写一个排序算法，排序List<String名字>
		// 4. 打印99乘法表，输入多少，打印多少
		printMuilti(5);
		

	}

	private static void countWord(String s) {
		char[] arry = s.toCharArray();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (char c : arry) {
			if (null == map.get(String.valueOf(c))) {
				map.put(String.valueOf(c), 1);
			} else {
				map.put(String.valueOf(c), map.get(String.valueOf(c)) + 1);
			}
		}

		for (String key : map.keySet()) {
			System.out.println("key= " + key + " and value= " + map.get(key));
		}
	}

	private static void printMuilti(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i + " ");
			}
			System.out.println();
		}
	}
}
