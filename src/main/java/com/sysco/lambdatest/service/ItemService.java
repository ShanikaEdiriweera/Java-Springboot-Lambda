package com.sysco.lambdatest.service;

import com.sysco.lambdatest.dao.ItemDao;
import com.sysco.lambdatest.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    ItemDao itemDAO;


    public int addItem(Item item){
        return itemDAO.addItem(item);
    }

    public String selectItem(int id){
        return itemDAO.selectItem(id);
    }
}
