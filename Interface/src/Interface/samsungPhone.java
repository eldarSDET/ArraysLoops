package Interface;

public class samsungPhone extends Phone implements camera,memoryCard{

	@Override
	public void download() {
		System.out.println("Samsung is downloading ");
		
	}

	@Override
	public Number getFiles() {
		
		return 16;
	}

	@Override
	public String getName() {
		
		return "SamsungName";
	}

	@Override
	public String getPicture() {
		
		return "Getting picture for Samsung";
	}

	@Override
	public void lock() {
		System.out.println("Samsung is locked");
		
	}

	@Override
	public void call(long number) {
		System.out.println("Samsung is calling to "+number);
		
	}

	@Override
	public void text(long number) {
		System.out.println("Samsung is texting to "+number);
		
	}

	@Override
	public void takePicture() {
		System.out.println("Samsung is taking picture");
		
	}
	

}
