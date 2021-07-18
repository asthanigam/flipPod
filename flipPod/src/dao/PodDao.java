package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import models.Pod;

public class PodDao {
    private static HashMap<Integer,Pod> pods = new HashMap<Integer,Pod>();
    private static int index = 0;

    public void savePod(Pod podobj) {
        pods.put(index++, podobj); 
        
    }

    public List<Pod> getAllPods() {
        // TODO Auto-generated method stub
        return new ArrayList<Pod>(pods.values());
    }

}
