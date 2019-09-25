package com.company;

abstract class CaffeineBaverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCap();
        if(customersWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    final void boilWater() {
        System.out.println("Boiling water");
    }

    final void pourInCap() {
        System.out.println("Pouring into cup");
    }

    boolean customersWantsCondiments() {
        return true;
    }
}
