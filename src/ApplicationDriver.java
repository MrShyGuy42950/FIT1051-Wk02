public class ApplicationDriver {
    public static void main(String[] args) {
        Person tania = new Person();


        tania.setUniversities("Monash");
        tania.setAge(21);
        System.out.println("Tania is " + tania.getAge() + " years old.");
        System.out.println("Tania is studying at " + tania.getUniversities() + " University.");
    }
}


