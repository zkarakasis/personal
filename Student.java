public class Student {

    private String name;
    private String registrationNumber;
    private int stageOfStudies;
    private int credits = 0;
    
    //Constructor
    public Student(String name, String registrationNumber,int stageOfStudies, int credits){
        setName(name);
        setRegistrationNumber(registrationNumber);
        setStageOfStudies(stageOfStudies);
        setCredits(credits);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }
    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public void setStageOfStudies(int stageOfStudies){
        this.stageOfStudies = stageOfStudies;
    }
    public int getStageOfStudies(){
        return stageOfStudies;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }
    public int getCredits(){
        return credits;
    }
    public boolean doesStudentPass(){
        if (getCredits() == 120){
            return true;
        }
        else{
            return false;
        }
    }
    public int passingMethod(){
       
    }

    }
        

