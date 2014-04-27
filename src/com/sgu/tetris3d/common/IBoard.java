package com.sgu.tetris3d.common;

public interface IBoard {
	/**
	 * Get board value at element x, y, z
	 * @param x X coordinate
	 * @param y Y coordinate
	 * @param z Z coordinate
	 * @return value at Board[x][y][z]
	 */
	public int getValue(int x, int y, int z);
	public void setValue(int x, int y, int z, int value);
}
