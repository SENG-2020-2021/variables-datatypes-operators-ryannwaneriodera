class Main {
  public static void main(String[] args) {
   int defaultedDays=10,amountPerDay=1000,amountToPay;
   int daysPaidFor,amountLeftToPay,daysNotPaid,amountPayed=3000,amountNotInDay;
   
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
