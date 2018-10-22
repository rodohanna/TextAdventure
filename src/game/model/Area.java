package game.model;

import java.util.List;

public class Area
{
    private String id;
    private String name;
    private String description;
    private List<String> itemIds;
    private World world;

    public Area(String id, String name, String description, List<String> itemIds, World world)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.itemIds = itemIds;
        this.world = world;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public List<String> getItemIds()
    {
        return itemIds;
    }

    public void handleAction(List<String> inputList) {
        for (String item : inputList) {
            System.out.println("|" + item + "|");
        }
        switch (inputList.get(0)) {
            case "go":
                World.print("Go command recognized.\n");
                break;
            case "inspect":
                World.print("Inspect command recognized.\n");
                break;
        }
    }

    private void handleInspect() {

    }

    private void handleWhere() {

    }
}
