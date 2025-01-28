package com.entity.view;

import com.entity.JiangxiangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 奖项信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-05 11:07:09
 */
@TableName("jiangxiangxinxi")
public class JiangxiangxinxiView  extends JiangxiangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiangxiangxinxiView(){
	}
 
 	public JiangxiangxinxiView(JiangxiangxinxiEntity jiangxiangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jiangxiangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
