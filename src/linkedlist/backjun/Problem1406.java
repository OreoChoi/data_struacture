package linkedlist.backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Problem1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String initialString = br.readLine();
		Stack<Character> leftStack = new Stack<>();
		Stack<Character> rightStack = new Stack<>();

		for (char c : initialString.toCharArray()) {
			leftStack.push(c);
		}

		int commandCount = Integer.parseInt(br.readLine());

		for (int i = 0; i < commandCount; i++) {
			String command = br.readLine();
			char type = command.charAt(0);

			if (type == 'L') {
				if (!leftStack.isEmpty()) {
					rightStack.push(leftStack.pop());
				}
			} else if (type == 'D') {
				if (!rightStack.isEmpty()) {
					leftStack.push(rightStack.pop());
				}
			} else if (type == 'B') {
				if (!leftStack.isEmpty()) {
					leftStack.pop();
				}
			} else if (type == 'P') {
				char value = command.charAt(2);
				leftStack.push(value);
			}
		}

		while (!leftStack.isEmpty()) {
			rightStack.push(leftStack.pop());
		}
		while (!rightStack.isEmpty()) {
			bw.write(rightStack.pop());
		}

		bw.flush();
		bw.close();
	}

	private static int plusCursor(int cursor, int lastIndex) {
		return cursor == lastIndex ? lastIndex : cursor + 1;
	}

	private static int minusCursor(int cursor) {
		return cursor == 0 ? cursor : cursor - 1;
	}
}
