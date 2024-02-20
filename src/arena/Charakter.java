package arena;

public abstract class Charakter {

	private String Name;
	private int Lifepoints;
	private boolean specialAbilityActive;
	private int Damagepoints;
	
	
	
	public Charakter(String name) {
		super();
		Name = name;
		this.Lifepoints = 100;
		this.specialAbilityActive = false;
		this.Damagepoints = 0;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getLifepoints() {
		return Lifepoints;
	}
	public void setLifepoints(int lifepoints) {
		Lifepoints = lifepoints;
	}
	public boolean isSpecialAbilityActive() {
		return specialAbilityActive;
	}
	public void setSpecialAbilityActive(boolean specialAbilityActive) {
		this.specialAbilityActive = specialAbilityActive;
	}
	public int getDamagepoints() {
		return Damagepoints;
	}
	public void setDamagepoints(int damagepoints) {
		Damagepoints = damagepoints;
	}
	
	
	
	
	
	
	
	
}
