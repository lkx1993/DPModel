package com.company.行为型模式.a08_mediator.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 同事的抽象类
 */
public abstract class AbstractColleague {
	protected AbstractMediator mediator;
	public AbstractColleague(AbstractMediator _mediator){
		this.mediator = _mediator;
	}
}
