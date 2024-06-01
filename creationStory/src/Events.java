public class Events {

    public static void printCreationEvent(int day) {
        switch (day) {
            case 1:
                System.out.println("Day 1: God created the Heavens and the Earth. The Earth was formless and empty, darkness was over the surface of the deep, and the Spirit of God was hovering over the waters. God said, \"Let there be light,\" and there was light. God separated the light from the darkness, calling the light 'day' and the darkness 'night.' Evening passed and morning came, marking the first day.");
                break;
            case 2:
                System.out.println("Day 2: God created the expanse (sky) to separate the waters above from the waters below.");
                break;
            case 3:
                System.out.println("Day 3: God gathered the waters under the sky to one place, and dry ground appeared. He called the dry ground 'land,' and the gathered waters he called 'seas.' God also created vegetation: seed-bearing plants and trees on the land that bear fruit with seed in it.");
                break;
            case 4:
                System.out.println("Day 4: God created the sun, moon, and stars to give light to the Earth and to separate the day from the night, and to mark seasons, days, and years.");
                break;
            case 5:
                System.out.println("Day 5: God created the creatures of the sea and every living thing that moves in the water, and every winged bird. He blessed them and told them to be fruitful and increase in number and fill the water in the seas, and let the birds increase on the Earth.");
                break;
            case 6:
                System.out.println("Day 6: God created the animals to fill the Earth. He also created mankind in His own image, in the image of God He created them; male and female He created them. God blessed them and said to them, \"Be fruitful and increase in number; fill the Earth and subdue it. Rule over the fish in the sea and the birds in the sky and over every living creature that moves on the ground.\"");
                break;
            case 7:
                System.out.println("Day 7: God finished His work and rested on the seventh day. He blessed the seventh day and made it holy, because on it He rested from all the work of creating that He had done.");
                break;
            default:
                System.out.println("Invalid day. Please enter a number between 1 and 7.");
        }
    }
}