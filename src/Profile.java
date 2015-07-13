package gitlec2;

public abstract class Profile {
	private String name;

	public Profile(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void hello() {
		System.out.println("================================");
		System.out.println(getName() + "Ç≈Ç∑ÅB\n" + profile());
		System.out.println("================================");
		
	}

	public abstract String profile();
}
