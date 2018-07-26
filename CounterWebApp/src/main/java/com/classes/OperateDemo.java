package com.classes;

import com.interfaces.OperatorI;

public class OperateDemo {
private OperatorI oInterface;

public void init(){
	System.out.println(" init ..");
}

public OperatorI getoInterface() {
	return oInterface;
}

public void setoInterface(OperatorI oInterface) {
	this.oInterface = oInterface;
}
public int getOperate(int x,int y){
	return oInterface.operate(x, y);
	
}
}
