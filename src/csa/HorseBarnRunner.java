package csa;

public class HorseBarnRunner {
    public static void main (String[] args){
        Horse[] horses = new Horse[7];
        horses[0] = new HorseCreate("Trigger", 1340);
        horses[1] = null;
        horses[2] = new HorseCreate("Silver", 1210);
        horses[3] = new HorseCreate("Lady", 1575);
        horses[4] = null;
        horses[5] = new HorseCreate("Patches", 1350);
        horses[6] = new HorseCreate("Duke", 1410);

        HorseBarn sweetHome = new HorseBarn(horses);

        System.out.println(sweetHome.findHorseSpace("Trigger"));
        System.out.println(sweetHome.findHorseSpace("Silver"));
        System.out.println(sweetHome.findHorseSpace("Coco"));
        sweetHome.consolidate();
        System.out.println(sweetHome.findHorseSpace("Duke"));
    }
}
