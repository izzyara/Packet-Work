public class TestTravel {

    public static void main (String[]args){

    int counter = 1;
    int people = 6;

    while(counter<19){
        Travel travel = new Travel(people);


        int v = travel.goByVan();
        int c = travel.goByCanoe();
        int p = travel.goByPlane();
        System.out.println("people = "+ people + ", vans = "+ v + ", canoes = "+ c + ", planes = "+ p);

        counter ++;
        people += 2;
    }
    }
    
}
