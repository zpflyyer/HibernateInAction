package com.pengfei.intern.dao.impl;

import com.pengfei.intern.dao.TaskDao;
import com.pengfei.intern.domain.Manager;
import com.pengfei.intern.domain.Task;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * Created by zhaopen on 5/16/2017.
 */
@Repository
public class TaskDaoImpl  extends BaseDaoImpl<Task> implements TaskDao {
    @Override
    public List<Task> getAllByManager(Manager mgr) {
        return find("select t from Task t where t.manager = ?0"
                , mgr);
    }
}
