package com.porcasse.goninjagoninja;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import com.porcasse.kowabunga.Context;
import com.porcasse.kowabunga.Coordonnees;
import com.porcasse.kowabunga.Ride;

public class FileReader {

	
	public void readFile(String inputSrc) throws Exception {
		File fic = new File(inputSrc);
		Scanner scan;
			scan = new Scanner(fic);

		//3 rows, 4 columns, 2 vehicles, 3 rides, 2 bonus and 10 steps
		scan.nextInt();
		Context ctx = new Context();
		
		ctx.setRows(scan.nextInt());
		ctx.setColumens(scan.nextInt());
		ctx.setVehicles(scan.nextInt());
		ctx.setRidecount(scan.nextInt());
		ctx.setBonus(scan.nextInt());
		ctx.setSteps(scan.nextInt());
		
		scan.nextLine();
		ctx.setRides(new ArrayList<>());
		for(int i = 0 ; i < ctx.getRidecuont(); i++) {
			Ride ride = new Ride();
			
			Coordonnees coordStart = new Coordonnees();
			
			coordStart.setX(scan.nextInt());
			coordStart.setY(scan.nextInt());
			
			ride.setStart(coordStart);
			
			Coordonnees coordEnd = new Coordonnees();
			coordEnd.setX(scan.nextInt());
			coordEnd.setY(scan.nextInt());
			
			ride.setEnd(coordEnd);

			ride.setStartTime(scan.nextInt());
			ride.setFinishTime(scan.nextInt());
			ctx.getRides().add(ride);
			scan.nextLine();
		}
		scan.close();
		
		
	}
}
