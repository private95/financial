package com.iparhan.financial.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.iparhan.financial.entity.ResearchTeam;

/**
 * 投研团队
 * @author iparhan
 * 参数列表：
 * name   //成员姓名
 * idea   //投资理念
 *
 */
@Mapper
public interface ResearchTeamMapper {
	
	@Insert("insert into t_researchteam (name_ResearchTeam,idea_ResearchTeam) values(#{name_ResearchTeam},#{idea_ResearchTeam})")
	void insertResearchTeam(@Param("name_ResearchTeam")String name_ResearchTeam,
							@Param("idea_ResearchTeam") String idea_ResearchTeam);

}
