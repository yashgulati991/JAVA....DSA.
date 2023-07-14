package oops;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queen q = new Queen();
		q.moves();
	}

}

interface cute {
	void looks();

}

interface height {
	void height();
}

class person implements height, cute {
	public void cute() {
		System.out.println("looks a little cute");
	}

	@Override
	public void height() {
		System.out.println("height is good enough");
	}

	@Override
	public void looks() {
		// TODO Auto-generated method stub

	}
}

interface chessPlayer {
	void moves();
}

class Queen implements chessPlayer {

	@Override
	public void moves() {
		System.out.println("Moves in all directions ");
	}

}

class Rook implements chessPlayer {
	@Override
	public void moves() {
		System.out.println("UP DOWN");
	}
}