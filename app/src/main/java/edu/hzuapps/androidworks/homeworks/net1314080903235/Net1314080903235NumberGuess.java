package edu.hzuapps.androidworks.homeworks;

import java.util.List;



public interface Net1314080903235NumberGuess {

	public abstract int getGuessTimeLeft();//����ʣ��²����
	
	public abstract String getNewNumber();//���ش�������
	
	public abstract int getGuessTime();//���ؿɲ²��ܴ���
	
	public abstract int getGuessedTime();//�����Ѳ²����

	public abstract List getResults();//���ز²�����
	
	
	/**
	 * 
	 * @param number
	 * @return 0��1��2������ֵ��
	 *          0��ʾ��Ϸ������
	 *          1��ʾ�²�ɹ���
	 *          2��ʾ���β²�ʧ�ܣ��ɼ����²�
	 */
	public abstract int NumberCompare(String number);

	public abstract boolean isNumberValid(String number);//�ж����������Ƿ�Ϸ��������ظ���

}