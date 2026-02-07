import java.util.Scanner;
class Sample5{
	static Scanner sc = new Scanner(System.in);
	void m1(float f, String s){
		System.out.println(f);
		System.out.println(s);
		}
	static long m2(Boolean b, long l){
		System.out.println(b);
		System.out.println(l);
		return sc.nextLong();
		}
	
	 void m3(char c, int i){
		System.out.println(c);
		System.out.println(i);
		}
	public static void main(String[] args){
		Sample5 obj = new Sample5();
		obj.m1(sc.nextFloat(),sc.next());
		System.out.println(m2(sc.nextBoolean(),sc.nextLong()));
		obj.m3(sc.next().charAt(0),sc.nextInt());
	}
}

class A{
	static Scanner sc = new Scanner(System.in);
	static double m1(boolean b){
		System.out.println(b);
		return sc.nextDouble();
		}
	short m2(char c){
		return sc.nextShort();
		}
	static int m3(double d){
		return sc.nextInt();
		}
	String m4(long l){
		return sc.next();
		}
	static long m5(float f){
		return sc.nextLong();
		}
	byte m6(String s){
		return sc.nextByte();
		}
	public static void main(String[] args){
		A obj = new A();
		m1(sc.nextBoolean());
		obj.m2(sc.next().charAt(0));
		m3(sc.nextDouble());
		obj.m4(sc.nextLong());
		m5(sc.nextFloat());
		obj.m6(sc.next());
		}
}


class B{
	void m1(){
		System.out.println("Method m1");
		}
		
	public static void main(String[] args){
		B obj = new B();
		obj.m1();
		}
}



class C{
	static Scanner sc = new Scanner(System.in);
	static boolean m1(String s){
		System.out.println(s);
		System.out.println(m2(sc.nextLong()));
		System.out.println("m1 method");
		System.out.println(m3(sc.nextDouble()));
		return sc.nextBoolean();
		}
	static char m2(long l){
		System.out.println(l);
		System.out.println("m2 method");
		return sc.next().charAt(0);
		}
	static int m3(double d){
		System.out.println(d);
		System.out.println("m3 method");
		System.out.println(m2(sc.nextLong()));
		return sc.nextInt();
		}
	public static void main(String[] args){
		System.out.println(m1(sc.next()));
		}
}


class D{
	static Scanner sc = new Scanner(System.in);
	static D obj = new D();
	boolean m1(String s){
		m2(sc.nextLong());
		System.out.println(s);
		System.out.println("m1 method");
		return sc.nextBoolean();
		}
	static char m2(long l){
		obj.m3(sc.nextDouble());
		System.out.println(l);
		return sc.next().charAt(0);
		}
	int m3(double d){
		System.out.println(d);
		return sc.nextInt();
		}
	public static void main(String [] args){
		obj.m1(sc.next());
		}
}

class E{
	static Scanner sc = new Scanner(System.in);
	int m1(){
		System.out.print("m1");
		return sc.nextInt();
		}
	static float m2(String s){
		System.out.print(s);
		return sc.nextFloat();
		}
	public static void main(String[] args){
		E obj = new E();
		System.out.print(obj.m1()+m2(sc.next()));
	}
}

class F{
	static Scanner sc = new Scanner(System.in);
	static F obj = new F();
	double m1(double a,double b){
		return a*b;
	}
	double m2(double c,double d){
		return c+d;
	}
	public static void main(String[] args){
		double d1=obj.m1(sc.nextDouble(),sc.nextDouble());
		double d2=obj.m2(sc.nextDouble(),sc.nextDouble());
		System.out.print(d1-d2);
	}
}

class G{
	static Scanner sc = new Scanner(System.in);
	static G obj = new G();
	double m1(double a,double b){
		return a*b;
		}
	double m2(double c,double d){
		return c-d;
		}
	public static void main(String[] args){
		double ror=obj.m1(sc.nextDouble(),sc.nextDouble())-obj.m2(sc.nextDouble(),sc.nextDouble());
		System.out.print(ror);
		
		}
}



class H{
	static Scanner sc = new Scanner(System.in);
	static H obj = new H();

	static boolean m1(double d1){
		return sc.nextBoolean();
	}
	char m2(String s1){
		m1(sc.nextDouble());
		return sc.next().charAt(0);
	}
	static long m3(float f1){
		obj.m2(sc.next());
		return sc.nextLong();
	}
	void m4(String s2){
		System.out.print("m4 method");
		m3(sc.nextFloat());
	}
	public static void main(String[] args){
		
		obj.m4(sc.next());
	}
}


class J{
	static Scanner sc = new Scanner(System.in);
	static J obj = new J();
 	int m1(){
		return sc.nextInt();
		}
	void m2(int q){
		System.out.print(q);
		}
	public static void main(String[] args){
		System.out.print(obj.m1());
		obj.m2(sc.nextInt());	
	}
}	


class K{
	static Scanner sc = new Scanner(System.in);
	static String m1(long l){
		System.out.print(l);
		return sc.next();
	}
	static long m2(double d){
		System.out.print(d);
		return sc.nextLong();
	}
	public static void main(String[] args){
		System.out.print(m2(sc.nextDouble()));
		System.out.print(m1(m2(sc.nextDouble())));
	}
}

class L{
	static Scanner sc = new Scanner(System.in);
	static boolean m1(short s){
		System.out.println("m1 method");
		System.out.println(s);
		return sc.nextBoolean();
	}
	static void m2(boolean b){
		System.out.println("m2 method");
		System.out.print(b);
		}
	public static void main(String[] args){
		m2(m1(sc.nextShort()));
	}
}

/*Create a java application where we have one class it contains 2 static methods like m1 and m2 having parameters int and string respectively and returns string and Boolean respectively. Invoke both the methods under main method by providing dynamic inputs.
Note: callings must be done under a single statement*/

class M{
 	static Scanner sc = new Scanner(System.in);
	static String m1(int i){
		System.out.print("m1 method");
		return sc.next();
		}
	static boolean m2(String s){
		System.out.print("m2 method");
		return sc.nextBoolean();
		}
	public static void main(String[] args){
		System.out.print(m2(m1(sc.nextInt())));
	}
}

class N{
	
	static Scanner sc = new Scanner(System.in);
	static int m1(float f){
		System.out.println(f);
		return sc.nextInt();
		}
	static float m2(double d){
		System.out.println(d);
		return sc.nextFloat();
		}
	void m3(int i){
		System.out.println(i);
		}
	public static void main(String[] args){
		N obj = new N();
		obj.m3(m1(m2(sc.nextDouble())));
		}
}

class O{
	static Scanner sc = new Scanner(System.in);
	static boolean m1(long l, double d){
   		return sc.nextBoolean();
		} 
	static double m2(String s){
		return sc.nextDouble();
		}
	static String m3(short t){
		return sc.next();
		}
	static long m4(){
		return sc.nextLong();
		}
	public static void main(String[] args){
		m1(m4(),m2(m3(sc.nextShort())));
		}
}


class P{
	static P obj = new P();
	static Scanner sc = new Scanner(System.in);
	void m1(String s,int i){
		System.out.println("m1 method");
		}
	static int m2(float f, double d){
		System.out.println("m2 method");
		return sc.nextInt();
		}
	double m3(short r){
		System.out.println("m3 method");
		return sc.nextDouble();
		}
	String m4(byte b){
		System.out.println("m4 method");
		return sc.next();
		}
	public static void main(String[] args){
		obj.m1(obj.m4(sc.nextByte()),m2(sc.nextFloat(),obj.m3(sc.nextShort())));
	}
}

class Q1{
	static Scanner sc = new Scanner(System.in);
	static Q1 obj = new Q1();

	int m1(int a,int b){
		return a+b;
	}	
	
	static double m2(double d1,double d2){
		if(d1>d2 )
			return d1;
		else 
			return d2;
		
	}		
	boolean m3(int p){
		if(p%2==0)
			return true;
		else
			return false;
		}
	static String m4(String s){
		return sc.next();
		}
	public static void main(String[] args){
		//System.out.print(obj.m1(sc.nextInt(),sc.nextInt()));
		//System.out.print(m2(sc.nextDouble(),sc.nextDouble()));
		//System.out.print(obj.m3(sc.nextInt()));
		//single statement invoke
			System.out.print(obj.m1(sc.nextInt(),sc.nextInt())+","+m2(sc.nextDouble(),sc.nextDouble())+","+obj.m3(sc.nextInt()));
		}
}


class Ex1{
	static Scanner sc = new Scanner(System.in);
	static Ex1 obj = new Ex1();
	String m1(float a,String s){
		System.out.println(a);
		System.out.println(s);
		return sc.next();
		}
	static double m2(boolean b,long l){
		System.out.println(b);
		System.out.println(l);
		return sc.nextDouble();
		}
	void m3(char c,int i){
		System.out.println(c);
		System.out.println(i);
		}
	public static void main(String[] args){
		System.out.print(obj.m1(sc.nextFloat(),sc.next()));
		System.out.print(m2(sc.nextBoolean(),sc.nextLong()));
		obj.m3(sc.next().charAt(0),sc.nextInt());
		}
}

class S{
	static Scanner sc = new Scanner(System.in);
	static int m1(){
		System.out.println("m1 method");
		return sc.nextInt();
		}
	static int m2(){
		System.out.println("m2 method");
		return m1();
		}
	public static void main(String[] args){
		System.out.print(m2());
		}
}

class T{
	static Scanner sc = new Scanner(System.in);
	int m1(String s){
		System.out.println("m1 method");
		return m2(sc.nextBoolean());
		}
	int m2(boolean b){
		System.out.println("m2 method");
		return sc.nextInt();
		}
	public static void main(String[] args){
		T obj = new T();
		System.out.println(obj.m1(sc.next()));
		}
}

class U{
	static Scanner sc = new Scanner(System.in);
	static String m1(long l){
		return sc.next();
		}
	static String m2(char c){
		return m1(sc.nextLong());
		}
	public static void main(String[] args){
		System.out.print(m2(sc.next().charAt(0)));
		}
}

class V{
	static Scanner sc = new Scanner(System.in);
	static V obj = new V();
	static boolean m1(char c){
		return obj.m3(sc.nextFloat());
	}
	static byte m2(double d){
		return obj.m4(sc.nextByte());
		}
	boolean m3(float f){
		return sc.nextBoolean();
		}
	byte m4(int i){
		return sc.nextByte();
		}
	public static void main(String[]args){
		System.out.print(m1(sc.next().charAt(0)));
		System.out.print(m2(sc.nextDouble()));
		}
}

/* class Bank{
	static Scanner sc = new Scanner(System.in);
	String acno = sc.next();
	double balance=sc.nextDouble();
	void withdraw(double amount){
		if(balance>=amount){
			balance = balance-amount;
			}
		else{
			System.out.print("insuficient balance");
			}
	}e
	void deposit(double amount){
		if(amount>0)
			balance=balance+amount;
		else
			System.out.print("invalid diposit amount");
	
	}
	public static void main(String[] args){
		System.out.println("Enter Account number and balance for user1");
		Bank user1 = new Bank();
		System.out.println("Enter Account number and balance for user2");
		Bank user2 = new Bank();
		System.out.println("balance of user1:");
		System.out.println(user1.balance);
		System.out.println("balance of user2:");
		System.out.println(user2.balance);
		System.out.println("enter amount for deposit into user1 account:");
		user1.withdraw(sc.nextDouble());
		user2.deposit(sc.nextDouble());
		user2.withdraw(sc.nextDouble());
		System.out.println(user1.balance);
		System.out.println(user2.balance);
		}
}
*/

class Test{
	static void m1(Test obj){
		System.out.print(obj);
		}
	public static void main(String[]args){
		m1(new Test());
		}
	}

class Te1{
	static Scanner sc= new Scanner(System.in);
	String s = sc.next();
	static void m1(Te1 obj){
		System.out.println("m1 method");
		System.out.println(obj.s);
		}
	public static void main(String[]args){
		m1(new Te1());
		m1(new Te1());
		}
}


class Te2{
	static Scanner sc = new Scanner(System.in);
	static boolean m1(Te2 obj){
		return sc.nextBoolean();
		}
	static boolean m2(Te2 obj){
		return sc.nextBoolean();
		}
	public static void main(String[] args){
		System.out.print(m1(new Te2()));
		System.out.print(m2(new Te2()));
	}
}	

/*Create a java application where we have one class it contains 2 static methods like m1 and m2 methods m1 having parameter as class name and returns nothing, m2 having parameter boolean and returns short value, and we have one non static method like m3 having parameter as long and returns a double value. Invoke m3 under m1 and invoke m1 and m2 under main method by providing dynamic inputs
Note:- create object only under main method*/			

class Te3{
	static Scanner sc = new Scanner(System.in); 
	static void m1(Te3 a){
		a.m3(sc.nextLong());
		}
	static short m2(boolean b){
		return sc.nextShort();
		}
	double m3(long l){
		return sc.nextDouble();
		}
	public static void main(String[] args){
		Te3 obj = new Te3();
		m1(obj);
		m2(sc.nextBoolean());
		}
}
	
/*Create a java application where we have one class it contains 2 static variables and 2 nonstatic variables, a non-static method m1 having parameter and return type and a static 
method with parameter and return type then invoke variables and m1 under m2 and m2 
under main method by providing dynamic inputs.
Note: Create object only under main method and use the object whatever created under 
main method to invoke properties under m2*/

class Te4{
	static Scanner sc = new Scanner(System.in);
	static String s = sc.next();
	static int i = sc.nextInt();
	double d = sc.nextDouble();
	char c = sc.next().charAt(0);
	short m1(float f){
		System.out.println(f);
		return sc.nextShort();
		}
	static long m2(Te4 obj){
		System.out.println(obj);
		System.out.println(s);
		System.out.println(obj.d);
		System.out.println(obj.c);
		System.out.println(obj.m1(sc.nextFloat()));
		return sc.nextLong();
	}
	public static void main(String[]args){
		Te4 obj = new Te4();
		m2(obj);
	}
}

class Fm{
	static Fm m1(){
		System.out.println("Factory method");
		return new Fm();
		}
	void m2(){
		System.out.println("m2");
		}
	public static void main(String[]args){
		//m1().m2();
		Fm obj=m1();
		obj.m2();
		}
}


class Fm1{
	static Scanner sc = new Scanner(System.in);
	String s =sc.next();
	static Fm1 m1(int a){
		System.out.print(a);
		return new Fm1();
		}
	boolean m2(long l){
		System.out.println(l);
		return sc.nextBoolean();
		}
	public static void main(String[] args){
		Fm1 x = m1(sc.nextInt());
		System.out.println("main");
		System.out.println(m1(sc.nextInt()).s);
		x.m2(sc.nextLong());
		}
}

class Fm3{
	static Scanner sc = new Scanner(System.in);
	static Fm3 m1(){
		System.out.print("m1");
		return new Fm3();
		}  
	static int m2(boolean b){
		System.out.print(b);
		return sc.nextInt();
		}
	boolean m3(String s){
		System.out.print(s);
		return sc.nextBoolean();
		}
	public static void main(String[] args){
		m2(m1().m3(sc.next()));
		}
}

/*create a java application where we have one class it contains a static method like m1 having parameter String and returns an integer value, 2 nonstatic methods like m2 and m3 having parameters and return types. invoke all these methods under main method by providing dynamic inputs.
Note:- if m1's return value is greater than 100 invoke m2 else invoke m3
*/

class Qwe{
	static Scanner sc = new Scanner(System.in);
	static int m1(String s){
		return sc.nextInt();
		}
	long m2(float f){
		return sc.nextLong();
		}

	float m3(double d){
		return sc.nextFloat();
		}
	public static void main(String[] args){
		Qwe obj = new Qwe();
		if(m1(sc.next())>100){
			System.out.println("m2");
			obj.m2(sc.nextFloat());
			}
			else{
			System.out.println("m3");
			obj.m3(sc.nextDouble());
			}
	}
}

/*
create a java application where we have one class it contains one static method like m1 having no parameter and returns a class variable, we have one non static method like m2 having parameters float, int, char and returns a double value, a static method like m3 having parameter as class variable and returns a integer value, a non static method m4 having no parameters an returns a float value, a static method like m5 having parameters String and returns a char value.
invoke all these methods under main method by providing dynamic inputs without using the import keyword.
Note;- invoke all these methods under a single statement and without creating the object explicitly.*/


class Qwe1{
	static Scanner sc = new Scanner(System.in);
	static Qwe1 m1(){
		System.out.println("m1 method");
		return new Qwe1();
		}
	double m2(float f,int i,char c){
		System.out.println("m2");
		return sc.nextDouble();
		}
	static int m3(Qwe1 x){
		System.out.println("m3");
		return sc.nextInt();
		}
	float m4(){
		System.out.println("m4");
		return sc.nextFloat();
		}
	static char m5(String s){
		System.out.println("m5");
		return sc.next().charAt(0);
		}
	public static void main(String[] args){
		//Qwe1 obj=m1();
		//obj.m2(sc.nextFloat(),sc.nextInt(),sc.next().charAt(0));
		//m3(obj);
		//obj.m4();
		//m5(sc.next());
		System.out.print(m1().m2(m1().m4(),m3(m1()),m5(sc.next())));
		m1().m2(m1().m4(),m3(m1()),m5(sc.next()));
		}
}


/*create a java application where we have one class it contains a static method like m1 having parameter float and returns an object, a static method m2 having parameter as class name and returns boolean value, a non static method m3 having parameter String and returns boolean value. invoke m1 and m2 under m3 under a single statement, invoke m3 under main by providing dynamic inputs.
Note:- do not create object explicitly*/


class Qwe2{
	static Scanner sc = new Scanner(System.in);
	static Qwe2 m1(float f){
		return new Qwe2();
		}
	static boolean m2(Qwe2 a){
		return sc.nextBoolean();
		}
	boolean m3(String s){
		System.out.println(m1(sc.nextFloat()));
		System.out.println(m2(m1(sc.nextFloat())));
		return sc.nextBoolean();
		}
	public static void main(String[] args){
		System.out.println(m1(sc.nextFloat()).m3(sc.next()));
	}
}

/*Create a Java application where we have an Organization with details like EmpId, EmpName, EmpSalary, EmpDesignation, and EmpWorkLocation, OrganizationName. Create instances for Five employees. There is a method named EmployeeDetails with a Class variable as a parameter and it returns nothing. Invoke this method under main and while invoking, According to user choice, the respective employee details should be displayed.Provide Dynamic inputs.
Note: Do not use an Import statement.

class Organization{
	static Scanner sc = new Scanner(System.in);
		static int EmpId = sc.nextInt();
		static String EmpName = sc.next();
		static int EmpSalary = sc.nextInt();
		static Sting EmpDesignation = sc.next();
		static String EmpWorkLocation = sc.next();
		static String OrganizationName = sc.next();
	static void EmpDetails(Organization e){
		System.out.println(EmpId);
		System.out.println(EmpName);
		System.out.println(EmpSalary);
		System.out.println(EmpDesignation);
		System.out.println(EmpWorkLocation);
		System.out.println(OrganizationName);
		}	
	public static void main(String[]args){
		Organization e = new Organization();
		Organization e1 = new Organization();
		Organization e2 = new Organization();
		Organization e3 = new Organization();
		Organization e4 = new Organization();
		Organization e5 = new Organization();
		e1 = EmpDetails(e);
		e2 = EmpDetails(e);
		e3 = EmpDetails(e);
		e4 = EmpDetails(e);
		e5 = EmpDetails(e);
		int choice = sc.nextInt();
		switch(choice){
			case 1 : System.out.print(e1);
			break;
			case 2 : System.out.print(e2);
			break;
			case 3 : System.out.print(e3);
			break;
			case 4 : System.out.print(e4);
			break;
			case 5 : System.out.print(e5);
			break;
			}
		}
}*/

class Cn{
	static java.util.Scanner sc = new java.util.Scanner(System.in);
	int a = sc.nextInt();
	Cn(){
		System.out.println("My Constructor");
		System.out.println(a);
		}
	public static void main(String[]args){
		System.out.println("Hellow");
		Cn obj = new Cn();
		System.out.println(obj.a);
		}
}

/*Create a Java Application where we have one class, it contains a default constructor, Single parameterized constructor, double parameterized constructor, and Triple parameterized constructor. invoke all these constructors under the main by giving dynamic inputs.*/

class Ja{
	static Scanner sc = new Scanner(System.in);
	Ja(){
	}
	Ja(int a ){
		System.out.println(a);
	}
	Ja(String s,float f){
		System.out.println(s);
		System.out.println(f);
	}
	Ja(double d,char c,long l){
		System.out.println(d);
		System.out.println(c);
		System.out.println(l);
	}
public static void main(String[] args){
	Ja obj = new Ja();
	Ja obj1= new Ja(sc.nextInt());
	Ja obj2= new Ja(sc.next(),sc.nextFloat());
	Ja obj3= new Ja(sc.nextDouble(),sc.next().charAt(0),sc.nextLong());
	// obj1.Ja(sc.nextInt());
	//obj2.Ja(sc.next(),sc.nextFloat());
	//obj3.Ja(sc.nextDouble(),sc.next().charAt(0),sc.nextLong());
	}
}


//constructor injection
class Inj{
	static Scanner sc = new Scanner(System.in);
	String s;
	int a;
	Inj(String s1,int a1){
		s=s1;
		a=a1;
		}
	public static void main(String[] args){
		Inj obj = new Inj(sc.next(),sc.nextInt());
		System.out.println(obj.s);
		System.out.println(obj.a);
	}
}

//constructor parametersFv c

class Cp{
	Cp(Cp obj){
		System.out.println(obj);
		}
	Cp(String s){
		System.out.print("my parm.cons");
		}
	public static void main(String[]args){
		Cp obj1 = new Cp(new Cp("hello"));
		System.out.println(obj1);
		}
}		

/*Create a java application where we have one employee, they have to display the details emp ID, name, salary, designation, and mobile number by using the parameterized constructor, then invoke the constructor under main by providing dynamic inputs.*/

class emply{
	static Scanner sc = new Scanner(System.in);
	emply(int empid,String name,int Salary,String desig,long mobile){
		System.out.println(empid);
		System.out.println(name);
		System.out.println(Salary);
		System.out.println(desig);
		System.out.println(mobile);
		}
	public static void main(String[] args){
		emply obj = new emply(sc.nextInt(),sc.next(),sc.nextInt(),sc.next(),sc.nextLong());
		System.out.print(obj);
		}
}

/*Create a java app where we have one class, it contains a default constructor, double parameterized constructor, Tripple parameterized constructor, methods like m1, m2, and m3 with parameters and return types then invoke all constructors under main by providing dynamic inputs, invoke m1 under default constructor, m2 under double parameterized constructor and m3 under Tripple parameterized constructor by giving dynamic inputs.*/

class Co1{
	static Scanner sc = new Scanner(System.in);
	Co1(){
		System.out.println("defalt con");
		m1(sc.nextInt());
	}
	Co1(int i,long l){
		System.out.println(i);
		System.out.println(l);
		m2(sc.next());
		}
	Co1(String s,boolean b,char c){
		System.out.println(s);
		System.out.println(b);
		System.out.println(c);
		m3(sc.next().charAt(0));
		}
	float m1(int x){
		System.out.println(x);
		return sc.nextFloat();
		}
	double m2(String y){
		System.out.println(y);
		return sc.nextDouble();
		}
	boolean m3(char z){
		System.out.println(z);
		return sc.nextBoolean();
		}
	public static void main(String[]args){
		Co1 obj = new Co1();
		Co1 obj1 = new Co1(sc.nextInt(),sc.nextLong());
		Co1 obj2 = new Co1(sc.next(),sc.nextBoolean(),sc.next().charAt(0));
		}
}

/*Create a Java Application where we have one static variable integer, two non-static variables Boolean and double, one non static method with parameter char and returns long value, a default constructor and a parameterized constructor. then invoke all the properties under main by providing dynamic inputs.

class Co2{
	static Scanner sc = new Scanner(System.in);
	static int a = sc.nextInt();
	boolean b = sc.nextBoolean();
	double d = sc.nextDouble();
	long m1(char c){
		System.out.println(c);
		return sc.nextLong();
		}
	Co2(){
		System.out.println("Default con");
		}
	Co2(float f){
		System.out.println(f);
		}
	public static void main(String[] args){
		Co2 obj = new Co2();
		System.out.println(a);
		System.out.println(obj.b);
		System.out.println(obj.d);
		Co2 obj1 = new Co2(sc.nextFloat());
		System.out.println(obj.m1(sc.next().charAt(0)));
		}
}

*/
/*Create a java application where we need to create any two constructors and then invoke any one constructor under the main method from there it has to invoke the remaining constructor*/

class Co3{
	static Scanner sc = new Scanner(System.in);
	Co3(){	
		this(sc.nextInt());
		System.out.println("def con");
		}

	Co3(int a){
		System.out.println("second con");
		System.out.println(a);
		}
	public static void main(String[] args){
		Co3 obj1 = new Co3();
		}
}
	


//copy constructor

class Cc{
	static Scanner sc = new Scanner(System.in);
	String name;
	int id;
	Cc(String name1,int id1){
		name=name1;
		id = id1;
		}
	Cc(Cc s)	//copy con
	{
		name=s.name;
		id = s.id;
	}
	public static void main(String[] args){
		Cc s1 = new Cc(sc.next(),sc.nextInt());
		Cc s2 = new Cc(sc.next(),sc.nextInt());
		Cc s3 = new Cc(sc.next(),sc.nextInt());
		Cc s4 = new Cc(s2);
		System.out.println(s1.name+" "+s1.id);
		System.out.println(s2.name+" "+s2.id);
		System.out.println(s3.name+" "+s3.id);
		System.out.println(s4.name+" "+s4.id);
		}		
}

/*Create a java application where we have one class like employee having variables like name, id and salary. Initialise these variables using a parameterized constructor. We have a display method to display the employee details. Create objects for 3 employees and provide the values. Now create a 4th object and copy the data from one of the 3 existing objects into this object with the help of copy constructor and display all the 4 object details with
 the help of display method by providing dynamic inputs*/

class emp1{
	static Scanner sc = new Scanner(System.in);
	String name;
	int id;
	int salary;
	emp1(String name1,int id1,int salary1){
		name=name1;
		id = id1;
		salary=salary1;
		}
	emp1(emp1 x){
		name=x.name;
		id=x.id;
		salary=x.salary;
		}
	void display(){
		System.out.println(name);
		System.out.println(id);
		System.out.println(salary);
		}
	public static void main(String [] args){
		emp1 obj1 = new emp1(sc.next(),sc.nextInt(),sc.nextInt());
		emp1 obj2 = new emp1(sc.next(),sc.nextInt(),sc.nextInt());
		emp1 obj3 = new emp1(sc.next(),sc.nextInt(),sc.nextInt());
		emp1 obj4 = new emp1(obj1);
		emp1 obj5 = new emp1(obj2);
		obj1.display();
		obj5.display();
		//System.out.println(obj1);
		//System.out.println(obj5);
		}
}
	
		
/*
class Oc{
	static Scanner sc = new Scanner(System.in);
	static boolean m1(int a){
		System.out.println("m1 method");
		return sc.nextBoolean();
			}
	void m2(boolean b){
		System.out.println("m2 method");
		}
	Oc(String s){
		System.out.println("constructor");
		}
	public static void main(String[] args){
		new Oc(sc.next()).m2(m1(sc.nextInt()));
	}
}*/

/*create a java application where we have one class that contains 2 static methods like m1 and m2 having parameters float and double respectively and returns int and float respectively. we have one non static method like m3 having parameter int and returns nothing, and we have 2 constructors having parameters double and char respectively. invoke all these methods under main method under a single statement by providing dynamic inputs.*/

class Oc1{
	static Scanner sc = new Scanner(System.in);
	static int m1(float f){
		System.out.println("m1");
		return sc.nextInt();
	}
	static float m2(double d){
		System.out.println("m2");
		return sc.nextFloat();
	}
	void m3(int i){
		System.out.println("m3");
	}
	Oc1(double d){
		System.out.println(d);
	}
	Oc1(char c){
		System.out.println(c);
	}
	public static void main(String[] args){
		new Oc1(sc.nextDouble()).m3(new Oc1(sc.next().charAt(0)).m1(m2(sc.nextDouble())));
	}
}

  
	