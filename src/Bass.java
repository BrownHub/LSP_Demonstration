
public class Bass extends Guitar {

	public Bass() {
		super();
		tunings.put(Tuning.DROPPED_C, "CGCF");
		tunings.put(Tuning.D_STANDARD, "DGCF");
		
		strings = new char[4];
		set_tuning(tuning);
	}
	
	public Bass(Tuning tune) {
		super(tune);
		tunings.put(Tuning.DROPPED_C, "CGCF");
		tunings.put(Tuning.D_STANDARD, "DGCF");
		
		tuning = tune;
		
		strings = new char[4];
		set_tuning(tuning);
	}
	
	@Override
	public void set_tuning(Tuning tune) {
		tuning = tune;
		
		strings[0] = tunings.get(tune).charAt(0);
		strings[1] = tunings.get(tune).charAt(1);
		strings[2] = tunings.get(tune).charAt(2);
		strings[3] = tunings.get(tune).charAt(3);
	}

}
