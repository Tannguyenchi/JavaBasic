public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        /*
        - Input: - without any parameters
        - Output: - return the value of firstName field
        */
        return firstName;
    }

    public String getLastName(){
        /*
        - Input: - without any parameters
        - Output: - return the value of lastName field
        */
        return lastName;
    }

    public int getAge(){
        /*
        - Input: - without any parameters
        - Output: - return the value of age field
        */
        return age;
    }

    public void setFirstName(String firstName){
        /*
        - Input: - with one parameter of type String
        - Output: - set the value of the firstName field
        */
        this.firstName = firstName;
    }

    public void setLastName (String lastName){
        /*
        - Input: - with one parameter of type String
        - Output: - set the value of the lastName field
        */
        this.lastName = lastName;
    }

    public void setAge(int age) {
         /*
        - Input: - with one parameter of type int
        - Output: - set the value of the age field.
                    If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
        */
        if (age > 0 && age <= 100) {
            this.age = age;
        }else {
            this.age = 0;
        }
    }

    public boolean isTeen (){
        /*
        - Input: - without any parameters
        - Output: - return true if the value of the age field is greater than 12 and less than 20,
                    otherwise, return false.
        */
        return age > 12 && age < 20;
    }

    public String getFullName (){
        /*
        - Input: - without any parameters
        - Output: - return the full name of the person
                       + In case both firstName and lastName fields are empty, Strings return an empty String.
                       + In case lastName is an empty String, return firstName.
                       + In case firstName is an empty String, return lastName.
        */
        if (firstName.isEmpty()) {
            return lastName;
        }
        if (lastName.isEmpty()){
            return firstName;
        }
        return firstName + " " + lastName;
    }
    public static void main(String[] args) {
        Person person = new Person();

        person.setFirstName("Nguyễn");
        person.setLastName("Chí Tân");
        person.setAge(14);

        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Full Name: " + person.getFullName());
        System.out.println("Is Teen: " + person.isTeen());
    }
}
