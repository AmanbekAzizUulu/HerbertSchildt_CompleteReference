package interfaces_1;

public class AskMe implements SharedConstants{
	public static void answer(int answer) {
		switch (answer) {
		case NO:
			System.out.println("NO");
			break;
		case YES:
			System.out.println("YES");
			break;
		case MAYBE:
			System.out.println("MAYBE");
			break;
		case LATER:
			System.out.println("LATER");
			break;
		case SOON:
			System.out.println("SOON");
			break;
		case NEVER:
			System.out.println("NEVER");
		}
	}
}
