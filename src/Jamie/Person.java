package Jamie;

import java.util.Arrays;

public class Person {
    private String[] names;
  private String firstName;
  private String middleName;
  private String lastName;

  public Person (String fullNAme){
      names = fullNAme.trim().split("\\s+");
      if (names.length == 2){
          this.firstName = names[0];
          this.lastName = names[1];
      } else if ( names.length == 3 ){
          this.firstName = names[0];
          this.middleName = names[1];
          this.lastName = names[2];
      } else {
          System.out.println("Only 2 or 3 names: ");
      }

  }

    @Override
    public String toString() {
        return "FirstName: " + firstName + '\'' +
                "MiddleName: " + middleName + '\'' +
                "LastName: " + lastName + '\'';
    }
}