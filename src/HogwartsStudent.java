public class HogwartsStudent {
    private String name;
    private int magicPower;
    private int transgression;

    public HogwartsStudent(String name, int magicPower, int transgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String getName() { return name; }

    public int getMagicPower() { return magicPower; }

    public int getTransgression() { return transgression; }


    public void description() {
        System.out.println(name + ": Magic power <" + magicPower + ">, " +
                "transgression distance <" + transgression + ">");
    }

    public void compareHogwartsStudent(HogwartsStudent student) {
        int totalCharacteristics = magicPower + transgression;
        int studentTotalQualities = student.magicPower + student.transgression;

        if (totalCharacteristics > studentTotalQualities) {
            System.out.println(this.getName() + " is better than " + student.getName());
        } else if (totalCharacteristics < studentTotalQualities) {
            System.out.println(this.getName() + " is worse than " + student.getName());
        } else {
            System.out.println("Both Hogwarts students have the same level of qualities.");
        }
    }
}
