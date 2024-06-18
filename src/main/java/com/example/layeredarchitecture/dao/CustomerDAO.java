package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> loadAllCustomer() throws SQLException, ClassNotFoundException;

    public void saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;

    public void updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException ;

    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;

    public void Delete(String id) throws SQLException, ClassNotFoundException ;

    public ResultSet GenerateId() throws SQLException, ClassNotFoundException ;
    public CustomerDTO SearchCustomer(String newValue) throws SQLException, ClassNotFoundException;
}
