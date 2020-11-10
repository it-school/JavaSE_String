package com.itschool;

import java.util.Arrays;

public class Main
{

	public static void main(String[] args)
	{
/*
		Scanner scanner = new Scanner(System.in);

      String s1 = "abc";
      String s2 = scanner.next();

      System.out.println(s1 == s2);
      System.out.println(s1.equals(s2));
 */
		String s = "  Результаты тестирования   по основам программированияОбратная связь програм ";
		System.out.println(s);

		System.out.println(s.length());
		s = s.strip();
		System.out.println(s.length());

		System.out.println(s.substring(3, 10));

		while (s.contains("  ")) {
			s = s.replace("  ", " ");
		}
		System.out.println(Arrays.toString(s.split(" ")));

		String s1 = "Abc", s2 = "";
		System.out.println(s1.compareToIgnoreCase(s2));

		System.out.println(s1.concat(s2));

		if (s.contains("програм")) { System.out.println(s.indexOf("програм")); }
		System.out.println();
// Практические задания

		// Реализовать проверку корректности автомобильного номера
		final String LETTERS = "ABCEHKMOPTX0123456789";
		String number = " BH1234AE ";
		System.out.println(number);
		number = number.strip().toUpperCase();
		if (number.length() != 8) {
			System.out.println("Incorrect auto number length!");
			return;
		}
		for (int i = 0; i < number.length(); i++) {
			if (!LETTERS.contains("" + number.charAt(i))) {
				System.out.println("Inacceptable symbol: " + number.charAt(i));
				return;
			}
		}
		System.out.println("Correct number: " + number + System.lineSeparator());

// Написать проверку корректности введённого имени человека и преобразовать к виду:
// первая буква Прописная, все остальные - строчные
		final String NAME_SYMBOLS = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЬЫЪЭЮЯ- ";
		String name = " король Йагупоп ";
		System.out.println(name);
		name = name.strip().toUpperCase();
		if (name.length() < 1) {
			System.out.println("Incorrect length of person name!");
			return;
		}
		for (int i = 0; i < name.length(); i++) {
			if (!NAME_SYMBOLS.contains("" + name.charAt(i))) {
				System.out.println("Inacceptable symbol in name: " + name.charAt(i));
				return;
			}
		}

		name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		System.out.println("Correct name: " + name + System.lineSeparator());

// Проверка корректности пароля
		boolean hasUpper = false, hasLower = false, hasDigit = false, hasNonLetterOrDigit = false;
		String password = " Pa$$w0rd ".strip();
		if (password.length() < 8) {
			System.out.println("Incorrect length: " + password.length());
			return;
		}
		for (int i = 0; i < password.length(); i++) {
			if (!hasDigit && Character.isDigit(password.charAt(i))) { hasDigit = true; }
			if (!hasUpper && Character.isUpperCase(password.charAt(i))) { hasUpper = true; }
			if (!hasLower && Character.isLowerCase(password.charAt(i))) { hasLower = true; }
			if (!hasNonLetterOrDigit && !Character.isAlphabetic(password.charAt(i))
					&& !Character.isDigit(password.charAt(i))) { hasNonLetterOrDigit = true; }
			if (hasDigit && hasUpper && hasLower && hasNonLetterOrDigit) { break; }
		}
		if (hasDigit && hasUpper && hasLower && hasNonLetterOrDigit) {
			System.out.println("Correct password: " + password);
		}
		else {
			if (!hasDigit) { System.out.println("No digit"); }
			if (!hasUpper) { System.out.println("No UPPERCASE letter"); }
			if (!hasLower) { System.out.println("No lowercase letter"); }
			if (!hasNonLetterOrDigit) { System.out.println("No symbol neither letter nor digit"); }
		}


		System.out.println();
		System.out.println("Deleting from string \"abc def ghj\" the chars from 4 to 8: " + delete("abc def ghj", 3, 7));
	}

	/**
	 * Удаляет часть строки
	 *
	 * @param string строка из которой удаляем подстроку
	 * @param start  с какой позиции удаляем
	 * @param end    по какую позицию удаляем
	 *
	 * @return строку без удалённого фрагмента
	 */
	public static String delete(String string, int start, int end)
	{
		return string.substring(0, start) + string.substring(end + 1);
	}
}
