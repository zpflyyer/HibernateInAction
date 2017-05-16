package com.pengfei.intern.dao;

import com.pengfei.intern.domain.Manager;
import com.pengfei.intern.domain.Task;

import java.util.List;
import java.util.Set;

/**
 * Created by zhaopen on 5/16/2017.
 */
public interface TaskDao extends BaseDao<Task> {
    List<Task> getAllByManager(Manager mgr);
}
