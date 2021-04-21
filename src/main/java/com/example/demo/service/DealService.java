package com.example.demo.service;

import com.example.demo.dao.CarDao;
import com.example.demo.dao.ClientDao;
import com.example.demo.dao.DealDao;
import com.example.demo.dao.ManagerDao;
import com.example.demo.model.Car;
import com.example.demo.model.Client;
import com.example.demo.model.Deal;
import com.example.demo.model.Manager;

public class DealService {
    private ClientDao clientDao = new ClientDao();
    private CarDao carDao = new CarDao();
    private DealDao dealDao = new DealDao();
    private ManagerDao managerDao = new ManagerDao();


    public DealService() {

    }

    public void saveClient(Client client) {
        clientDao.save(client);
    }

    public void saveCar(Car car) {
        carDao.save(car);
    }

    public void saveDeal(Deal deal) {
        dealDao.save(deal);
    }

    public void saveManager(Manager manager) {
        managerDao.save(manager);
    }
}
