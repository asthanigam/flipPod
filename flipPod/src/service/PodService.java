package service;

import java.util.List;

import dao.PodDao;
import models.Pod;

public class PodService {
    private PodDao podDao = new PodDao();
    public void savePod(Pod podobj) {
        podDao.savePod(podobj);
    }
    public List<Pod> getAllPods()
    {
        return podDao.getAllPods();
    }

}
