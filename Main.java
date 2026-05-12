/********************************************
*	DEVELOPER:	Bee Smith
* COLLABORATORS: 
*	LAST MODIFIED:	5/11/2026
********************************************/
/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/

class Main 
{
  public static void main(String[] args) 
	{
    //TODO PART 3: test your setter/getter here!


    //this data represents one daca recipient
    // String surname;
    // String givenName;
    // String uscisNumber;
    // String countryOfOrigin;
    // int birthday, validFormDate, expirationDate;
    // char sex;

    DACArecipient test = new DACArecipient();
    DACArecipient test2 = new DACArecipient();
    DACArecipient test3 = new DACArecipient();

    //test.surname = "Bee";
    System.out.println("Test surname = " + test.getSurname());
    System.out.println("Test birthday = " + test.getBirthday());
    System.out.println("Test sex = " + test.getSex());

    

  }
}