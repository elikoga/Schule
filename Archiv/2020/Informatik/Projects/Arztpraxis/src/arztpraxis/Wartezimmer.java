/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arztpraxis;

/**
 *
 * @author coafin
 */
public class Wartezimmer {

    private final Queue<Patient> prioWarteschlange;
    private final Queue<Patient> warteschlange;

    public Wartezimmer() {
        prioWarteschlange = new Queue<>();
        warteschlange = new Queue<>();
    }

    public void anstellen(Patient patient) {
        if (patient.isPrio()) {
            prioWarteschlange.enqueue(patient);
        } else {
            warteschlange.enqueue(patient);
        }
    }

    public Patient naechsterBitte() {
        Patient patient;
        if (!prioWarteschlange.isEmpty()) {
            patient = prioWarteschlange.front();
            prioWarteschlange.dequeue();
            return patient;
        }
        patient = warteschlange.front();
        warteschlange.dequeue();
        return patient;
    }

    private int countQueue(Queue queue) {
        int count = 0;
        Queue tQueue = new Queue();
        while (!queue.isEmpty()) {
            tQueue.enqueue(queue.front());
            queue.dequeue();
            count++;
        }
        while (!tQueue.isEmpty()) {
            queue.enqueue(tQueue.front());
            tQueue.dequeue();
        }
        return count;
    }

    public int anzahlPrio() {
        return countQueue(prioWarteschlange);
    }

    public int anzahlAlle() {
        return countQueue(warteschlange) + countQueue(prioWarteschlange);
    }

    public int anzahlNormalos() {
        return countQueue(warteschlange);
    }

    public String queueToString(Queue<Patient> queue) {
        String out = "Patienten(\n";
        Queue<Patient> tQueue = new Queue();
        while (!queue.isEmpty()) {
            out += queue.front().toString() + ",\n";
            tQueue.enqueue(queue.front());
            queue.dequeue();
        }
        while (!tQueue.isEmpty()) {
            queue.enqueue(tQueue.front());
            tQueue.dequeue();
        }
        out += ")\n";
        return out;
    }

    @Override
    public String toString() {
        return "Anzahl: " + Integer.toString(anzahlAlle()) + "\n"
                + "Normale: " + Integer.toString(anzahlNormalos()) + " "
                + queueToString(warteschlange)
                + "Prio: " + Integer.toString(anzahlPrio()) + " "
                + queueToString(prioWarteschlange);
    }

}
