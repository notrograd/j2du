package us.j2du.elements;

import java.nio.file.Path;

public abstract class Element {

    String spritePath;
    Path image = Path.of(getSpritePath());

    public Element(String name, boolean isLivingEntity)
    {
        if (spritePath == null)
        {
            spritePath = "";
        }

        logic();
    }

    public abstract void logic();

    public String getSpritePath() {
        return spritePath;
    }

    public void setSpritePath(String path)
    {
        this.spritePath = path;
    }
}
