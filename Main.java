class Main {
  public static void main(String[] args) {
   int defaultedDays=14,amountPerDay=500,amountToPay;
   int daysPaidFor,amountLeftToPay,daysNotPaid,amountPayed=3500,amountNotInDay;
   
   amountToPay=defaultedDays*amountPerDay;
   System.out.println("the amount to pay is:"+amountToPay);
   
   daysPaidFor=amountPayed/amountPerDay;
   System.out.println("the days paid for are:"+daysPaidFor);
   
   amountNotInDay=amountPayed%amountPerDay;
   System.out.println("the amount that doesnt cover a day is:"+amountNotInDay);
   
   if(amountNotInDay>0){
   
   amountLeftToPay=((defaultedDays-daysPaidFor)*amountPerDay)+(amountPerDay-amountNotInDay);
   System.out.println("the amount left to pay is:"+amountLeftToPay);
   }
   
   else{
	   amountLeftToPay=((defaultedDays-daysPaidFor)*amountPerDay);
   System.out.println("the amount left to pay is:"+amountLeftToPay);
   }
   daysNotPaid=defaultedDays-daysPaidFor;
   System.out.println("the days not paid for are:"+daysNotPaid);

   // calculate and print the days the debtor paid for
  
  // calculate and print the amount whose day was not captured because the amount was incomplete

   // calculate and print amount the debtor is left to pay

   // calculate and print days the debtor has not payed for

   //kindly remove the statement below when you are done with the assignment
    
  }
}