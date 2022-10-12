
public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Asker Kredisi Hesaplandı.");
		
	}

	@Override
	public void save() {
		System.out.println("Kredi Sistemine Kaydedildi.");
		
	}

}
