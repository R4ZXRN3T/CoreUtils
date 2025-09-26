package org.R4ZXRN3T;

import java.util.Arrays;

/**
 * Utility class providing various prompt methods for user input.
 * Includes confirmation prompts and custom input prompts with allowed values.
 */
public class Prompts {

	/**
	 * Displays a confirmation prompt to the user and waits for a 'y' or 'n' response.
	 *
	 * @param promptMessage the message to display to the user
	 * @return {@code true} if the user enters 'y' (case-insensitive), {@code false} if 'n'
	 * @throws RuntimeException if an unexpected error is encountered (should not happen)
	 */
	public static boolean confirmationPrompt(String promptMessage) {
		IO.print("\033[s");

		String input = null;

		do {
			if (input != null) IO.print("\033[u\033[0J");
			IO.print(promptMessage);
			input = IO.readln();
		} while (!(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")));

		return switch (input.toLowerCase()) {
			case "y" -> true;
			case "n" -> false;
			default -> throw new RuntimeException("How the fuck did this happen?");
		};
	}

	/**
	 * Prompts the user for input, only accepting responses that match one of the allowed inputs (case-sensitive).
	 *
	 * @param promptMessage the message to display to the user
	 * @param allowedInputs the allowed input strings
	 * @return the user's input, guaranteed to be one of the allowed inputs
	 */
	public static String customPrompt(String promptMessage, String... allowedInputs) {
		return customPrompt(promptMessage, false, allowedInputs);
	}

	/**
	 * Prompts the user for input, only accepting responses that match one of the allowed inputs (case-insensitive).
	 *
	 * @param promptMessage the message to display to the user
	 * @param allowedInputs the allowed input strings
	 * @return the user's input, guaranteed to be one of the allowed inputs (case-insensitive match)
	 */
	public static String customPromptIgnoreCase(String promptMessage, String... allowedInputs) {
		return customPrompt(promptMessage, true, allowedInputs);
	}

	/**
	 * Internal method to prompt the user for input, accepting only allowed inputs.
	 *
	 * @param promptMessage the message to display to the user
	 * @param ignoreCase    whether to ignore case when matching allowed inputs
	 * @param allowedInputs the allowed input strings
	 * @return the user's input, guaranteed to be one of the allowed inputs
	 */
	private static String customPrompt(String promptMessage, boolean ignoreCase, String... allowedInputs) {
		IO.print("\033[s");

		String input = null;

		do {
			if (input != null) IO.print("\033[u\033[0J");
			IO.print(promptMessage);
			input = IO.readln();
		} while (Arrays.stream(allowedInputs).noneMatch(ignoreCase ? input::equalsIgnoreCase : input::equals));

		return input;
	}

	/**
	 * Demonstrates usage of the prompt methods.
	 * Not intended for production use.
	 */
	static void main() {
		String result = customPromptIgnoreCase("Please Enter what you want: (bla/blah/blahhh)   ", "bla", "blah", "blahhh");
		boolean sure = confirmationPrompt("Are you sure you want " + result + "? (y/n)");
		if (sure) IO.println("Ok here: Aquired 1 " + result);
		else IO.println("OK");
	}
}