package question10;

import java.sql.SQLException;

public class superClass {
	
	void methodOfSuperClass() throws SQLException{
		System.out.println("Super class");}
		}
		class SubClass extends superClass{
		
		void methodOfSuperClass() throws ArrayIndexOutOfBoundsException{
		System.out.println("can be overrided");}
		}
		
		class SubClassOne extends superClass{
		
		void methodOfSuperClass() throws NumberFormatException, NullPointerException{
		System.out.println("can be overrided with any number of unchecked exceptions");}
		}
		class SubClassTwo extends superClass{
		
		void methodOfSuperClass() throws SQLException{



		}
		}
