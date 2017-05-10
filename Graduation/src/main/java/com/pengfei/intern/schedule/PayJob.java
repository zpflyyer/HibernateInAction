package com.pengfei.intern.schedule;

import com.pengfei.intern.service.ItrManager;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class PayJob extends QuartzJobBean
{
	// �ж���ҵ�Ƿ�ִ�е����
	private boolean isRunning = false;
	// ����ҵ����������ҵ���߼����
	private ItrManager empMgr;
	public void setEmpMgr(ItrManager empMgr)
	{
		this.empMgr = empMgr;
	}
	// ��������ִ����
	public void executeInternal(JobExecutionContext ctx)
		throws JobExecutionException
	{
		if (!isRunning)
		{
			System.out.println("��ʼ�����Զ����㹤��");
			isRunning = true;
			// ����ҵ���߼�����
			empMgr.autoPay();
			isRunning = false;
		}
	}
}