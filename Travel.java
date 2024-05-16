public class Travel {
    private int people;

    public Travel(int n){
        people = n;
    }
    public int goByVan(){
        double vans = (people/8);
        int testv = people%8;
        if (testv != 0){
            vans ++;
        }
        return (int)vans;
    }
    public int goByCanoe(){
        double canoes = people/3;
        int testc = people%3;
        if (testc != 0){
            canoes ++;
        }
        return (int)canoes;

    }
    public int goByPlane(){
        double planes = (people/12);
        int testp = people%12;
        if (testp != 0){
            planes ++;
        }
        return (int)planes;
    }
} 
