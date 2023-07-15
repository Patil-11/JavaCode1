//import java.util.Collections;
//import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringJoinerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*StringJoiner JoinName=new StringJoiner(",","[", "]");
		StringJoiner JoinName1=new StringJoiner("-");
		
		
		//Adding values to StringJoiner
		JoinName.add("Sneha");
		JoinName.add("Ankita");
		JoinName.add("Tanuja");
		JoinName.add("Gaurii");
		JoinName.add("Rajani");
		
		JoinName1.add("Sneha");
		JoinName1.add("Ankita");
		JoinName1.add("Tanuja");
		JoinName1.add("Gaurii");
		JoinName1.add("Rajani");
		
		Collections.sort(JoinName);
		System.out.println("String Values:" +JoinName);
		
		System.out.println("String Values:" +JoinName1);*/
		
		Stream<String> str=Stream.of("abc","xyz","mno");
		String res=str.collect(Collectors.joining(",","{","}"));
		
		
		System.out.println(res);
	}

}
