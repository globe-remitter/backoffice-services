package com.gr.backoffice.common.dao.accounts;

import java.util.List;

/**
 *  Extend this interface to the module specific interface so that you don't need to write the code for the module specific interface.
 * @param <T>
 *
 */
public interface IDaoOperations<T> {
    int save(T t);
    int update(T t);
    T getOne(int id);
    T getOne(String id);
    List<T> getAll();
    int delete(int id);
    int delete(String id);
    int updateStatus(int id, boolean status);
    int updateStatus(String id, boolean status);
}
