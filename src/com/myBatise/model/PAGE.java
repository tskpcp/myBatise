package com.myBatise.model;

public class PAGE {
	   public PAGE(){}
	   private int IDX_CURR;
	   private int IDX_START;
	   private int IDX_END;
	   private int IDX_PRE;
	   private int IDX_NEXT;
	   private int TOT_PAGE;
	   private int TOT_COUNT;
	   private int UNIT;
	public int getIDX_CURR() {
		return IDX_CURR;
	}
	public void setIDX_CURR(int iDX_CURR) {
		IDX_CURR = iDX_CURR;
	}
	public int getIDX_START() {
		return IDX_START;
	}
	public void setIDX_START(int iDX_START) {
		IDX_START = iDX_START;
	}
	public int getIDX_END() {
		return IDX_END;
	}
	public void setIDX_END(int iDX_END) {
		IDX_END = iDX_END;
	}
	public int getIDX_PRE() {
		return IDX_PRE;
	}
	public void setIDX_PRE(int iDX_PRE) {
		IDX_PRE = iDX_PRE;
	}
	public int getIDX_NEXT() {
		return IDX_NEXT;
	}
	public void setIDX_NEXT(int iDX_NEXT) {
		IDX_NEXT = iDX_NEXT;
	}
	public int getTOT_PAGE() {
		return TOT_PAGE;
	}
	public void setTOT_PAGE(int tOT_PAGE) {
		TOT_PAGE = tOT_PAGE;
	}
	public int getTOT_COUNT() {
		return TOT_COUNT;
	}
	public void setTOT_COUNT(int tOT_COUNT) {
		TOT_COUNT = tOT_COUNT;
	}
	public int getUNIT() {
		return UNIT;
	}
	public void setUNIT(int uNIT) {
		UNIT = uNIT;
	}
}
