public class App { /*������ �迭�� ���ĺ� ��� ����*/
    public static void main(String[] args) throws Exception {
        char[][] alphabets = new char[13][2];
        char ch = 'a';

       for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++, ch++) {
				alphabets[i][j] = ch;
				System.out.print(alphabets[i][j] + " ");
			}
			System.out.println();
       }
    }   
}
