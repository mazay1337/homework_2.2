public class Ravenclow  extends HogwartsStudent {
    private int intelligent;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclow(String name, int magicPower, int transgression,
                      int intelligent, int wise, int witty, int creative) {
        super(name, magicPower, transgression);
        this.intelligent = intelligent;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getIntelligent() { return intelligent; }

    public int getWise() { return wise; }

    public int getWitty() { return witty; }

    public int getCreative() { return creative; }


    @Override
    public void description() {
        super.description();
        System.out.println(" Intelligent:" + intelligent + ", Wise:" + wise + ", Witty:" + witty + ", Creative:" + creative);
        System.out.println();
    }

    public void compareRavenclow(Ravenclow student) {
        int totalCharacteristics = intelligent + wise + witty + creative;
        int studentTotalQualities = student.intelligent + student.wise + student.witty + student.creative;

        if (totalCharacteristics > studentTotalQualities) {
            System.out.println(this.getName() + " is a better Ravenclow than " + student.getName());
        } else if (totalCharacteristics < studentTotalQualities) {
            System.out.println(this.getName() + " is a worse Ravenclow than " + student.getName());
        } else {
            System.out.println("Both Ravenclow students have the same level of qualities.");
        }
    }
}
