package kuyruk;

public class kuyrukyapisi {
	int[] dizi;
	int size;
	int front;
	int rear;
	public kuyrukyapisi(int size) {
		
		this.size = size;
		dizi=new int[size];
		front=0;
		rear=-1;
		
	}
	void enqueue(int data) {
		if(rear==size-1) {
			System.out.println("kuyruk doludur");
		}
		else {
		rear++;
		dizi[rear]=data;
		System.out.println(dizi[rear] + "  kuyruga eklendi");
		}
	}
	void dequeue() {
		if(rear==-1) {
			System.out.println("kuyruk bostur");
		}
		else {
			int a=dizi[front];
		for(int i=1;i<=rear;i++) {
			dizi[i-1]=dizi[i];
			
			
		}
		rear--;
		System.out.println(a + "  kuyruktan silindi");
		}
	}
	void yazdýr() {
		int i=rear;
		while(i>=0) {
			System.out.print(dizi[i] + " **   ");
			i--;
		}
		System.out.println();
	}
	void sayisi() {
		System.out.println((rear+1));
	}

}
