import java.util.Scanner;
public class NokiaV2{
public static void main(String[] rofih){

String button="""
Welcome to your Nokia phone
1->Phone book
2->Messages
3->Chat
4->Call register
5->Tones
6->Settings
7->Call divert
8->Games
9->Calculator
10->Reminders
11->Clock
12->Profiles
13->SIM services
""";
System.out.println(button);



Scanner input=new Scanner(System.in);
System.out.print("Select a button");
int mainMenu=input.nextInt();
   
switch (mainMenu){
case 1: {
	System.out.print("Phone book");
	int Menu=input.nextInt();
      switch (Menu) {
            case 1: System.out.print("Search");
            break;
            case 2:System.out.print("Service Nos.");
            break;
            case 3:System.out.print("Add name");
            break;
            case 4:System.out.print("Erase");
            break;
            case 5:System.out.print("Edit");
            break;
            case 6:System.out.print("Assign tone");
            break;
            case 7:System.out.print("Send b'card");
            break;
            case 8: {
		  System.out.print("Options");
		  int options=input.nextInt();
                  switch (options) {
                         case 1: 
				System.out.print("Type of view");
                         	break;     
                         case 2:
				System.out.print("Memory status");
                         	break;
                  }
            }
            case 9:
                  System.out.print("Speed dials");
            break;
            case 10:
                   System.out.print("Voice Tags");
            break;
	}
}
break;
case 2:{
      System.out.print("Messages");
      int Messages=input.nextInt();
      switch (Messages) {
         case  1:
                System.out.print("Write messages");
          break;     
          case 2:
                System.out.print("Inbox");
          break;     
          case 3:
                System.out.print("Outbox");
          break;     
          case 4:
                System.out.print("Picture messages");
          break;     
          case 5:
                System.out.print("Templates");
          break;     
          case 6:
                System.out.print("Smileys");
          break;
          case 7:{
                System.out.print("Messages settings");
                int Messagessettings=input.nextInt();
                switch (Messagessettings) {
                      case 1:{
                            System.out.print("Set 1");
                            int Set1=input.nextInt();
                            switch (Set1){
                               case 1:
                                     System.out.print("Message centre number");
                               break;    
                               case 2:
                                     System.out.print("Messages sent as");
                               break;
                               case 3:
                                     System.out.print("Message validity");
                               break;


	}
}
break;
         
                      case 2: {
                            System.out.print("Common");
                            int Common=input.nextInt();
                            switch (Common) {
                                  case 1:
                                        System.out.print("Delivery reports");
                                  break; 
                                  case 2:
                                        System.out.print("Reply via same centre");
                                  break;
                                  case 3:
                                        System.out.print("Character support");
                                  break;
                                  
}
}
}
}
        case 8:
              System.out.print("Info service");
        break; 
        case 9:
              System.out.print("Voice mailbox number");
        break;
        case 10:
               System.out.print("Service command editor");
        break;
}
}
case 3:
      System.out.print("Chat");
break;
case 4:{
      System.out.print("Call register");
      int Callregister=input.nextInt();
      switch (Callregister) {
            case 1:
                  System.out.print("Missed calls");
            break; 
            case 2:
                  System.out.print("Received calls");
            break;
            case 3:
                  System.out.print("Dialled numbers");
            break;
            case 4:
                  System.out.print("Erase recent call lists");
            break;
            case 5:{ 
                 System.out.print("Show call duration");
                 int Showcallduration=input.nextInt(); 
                 switch (Showcallduration) {
                        case 1:
                              System.out.print("Last call duration");
                        break;
                        case 2:
                              System.out.print("All call's duration");
                        break;
                        case 3:
                              System.out.print("Received call's duration");
                        break;
                        case 4:
                              System.out.print("Dialled call's duration");
                        break;
                        case 5:
                              System.out.print("Clear times");
                        break;
}
}       
            case 6:{
                  System.out.print("Show call costs");
                  int Showcallcost=input.nextInt(); 
                  switch (Showcallcost) {
                        case 1:
                              System.out.print("Last call cost");
                        break;
                        case 2:
                              System.out.print("All call's cost");
                        break;
                        case 3:
                              System.out.print("Clear counters");
                        break;
}
}
            case 7:{
                  System.out.print("Call cost settings");
                  int Callcostsettings=input.nextInt(); 
                  switch (Callcostsettings) {
                        case 1:
                              System.out.print("Call cost limit");
                        break; 
                        case 2:
                              System.out.print("Show costs in");
                        break;
}
}                      
            case 8:
                  System.out.print("Prepaid credit");
            break;                              
}
}
break;
case 5:{
      System.out.print("Tones");
      int Tones=input.nextInt();
      switch (Tones) {
            case 1:
                  System.out.print("Ringing tone");
            break;  
            case 2:
                  System.out.print("Ringing volume");
            break; 
            case 3:
                  System.out.print("Incoming call alert");
            break; 
            case 4:
                  System.out.print("Composer");
            break; 
            case 5:
                  System.out.print("Message alert tone");
            break; 
            case 6:
                  System.out.print("Keypad tones");
            break; 
            case 7:
                  System.out.print("Warning and game tones");
            break; 
            case 8:
                  System.out.print("Vibrating alert");
            break; 
            case 9:
                  System.out.print("Screen saver");
            break; 
}
}
break;
case 6:{
      System.out.print("Settings");
      int Settings=input.nextInt();
      switch (Settings) {
            case 1:
                  System.out.print("Callsettings");
                  int Callsettings=input.nextInt();                                   {
                  switch (Callsettings) {
                         case 1:
                               System.out.print("Automatic redial");
                         break; 
                         case 2:
                               System.out.print("Speed dialling");
                         break; 
                         case 3:
                               System.out.print("Call waiting options");
                         break; 
                         case 4:
                               System.out.print("Own number sending");
                         break; 
                         case 5:
                               System.out.print("Phone line in use");
                         break; 
                         case 6:
                               System.out.print("Automatic answer");
                         break; 
}
}  
            case 2:{
                  System.out.print("Phone settings");
                  int Phonesettings=input.nextInt();    
                  switch (Phonesettings) {
                         case 1:
                               System.out.print("Language");
                         break; 
                         case 2:
                               System.out.print("Cell info display");
                         break; 
                         case 3:
                               System.out.print("Welcome note");
                         break; 
                         case 4:
                               System.out.print("Network selection");
                         break; 
                         case 5:
                               System.out.print("Lights");
                         break; 
                         case 6:
                               System.out.print("Confirm SIM service actions");
                         break; 
}
}
            case 3:{
                  System.out.print("Security settings");
                  int Securitysettings=input.nextInt();    
                  switch (Securitysettings) {
                         case 1:
                               System.out.print("PIN code request");
                         break; 
                         case 2:
                               System.out.print("Call barring service");
                         break; 
                         case 3:
                               System.out.print("Fixed dialling");
                         break; 
                         case 4:
                               System.out.print("Closed user group");
                         break; 
                         case 5:
                               System.out.print("Phone security");
                         break; 
                         case 6:
                               System.out.print("Change access codes");
                         break; 
}
}
            case 4:
                  System.out.print("Restore factory settings");
            break;       
}
}
break;
case 7:
      System.out.print("Call divert");
break;
case 8:
      System.out.print("Games");
break;
case 9:
      System.out.print("Calculator");
break;
case 10:
       System.out.print("Reminders");
break;
case 11:{
       System.out.print("Clock");
       int Clock=input.nextInt();
       switch (Clock) {
                         case 1:
                               System.out.print("Alarm clock");
                         break; 
                         case 2:
                               System.out.print("Clock settings");
                         break; 
                         case 3:
                               System.out.print("Date setting");
                         break; 
                         case 4:
                               System.out.print("Stopwatch");
                         break; 
                         case 5:
                               System.out.print("Countdown timer");
                         break;
                         case 6:
                               System.out.print("Auto update of date and time");
                         break; 
}
}
break;
case 12:
       System.out.print("Profiles");
break;
case 13:
       System.out.print("SIM services");
break;          }


}

}














public static void gotoMainmenu(String button){
String button="""
Welcome to your Nokia phone
1->Phone book
2->Messages
3->Chat
4->Call register
5->Tones
6->Settings
7->Call divert
8->Games
9->Calculator
10->Reminders
11->Clock
12->Profiles
13->SIM services
""";
System.out.println(button);


import java.util.Scanner;
Scanner input=new Scanner(System.in);
System.out.print("Select a button");
int mainMenu=input.nextInt();
}


public static void gotoPhonebook(){
switch (mainMenu){
case 1: { 
	System.out.print("Phone book");
	int Menu=input.nextInt();
      switch (Menu) {
            case 1: System.out.print("Search");
            break;
            case 2:System.out.print("Service Nos.");
            break;
            case 3:System.out.print("Add name");
            break;
            case 4:System.out.print("Erase");
            break;
            case 5:System.out.print("Edit");
            break;
            case 6:System.out.print("Assign tone");
            break;
            case 7:System.out.print("Send b'card");
            break;
            case 8: 
		  
                  System.out.print("Options");
		  int options=input.nextInt();
                  switch (options) {
                         case 1: 
				System.out.print("Type of view");
                         	break;     
                         case 2:
				System.out.print("Memory status");
                         	break;
                  }
            }
            case 9:
                  System.out.print("Speed dials");
            break;
            case 10:
                   System.out.print("Voice Tags");
            break;
	}
break;
 gotoMainmenu(String button);
}


public static void gotoMenu(){
      int Menu=input.nextInt();
      switch (Menu) {
            case 1: System.out.print("Search");
            break;
            case 2:System.out.print("Service Nos.");
            break;
            case 3:System.out.print("Add name");
            break;
            case 4:System.out.print("Erase");
            break;
            case 5:System.out.print("Edit");
            break;
            case 6:System.out.print("Assign tone");
            break;
            case 7:System.out.print("Send b'card");
            break;
            
}


public static void gotoOptions(){
		  
}System.out.print("Options");
		  int options=input.nextInt();
                  switch (options) {
                         case 1: 
				System.out.print("Type of view");
                         	break;     
                         case 2:
				System.out.print("Memory status");
                         	break;
                  }
            }
            case 9:
                  System.out.print("Speed dials");
            break;
            case 10:
                   System.out.print("Voice Tags");
            break;
	}
break;
}











































