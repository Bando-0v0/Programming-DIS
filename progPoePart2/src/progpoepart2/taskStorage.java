
package progpoepart2;
import javax.swing.JOptionPane;

public class taskStorage {
 // declaring the variable that will be used globaly in my code

private String name;
   private String surname;
   private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
   
   
   private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   private String myUsername;

    public String getMyUsername() {
        return myUsername;
    }

    public void setMyUsername(String myUsername) {
        this.myUsername = myUsername;
    }
   
   private String myPassword;

    public String getMyPassword() {
        return myPassword;
    }

    public void setMyPassword(String myPassword) {
        this.myPassword = myPassword;
    }
   private String taskName;
   private String developerName;
   private String developerSurname;
   private int taskDuration;
   private int taskStatus;
   private String TaskID;
   private String part1;
   private String TaskID1;
   private String part2;
   private String status1;
   private String status2;
   private String status3;
   private String taskDescription;
   private int options;
   private int repeat;
   private int i;
   private int n;
   private int sum;
   
 // my register user method calls other method and returns all necassary messages
    public boolean registerUser(){
       JOptionPane.showMessageDialog(null, "Welcome to EasyKaban");
         
         options =Integer.parseInt(JOptionPane.showInputDialog(null, "Please select an option\n" +"1. login\n " +"2. Register\n"+ "3. Quit"));
        
        
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
                
            break;
            
            default :
                JOptionPane.showMessageDialog(null,"Goodbye :)");
                
   
        }
        return false;
}
 //my check user name, checks the users input against the programs conditions
   
     public boolean checkUserName(){
      do{
      name = JOptionPane.showInputDialog("Enter your name:");
      }while(name.length()<2);
      
      do{  
      surname = JOptionPane.showInputDialog("Enter your surname:");
      }while(surname.length()<2);
      
      do{
      username = JOptionPane.showInputDialog("Enter your username:\n" + "Username must be 5 characters long and must contain an underscore:");
      }while(username.length()<5 && username.length()>5);
      
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
     
     do{
      password= JOptionPane.showInputDialog("Enter your password:\n "+ "Your password MUST contain:\n"+"at least 8 characters:\n"+"A special character:\n"+"An uppercase:\n"+"A number:");
     }while(password.length()<8);
     
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
     
       options =Integer.parseInt(JOptionPane.showInputDialog(null, "Please select an option\n" +"1. login\n " +"2. Register\n"+ "3. Quit"));
    
    switch(options){
     case 1:
         // this while loop controls my login page to ensure the user credentials meet the conditions before moving on 
     
      do{
     JOptionPane.showMessageDialog(null, "Hello please enter your username and password to login");
      myUsername =JOptionPane.showInputDialog("Enter username:");
      myPassword = JOptionPane.showInputDialog("Enter your password:");
      }while(myUsername.length()<5 && myUsername.length()>5 && myPassword.length()<5);
    
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
      do{
      myUsername =JOptionPane.showInputDialog("Enter username:");
      myPassword = JOptionPane.showInputDialog("Enter your password:");
      }while(myUsername.length()<5&&myUsername.length()>5&&myPassword.length()<8);
      
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
   public boolean menu(){
      options =Integer.parseInt(JOptionPane.showInputDialog(null, "Please select an option\n" +"1. Add task\n " +"2. Show report\n"+ "3. Quit"));
        
         switch(options){
             case 1:
                  repeat =Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of tasks you wish to add:"));
                     for( i = 0; i < repeat; i++ ){
                         
                       checkTaskDescription();
                       
                taskStatus =Integer.parseInt(JOptionPane.showInputDialog(null, "Please select an option\n" +"1. To Do\n " +"2. Done\n"+ "3. Doing"));
                   switch(taskStatus){
                       case 1:
                           status1 = "To do";
                       break;
                       
                       case 2:
                           status2 = "Done";
                       break;
                       
                       default:
                           status3 = "Doing";
                   }
                   
                  createTaskID();
                   
                   
                   for( n=0; n <= i; n++){
                        
                 prinTaskDetails();
                
                        }
                     }
                returnTotalHours();
                
             break;
             
             case 2:
                 JOptionPane.showMessageDialog(null, "Coming soon");
                   options =Integer.parseInt(JOptionPane.showInputDialog(null, "Please select an option\n" +"1. Add task\n " +"2. Show report\n"+ "3. Quit"));
                   
                    switch(options){
             case 1:
                
                  repeat = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of tasks you wish to add:"));
                     for( i = 0; i < repeat; i++ ){
                         
                         checkTaskDescription();
                         
               taskStatus =Integer.parseInt(JOptionPane.showInputDialog(null, "Please select an option\n" +"1. To Do\n " +"2. Done\n"+ "3. Doing"));
                   switch(taskStatus){
                       case 1:
                           status1 = "To do";
                       break;
                       
                       case 2:
                           status2 = "Done";
                       break;
                       
                       default:
                           status3 = "Doing";
                   }
                  createTaskID();
                  
                   
                  for( n=0; n <= i; n++){ 
                     
                 prinTaskDetails();
                        }
                     }
                 returnTotalHours();    
                  
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
    return false;

}
  public boolean checkTaskDescription(){
      do{
    taskName = JOptionPane.showInputDialog("Please enter your task name:");
      }while (taskName.length()<5);
                  
      do{
                 taskDescription = JOptionPane.showInputDialog("Please enter your task description:\n"+"Please ensure your description is 50 characters or less");
                   if(taskDescription.length()<50){
                       JOptionPane.showMessageDialog(null, "Task description successfully captured");
                   }else{
                       JOptionPane.showMessageDialog(null, "Description is too long");
                   }
                 }while(taskDescription.length() > 50);
      do{
                    developerName = JOptionPane.showInputDialog("Please enter the developer name:");
      }while(developerName.length()<2);
      
      do{
                   developerSurname = JOptionPane.showInputDialog("Please enter developer surname:");
      }while(developerSurname.length()<2);
      
                   taskDuration =Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the duration of the task: "));
     
      
    return false;
      
  }  
  public boolean createTaskID(){
    
      
      TaskID= new String(developerName);
                  part1 = TaskID.substring(0,2).toUpperCase();
                  
                  TaskID1= new String(taskName);
                  part2 = TaskID1.substring(0,2).toUpperCase(); 
    return false;
  }
  public boolean prinTaskDetails(){
      createTaskID();
      JOptionPane.showMessageDialog(null, "Task name: "+ taskName + "\n"+ "Task number: " + i + "\n" + "Task description: "+ taskDescription+"\n"
                 + "Developer details: "+ developerName+" "+ developerSurname+ "\n"+ "Task duration: "+ taskDuration+"hrs" + "\n" + "taskStatus: " + taskStatus + "\n"
                 +"\n"+ "Task ID: " + part1+":"+i+":"+part2);
    return false;
      
  }
  public boolean returnTotalHours(){
      
      sum = 0 + taskDuration + taskDuration;
      JOptionPane.showMessageDialog(null,"Total duration:"+" "+ sum+"hrs");
      
    return false;
      
  }
}
   

