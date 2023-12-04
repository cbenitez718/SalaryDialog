// Chapter 2 example (Text page 85)

import javax.swing.JOptionPane;

public class SalaryDialog
{
public static void main(String[] args) 
	{
	// Variables and constants
	String wageString;
	String dependentsString;
	double wage;
	double weeklyPay;
	int dependents;
	final double HOURS_IN_WEEK = 37.5;
	
	// Input Phase
	wageString = JOptionPane.showInputDialog(null, "Please enter employee's hourly wage:", "Salary dialog 1", JOptionPane.INFORMATION_MESSAGE);
	wage = Double.parseDouble(wageString);

	dependentsString = JOptionPane.showInputDialog(null, "Now, enter the number of dependents?", "Salary dialog 2", JOptionPane.WARNING_MESSAGE);
	dependents = Integer.parseInt(dependentsString);

	// Processing phase
	weeklyPay = wage * HOURS_IN_WEEK;

	// Output phase
	JOptionPane.showMessageDialog(null, "Weekly salary is $" + weeklyPay + "\nDeductions will be made for " + dependents + " dependents");

	/* Code from book - not used
	JOptionPane.showMessageDialog(null, "Weekly salary is $" + wage + "\nDeductions will be made from " + dependents + " dependents");
	*/

	}
}

