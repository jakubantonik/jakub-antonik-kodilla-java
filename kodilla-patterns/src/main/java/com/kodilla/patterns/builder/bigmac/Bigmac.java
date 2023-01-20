package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final RollType rollType;
    private final int burgers;
    private final SauceType sauce;
    private List<IngredientsType>ingredients = new ArrayList<>();


    public static class BigmacBuilder{
        private RollType rollType;
        private int burgers;
        private SauceType sauce;
        private List<IngredientsType>ingredients = new ArrayList<>();

        public BigmacBuilder rollType(RollType rollType){
            this.rollType = rollType;
            return this;
        }
        public BigmacBuilder burgers(int burgers){
            this.burgers= burgers;
            return this;
        }
        public BigmacBuilder sauce(SauceType sauce){
            this.sauce = sauce;
            return this;
        }
        public BigmacBuilder ingredient(IngredientsType ingredient){
            ingredients.add(ingredient);
            return this;
        }
        public Bigmac build(){
            return new Bigmac(rollType, burgers, sauce, ingredients);
        }

    }

    public Bigmac(RollType rollType, int burgers, SauceType sauce, List<IngredientsType>ingredients) {
        this.rollType = rollType;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }
    public RollType getRollType() {
        return rollType;
    }

    public int getBurgers() {
        return burgers;
    }

    public SauceType getSauce() {
        return sauce;
    }

    public List<IngredientsType> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + rollType + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
