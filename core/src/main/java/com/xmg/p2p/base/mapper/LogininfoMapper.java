package com.xmg.p2p.base.mapper;

import java.util.List;

import com.xmg.p2p.base.domain.Logininfo;

public interface LogininfoMapper {

    int insert(Logininfo record);

    Logininfo selectByPrimaryKey(Long id);

    List<Logininfo> selectAll();

    int updateByPrimaryKey(Logininfo record);
}