package com.mycollab.module.user.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.user.domain.Group;
import com.mycollab.module.user.domain.GroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface GroupMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    long countByExample(GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int deleteByExample(GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int insert(Group record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int insertSelective(Group record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    List<Group> selectByExampleWithBLOBs(GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    List<Group> selectByExample(GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    Group selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int updateByExampleSelective(@Param("record") Group record, @Param("example") GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Group record, @Param("example") GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int updateByExample(@Param("record") Group record, @Param("example") GroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int updateByPrimaryKeySelective(Group record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int updateByPrimaryKeyWithBLOBs(Group record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    int updateByPrimaryKey(Group record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    Integer insertAndReturnKey(Group value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_group
     *
     * @mbg.generated Fri Jun 01 14:16:25 ICT 2018
     */
    void massUpdateWithSession(@Param("record") Group record, @Param("primaryKeys") List primaryKeys);
}