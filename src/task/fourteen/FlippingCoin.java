package task.fourteen;
//Zadaca_14_19_11_2017

/*
 *  @uthor Edin Korkic
 * 
 *  Napisati metodu koja prima jedan argument te simulira bacanje novèida toliko puta. 
 *  Nakon što se simulacija završi, program ispisuje koliko puta je novèiæ pokazao 
 *  glavu a koliko puta pismo.   
 */

public class FlippingCoin {

	public static void main(String[] args) {

		flippingCoin(1000);

	}

	public static void flippingCoin(int n) {

		int head = 0;
		int tail = 0;

		for (int i = 0; i < n; i++) {
			int coin = (int) (Math.random() * 2);

			if (coin > 0) {
				head++;

			} else {
				tail++;

			}
		}

		System.out.printf(" Novcic je bacen %d puta. \n", n);
		System.out.printf(" Pao je na glavu %d a na pismo %d puta.", head, tail);
	}
}
