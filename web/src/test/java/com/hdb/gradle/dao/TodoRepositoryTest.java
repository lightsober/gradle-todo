package com.hdb.gradle.dao;

import com.hdb.gradle.model.TodoItem;
import org.junit.Assert;
import org.junit.Test;

public class TodoRepositoryTest {
    private TodoRepository repository = new TodoRepository();

    @Test
    public void testSave() {
        TodoItem item = new TodoItem("imooc");
        repository.save(item);
        Assert.assertNotNull(repository.query(item));
    }
}
