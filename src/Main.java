import java.lang.ref.Reference;

public class Main {
    public static void main(String[] args) {
        Gryffindor garryPotter = new Gryffindor("Garry Potter", 89, 67,
                100, 100, 100);
        Gryffindor hermioneGranger =new Gryffindor("Hermione Granger", 99, 99,
                89, 99, 65);
        Gryffindor ronWeasley =new Gryffindor("Ron Weasley", 47, 36,
                71, 88, 27);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 76, 84,
                97, 99, 80, 82, 100);
        Slytherin grahamMontague = new Slytherin("Graham Montegue", 15, 15,
                66, 44, 55, 33, 60);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 15, 3,
                11, 11, 23, 5, 3);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 47, 56,
                87, 89, 92);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 86, 77,
                90, 95, 98);
        Hufflepuff justinFletchley = new Hufflepuff("Justin Finch-Fletchley", 32, 21,
                52, 51, 67);

        Ravenclow choChang = new Ravenclow("Cho Chang", 69, 42,
                72, 41, 13, 92);
        Ravenclow padmaPatil = new Ravenclow("Padma Patil", 26, 19,
                43, 56, 56, 76);
        Ravenclow marcusBelby = new Ravenclow("Marcus Belby", 59, 40,
                71, 51, 28, 73);

        garryPotter.description();
        ronWeasley.compareGryffindor(garryPotter);
        cedricDiggory.compareHufflepuff(justinFletchley);
        padmaPatil.compareRavenclow(choChang);
        gregoryGoyle.compareSlytherin(dracoMalfoy);
        marcusBelby.compareHogwartsStudent(garryPotter);
    }
}