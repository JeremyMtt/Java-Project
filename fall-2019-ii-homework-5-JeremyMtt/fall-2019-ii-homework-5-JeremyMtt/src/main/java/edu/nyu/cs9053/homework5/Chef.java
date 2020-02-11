package edu.nyu.cs9053.homework5;

/**
 * User: blangel
 */
public class Chef {
    
    private final Oven oven;
    
    private final SousChef sousChef;
    
    public Chef(Oven oven, SousChef sousChef) {
	this.sousChef = sousChef;
	this.oven = oven;
    }
    
    public static void main(String[] args) {
	Oven oven = new Oven(300);
	Chef chef = new Chef(oven, new SousChef(oven));

	RoastedSweetPotato roastedSweetPotato = new RoastedSweetPotato(oven);
	PotRoast potroast = new PotRoast(oven);
	Baguette baguette = new Baguette(oven);
	Baguette baguette2 = new Baguette(oven);
	if(!potroast.isRecipeDone()) {
	    chef.prepareToCook(potroast);
	}
	
	if(!baguette.isRecipeDone()) {
	    chef.prepareToCook(baguette);
	}
	
	if(!roastedSweetPotato.isRecipeDone()) {
	    chef.prepareToCook(roastedSweetPotato);
	}
	
	if(!baguette2.isRecipeDone()) {
	    chef.prepareToCook(baguette2);
	}
    }


    private void prepareToCook(Recipe recipe) {
	RecipeReadyCallback callback = new RecipeReadyCallback() {
		@Override
		    public void recipeReadyToCook(Recipe recipe) {
		    recipe.initializeFromOven(oven);
		    cookInOven(recipe,true);
		}
	    };
	sousChef.prepare(recipe, callback);
    }


    private void cookInOven(Recipe recipe, boolean initialPutInOven) {
	if(initialPutInOven == true) {
	    Timer recipeTimer = new Timer() {
		    @Override public void update(Time unit, int value, int ovenTemperature) {
			if (unit == null) {
			    throw new IllegalArgumentException("unit cannot be null");
			}
			recipe.adjust(unit, value, ovenTemperature);
		    }
		};
	    oven.cook(recipe, recipeTimer, true);
	    while (!recipe.isRecipeDone()) {
		oven.cook(recipe, recipeTimer, false);
	    }
	    oven.takeOut(recipe);
	}
	else {Timer timer = new Timer() {
		@Override public void update(Time unit, int value, int ovenTemperature) {
		    if (unit == null) {
			throw new IllegalArgumentException("unit cannot be null");
		    }
		    recipe.adjust(unit, value, ovenTemperature);
		}
	    };
	    oven.cook(recipe, timer, false);
	    while (!recipe.isRecipeDone()) {
		oven.cook(recipe, timer, false);
	    }
	    oven.takeOut(recipe);
    
	}
    }
}