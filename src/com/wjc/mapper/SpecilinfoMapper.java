package com.wjc.mapper;

import com.wjc.po.Specilinfo;

import java.util.List;
import java.util.Map;

public interface SpecilinfoMapper {

        List<Specilinfo> findCustomerByName(Map<String,Object> map);

}
