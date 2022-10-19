package abstractDemo;

public class OracleDatabaseManager extends BaseDatabaseManager {

	@Override // Annotation
	public void getData() {
		System.out.println("Veri Getirildi: Oracle");
	}

}
