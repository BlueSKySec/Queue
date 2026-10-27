public class Aufgaben {

    Queue test;

    public Aufgaben(){
        test = new Queue();
        test.enqueue(new Patient("1", null));
        test.enqueue(new Patient("2", null));
        test.enqueue(new Patient("3", null));
    }

    // Queue am Ende des Tages komplett leeren

    public void clearQueue(){
        while (!test.isEmpty()){
            test.dequeue();
        }
    }

    public void ausgeben() {
        Queue hilf = new Queue();

        while(!test.isEmpty()) {
            Patient p = test.front();
            System.out.println(p.getName());
            hilf.enqueue(p);
            test.dequeue();
        }

        while (!hilf.isEmpty()) {
            Patient p = hilf.front();
            System.out.println("Ich speichere zurück:" + p.getName());
            test.enqueue(p);
            hilf.dequeue();
        }

    }


    public static  void main(String[] args){
        Aufgaben a = new Aufgaben();
        a.ausgeben();
    }
}
