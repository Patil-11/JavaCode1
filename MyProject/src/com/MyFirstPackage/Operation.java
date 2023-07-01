package com.MyFirstPackage;
interface math1
{
	void add();
}
interface complex1
{
	void square();
}
public class Operation implements math1,complex1
{
	public void add()
	{
		System.out.println("Add Function");
	}
	public void square()
	{
		System.out.println("Square Function");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation o=new Operation();
		o.add();
		o.square();
	}

}
