import java.util.HashMap;
import java.util.Map;

public class Guitar {
	protected char strings[];
	protected Map<Tuning, String> tunings;
	protected Tuning tuning;
	
	public Guitar() {
		tunings = new HashMap<Tuning, String>();
		tunings.put(Tuning.STANDARD, "EADGBE");
		tunings.put(Tuning.DROP_D, "DADGBE");
		
		tuning = Tuning.STANDARD;
		
		strings = new char[6];
		set_tuning(tuning);
	}
	
	public Guitar(Tuning tune) {
		tunings = new HashMap<Tuning, String>();
		tunings.put(Tuning.STANDARD, "EADGBE");
		tunings.put(Tuning.DROP_D, "DADGBE");
		tunings.put(Tuning.DADGAD, "DADGAD");
		
		tuning = tune;
		
		strings = new char[6];
		set_tuning(tuning);
	}
	
	public void set_tuning(Tuning tune) {
		tuning = tune;
		
		strings[0] = tunings.get(tune).charAt(0);
		strings[1] = tunings.get(tune).charAt(1);
		strings[2] = tunings.get(tune).charAt(2);
		strings[3] = tunings.get(tune).charAt(3);
		strings[4] = tunings.get(tune).charAt(4);
		strings[5] = tunings.get(tune).charAt(5);
	}
	
	public char get_string_1() {
		return strings[0];
	}
	
	public char get_string_2() {
		return strings[1];
	}
	
	public char get_string_3() {
		return strings[2];
	}
	
	public char get_string_4() {
		return strings[3];
	}
	
	public char get_string_5() {
		return strings[4];
	}
	
	public char get_string_6() {
		return strings[5];
	}
	
	/*
	public String get_strings() {
		String current_strings = new String();
		
		for (char string : strings) {
			current_strings += string;
		}
		
		return current_strings;
	}
	*/
}
