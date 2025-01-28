package com.entity.view;

import com.entity.ShiyanleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 实验类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
@TableName("shiyanleixing")
public class ShiyanleixingView  extends ShiyanleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyanleixingView(){
	}
 
 	public ShiyanleixingView(ShiyanleixingEntity shiyanleixingEntity){
 	try {
			BeanUtils.copyProperties(this, shiyanleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
