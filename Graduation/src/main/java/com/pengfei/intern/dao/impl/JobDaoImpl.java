package com.pengfei.intern.dao.impl;

import com.pengfei.intern.dao.JobDao;
import com.pengfei.intern.domain.Intern;
import com.pengfei.intern.domain.Job;
import com.pengfei.intern.domain.Task;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhaopen on 5/16/2017.
 */
@Repository
public class JobDaoImpl extends BaseDaoImpl<Job> implements JobDao{
    @Override
    public List<Job> getAllByIntern(Intern itr) {
        return find("select j from Job as j where j.intern=?0",itr);
    }

    @Override
    public List<Job> getAllByTask(Task task) {
        return find("select j from Job as j where j.task=?0",task);
    }
}
