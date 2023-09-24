
public class Character {
	private String name;
	private String charClass;
	private Weapon weapon = new Weapon();
	private Armor armor = new Armor();

	public Character(String name, String charClass, String weapon, String weaponType, String armor, String armorType) {
		super();
		this.name = name;
		this.charClass = charClass;
		this.weapon.setWeapon(weapon);
		this.weapon.setWeaponType(weaponType);
		this.armor.setArmor(armor);
		this.armor.setArmorType(armorType);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharClass() {
		return charClass;
	}

	public void setCharClass(String charClass) {
		this.charClass = charClass;
	}

	public String getWeapon() {
		return weapon.getWeapon();
	}

	public void setWeapon(String weapon) {
		this.weapon.setWeapon(weapon);
	}

	public String getWeaponType() {
		return weapon.getWeaponType();
	}

	public void setWeaponType(String weaponType) {
		this.weapon.setWeaponType(weaponType);
	}

	public String getArmor() {
		return armor.getArmor();
	}

	public void setArmor(String armor) {
		this.armor.setArmor(armor);
	}

	public String getArmorType() {
		return armor.getArmorType();
	}

	public void setArmorType(String armorType) {
		this.armor.setArmorType(armorType);
	}
	
	
}
