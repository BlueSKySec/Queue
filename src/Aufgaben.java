public class Aufgaben {

    Queue test;

    public Aufgaben() {
        test = new Queue();
        test.enqueue(new Patient("1", null));
        test.enqueue(new Patient("2", null));
        test.enqueue(new Patient("3", null));
    }

    // Queue am Ende des Tages komplett leeren

    public void clearQueue() {
        while (!test.isEmpty()) {
            test.dequeue();
        }
    }

    public void ausgeben() {
        Queue hilf = new Queue();

        while (!test.isEmpty()) {
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


    public void loeschen() {
        while (!test.isEmpty()) {
            test.dequeue();
        }

    }

    public Queue getQueue() {
        return test;
    }

    public void entfernePatient(String name){

        Queue hilfe = new Queue();

        while(!test.isEmpty()){
            Patient k = test.front();
            if (!k.getName().equals(name)){
                hilfe.enqueue (k);
            }
            test.dequeue();
        }
        while(!hilfe.isEmpty()){
            Patient k = hilfe.front();
            test.enqueue(k);
            hilfe.dequeue();
        }
    }


    public static void main(String[] args) {
        // instantiierem der Klasse "Aufgaben":
        // Nun steht das Objekt "a" vom Typ "Aufgaben" zur Verfügung.+
        // Wenn Du oben Methoden implementierst, müssen diese hier
        // eingebunden werden:
        // Aufruf erfolgt dann mit
        // a.methodenName();

        Aufgaben a = new Aufgaben();
        a.ausgeben();
        a.entfernePatient("2");
        a.ausgeben();
        a.loeschen();
        Queue test = a.getQueue();
        Patient p = test.front();

        if (p == null) {
            System.out.println("Schlange ist leer");
        } else {
            System.out.println("Schlange ist nicht leer");
        }
    }
}



