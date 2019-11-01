package Controller;

import Model.TrafficLight;
import Model.World;

import javax.swing.*;
// The Following Class is the controller of the program, what is needed to be run
public class Main {
    public static void main(String[] args) {
        World t = new World();
        JFrame jf = new JFrame();
        jf.setTitle("TrafficSim");
        jf.setSize(600, 400);
        jf.setResizable(false);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(t);
//        TrafficLight a = new TrafficLight();
//        jf.add(a);
    }
}
