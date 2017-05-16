package com.pengfei.intern.dao;

import com.pengfei.intern.domain.Intern;
import com.pengfei.intern.domain.Job;
import com.pengfei.intern.domain.Task;

import java.util.List;
import java.util.Set;

/**
 * Created by zhaopen on 5/16/2017.
 */
public interface JobDao extends BaseDao<Job>{
    List<Job> getAllByIntern(Intern itr);

    List<Job> getAllByTask(Task task);
}
