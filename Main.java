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
   
   
   amountLeftToPay=(defaultedDays*amountPerDay)-amountPayed;
   System.out.println("the amount left to pay is:"+amountLeftToPay);
   

   daysNotPaid=defaultedDays-daysPaidFor;
   System.out.println("the days not paid for are:"+daysNotPaid);
  }
}
