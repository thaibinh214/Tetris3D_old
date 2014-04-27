package com.sgu.tetris3d.game;

import com.sgu.tetris3d.common.IBoard;

public class Board implements IBoard {
	public static final int SIZE_X = 5;
	public static final int SIZE_Y = 10;
	public static final int SIZE_Z = 5;
	
	public int[][][] Board;
	
	public Board() {
		initializeBoard();
	}
	
	public void initializeBoard() {
		Board = new int[SIZE_X][SIZE_Y][SIZE_Z];
		
		for(int z=0; z<SIZE_Z; z++) {
			for(int y=0; y<SIZE_Y; y++) {
				for(int x=0; x<SIZE_X; x++) {
					Board[x][y][z] = 0;
				}
			}
		}
	}
	
	public int getValue(int x, int y, int z) {
		return Board[x][y][z];
	}
	
	public void setValue(int x, int y, int z, int value) {
		Board[x][y][z] = value;
	}
}
