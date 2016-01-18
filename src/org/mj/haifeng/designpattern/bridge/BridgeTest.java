package org.mj.haifeng.designpattern.bridge;

public class BridgeTest {

	public static void main(String[] args) {

		/*Bridge bridge = new MyBridge();
		
		 ���õ�һ������ 
		
		Sourceable source1 = new SourceSub1();
		bridge.setSource(source1);
		bridge.method();
		
		 ���õڶ������� 
		
		Sourceable source2 = new SourceSub2();
		bridge.setSource(source2);
		bridge.method();*/
		
		BridgeMy bridgeMy = new BridgeMy();
		
		Sourceable source1 = new SourceSub1();
		bridgeMy.setSource(source1);
		bridgeMy.method();
		
		 //���õڶ������� 
		
		Sourceable source2 = new SourceSub2();
		bridgeMy.setSource(source2);
		bridgeMy.method();
		
	}

}
