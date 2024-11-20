public class EmployeeMain2 {
   public static void main(String[] args){
    //Lawyer output
    System.out.print("Lawyer: ");
    Lawyer ls = new Lawyer();
    System.out.print(ls.getHours() + ", ");
    System.out.printf("$%.2f, ", ls.getSalary());
    System.out.print(ls.getVacationDays() + ", ");
    System.out.println(ls.getVacationForm());
    ls.handelLawsuits("Hello Kitty is sued by SpongeBob for stealing the Krabby Patty's recipe.");
    
    //Legal Secretary output
    System.out.print("Legal Secretary: ");
    LegalSecretary leo = new LegalSecretary();
    System.out.print(leo.getHours() + ", ");
    System.out.printf("$%.2f, ", leo.getSalary());
    System.out.print(leo.getVacationDays() + ", ");
    System.out.println(leo.getVacationForm());
    leo.takeDictation("neato");
    leo.fileLegalBriefs();
    
    }

}