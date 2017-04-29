package poo.abstraction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestAbstraction {

	public static void main(String[] args) {
		Livre l1 = new Livre();
		l1.setTitre(" Java par la pratique ");
		l1.setDateEdition(new Date());

		Calendar cal = Calendar.getInstance();
		cal.set(2015, 12, 01);
		l1.setDateEdition(cal.getTime());

		SimpleDateFormat dateFormat = new SimpleDateFormat(" dd-mm-yyyy ");

		try {
			l1.setDateEdition(dateFormat.parse(" 06-04-2016 "));
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(dateFormat.format(l1.getDateEdition()));

		Chaise ch = new Chaise();
		ch.setModele("IKEA");
		ch.plier();
	}

}
