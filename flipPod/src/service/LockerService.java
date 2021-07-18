package service;

import java.util.List;

import dao.LockerDao;
import models.Locker;

public class LockerService {
    private LockerDao lockerDao = new LockerDao();
    public void saveLocker(Locker lockerobj) {
        lockerDao.saveLocker(lockerobj);
    }
    public List<Locker> getAllLockers()
    {
        return lockerDao.getAllLockers();
    }

}
