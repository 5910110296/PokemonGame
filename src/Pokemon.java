abstract class Pokemon{
	public final double maxHealth;
	protected double health;
	protected String name;
	protected PokemonSkill attackSkill;
	protected PokemonSkill untimatedSkill;

	public Pokemon(String name, double maxHealth){
		this.name = name;
		this.health = maxHealth;
		this.maxHealth = maxHealth;
	}

	public double getHealth(){
		return this.health;
	}

	public String getName(){
		return this.name;
	}
	
	public void eat(Berry berry){
		this.health += berry.getRestoreValue();
		if(this.health > this.maxHealth)
			this.health = this.maxHealth;
	}

	public void attack(Pokemon rival){
		rival.injure(this.attackSkill);
	}

	public void untimate(Pokemon rival){
		rival.injure(this.untimatedSkill);
	}

	public void injure(PokemonSkill skill){
		this.reducedHealth(skill.getDamage());
	}

	public void reducedHealth(double value){
		this.health -= value;
		if(this.health < 0)
			this.health = 0;
	}

	abstract public void move();

}
