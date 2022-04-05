package kuyruk;

public class kuyrukana {
	public static void main(String[] args) {
		kuyrukyapisi kuyruk=new kuyrukyapisi(5);
	kuyruk.enqueue(7);
	kuyruk.enqueue(4);
	kuyruk.enqueue(1);
	kuyruk.enqueue(5);
	kuyruk.enqueue(8);
	kuyruk.enqueue(7);
	kuyruk.dequeue();
	kuyruk.dequeue();
	kuyruk.dequeue();
	kuyruk.dequeue();
	kuyruk.dequeue();
	kuyruk.dequeue();
	kuyruk.yazdýr();
	kuyruk.enqueue(5);
	kuyruk.enqueue(15);
	kuyruk.enqueue(30);
	kuyruk.enqueue(70);
	kuyruk.enqueue(30);
	kuyruk.enqueue(30);
	kuyruk.enqueue(30);
	kuyruk.yazdýr();
	kuyruk.sayisi();
	}

}
