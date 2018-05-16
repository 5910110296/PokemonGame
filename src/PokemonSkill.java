public class PokemonSkill{
	private String name;
	private float damage;

	public PokemonSkill(String name, float damage){
		this.name = name;
		this.damage = damage;
	}

	public String getName(){
		return this.name;
	}

	public float getDamage(){
		return this.damage;
	}

	public static PokemonSkill getPokemonSkill(String name){
		PokemonSkill skill = null;
		switch(name.toLowerCase()){
			case "thunder shock":
				skill = new PokemonSkill("Thunder Shock", 40);
				break;
			case "thunderbolt":
				skill = new PokemonSkill("Thunderbolt", 90);
				break;
			case "tail whip":
				skill = new PokemonSkill("Tail Whip", 10);
				break;
			case "Water Pulse":
				skill = new PokemonSkill("Water Pulse", 100);
				break;
		}
		return skill;
	}
}
