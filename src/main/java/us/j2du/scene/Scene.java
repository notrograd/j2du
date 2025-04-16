package us.j2du.scene;

import us.j2du.elements.Element;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Scene extends Element {

    protected   String name;
    protected   int width;
    protected   int height;


    ArrayList<Element> elements = new ArrayList<>();

    public ArrayList<Element> getElements() {
        if (!elements.isEmpty())
            return elements;
        else return null;
    }

    public Scene(String name, int width, int height)
    {
        super(name, false);

        this.width  = width;
        this.height = height;
    }

    @Override
    public void logic() {

        JFrame scene = new JFrame(name);

        scene.width
    }
}
