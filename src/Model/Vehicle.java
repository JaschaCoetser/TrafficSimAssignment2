package Model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Vehicle<color> {
    int x, y, v;
    int start_x, start_y, start_v;
    int w, h;
    color c;
    String dir;

    Vehicle(int x, int y, int w, int h, int v, color c, String dir) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.v = v;
        this.c = c;
        this.start_x = x;
        this.start_y = y;
        this.start_v = v;
        this.dir = dir;
    }

    int getX() {
        return this.x;
    }

    int getY() {
        return this.y;
    }

    int getV() {
        return this.v;
    }

    int get_start_v() {
        return this.start_v;
    }

    String getDir() {
        return this.dir;
    }


    void drive() {

        if (this.dir.equals("h")) {
            this.x = this.x + this.v;
        } else {
            this.y = this.y + this.v;
        }

        int width = 0;
        if (this.x > width || this.x < 0) {
            this.x = start_x;
        }
        int height = 0;
        if (this.y > height || this.y < 0) {
            this.y = this.start_y;
        }
    }

    //if given parameters update speed
    void drive(int v) {
        this.v = v;
        if (this.dir.equals("h")) {
            this.x = this.x + this.v;
        } else {
            this.y = this.y + this.v;
        }

        int width = 0;
        if (this.x > width || this.x < 0) {
            this.x = this.start_x;
        }
        int height = 0;
        if (this.y > height || this.y < 0) {
            this.y = this.start_y;
        }
    }
}