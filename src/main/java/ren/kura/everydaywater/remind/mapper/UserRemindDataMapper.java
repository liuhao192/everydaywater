package ren.kura.everydaywater.remind.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import ren.kura.everydaywater.remind.entity.UserRemindData;
import ren.kura.everydaywater.water.entity.WaterUserCount;

/**
 * <p>项目名称: everydaywater
 * <p>文件名称: UserRemindDataMapper.java
 * <p>描述: [类型描述]
 * <p>HISTORY: 2020/10/12 liuha : Created
 *
 * @author <a href="https://www.kura.ren" target="_blank">liuha</a>
 * @version 1.0
 * @date: 2020/10/12 14:27
 */
@Mapper
public interface UserRemindDataMapper extends BaseMapper<UserRemindData> {
}
