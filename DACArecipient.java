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
- validFromDate  : int
- expirationDate : int
- sex : char
-----------------------------------------
+ getSurname() : String
+ getGivenName() : String
+ getUscisNumber() : String
+ getCountryOfOrigin() : String
+ getBirthday() : int
+ getValidFromDate() : int
+ getExpirationDate() : int
+ getSex(sex : char) : char

+ setSurname(surname : String) : void
+ setGivenName(givenName : String) : void
+ setUscisNumber(uscisNumber : String) : void
+ setCountryOfOrigin(countryOfOrigin : String) : void
+ setBirthday(birthday : int) : void
+ setValidFromDate(validFromDate  : int) : void
+ setExpirationDate(expirationDate : int) : void
+ setSex(sex : char) : void

+setAll(surname : String, givenName : String, uscisNumber : String, countryOfOrigin : String, birthday : int, validFromDate  : int, expirationDate : int, sex : char) : void
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	//TODO: Declare the instance variables. 
	private String surname;
	private String givenName;
	private String uscisNumber;
	private String countryOfOrigin;
	private int birthday, validFromDate, expirationDate;
	private char sex;

	/***** ACCESSORS *****/
	//TODO: Write the getter for each instance variable. Remember to include documentation for each method.
	
	/**
	 * Returns surname of calling object 
	 * 
	 * @return String representing surname
	 */
	public String getSurname()
	{
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
		return this.countryOfOrigin;
	}
	public int getBirthday()
	{
		return this.birthday;
	}
	public int getValidFromDate()
	{
		return this.validFromDate;
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
	//TODO: Write the setter for each instance variable. Remember to include
	//  documentation for each method.
	/**
	 * Sets surname to parameter value of calling object.
	 * 
	 * @param surName String representing last name, assume it is valid
	 */
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	public void setGivenName(String givenName)
	{
		this.givenName = givenName;
	}
	public void setUscisNumber(String uscisNumber)
	{
		this.uscisNumber = uscisNumber;
	}
	public void setCountryOfOrigin(String countryOfOrigin)
	{
		this.countryOfOrigin = countryOfOrigin;
	}
	public void setBirthday(int birthday)
	{
		this.birthday = birthday;
	}
	public void setValidFromDate(int validFromDate)
	{
		this.validFromDate = validFromDate;
	}
	public void setExpirationDate(int expirationDate)
	{
		this.expirationDate = expirationDate;
	}
	public void setSex(char sex)
	{
		this.sex = sex;
	}

	//TODO: Write the setAll method. Remember to include documentation.
	//+setAll(surname : String, givenName : String, uscisNumber : String, countryOfOrigin : String, birthday : int, validFromDate  : int, expirationDate : int, sex : char) : void
	/**
	 * sets all data for object
	 * 
	 * @Param surName String representing last name, assume it is valid
	 * @Param givenName String representing first name, assume it is valid
	 * @Param uscisNumber String representing 3-part USCIS number w dashes
	 * @Param countryOfOrigin country name assume valid country 
	 * @Param birthday Julian day number for birthday
	 * @Param validFromDate Julian day number for valid From date
	 * @Param expirationDate Julian day number for expiration date
	 * @Param sex char representing sex
	 * 
	 */

	public void setAll(String surname, String givenName,String uscisNumber, String countryOfOrigin, int birthday, int validFromDate, int expirationDate, char sex)
	{
		//this.surname = surname;
		setSurname(surname);
		setGivenName(givenName);
		setUscisNumber(uscisNumber);
		setCountryOfOrigin(countryOfOrigin);
		setBirthday(birthday);
		setValidFromDate(validFromDate);
		setExpirationDate(expirationDate);
		setSex(sex);
	}
}