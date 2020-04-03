package collectionsarefun;

public class Chessboard {
	public static void main(String[] args) {
		String[][] chessBoard = { { "Rook", "Bishop-B", "Knight", "King", "Queen", "Knight", "Bishop-b", "Rook" }, // 0
				{}, // 1
				{}, // 2
				{}, // 3
				{}, // 4
				{}, // 5
				{}, // 6
				{ "Rook", "Bishop-b", "Knight", "King", "Queen", "Knight", "Bishop", "Rook" },// 7
		};
		System.out.println(chessBoard[5][1]);

	}
}
