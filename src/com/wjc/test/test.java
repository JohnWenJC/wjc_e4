package com.wjc.test;


import com.wjc.mapper.SpecilinfoMapper;
import com.wjc.po.Specilinfo;
import com.wjc.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pageNo,pageSize=3,start;
        SqlSession sqlSession = MybatisUtils.getSqlSession(true);
        SpecilinfoMapper customerMapper = sqlSession.getMapper(SpecilinfoMapper.class);

        Map<String,Object> map=new HashMap<>();

        map.put("biao","specilinfo");

        map.put("column","spilinfoname");
        System.out.println("输入关键字");
        map.put("name",scanner.next());

        pageNo = 1;
        start = (pageNo-1)*pageSize;
        map.put("start",start);
        map.put("pageSize",pageSize);

        List<Specilinfo> list = customerMapper.findCustomerByName(map);

        for (Specilinfo specilinfo: list
             ) {
            System.out.println(specilinfo.toString());
        }

        MybatisUtils.closeSqlSession(sqlSession);
    }
}
