
public class FlowEx24_1 {

	public static void main(String[] args) throws java.io.IOException {
		// while문으로 재구조화
		
		int input = 0;
		System.out.println("문장을 입력하세요.");
		System.out.println("입력을 마치려면 x를 입력하세요.");
		while(input != -1 && input != 'x'){
			input = System.in.read();
			System.out.print((char)input);
		}

	}

}
