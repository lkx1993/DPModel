package com.company.a18_备忘录_memento.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Originator {
	
	
/*#com.company.memento.section4.Memento lnkMemento*/
//内部状态
	private String state = "";
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	//创建一个备忘录
	public Memento createMemento(){
		return new Memento(this.state);
	}
	
	//恢复一个备忘录
	public void restoreMemento(Memento _memento){
		this.setState(_memento.getState());
	}
}
