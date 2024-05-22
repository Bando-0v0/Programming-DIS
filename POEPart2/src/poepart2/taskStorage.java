
package poepart2;
import javax.swing.JOptionPane;

public class taskStorage {
// declaring the variable that will be used globaly in my code

private String name;
   private String surname;
   private String username;
   private String password;
   
 // my register user method calls other method and returns all necassary messages
    public boolean registerUser(){
       JOptionPane.showMessageDialog(null, "Welcome to EasyKaban");
         
        int options =Integer.parseInt(JOptionPane.showInputDialog(null, "Please select an option\n" +"1. login\n " +"2. Register\n"+ "3. Quit"));
        
        
        switch(options){
            case 1:
             JOptionPane.showMessageDialog(null, "Please register an account first");
             
             options =Integer.parseInt(JOptionPane.showInputDialog(null, "Please select an option\n" +"1. login\n " +"2. Register\n"+ "3. Quit"));
               
             switch(options){
                 case 1:
                  
               
                     LoginUser();
                  menu(); 
               menu();
                 break;
                 
                 case 2:
                  checkUserName();
                  checkPasswordComplexity();
                  LoginUser();
                  menu();
                  menu();
                 break;
                 
                 default:
                   JOptionPane.showMessageDialog(null,"Goodbye :)");
                   
             }
             
             
            break;
            
            case 2:
                checkUserName();
                checkPasswordComplexity();
                LoginUser();
                menu();
                menu();
            break;
            
            default :
                JOptionPane.showMessageDialog(null,"Goodbye :)");
                
   
        }
        return false;
}
 //my check user name, checks the users input against the programs conditions
   
     public boolean checkUserName(){
      name = JOptionPane.showInputDialog("Enter your name:");
      surname = JOptionPane.showInputDialog("Enter your surname:");
      username = JOptionPane.showInputDialog("Enter your username:\n" + "Username must be 5 characters long and must contain an underscore:");
     
      boolean checkUserName = checkUserName(username);
    
     if(checkUserName){
            JOptionPane.showMessageDialog(null, "Username successfully captured");
        }else{
            JOptionPane.showMessageDialog(null, "Your Username is is incorrectly formatted. Please ensure that your username contains an underscore and is no more than 5 characters long.");
        }
        return false;
    
     
}
    
    public boolean checkUserName(String username){
            boolean hasUnderscore= false;
            
            if(username.length()<5){
                return false;
            }
               if(username.contains("_")){
                    hasUnderscore =true;
                }
            
            return hasUnderscore;
        } 

    
 // My check passord complextity method will compare the users input with the programs conditions 
    
 public boolean checkPasswordComplexity(){
      password= JOptionPane.showInputDialog("Enter your password:\n "+ "Your password MUST contain:\n"+"at least 8 characters:\n"+"A special character:\n"+"An uppercase:\n"+"A number:");
     
        boolean checkPasswordComplexity = checkPasswordComplexity(password);
        
        if(checkPasswordComplexity){
            JOptionPane.showMessageDialog(null, "Password successfully captured");
        }else{
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted please ensure that the password contains at least 8 characters, a capital letter, a number and a special character");
        }
        return false;
        
 }
 
  // creating a method to check the complexity of my password 
        public boolean checkPasswordComplexity(String password){
            boolean hasUppercase = false;
            boolean hasNumber = false;
            boolean hasSpecialCharacter= false;
            
            if(password.length()<8){
                return false;
            }
            for(char c: password.toCharArray()){
                if(Character.isUpperCase(c)){
                    hasUppercase= true;
                }else if(Character.isDigit(c)){
                    hasNumber= true;
                }else if(Character.isLetterOrDigit(c)){
                    hasSpecialCharacter =true;
                }
            }
            return hasUppercase && hasNumber && hasSpecialCharacter;
        }   
  
        // my login user method will compare the previously captured information in the above methods to login conditions
   public boolean LoginUser(){
    int options =Integer.parseInt(JOptionPane.showInputDialog(null, "Please select an option\n" +"1. login\n " +"2. Register\n"+ "3. Quit"));
    
    switch(options){
     case 1:
     JOptionPane.showMessageDialog(null, "Hello please enter your username and password to login");
     String myUsername =JOptionPane.showInputDialog("Enter username:");
     String myPassword = JOptionPane.showInputDialog("Enter your password:");
    
      boolean checkPasswordComplexity1 = checkPasswordComplexity1(myPassword, myUsername);
        
        if(checkPasswordComplexity1){
            JOptionPane.showMessageDialog(null, "Hello "+name+" "+surname+" "+ "its great to see you again");
        }else{
            JOptionPane.showMessageDialog(null, "Login unsuccessful, please check your username and password");
        }
    break;
    
     case 2:
         JOptionPane.showMessageDialog(null, "account already exists");
         options =Integer.parseInt(JOptionPane.showInputDialog(null, "Please select an option\n" +"1. login\n " +"2. Register\n"+ "3. Quit"));
         switch(options){
             case 1:
                 JOptionPane.showMessageDialog(null, "Hello please enter your username and password to login");
      myUsername =JOptionPane.showInputDialog("Enter username:");
      myPassword = JOptionPane.showInputDialog("Enter your password:");
    
       checkPasswordComplexity1 = checkPasswordComplexity1(myPassword, myUsername);
        
        if(checkPasswordComplexity1){
            JOptionPane.showMessageDialog(null, "Hello "+name+" "+surname+" "+ "its great to see you again");
        }else{
            JOptionPane.showMessageDialog(null, "Login unsuccessful, please check your username and password");
        }
                 break;
             case 2:
                 JOptionPane.showMessageDialog(null, "Account already exist");
                 break;
             default:
                 JOptionPane.showMessageDialog(null, "Goodbye");
         }
         
         break;
         
     default:
         JOptionPane.showMessageDialog(null, "Goodbye");
    }
        return false; 
}
   public boolean checkPasswordComplexity1(String myPassword, String myUsername){
            boolean passwordCorrect = false;
            boolean usernameCorrect = false;
            
            
            if(myPassword.length()<8){
                return false;
            }
           if(myUsername.length()<5){
               return false;
           }
                if(myPassword.matches(password)){
                    passwordCorrect = true;
                }
                if(myUsername.matches(username)){
                    usernameCorrect= true;
                }
                
            
            return passwordCorrect && usernameCorrect;
            
   }
    
   //My menu method is tha control pannel o fthe program allowing users to navigate the options 
   public static void menu(){
     int options =Integer.parseInt(JOptionPane.showInputDialog(null, "Please select an option\n" +"1. Add task\n " +"2. Show report\n"+ "3. Quit"));
        
         switch(options){
             case 1:
                  int repeat =Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of tasks you wish to add:"));
                     for(int i = 0; i < repeat; i++ ){
                         
                         String taskName = JOptionPane.showInputDialog("Please enter your task name:");
                    
                 String taskDescription = JOptionPane.showInputDialog("Please enter your task description:\n"+"Please ensure your description is 50 characters or less");
                   if(taskDescription.length()<50){
                       JOptionPane.showMessageDialog(null, "Task description successfully captured");
                   }else{
                       JOptionPane.showMessageDialog(null, "Description is too long");
                   }
                   
                   String developerName = JOptionPane.showInputDialog("Please enter the developer name:");
                   String developerSurname = JOptionPane.showInputDialog("Please enter developer surname:");
                   int taskDuration =Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the duration of the task: "));
                   
               int taskStatus =Integer.parseInt(JOptionPane.showInputDialog(null, "Please select an option\n" +"1. To Do\n " +"2. Done\n"+ "3. Doing"));
                   switch(taskStatus){
                       case 1:
                           String status1 = "To do";
                       break;
                       
                       case 2:
                           String status2 = "Done";
                       break;
                       
                       default:
                           String status3 = "Doing";
                   }
                  String TaskID= new String(developerName);
                  String part1 = TaskID.substring(0,2).toUpperCase();
                  
                  String TaskID1= new String(taskName);
                  String part2 = TaskID1.substring(0,2).toUpperCase();
                   
                   
                   for(int n=0; n <= i; n++){
                       int sum = 0 + taskDuration;
                 JOptionPane.showMessageDialog(null, "Task name: "+ taskName + "\n"+ "Task number: " + i + "\n" + "Task description: "+ taskDescription+"\n"
                 + "Developer details: "+ developerName+" "+ developerSurname+ "\n"+ "Task duration: "+ taskDuration+"hrs" + "\n" + "taskStatus: " + taskStatus + "\n"+"Total duration: "+ sum+"hrs"
                 +"\n"+ "Task ID: " + part1+":"+i+":"+part2);
                        }}
                
             break;
             
             case 2:
                 JOptionPane.showMessageDialog(null, "Coming soon");
                   options =Integer.parseInt(JOptionPane.showInputDialog(null, "Please select an option\n" +"1. Add task\n " +"2. Show report\n"+ "3. Quit"));
                   
                    switch(options){
             case 1:
                
                  int repeat1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of tasks you wish to add:"));
                     for(int i = 0; i < repeat1; i++ ){
                         
                         String taskName = JOptionPane.showInputDialog("Please enter your task name:");
                
                     
                 String taskDescription = JOptionPane.showInputDialog("Please enter your task description:\n"+"Please ensure your description is 50 characters or less");
                   if(taskDescription.length()<50){
                       JOptionPane.showMessageDialog(null, "Task description successfully captured");
                   }else{
                       JOptionPane.showMessageDialog(null, "Description is too long");
                   }
                   
                   String developerName = JOptionPane.showInputDialog("Please enter the developer name:");
                   String developerSurname = JOptionPane.showInputDialog("Please enter developer surname:");
                   int taskDuration =Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the duration of the task: "));
                   
               int taskStatus =Integer.parseInt(JOptionPane.showInputDialog(null, "Please select an option\n" +"1. To Do\n " +"2. Done\n"+ "3. Doing"));
                   switch(taskStatus){
                       case 1:
                           String status1 = "To do";
                       break;
                       
                       case 2:
                           String status2 = "Done";
                       break;
                       
                       default:
                           String status3 = "Doing";
                   }
                  String TaskID= new String(developerName);
                  String part1 = TaskID.substring(0,2).toUpperCase();
                  
                  String TaskID1= new String(taskName);
                  String part2 = TaskID1.substring(0,2).toUpperCase();
                  int sum = + taskDuration;
                  for(int n=0; n < i; n++){ 
                     
                 JOptionPane.showMessageDialog(null, "Task name: "+ taskName + "\n"+ "Task number: " + i + "\n" + "Task description: "+ taskDescription+"\n"
                 + "Developer details: "+ developerName+" "+ developerSurname+ "\n"+ "Task duration: "+ taskDuration+"hrs" + "\n" + "taskStatus: " + taskStatus + "\n"+"Total duration: "+ sum+"hrs"
                 +"\n"+ "Task ID: " + part1+":"+i+":"+part2);
                        }
                     }
                     
                  
             break;
             
             case 2:
                 JOptionPane.showMessageDialog(null, "Coming soon");
                 break;
                 
             case 3:
                 JOptionPane.showMessageDialog(null, "Goodbye");
                 
             break;
             
             default:
                 JOptionPane.showMessageDialog(null, "Goodbye");
         }

   
         }

}
    
}
