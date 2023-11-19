public class Slytherin extends HogwartsStudent{
    private int cunning;
    private int ambition;
    private int confidence;
    private int resourcefulness;
    private int naturalLeaders;

    public Slytherin(String name, int magicPower, int transgression,
                     int cunning, int ambition, int confidence, int resourcefulness,int naturalLeaders) {
        super(name, magicPower, transgression);
        this.cunning = cunning;
        this.ambition = ambition;
        this.confidence = confidence;
        this.resourcefulness = resourcefulness;
        this.naturalLeaders = naturalLeaders;
    }

    public int getCunning() { return cunning; }

    public int getAmbition() { return ambition; }

    public int getConfidence() { return confidence; }

    public int getResourcefulness() { return resourcefulness; }

    public int getNaturalLeaders() { return naturalLeaders; }


    @Override
    public void description() {
        super.description();
        System.out.println(" Cunning:" + cunning + ", Ambition:" + ambition + ", Confidence:" + confidence +
                ", Resourcefulness:" + resourcefulness + ", NaturalLeaders:" + naturalLeaders);
        System.out.println();
    }

    public void compareSlytherin(Slytherin student) {
        int totalCharacteristics = cunning + ambition + confidence + resourcefulness + naturalLeaders;
        int studentTotalQualities = student.cunning + student.ambition + student.confidence + student.resourcefulness + student.naturalLeaders;

        if (totalCharacteristics > studentTotalQualities) {
            System.out.println(this.getName() + " is a better Slytherin than " + student.getName());
        } else if (totalCharacteristics < studentTotalQualities) {
            System.out.println(this.getName() + " is a worse Slytherin than " + student.getName());
        } else {
            System.out.println("Both Slytherin students have the same level of qualities.");
        }
    }
}
