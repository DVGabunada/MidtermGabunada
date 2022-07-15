package com.example.midterms;

public class Bill {
    int previous;
    int current;
    Pipe type;
    int pack;
    int month;

    public Bill(int previous, int current, Pipe type, int pack, int month) {
        this.previous = previous;
        this.current = current;
        this.type = type;
        this.pack = pack;
        this.month = month;
    }

    // TODO Milestone 3: Calculate bill.
    public double get_bill() {
        return 0;
    }
}
