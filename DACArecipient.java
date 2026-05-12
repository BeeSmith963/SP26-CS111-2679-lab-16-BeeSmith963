/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 * 
 * <TODO: add @author info here for all group-mates!>
 *
 *	@version 1.0
 **/

//TODO: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
<class name>
-----------------------------------------
- surname : String
- givenName : String
- uscisNumber : String
- countryOfOrigin : String
- birthday : int
- validFormDate  : int
- expirationDate : int
- sex : char
-----------------------------------------
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountryOfOrigin() : String
+ getBirthday() : int
+ getValidFormDate() : int
+ getExpirationDate() : int
+ getSex(sex : char) : char

+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void
+ setUscisNumber(uscisNumber : String) : void
+ setCountryOfOrigin(countryOfOrigin : String) : void
+ setBirthday(birthday : int) : void
+ setValidFormDate(validFormDate  : int) : void
+ setExpirationDate(expirationDate : int) : void
+ setSex() : void

+setAll(surname : String, givenName : String, uscisNumber : String, countryOfOrigin : String, birthday : int, validFormDate  : int, expirationDate : int, sex : char) : void
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	//TODO: Declare the instance variables. 
	public String surname;
	private String givenName;
	private String uscisNumber;
	private String countryOfOrigin;
	private int birthday, validFormDate, expirationDate;
	private char sex;

	/***** ACCESSORS *****/
	//TODO: Write the getter for each instance variable. Remember to include documentation for each method.
	
	/**
	 * Returns surname of calling object 
	 * 
	 * @return String representing surname
	 */
	public String getSurname(){
		return this.surname;
	}
	public String getGivenName()
	{
		return this.givenName;
	}
	public String getUscisNumber()
	{
		return this.uscisNumber;
	}
	public String getCountryOfOrigin()
	{
		retunr this.countryOfOrigin;
	}
	public int getBirthday;
	{
		return this.birthday;
	}
	public int getValidFormDate()
	{
		return this.validFormDate;
	}
	public int getExpirationDate()
	{
		return this.expirationDate;
	}
	public char getSex()
	{
		return this.sex;
	}

	/***** MUTATORS *****/
	//TODO: Write the setter for each instance variable. Remember to include documentation for each method.

	//TODO: Write the setAll method. Remember to include documentation.

}