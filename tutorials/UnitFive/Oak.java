package UnitFive;

public class Oak extends Plant {
	public Oak() {
		// Not acceptable with private
		// type = "tree";

		// Works because size is protected and
		// opens between class and protected
		// and oak is a subclass of plant
		this.size = "large";

		// no access specifier // works
		this.height = 10;
	}
}
