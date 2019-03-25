# DPModel  

《[设计模式之禅](http://book.douban.com/subject/4260618/)》原书源码，有部分修改。存于此便于以后参考使用。

## 六大设计原则(SOLID)
 * [单一职责原则(SRP)](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/srp)
 * [开闭原则(OCP)](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/ocp)
 * [里氏替换原则(LSP)](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/lsp)
 * [迪米特法则(LOD)](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/lod)
 * [接口隔离原则(ISP)](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/isp)
 * [依赖倒置原则(DIP)](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/dip)  


## 23个设计模式  

创建型模式，共五种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式。

结构型模式，共七种：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式。

行为型模式，共十一种：策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式。

其实还有两类：并发型模式和线程池模式。

### 1.[单例模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/singleton)  
![Alt text](src/dp/com/company/a01_singleton/singleton.gif "单例模式")

### 2.[工厂模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/factorys)  
![Alt text](src/dp/com/company/a02_factorys/factorys.jpg "工厂模式类图")

### 3.[抽象工厂模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/factorya)   
![Alt text](src/dp/com/company/a03_factorya/factorya.jpg "抽象工厂模式类图")

### 4.[模板模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/template_method)  
![Alt text](src/dp/com/company/a04_template_method/template.jpg "模板模式类图")

### 5.[建造者模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/builder)  
![Alt text](src/dp/com/company/a05_builder/builder.jpg "建造者模式类图")

### 6.[代理模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/proxy)  
![Alt text](src/dp/com/company/a06_proxy/proxy.jpg "代理模式类图")

### 7.[原型模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/prototype)  
![Alt text](src/dp/com/company/a07_prototype/prototype.gif "原型模式类图")

### 8.[中介模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/mediator)  
![Alt text](src/dp/com/company/a08_mediator/mediator.jpg "中介模式类图")

### 9.[命令模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/command)  
![Alt text](src/dp/com/company/a09_command/command.jpg "命令模式类图")

### 10.[责任链模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/chain_of_responsibility)  
![Alt text](src/dp/com/company/a10_chain_of_responsibility/chainofresponsibility.jpg "责任链模式类图")

### 11.[装饰模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/decorator)  
![Alt text](src/dp/com/company/a11_decorator/decorator.jpg "装饰模式类图")

### 12.[策略模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/strategy)  
![Alt text](src/dp/com/company/a12_strategy/strategy.jpg "策略模式类图")

### 13.[适配器模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/adapter)  
![Alt text](src/dp/com/company/a13_adapter/adapter.jpg "适配器模式类图")

### 14.[迭代器模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/iterator)  
![Alt text](src/dp/com/company/a14_iterator/iterator.jpg "迭代器模式类图")

### 15.[组合模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/composite)  
![Alt text](src/dp/com/company/a15_composite/composite.jpg "组合模式类图")

### 16.[观察者模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/observer)  
![Alt text](src/dp/com/company/a16_observer/observer.jpg "观察者模式类图")

### 17.[门面模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/facade)  
![Alt text](src/dp/com/company/a17_facade/facade.gif "门面模式示意图")

### 18.[备忘录模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/memento)  
![Alt text](src/dp/com/company/a18_memento/memento.jpg "备忘录模式类图")

### 19.[访问者模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/visitor)  
![Alt text](src/dp/com/company/a19_visitor/visitor.jpg "访问者模式类图")

### 20.[状态模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/state)  
![Alt text](src/dp/com/company/a20_state/state.jpg "状态模式类图")

### 21.[解释器模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/interpreter)  
![Alt text](src/dp/com/company/a21_interpreter/interpreter.jpg "解释器模式类图")

### 22.[享元模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/flyweight)  
![Alt text](src/dp/com/company/a22_flyweight/flyweight.gif "享元模式类图")

### 23.[桥接模式](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/bridge)  
![Alt text](src/dp/com/company/a23_bridge/bridge.jpg "桥接模式类图")

### 24.[MVC](https://github.com/nivance/DPModel/tree/master/src/dp/com/company/mvc)
