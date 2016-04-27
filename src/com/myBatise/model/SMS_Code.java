package com.myBatise.model;

public class SMS_Code {
	public SMS_Code(){}
	private String CodeID;
	private int CodeIndex;
	private String CodeParent;
	private String CodeName;
	private String CodeValue1;
	private String CodeValue2;
	private String CodeValue3;
	public String getCodeID() {
		return CodeID;
	}
	public void setCodeID(String codeID) {
		CodeID = codeID;
	}
	public int getCodeIndex() {
		return CodeIndex;
	}
	public void setCodeIndex(int codeIndex) {
		CodeIndex = codeIndex;
	}
	public String getCodeParent() {
		return CodeParent;
	}
	public void setCodeParent(String codeParent) {
		CodeParent = codeParent;
	}
	public String getCodeName() {
		return CodeName;
	}
	public void setCodeName(String codeName) {
		CodeName = codeName;
	}
	public String getCodeValue1() {
		return CodeValue1;
	}
	public void setCodeValue1(String codeValue1) {
		CodeValue1 = codeValue1;
	}
	public String getCodeValue2() {
		return CodeValue2;
	}
	public void setCodeValue2(String codeValue2) {
		CodeValue2 = codeValue2;
	}
	public String getCodeValue3() {
		return CodeValue3;
	}
	public void setCodeValue3(String codeValue3) {
		CodeValue3 = codeValue3;
	}
	@Override
	public String toString(){
		return this.CodeID;
	}
}
