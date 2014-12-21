import java.util.*;
import easyIO.*;
import java.io.*;

class EazyMoney{

	public static void main(String[] args) {
		
		Meny m = new Meny();



	}
}

class Meny{

	int switchNr = 0;

	void startUp () {

		switch()

	}

	void readKonto () {

		int arraySize = 0;

		double d = 0;
		
		Scanner les;

		String [] s = new String [50];

		lesSide();

		innEllerUt();

	}


	void lesSide () {

	}

	int innEllerUt () {

	}

	void readFile () {

		Scanner les = new Scanner(subVariabler.txt);

		String s;

		String [] sOversikt = new String [200];

	}

	void showInntekt () {

	}

	void showUtgift () {

	}

	/*void addMonthlyExpense () {
	
	}

	void removeMonthlyExpense () {
	
	} */

	void saveFile () {

		String dato;

		String datoDone = dato + ".txt";

		FileWriter out = new FileWriter(new File(datoDone));

		Scanner tast = new Scanner(System.in);

		String def;  //FORMATTED DEFAULT STRING

		HashMap <> printUtgift = new HashMap <>;

		HashMap <> printInntekt = new HashMap <>;
	}

	void close () {


	}
}

class Inntekt{

	Double sum;

	HashMap <String, Subinntekt> oversiktInntekt = new HashMap <String, Subinntekt>; 

	Subinntekt s;

	Inntekt (String [] s, Double d) {


	}

	boolean ifExists (String s) {

	}

	int inntektPrDag (int mnd, int aar, Double d) {

	}
}

class Utgift{

	Double sum;

	HashMap <String, Subutgift> oversiktUtgift = new HashMap <String, Subutgift>; 

	Subutgift s;

	Utgift (String [] s, Double d) {


	}

	boolean ifExists (String s) {

	}

	int UtgiftPrDag (int mnd, int aar, Double d) {
		


}

class Subinntekt{

	String navn;
	
	Double totSum = 0;

	Arraylist oversiktSubinntekt = new Arraylist;

	Subinntekt(String s, Double d){

	}

}

class Subutgift{

	String navn;
	
	Double totSum = 0;

	Arraylist oversiktSubutgift = new Arraylist;

	Subutgift(String s, Double d){

}