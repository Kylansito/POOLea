import Keyboard.*;

import java.util.Random;

public class Memory {
    public static void main(String[] args) {
        int nFiles = dades(0, 0);
        int nColumnes = dades(1, nFiles);

        String[][] tNoms = new String[nFiles][nColumnes];
        Boolean[][] marcats = new Boolean[nFiles][nColumnes];

        String[] randNames = new String[nColumnes*nFiles/2];


    }

    public static int dades(int num, int nFiles){
        if(num == 0){
            System.out.println("Indica el numero de files del taulell");
            int in = Keyboard.readInt();
            while(in < 1 || in > 36){
                System.out.println("Valor incorrecte, torni a introduir el valor [1, 36]");
                in = Keyboard.readInt();
            }
            return in;
        }
        if(num == 1){
            System.out.println("Indica el numero de columnes del taulell");
            int in = Keyboard.readInt();
            while(in < 1 || nFiles*in > 36 || nFiles*in % 2 != 0){
                System.out.println("Valor incorrecte, torni a introduir el valor. El taulell pot tenir maxim 36 caselles i han de ser parelles");
                in = Keyboard.readInt();
            }
            return in;
        }
        return 0;
    }

    public static void startRandom(String[] randNames){
        boolean[] agafat = new boolean[randNames.length];


        Random rand = new Random();

        for(int i = 0; i < randNames.length; i++) {
            int nRand = rand.nextInt(18);
            while(agafat[nRand]){
                nRand = rand.nextInt(randNames.length);
            }
            agafat[nRand] = true;
            randNames[i] = switchRand(nRand);
        }
    }

    public static String switchRand(int n){
        switch (n){
            case 0: return "Aatrox";
            case 1: return "Ahri";
            case 2: return "Akali";
            case 3: return "Akshan";
            case 4: return "Alistar";
            case 5: return "Amumu";
            case 6: return "Anivia";
            case 7: return "Annie";
            case 8: return "Aphelios";
            case 9: return "Ashe";
            case 10: return "Aurelion Sol";
            case 11: return "Bardo";
            case 12: return "Bel'Veth";
            case 13: return "Blitzcranck";
            case 14: return "Brand";
            case 15: return "Braum";
            case 16: return "Caitlyn";
            case 17: return "Camille";
            default: return "";
        }
    }
}