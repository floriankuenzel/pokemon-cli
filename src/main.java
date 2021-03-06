public class main {

    public static void main(String[] args) {

        // normal moves
        Move tackle = new Move("Tackle", "Normal", 50, 35, 100);
        Move ruckzuckhieb = new Move("Ruckzuckhieb", "Normal", 40, 30, 100);

        // grass moves
        Move rankenhieb = new Move("Rankenhieb", "Pflanze", 35, 10, 100);
        Move rasierblatt = new Move("Rasierblatt", "Pflanze", 55, 25, 95);

        // fire moves
        Move glut = new Move("Glut", "Feuer", 40, 25, 100);
        Move flammenwurf = new Move("Flammenwurf", "Feuer", 90, 15, 100);

        // water moves
        Move aquaknarre = new Move("Aquaknarre", "Wasser", 40, 25, 100);
        Move surfer = new Move("Surfer", "Wasser", 90, 15, 100);


        // misc moves
        Move erdbeben = new Move("Erdbeben", "Boden", 100, 10, 100);
        Move eisstrahl = new Move("Eisstrahl", "Eis", 90, 10, 100);
        Move donnerblitz = new Move("Donnerblitz", "Elektro", 90, 15, 100);
        Move psychokinese = new Move("Psychokinese", "Psycho", 90, 10, 100);
        Move windstoss = new Move("Windstoß", "Flug", 60, 35, 100);
        Move drachenwut = new Move("Drachenwut", "Drache", 40, 10, 100);
        Move steinhagel = new Move("Steinhagel", "Gestein", 75, 10, 90);


        Pokemon bisaflor = new Pokemon("Bisaflor", "Pflanze", rasierblatt, 50, 80, 100, 83, 80);
    }

    public static void choosePokemon() {

    }

    public static void renderHealthBar(Pokemon current) {

        int currentHP = current.getHealthPoints();
        int maxHP = current.getMaxHealthPoints();

        String healthBarFirst = "HP: xxxxxxxxxx ||";
        String healthBarSecond = "       " + currentHP + " / " + maxHP + " ||";
        String healthBarThird = "<==============||";

        System.out.println(healthBarFirst);
        System.out.println(healthBarSecond);
        System.out.println(healthBarThird);

    }
}
