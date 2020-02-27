import java.util.ArrayList;

public class Venue {
	private boolean[][][] allSeats;

	public Venue(int section, int row, int seat) {
		allSeats = new boolean[section][row][seat];

		for(int i=0; i< section; i++) {
			
			for(int j=0; j< row; j++) {
				
				for(int k=0; k<seat; k++) {
					allSeats[i][j][k] = false;

				}//3rd for
			}//2nd for
		}//1st for
	}// venue constructor

	public boolean seatLookup(int sections, int rows, int seats) {
		if(allSeats[sections][rows][seats] == false) {
			allSeats[sections][rows][seats] = true;
			return true;
		}//if
		else {
			System.out.print("The seat is open ");
			return false;
		}//else
	}// seatLookup method

}// class
