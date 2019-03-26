import com.classes.Destination;
import com.classes.Source;
import com.interfaces.Pairs;

public class SampleMain implements Pairs<Source, Destination> {

	@Override
	public Source getKey(Destination b) {

		String getDestination = b.getA();
//Setting destination to source
		Source source = new Source();
		source.setA(getDestination);
//returning Source.
		System.out.println("The Destination to ur Source is::" + source + "..");
		return source;
	}

	@Override
	public Destination getValue(Source b) {

		// ViseVersa.

		return null;
	}

	public static void main(String[] args) {

		SampleMain main = new SampleMain();

		// Setting destination at runtime for now.

		Destination bes = new Destination();
		bes.setA("Destination EndPoint:::>");
//Not passing setB so, returns null by default.

//Calling Source to Destination Method.
		main.getKey(bes);

	}
}