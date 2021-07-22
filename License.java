import java.util.Random;
import java.util.GregorianCalendar;
import java.io.*;

public class License{

  //fields
   private String firstName;
   private String lastName;
   private double weight;
   private double height;
   private String eyeColor;
   private String hairColor;
   private String addressStreet;
   private int addressNumber;
   private int licenseNumber;
   private String dateOfBirth;
   private String expirationDate;
   private String newExpirationDate;
  
  //setter methods
   public void setFirstName(String userFirstName){
      firstName = userFirstName;
   }
  
   public void setLastName(String userLastName){
      lastName = userLastName;
   }
  
   public void setWeight(double userWeight){
      weight = userWeight;
   }
   
   public void setHeight(double userHeight){
      height = userHeight;
   }
   
   public void setEyeColor(String userEyeColor){
      eyeColor = userEyeColor;
   }
   
   public void setHairColor(String userHairColor){
      hairColor = userHairColor;
   }
   
   public void setAddress(){
   
      int selector = 0;
   
      Random randNumb = new Random();
      addressNumber = randNumb.nextInt(9999)+1;
      
      Random randSelector = new Random();
      selector = randSelector.nextInt(4)+1;
      
      switch(selector){
         case 1:
            addressStreet = "Belvedere Ln";
            break;
         case 2:
            addressStreet = "Dairyland Blvd";
            break;
         case 3:
            addressStreet = "Buff St";
            break;
         case 4:
            addressStreet = "Crenshaw Ave";
            break;
      }
   }
   
   public void setLicenseNumber(){
   
      Random randLicense = new Random();
      licenseNumber = randLicense.nextInt(90000001)+10000000;
   }
   
   public void setDateOfBirth(){
      
      Random randBetween = new Random();
      GregorianCalendar gc = new GregorianCalendar();
      
      int year = randBetween.nextInt(65)+1940;
      gc.set(gc.YEAR, year);
      int dayOfYear = randBetween.nextInt(gc.getActualMaximum(gc.DAY_OF_YEAR))+1;
      gc.set(gc.DAY_OF_YEAR, dayOfYear);
      
      dateOfBirth = gc.get(gc.YEAR)+"-"+(gc.get(gc.MONTH)+1)+"-"+gc.get(gc.DAY_OF_MONTH);
   }
   
   public void setExpirationDate(){
      
      Random randBetweenExp = new Random();
      GregorianCalendar gcExp = new GregorianCalendar();
      
      int year = randBetweenExp.nextInt(2)+2019;
      gcExp.set(gcExp.YEAR, year);
      int dayOfYear = randBetweenExp.nextInt(gcExp.getActualMaximum(gcExp.DAY_OF_YEAR))+1;
      gcExp.set(gcExp.DAY_OF_YEAR, dayOfYear);
      
      expirationDate = gcExp.get(gcExp.YEAR)+"-"+(gcExp.get(gcExp.MONTH)+1)+"-"+gcExp.get(gcExp.DAY_OF_MONTH);
   }
   
   public void setNewExpirationDate(){
      
      Random randBetweenNewExp = new Random();
      GregorianCalendar gcNewExp = new GregorianCalendar();
      
      int year = randBetweenNewExp.nextInt(2)+2025;
      gcNewExp.set(gcNewExp.YEAR, year);
      int dayOfYear = randBetweenNewExp.nextInt(gcNewExp.getActualMaximum(gcNewExp.DAY_OF_YEAR))+1;
      gcNewExp.set(gcNewExp.DAY_OF_YEAR, dayOfYear);
      
      newExpirationDate = gcNewExp.get(gcNewExp.YEAR)+"-"+(gcNewExp.get(gcNewExp.MONTH)+1)+"-"+gcNewExp.get(gcNewExp.DAY_OF_MONTH);
   }
   
   //getter methods
   public String getFirstName(){
      return firstName;
   }
  
   public String getLastName(){
      return lastName;
   }

   public double getWeight(){
      return weight;
   } 
   
   public double getHeight(){
      return height;
   } 
   
   public String getEyeColor(){
      return eyeColor;
   }
   
   public String getHairColor(){
      return hairColor;
   }
   
   public String getStreetAddress(){
      return addressStreet;
   }
   
   public int getAddressNumber(){
      return addressNumber;
   }
   
   public int getLicenseNumber(){
      return licenseNumber;
   }
   
   public String getDateOfBirth(){
      return dateOfBirth;
   }
   
   public String getExpirationDate(){
      return expirationDate;
   }
   
   public String getNewExpirationDate(){
      return newExpirationDate;
   }
   
}