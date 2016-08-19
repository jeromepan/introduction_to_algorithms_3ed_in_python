package charper2;

public class insertion_sort {
	public static void main(String[] args){
	java.util.Scanner input = new java.util.Scanner(System.in);
	System.out.println("Enter a squence of number: ");
	
	int c = input.nextInt();
	int [] cards = new int [c];
	for(int i1 = 0; i1 < cards.length; i1++){
		cards[i1] = input.nextInt();
		}
	
	for(int j = 2; j < cards.length; j++){
		int key = cards[j];
		
		int i = j - 1;
		while (i >= 0 && cards[i] > key){
			cards[i + 1] = cards[i];
			i = i-1;
			}
		cards[i+1] = key;
		
		}
	for (int k = 0; k<cards.length; k++){
		System.out.print(cards[k]+" ");
	}
	}
}
