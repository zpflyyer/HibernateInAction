package com.pengfei.intern.schedule;

import com.pengfei.intern.service.EmpManager;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;


public class PunchJob extends QuartzJobBean
{
	private boolean isRunning = false;
	private EmpManager empMgr;
	public void setEmpMgr(EmpManager empMgr)
	{
		this.empMgr = empMgr;
	}
	public void executeInternal(JobExecutionContext ctx)
		throws JobExecutionException
	{
		if (!isRunning)
		{
			System.out.println("start to autoPunch");
			isRunning = true;
			empMgr.autoPunch();
			isRunning = false;
		}
	}
}