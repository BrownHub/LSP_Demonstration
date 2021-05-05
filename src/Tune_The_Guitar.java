import static org.junit.Assert.assertEquals;

public class Tune_The_Guitar {
	private Guitar six_string;
	private Bass four_string;
	private static Tune_The_Guitar instance;
	
	private static Tune_The_Guitar get_instance() {
		instance = new Tune_The_Guitar();
		instance.six_string = new Guitar();
		instance.four_string = new Bass();
		return instance;
	}
	
	//test results for guitar in standard tuning
	public void test_guitar_standard(Guitar guitar) {
		try {
			if (guitar.get_string_1() == 'E') {
				System.out.println("1 String: E");
			} else {
				System.out.println("1 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("1 String: test fails");
		}

		try {
			if (guitar.get_string_2() == 'A') {
				System.out.println("2 String: A");
			} else {
				System.out.println("2 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("2 String: test fails");
		}

		try {
			if (guitar.get_string_3() == 'D') {
				System.out.println("3 String: D");
			} else {
				System.out.println("3 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("3 String: test fails");
		}

		try {
			if (guitar.get_string_4() == 'G') {
				System.out.println("4 String: G");
			} else {
				System.out.println("4 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("4 String: test fails");
		}

		try {
			if (guitar.get_string_5() == 'B') {
				System.out.println("5 String: B");
			} else {
				System.out.println("5 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("5 String: test fails");
		}

		try {
			if (guitar.get_string_6() == 'E') {
				System.out.println("6 String: E");
			} else {
				System.out.println("6 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("6 String: test fails");
		}
	}
	
	public void test_guitar_drop_d(Guitar guitar) {
		try {
			if (guitar.get_string_1() == 'D') {
				System.out.println("1 String: D");
			} else {
				System.out.println("1 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("1 String: test fails");
		}

		try {
			if (guitar.get_string_2() == 'A') {
				System.out.println("2 String: A");
			} else {
				System.out.println("2 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("2 String: test fails");
		}

		try {
			if (guitar.get_string_3() == 'D') {
				System.out.println("3 String: D");
			} else {
				System.out.println("3 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("3 String: test fails");
		}

		try {
			if (guitar.get_string_4() == 'G') {
				System.out.println("4 String: G");
			} else {
				System.out.println("4 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("4 String: test fails");
		}

		try {
			if (guitar.get_string_5() == 'B') {
				System.out.println("5 String: B");
			} else {
				System.out.println("5 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("5 String: test fails");
		}
		

		try {
			if (guitar.get_string_6() == 'E') {
				System.out.println("6 String: E");
			} else {
				System.out.println("6 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("6 String: test fails");
		}
	}
	
	public void test_bass_standard(Bass bass) {
		try {
			if (bass.get_string_1() == 'E') {
				System.out.println("1 String: E");
			} else {
				System.out.println("1 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("1 String: test fails");
		}

		try {
			if (bass.get_string_2() == 'A') {
				System.out.println("2 String: A");
			} else {
				System.out.println("2 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("2 String: test fails");
		}

		try {
			if (bass.get_string_3() == 'D') {
				System.out.println("3 String: D");
			} else {
				System.out.println("3 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("3 String: test fails");
		}

		try {
			if (bass.get_string_4() == 'G') {
				System.out.println("4 String: G");
			} else {
				System.out.println("4 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("4 String: test fails");
		}
	}
	
	public void test_bass_drop_d(Bass bass) {
		try {
			if (bass.get_string_1() == 'D') {
				System.out.println("1 String: D");
			} else {
				System.out.println("1 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("1 String: test fails");
		}

		try {
			if (bass.get_string_2() == 'A') {
				System.out.println("2 String: A");
			} else {
				System.out.println("2 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("2 String: test fails");
		}

		try {
			if (bass.get_string_3() == 'D') {
				System.out.println("3 String: D");
			} else {
				System.out.println("3 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("3 String: test fails");
		}

		try {
			if (bass.get_string_4() == 'G') {
				System.out.println("4 String: G");
			} else {
				System.out.println("4 String: test fails");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("4 String: test fails");
		}
	}

	public void tune_guitar(Tuning tuning) {
		six_string.set_tuning(tuning);
	}
	
	public void tune_bass(Tuning tuning) {
		four_string.set_tuning(tuning);
	}
	
	public Guitar get_guitar() {
		return six_string;
	}
	
	public Bass get_bass() {
		return four_string;
	}
	
	public static void main(String[] args) {
		Tune_The_Guitar exercise = get_instance();
		
		//Display opening message
		System.out.println("First, both guitars are in standard tuning:\nGuitar:");
		exercise.test_guitar_standard(exercise.get_guitar());
		
		System.out.println("\nBass:");
		exercise.test_bass_standard(exercise.get_bass());
		
		System.out.println("\nNext, if we change the guitar and the bass to drop d tuning, we see they still perform as expected:\nGuitar");
		exercise.tune_guitar(Tuning.DROP_D);
		exercise.test_guitar_drop_d(exercise.get_guitar());
		
		System.out.println("\nBass:");
		exercise.tune_bass(Tuning.DROP_D);
		exercise.test_bass_drop_d(exercise.get_bass());
		
		System.out.println("\nSo far it seems like a bass, being a type of guitar, benefits from sharing the same functions.");
		System.out.println("The LSP violation of this usage becomes apparent, however, when we try to test the bass' tuning as a guitar.\nBass:");
		exercise.test_guitar_drop_d(exercise.get_bass());
		
		System.out.println("\nThe bass should be able to be treated as a guitar without breaking the program, but we see here that because any check");
		System.out.println(" on a guitar tests 6 strings and the bass only has 4, the program throws an error.");
	}
	
	

}
