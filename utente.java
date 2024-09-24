public class utente {
  
    private static final String DEFAULT_NAME = "Unknown";
    private static final String DEFAULT_GENDER = "Undefined";
    private static final int DEFAULT_AGE = 0;
    private static final float DEFAULT_HEIGHT = 0.0f; // in meters (Note the 'f' for float)
    private static final float DEFAULT_WEIGHT = 0.0f;  // in kg (Note the 'f' for float)
    

    private String name;
    private String gender;
    private int age;
    private float height;
    private float weight;
    private int countConstructor=0;
    public utente() {
        this.name = DEFAULT_NAME;
        this.gender = DEFAULT_GENDER;
        this.age = DEFAULT_AGE;
        this.height = DEFAULT_HEIGHT;
        this.weight = DEFAULT_WEIGHT;
        countConstructor++;
    }

  
    public utente(String name, int age) {
        this.name = name;
        this.gender = DEFAULT_GENDER;
        this.age = age;
        this.height = DEFAULT_HEIGHT;
        this.weight = DEFAULT_WEIGHT;
        countConstructor++;
    }

    
    public utente(String name, String gender, int age, float height, float weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        countConstructor++;
    }

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getCountConstruct(){
        return countConstructor;
    }
   /**
 *  calculate  index  body mass (IMC)of user acording to formula 
 * @param User otherUser
 * @return diferenceAge
 */
    public int calculateAgeDifference(utente otherUser) {
        int diferenceAge=Math.abs(this.age - otherUser.getAge());
        return diferenceAge;
    }

/**
 *  calculate  index  body mass (IMC)of user acording to formula 
 * @return imc* 
 */
    public float calculateIMC() {
        float imc=this.weight / (int) Math.pow(this.height, 2);;
        return imc;
    }

    /**
 *  Converte imc to obesityLevel
 *@param imc
 *  @return levelOfObesity* 
 */
    public String ConversionLevelObesity(float imc){
        if(imc<18){
            return "Skinny";
        }
        else if(imc >25){
            return"Obese";
        }
    
    else{return"healthy";}
    
    }


  /**
 *  Compare ages between two Users
 *  @param otherUser
 *  @return this.age if the User is younger.otherUser.getAge() if the otherUser is younger  and null if they are the same age * 
 */
    public String compareAge(utente otherUser) {
        if (this.age < otherUser.getAge()) {
            return this.name+"have"+this.age+"is younger than"+otherUser.name; 
        } else if (this.age > otherUser.getAge()) {
            return otherUser.name+"have"+otherUser.age+"is younger than"+this.age;  
        } else {
            return null;  
        }
    }


/**
 *  Converte imc to obesityLevel
 *  @param imc
 *  @return true if is healthy false if isn´t * 
 */
//ALtera
    public boolean isHealthy(float imc){
        if(imc<18 && imc >25){
            return true;
        }
        return false;
    }




    public String toString() {
        return "User Details: " +
                "Name='" + name + '\'' +
                ", Gender='" + gender + '\'' +
                ", Age=" + age +
                ", Height=" + height + " meters" +
                ", Weight=" + weight + " kg";
    }
}
