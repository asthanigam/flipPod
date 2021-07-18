package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import models.Locker;

public class LockerDao {
    private static HashMap<Integer,Locker> lockers = new HashMap<Integer,Locker>();
    private static int index = 0;

    public void saveLocker(Locker lockerobj) {
        lockers.put(index++, lockerobj); 
    }

    public List<Locker> getAllLockers() {
        return  new ArrayList<Locker>(lockers.values());
    }

}
