package dubboProvider;

import dubboApi.DemoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> getLists(Integer id) {
        List<String> strings = new ArrayList<>();

        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");

        return strings;
    }
}
