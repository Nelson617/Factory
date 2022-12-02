public class Sport {
    int pos;
    String season;
    String name;
    int avefans;
    int Players;
    int record;


    public Sport() {
        name = "Basketball";
        pos = 5;
        season = "Winter";
        avefans = 100000;

    }

    public void print(){
        System.out.println("this is the sport " + name+" and it happens in the " + season+ " season");
        System.out.println("with an average fan rate of " + avefans +" and a max positions of " + pos +" people on the court at once");
        rateing();

    }




    public Sport( int pPlayers, int pRecord, String pName)
    {
        name = pName;
        Players = pPlayers;
        record = pRecord;

        }

        public void rateing(){
        if(record > 10) {
            System.out.println("This is a good season");
        }
        else {
            System.out.println("This is a sad season");
        }
    }
    }



