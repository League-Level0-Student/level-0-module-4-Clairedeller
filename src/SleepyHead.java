
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
   int answer=JOptionPane.showConfirmDialog(null, "Is it a weekday?", "",
    		JOptionPane.YES_NO_OPTION);

   int answer2=JOptionPane.showConfirmDialog(null, "Is it a Holiday or Vacation?", "",
   		JOptionPane.YES_NO_OPTION);
   if(answer==0 && answer2==1){
	   JOptionPane.showMessageDialog(null, "Get up Lazy bones!");
   }
   else {JOptionPane.showMessageDialog(null, "Sleep in!");
        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    }
}
}
