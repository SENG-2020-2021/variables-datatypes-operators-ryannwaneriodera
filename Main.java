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

  
    
  }
}
