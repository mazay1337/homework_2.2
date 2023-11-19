public class Hufflepuff extends HogwartsStudent {
    private int hardworking;
    private int loyal;
    private int fairAndJust;

    public Hufflepuff(String name, int magicPower, int transgression,
                      int hardworking, int loyal, int fairAndJust) {
        super(name, magicPower, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.fairAndJust = fairAndJust;
    }

    public int getHardworking() { return hardworking; }

    public int getLoyal() { return loyal; }

    public int getFairAndJust() { return fairAndJust; }

    @Override
    public void description() {
        super.description();
        System.out.println(" Hardworking:" + hardworking + ", Loyal:" + loyal + ", FairAndJust:" + fairAndJust);
        System.out.println();
    }

    public void compareHufflepuff(Hufflepuff student) {
        int totalCharacteristics = hardworking + loyal + fairAndJust;
        int studentTotalQualities = student.hardworking + student.loyal + student.fairAndJust;

        if (totalCharacteristics > studentTotalQualities) {
            System.out.println(this.getName() + " is a better Hufflepuff than " + student.getName());
        } else if (totalCharacteristics < studentTotalQualities) {
            System.out.println(this.getName() + " is a worse Hufflepuff than " + student.getName());
        } else {
            System.out.println("Both Hufflepuff students have the same level of qualities.");
        }
    }
}
