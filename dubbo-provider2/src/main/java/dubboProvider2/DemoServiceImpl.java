package dubboProvider2;

import com.alibaba.dubbo.config.annotation.Service;
import dubboApi.DemoService;

import java.util.ArrayList;
import java.util.List;

@Service(version = "1.0")
public class DemoServiceImpl implements DemoService {

    @Override
    public List<String> getLists(Integer id) {
        List<String> strings = new ArrayList<>();

        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");

        System.out.println(strings);

        return strings;
    }

}