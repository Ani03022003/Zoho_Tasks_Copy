class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter{
    public String toString(){
        return "Fighter is a Warrior";
    }
    boolean isVulnerable(){
        return false;
    }
    int getDamagePoints(Fighter f){
        if(f.isVulnerable())
            return 10;
        else
            return 6;
    }
}

// TODO: define the Wizard class
class Wizard extends Fighter{
    boolean spell=false;
    public String toString(){
        return "Fighter is a Wizard";
    }
    void prepareSpell(){
        spell=true;
    }
    boolean isVulnerable(){
        if(spell){
            return false;
        }
        else
            return true;
    }
    int getDamagePoints(Fighter f){
        if(spell)
            return 12;
        else
            return 3;
    }
}