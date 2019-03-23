package creational.Builder;

import java.util.List;

public class Wiedzma {
    private String name;
    private List<String> spells;
    private int mana;
    private int hp;

    public Wiedzma(Builder builder) {
        this.name = builder.name;
        this.spells = builder.spells;
        this.mana = builder.mana;
        this.hp = builder.hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSpells() {
        return spells;
    }

    public void setSpells(List<String> spells) {
        this.spells = spells;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public static class Builder {
        private String name;
        private List<String> spells;
        private int mana;
        private int hp;

        public Builder() {

        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpells(List<String> spells) {
            this.spells = spells;
            return this;
        }

        public Builder setMana(int mana) {
            this.mana = mana;
            return this;
        }

        public Builder setHp(int hp) {
            this.hp = hp;
            return this;
        }

        public Wiedzma create() {
            return new Wiedzma(this);
        }
    }
}
