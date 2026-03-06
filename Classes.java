public class Classes{

    public class Rectangle{
        //Attributes
        private double height;
        private double width;

        //Methods
        public void setHeight(double height){
            this.height = height;
        }
        public void setWidth(double width){
            this.width = width;
        }
        public boolean isSquare(){
            return height == width;
        }
        public double getHeight(){
            return height;
        }
        public double getWidth(){
            return width;
        }
        public boolean isValid(){
            if((getHeight() > 0.1) && (getWidth() < 21) && (getHeight() > 0.1) && (getHeight() < 21)){
                return true;
            }
            else{
                return false;
            }
        }
        public double getPerimeter(){
            double perimeter = 2 * getHeight() + 2 * getWidth();
            return perimeter;
        }
        public double getArea (){
            double area = getHeight() * getWidth();
            return area;
        }
        
    }
    public class Student{
        //Attributes
        private String name;
        private String registrationNumber;
        private int stageOfStudies;
        private int credits;
        

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
            if (getCredits() > 120){
                return true;
            }
            else{
                return false;
            }
        }

    }
    



        
        // public static double getPerimeter(double height, double width){
        //     double perimeter = 2 * height + 2 * width;
        //     return perimeter;
        // }
        // public static double getArea (double height, double width){
        //     double area = height * width;
        //     return area;
        // }
        // public static boolean isSquare (double height, double width){
        //     if(height > 0 && width > 0 && height == width){
        //         return true;
        //     }
        //     else if(height > 0 && width > 0 && height != width){
        //         return false;
        //     }
        // }
        // public static void areValidLengths (double height, double width){
        //     if(height < 0 || width < 0){
        //         System.out.println("Invalid height ir length. Please insert value bigger than 0.")    
        //     }
            
        // }




    


    
}
