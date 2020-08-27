package org.nerdcore;

public class SimpleCreatureBasic {

    private int id;
    private String creatureName = "";
    private String creatureBody = "";

    public SimpleCreatureBasic() {
    }

    public SimpleCreatureBasic(int id, String creatureName, String creatureBody) {
        this.id = id;
        this.creatureName = creatureName;
        this.creatureBody = creatureBody;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreatureName() {
        return creatureName;
    }

    public void setCreatureName(String creatureName) {
        this.creatureName = creatureName;
    }

    public String getCreatureBody() {
        return creatureBody;
    }

    public void setCreatureBody(String creatureBody) {
        this.creatureBody = creatureBody;
    }
}
