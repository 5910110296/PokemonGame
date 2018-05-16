/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus-PC
 */
public class Keromatsu extends Pokemon implements Swimmable{
	private static final int maxGroupHealth = 200;
	public Keromatsu(){
		super("Keromatsu",
		      (Math.random()*1000) % (maxGroupHealth+1));

		this.attackSkill = PokemonSkill.getPokemonSkill("Thunder Shock");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Water Pulse");
        }
        public void move(){
		this.swim();
	}
        public void swim(){
		this.reducedHealth(25);
	}
        
}
