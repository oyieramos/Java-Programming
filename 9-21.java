derek banas
the new boston

import Java.util.Scanner; // to import scanner

import java.io.*;			//handles input output
import java.util.*;			//utilities like Scanner
import java.text.*;			//
import java.math.*;			//
import java.util.regex.*;	//parent of util, includes Matcher and Pattern

java arguments ->
	Scanner scan = new Scanner(System.in)
variable =	scan.next(); //gets the newest argument, used for string
			scan.nextLine();
			scan.nextInt();
			scan.nextDouble(); //other data types
			scan.nextBigInteger();

			scan.hasNext(); //
			scan.hasNextLine(); //
			scan.hasNextInt(); // next Double, Float, Boolean, Byte, Long, Short
//print, println, printf
System.out.format("The value of " + "the float variable is " +
     "%f, while the value of the " + "integer variable is %d, " +
     "and the string is %s", floatVar, intVar, stringVar);

java variable declarations
1 2 4 8 16 32 64 128 256 512 1024 2048 4096 8192 16384 32768 65536
	byte variableName = 127				// 8-bit
	short variableName = 32767			// 16-bit
	int variableName = 210000000		// 32-bit
	long variableName = 92200000		// 64-bit
	float variableName = 3.14F
	double variableName = 3.14898765132 //bigger than float
	boolean variableName = true or false
	char variableName = 65; // output A
	char variableName = A; //output A also, can also use for string 

	String variableName = new String(stringValue); // straight 'stringValue'
	String variableName = Integer.toString(integerVariableName);
	String variableName = scan.next(); // Byte.toString(bigByte) turns bigByte to string
	int stringToInt = Integer.parseInt(StringValue);

	double variableName = (highValue)
	int variableName = int(doubleValue) //if the double value is higher than int max will only return int
										//int do not normally have decimal point
	
	Math.abs(int)			//absolute value negative -> positive, positive -> positive
	Math.max(a, b)			//returns the higher value between a and b
	Math.min(a, b)			//returns lower value from a and b
	Math.sqrt(int)			//square root integerValue
	Math.pow(a, b)			// a^b
	Math.ceil(number); 		// will usually return a double 
	Math.floor(number); 	// will usually return a double 
	Math.round(number); 	// will usually return a double 
	Math.random(); 			// will return 0 -> 1
	int NumCeiling = (int) Math.ceil(5.23); // to return an integer

	Relational Operators:
	>	<	==	!=	>=	<= //java only has == and do not have ===
	!(statement)
	"^" XOR (only returns true when one is true and one is false)

	switch (statemtn){
		case'A':
			do this;
		case 'B':
			do this;
		default:
			"else";
	}

	if(statement){
		continue; // will continue the code
		break; //will get out
	}

	try{

	} catch(e){
		//alot of type of e ArithmeticException
		//InputMismatchException 
		//Exception e will get all error
		System.out.println(e.getMessage());
		e.toString();
		e.printStackTrace();
	} 

String methods
	.charAt()			//cannot use toUpperCase() after this
	.compareTo()		//A.compareTo(B) A-B in ASCII value? returns -1 on false
	concat()
	contains()
	endsWith()
	.equals()			// A.equals(B) true if A and B have same content and case
	.equalsIgnoreCase("y"); // returns true on "y" and "Y"
	format()
	getBytes()
	getChars()
	indexOf()
	intern()
	.isEmpty();			// returns true if "" false otherwise
	join()
	lastIndexOf()
	.length()			//gets length of string
	replace()
	replaceAll()
	.split()			// .split(regEx, # of output)
	startsWith()
	.substring()			//(startIndex,endIndex) can use toUpperCase()
	toCharArray()
	.toLowerCase()			//string.toLowerCase()
	toUpperCase()
	.trim()					//string.trim() removes spaces before and after
	.valueOf()

BigInteger methods		//BigInteger is an integer bigger than long
	.add()				// a.add(b) -> return a+b
	.multiply()			// a.multiply(b) -> return a*b
	.isProbablePrime()	// variable.isProbablePrime() returns true/false
	
sum = sum.add(BigInteger.valueOf(i)); // sum += i

Array methods
	.length				//gets length of array

java.util.regex.Matcher
	.matches()			// str.matches(str.substr)	returns true or false
	.matcher()			// str.matcher(input)	
	.group()			// array of of input that passess matcher
java.util.regex.Pattern
	Pattern varName = Pattern.compile(string, Pattern.CASE_INSENSITIVE)