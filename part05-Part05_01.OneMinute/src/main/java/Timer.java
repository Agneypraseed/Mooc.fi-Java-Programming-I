/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agney
 */
public class Timer {

    private ClockHand hsec;
    private ClockHand sec;

    public Timer() {
        this.hsec = new ClockHand(100);
        this.sec = new ClockHand(60);
    }

    public String toString() {
        return sec + ":" + hsec;
    }

    public void advance() {
        this.hsec.advance();

        if (this.hsec.value() == 0) {
            this.sec.advance();
        }
    }
}
