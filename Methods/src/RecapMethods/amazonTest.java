package RecapMethods;

public class amazonTest {
	public static void main(String[] args) {
		amazon.navigate(testData.url);
		amazon.login(testData.userName, testData.password);
		amazon.search(testData.item);
		
	}

}
