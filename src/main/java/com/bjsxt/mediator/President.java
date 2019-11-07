package com.bjsxt.mediator;

import java.util.HashMap;
import java.util.Map;

/**中介实现类
 * @author lvyelanshan
 * @create 2019-11-07 17:44
 */
public class President implements Mediator{

    private Map<String,Department> map = new HashMap<String, Department>();

    public void regiter(String dname, Department d) {
        map.put(dname,d);
    }

    public void command(String dename) {
       map.get(dename).selfAction();
    }
}
