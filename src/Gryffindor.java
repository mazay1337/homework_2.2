class Gryffindor extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int brave;

    public Gryffindor(String name, int magicPower, int transgression,
                      int nobility, int honor, int brave) {
        super(name, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;
    }

    public int getNobility() { return nobility; }

    public int getHonor() { return honor; }

    public int getBrave() { return brave; }


    @Override
    public void description() {
        super.description();
        System.out.println(" Nobility:" + nobility + ", Honor:" + honor + ", Brave:" + brave);
        System.out.println();
    }

    public void compareGryffindor(Gryffindor student) {
        int totalCharacteristics = nobility + honor + brave;
        int studentTotalQualities = student.nobility + student.honor + student.brave;

        if (totalCharacteristics > studentTotalQualities) {
            System.out.println(this.getName() + " is a better Gryffendor than " + student.getName());
        } else if (totalCharacteristics < studentTotalQualities) {
            System.out.println(this.getName() + " is a worse Gryffendor than " + student.getName());
        } else {
            System.out.println("Both Gryffindor students have the same level of qualities.");
        }
    }
}
