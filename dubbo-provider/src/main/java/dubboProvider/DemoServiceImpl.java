package dubboProvider;

import dubboApi.DemoService;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {
    public List<String> getLists(Integer id) {
        List<String> strList = new ArrayList<String>();
        strList.add("id:" + (id + 1));
        strList.add("id:" + id);
        strList.add("id:" + --id);
        System.out.println(strList);
        return strList;
    }
}
