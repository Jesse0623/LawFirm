public class Lawyer extends Employee {
   
  public int getVacationDays() {
      return 15;
  }
  
  public String getVacationForm() {
      return "pink";        
  }
  
  public void handelLawsuits(String lawsuits) {
      System.out.println("Handel lawsuits: " + lawsuits);
  
  }
     
}

