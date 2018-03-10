package com.zking.crm.bizA.impl;
import com.zking.crm.bizA.isalchance;
import com.zking.crm.mappel.salchanceMapper;
import com.zking.crm.model.salchance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class isalchanceimpl implements isalchance {

    @Autowired
    private salchanceMapper salchanceMapper;

    @Override
    public List<salchance> list(salchance salchance1) {
        return salchanceMapper.list(salchance1);
    }
}
