import java.util.function.Predicate;

public class Sample8_6 {

	public static void main(String[] args) {
		//oredicate<String> pre = (String t) -> {return t.equals("Hello");};
		Predicate<String> pre = t -> t.equals("Hello");
		System.out.println(pre.test("Hello"));
		System.out.println(pre.test("1"));
	}

}
