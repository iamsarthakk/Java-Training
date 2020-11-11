package com.pkg;

public class TestInterfaceImp1 implements TestInterface{
		String str;
		public TestInterfaceImp1() {
			
		}
		public TestInterfaceImp1(String s) {
			str = s;
		}
		public String getStr() {
			return str;
		}
		public void setStr(String str) {
			this.str = str;
		}
		public void sayHello() {
			System.out.println("Welcome "+str);
		}
}
