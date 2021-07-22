import java.util.Scanner;
import java.io.*;

public class DungeonOfMotorVehiclesFirstDraft{

   public static License welcomeToTheDungeon() throws IOException{
   
      Scanner charStats = new Scanner(System.in);
   
      System.out.println("WELCOME, BRAVE ADVENTURER, TO THE DUNGEON OF MOTOR VEHICLES!!");
      System.out.println("Your journey into tedium and malaise begins here.");
      System.out.println("How shall I address you, oh mighty one?");
   
      String firstName = charStats.nextLine();
   
      System.out.println("Hail and well met "+ firstName +"!");
      System.out.println("What is your house's surname?");
   
      String lastName = charStats.nextLine();
   
      System.out.println("How tall are you by a count of inches?");
   
      double height = Double.parseDouble(charStats.nextLine());
   
      System.out.println("How much do you weigh by a count of pounds?");
   
      double weight = Double.parseDouble(charStats.nextLine());
   
      System.out.println("What color are your eyes?");
   
      String eyeColor = charStats.nextLine();
   
      System.out.println("What color is your hair?");
   
      String hairColor = charStats.nextLine();
   
      License charLicense = new License();
         charLicense.setFirstName(firstName);
         charLicense.setLastName(lastName);
         charLicense.setWeight(weight);
         charLicense.setHeight(height);
         charLicense.setEyeColor(eyeColor);
         charLicense.setHairColor(hairColor);
         charLicense.setAddress();
         charLicense.setLicenseNumber();
         charLicense.setDateOfBirth();
         charLicense.setExpirationDate();
      
      String[] lineTwo;
         lineTwo = new String[2];
         lineTwo[0] = charLicense.getFirstName();
         lineTwo[1] = charLicense.getLastName();
      
      double[] lineThree;
         lineThree = new double[2];
         lineThree[0] = charLicense.getWeight();
         lineThree[1] = charLicense.getHeight();
            
      String[] lineFour;
         lineFour = new String[2];
         lineFour[0] = charLicense.getEyeColor();
         lineFour[1] = charLicense.getHairColor();
      
      String[] lineSix;
         lineSix = new String[2];
         lineSix[0] = charLicense.getDateOfBirth();
         lineSix[1] = charLicense.getExpirationDate();
      
      PrintWriter licenseFile = new PrintWriter("license.txt");
         licenseFile.println("-------------------------------------------------------------------");
         licenseFile.println(charLicense.getLicenseNumber());
         licenseFile.println(lineTwo[0]+" "+lineTwo[1]);
         licenseFile.println(lineThree[0]+"    "+lineThree[1]);
         licenseFile.println(lineFour[0]+"   "+lineFour[1]);
         licenseFile.println(charLicense.getStreetAddress()+" "+charLicense.getAddressNumber());
         licenseFile.println("Date of Birth: "+lineSix[0]+"   "+"Expiration Date: "+lineSix[1]);
         licenseFile.println("-------------------------------------------------------------------");
         licenseFile.close();
   
      System.out.println("You now have in your posession a license that needs renewing.");
      System.out.println("You may need to reference this text document in your travels.");
      System.out.println("Good luck and godspeed, intrepid soul!");
      System.out.println("The challenges that await you are many.");
      System.out.println("If you can successfully update your license and maintain your sanity,");
      System.out.println("you will have bested the trials of the DUNGEON OF MOTOR VEHICLES!");
      System.out.println(" ");
      System.out.println(" ");
      System.out.println("*************************************");
      
      return charLicense;
   
   }
   
   public static void theWaitingRoom() throws IOException{
   
      Scanner activity = new Scanner(System.in);
      
      System.out.println(" ");
      System.out.println("Today is the day, hero. You've finally managed to remember your long-expired driver's license");
      System.out.println("and summoned the wherewithal to head to your local fantasy magistrate's DUNGEON OF MOTOR VEHICLES.");
      System.out.println("As you approach the unremarkable rectangular, cement-brick building, you can already tell the");
      System.out.println("winds of fate are blowing against you hard and fast. You can feel a small part of yourself");
      System.out.println("shriveling and dying just gazing upon its oppressive and featureless modern architecture.");
      System.out.println(" ");
      System.out.println("*************************************");
      System.out.println(" ");
      System.out.println("The automatic doors slowly shuffle apart, and appear themselves to be beleaguered by the aura");
      System.out.println("of lethargy and boredom that permeates every corner and crevice of this cursed building.");
      System.out.println("You walk up to the ticket dispencer and receive a ticket: A245. You look around you and try");
      System.out.println("to discern a pattern in the numbers being called by the unsavory characters behind the service");
      System.out.println("windows to reassure yourself that surely your wait won't be too long... but alas, the DUNGEON's");
      System.out.println("wiley ways hide their cryptic pattern and leave you only with the hum of flourescent lighting and");
      System.out.println("a creeping desperation as you survey the room and look for a place to sit that's not too close to");
      System.out.println("other unfortunate souls desperately clutching their crumpled tickets.");
      System.out.println(" ");
      System.out.println("*************************************");
      System.out.println(" ");
      
      int counter = 0;
      boolean phoneFlag = true;
      boolean peopleFlag = true;
      boolean magazineFlag = true;
      
      while(counter <= 6){
         System.out.println("You are seated in a hard plastic chair surrounded by varying shades");
         System.out.println("of taupe and khaki. What do you do to pass the time?");
         System.out.println(" ");
         System.out.println("*************************************");
         System.out.println(" ");
         System.out.println("SELECT: PHONE, PEOPLE, MAGAZINE");
      
      String firstRound = activity.nextLine();
         
         if((firstRound.equals("PHONE") || firstRound.equals("phone") || firstRound.equals("Phone")) && phoneFlag == true){
            System.out.println("You go for the old tried-and-true when things get boring: your phone.");
            System.out.println("As you scroll past news articles and pictures of friends and celebrities");
            System.out.println("you feel a familiar emptiness begin to creep up inside you exacerbated by the");
            System.out.println("pronounced, mechanical ticking of an ancient wall clock. Maybe your phone is");
            System.out.println("better off in your pocket...");
            System.out.println(" ");
            System.out.println(" ");
            
            phoneFlag = false;
            counter++;
            
         }else if((firstRound.equals("PEOPLE") || firstRound.equals("people") || firstRound.equals("People")) && peopleFlag == true){
            System.out.println("People-watching is a nice go-to when you find yourself without anything else to do.");
            System.out.println("However, as you look around, you recognize the same look on each person's face of muted pain");
            System.out.println("and reluctant tolerance for the situation you all have collectively found yourselves in.");
            System.out.println("Maybe you'll just keep your eyes to yourself...");
            System.out.println(" ");
            System.out.println(" ");
            
            peopleFlag = false;
            counter++;
            
         }else if((firstRound.equals("MAGAZINE") || firstRound.equals("magazine") || firstRound.equals("Magazine")) && magazineFlag == true){
            System.out.println("A May 1998 edition of Golf Digest stares back almost mockingly from a particle-board display across");
            System.out.println("the aisle from you. The middle-aged man's vacant smile is a harsh juxtaposition against the bureaucratic");
            System.out.println("desolation you see everywhere else around you. On second thought, you don't really feel like reading...");
            System.out.println(" ");
            System.out.println(" ");

            magazineFlag = false;
            counter++;
            
         }else if(firstRound.equals("PHONE") || firstRound.equals("phone") || firstRound.equals("Phone")){
            System.out.println("Back to your phone. Eyes glaze over as your screen slowly lulls you into a state of pacified");
            System.out.println("self-loathing. You are reminded why you abandoned your phone to your pocket in the first place.");
            System.out.println("Back it goes...");
            System.out.println(" ");
            System.out.println(" ");
            
            counter++;
            
         }else if(firstRound.equals("MAGAZINE") || firstRound.equals("magazine") || firstRound.equals("Magazine")){
            System.out.println("Jack or Tom or Dave, or whatever the stupid golfer's name is, still looks at you in a way");
            System.out.println("that only serves to remind you that he's the one in a tropical locale, a nice breeze in his");
            System.out.println("hair and you are the one stuck in the DUNGEON OF MOTOR VEHICLES...");
            System.out.println(" ");
            System.out.println(" ");
            
            counter++;
                   
         }else if(firstRound.equals("PEOPLE") || firstRound.equals("people") || firstRound.equals("People")){
            System.out.println("Oh no... you just made eye contact with someone. For two excruciating seconds your eyes met");
            System.out.println("with a stranger's before darting to the nearest stationary object in an effort to try and");
            System.out.println("convince yourself it didnt' happen...");
            System.out.println(" ");
            System.out.println(" ");
            
            counter++;
         }else{
            System.out.println("I'm sorry... please try again");
            System.out.println(" ");
            System.out.println(" ");
         }
      }
      
      while(counter <= 10){
      
         System.out.println("Your vision is beginning to falter, and the walls seem as though they are drawing closer to the");
         System.out.println("center of the room. Who or what will save you from this madness?");
         System.out.println(" ");
         System.out.println("*************************************");
         System.out.println(" ");
         System.out.println("SELECT: HAIR, CRY, LAUGH");
      
         String secondRound = activity.nextLine();
      
         if(secondRound.equals("HAIR") || secondRound.equals("hair") || secondRound.equals("Hair")){
            System.out.println("You begin to grab tufts of your hair in an effort to distract yourself from the existential pain");
            System.out.println("gnawing away inside of you. You come away none the better with far fewer hairs on your head and");
            System.out.println("significantly more in your clenched and trembling fists...");
            System.out.println(" ");
            System.out.println(" ");
         
            counter++; 
              
         }else if(secondRound.equals("CRY") || secondRound.equals("cry") || secondRound.equals("Cry")){
            System.out.println("Involuntarily, you let out a whimper. It seems this place has gotten the better of you. You then");
            System.out.println("let out a small cry, which turns into a larger one, and before long you are inconsolably weeping.");
            System.out.println("When will it all end???");
            System.out.println(" ");
            System.out.println(" ");
         
            counter++;
         
         }else if(secondRound.equals("LAUGH") || secondRound.equals("laugh") || secondRound.equals("Laugh")){
            System.out.println("Everyone in the DUNGEON OF MOTOR VEHICLES looks your way as you finally crack. You can no longer");
            System.out.println("take it. If this is all one big joke, than it has definitely been on you. Your laughs get louder");
            System.out.println("and louder as you see a mother with three small children slowly avert their gazes and shepherd");
            System.out.println("them away from you...");
            System.out.println(" ");
            System.out.println(" ");
         
            counter++;
         
         }else{
            System.out.println("I'm sorry... please try again");
            System.out.println(" ");
            System.out.println(" ");
         }
      }
      
   }

   public static void bossFight(License charLicense) throws IOException{
   
      System.out.println("'A245? A245?'");
      System.out.println("...");
      System.out.println("...");
      System.out.println("'A245? A245?'");
      System.out.println(" ");
      System.out.println("You can't believe it. Never a sweeter combination of characters have ever graced your ears. You collect");
      System.out.println("what remains of your broken and shattered self and shamble up to the service window.");
      System.out.println(" ");
      System.out.println(" ");
    
      
      Scanner renewal = new Scanner(System.in);
      int counter = 0;
      
      while(counter < 1){
      
         System.out.println("The ogre behind the counter says 'Hello, please verify your first name'");
         
         String responseName = renewal.nextLine();
         
         if(responseName.equals(charLicense.getFirstName())){
            System.out.println("The ogre behind the counter says 'Thank you.' And begins to type away...");
            System.out.println(" ");
            System.out.println(" ");
            counter++;
         }else{
            System.out.println("Let's try that again...");
            System.out.println(" ");
            System.out.println(" ");
         }
      }
      
      while(counter == 1){
      
         System.out.println("The ogre behind the counter says 'Please verify your date of birth.'");
         
         String responseDateOfBirth = renewal.nextLine();
         
         if(responseDateOfBirth.equals(charLicense.getDateOfBirth())){
            System.out.println("The ogre behind the counter says 'Thank you.' And begins to type away...");
            System.out.println(" ");
            System.out.println(" ");
            counter++;
         }else{
            System.out.println("Let's try that again...");
            System.out.println(" ");
            System.out.println(" ");

         }
      }
      
      while(counter == 2){
      
         System.out.println("The ogre behind the counter says 'Any change of address?'");
         
         String responseAddress = renewal.nextLine();
      
         if(responseAddress.equals("YES") || responseAddress.equals("yes") || responseAddress.equals("Yes")){
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Your response is barely intelligible, but through some act of grace, the ogre");
            System.out.println("understands you perfectly and updates your address.");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("The ogre behind the counter then says 'Thank you for stopping by the");
            System.out.println("DUNGEON OF MOTOR VEHICLES. Here is your renewed license.'");
            System.out.println(" ");
            System.out.println(" ");
         
            charLicense.setAddress();
            charLicense.setNewExpirationDate();
         
            PrintWriter licenseFile = new PrintWriter("license.txt");
            licenseFile.println("-------------------------------------------------------------------");
            licenseFile.println(charLicense.getLicenseNumber());
            licenseFile.println(charLicense.getFirstName()+" "+charLicense.getLastName());
            licenseFile.println(charLicense.getHeight()+"   "+charLicense.getWeight());
            licenseFile.println(charLicense.getEyeColor()+"    "+charLicense.getHairColor());
            licenseFile.println(charLicense.getStreetAddress()+" "+charLicense.getAddressNumber());
            licenseFile.println("Date of Birth: "+charLicense.getDateOfBirth()+"   "+"Expiration Date: "+charLicense.getNewExpirationDate());
            licenseFile.println("-------------------------------------------------------------------");
            licenseFile.close();
         
            counter++;
         
         }else if(responseAddress.equals("NO") || responseAddress.equals("no") || responseAddress.equals("No")){
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("The ogre behind the counter then says 'Thank you for stopping by the");
            System.out.println("DUNGEON OF MOTOR VEHICLES. Here is your renewed license.'");
            System.out.println(" ");
            System.out.println(" ");
            
            charLicense.setNewExpirationDate();
         
            PrintWriter licenseFile = new PrintWriter("license.txt");
            licenseFile.println("-------------------------------------------------------------------");
            licenseFile.println(charLicense.getLicenseNumber());
            licenseFile.println(charLicense.getFirstName()+" "+charLicense.getLastName());
            licenseFile.println(charLicense.getHeight()+"   "+charLicense.getWeight());
            licenseFile.println(charLicense.getEyeColor()+"    "+charLicense.getHairColor());
            licenseFile.println(charLicense.getStreetAddress()+" "+charLicense.getAddressNumber());
            licenseFile.println("Date of Birth: "+charLicense.getDateOfBirth()+"   "+"Expiration Date: "+charLicense.getNewExpirationDate());
            licenseFile.println("-------------------------------------------------------------------");
            licenseFile.close();
         
            counter++;
         
         }else{
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Let's try that again...");
            System.out.println(" ");
            System.out.println(" ");

         }
      }
      
      System.out.println("*************************************");
      System.out.println("CONGRATULATIONS, BOLD CHAMPION!! YOU HAVE BESTED THE DUNGEON OF MOTOR VEHICLES!!");
      System.out.println("And for your troubles, a legally valid license! Huzzah!");
      System.out.println("*************************************");
      
   }
      
      
      public static void main(String[] args) throws IOException{
   
      License charLicense = welcomeToTheDungeon();
      theWaitingRoom();
      bossFight(charLicense);
      
   }
   
}
   