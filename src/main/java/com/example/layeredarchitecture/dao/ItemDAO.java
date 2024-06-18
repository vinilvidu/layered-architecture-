package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemDAO {
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException ;
    public void ItemSave(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;
    public boolean updateItem (ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;
    public boolean existItem(String code) throws SQLException, ClassNotFoundException;

    public void DeleteItem (String code) throws SQLException, ClassNotFoundException ;
    public ResultSet GenerateId() throws SQLException, ClassNotFoundException ;
    public ItemDTO FindItem (String newItemCode) throws SQLException, ClassNotFoundException;

}
