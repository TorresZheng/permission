package com.permission.model.vo;

/**
 * 模块元素视图模型
 * @author milanyangbo
 *
 */
public class ModuleElementVM {

	/**
	 * 流水号
	 */
    private int id;
    
    /**
	 * DOM ID
	 */
    private String domid;

    /**
	 * 名称
	 */
    private String name;


    /**
	 * 功能模块Id
	 */
    private int moduleid;

    /**
   	 * 所属模块名称
   	 */
    private String modulename;
    
    /**
   	 * 授权状态
   	 */
    private Boolean accessed;


  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDomid() {
        return domid;
    }

    public void setDomid(String domid) {
        this.domid = domid == null ? null : domid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

 
    public int getModuleid() {
        return moduleid;
    }

    public void setModuleid(int moduleid) {
        this.moduleid = moduleid;
    }

    public String getModuleName() {
        return modulename;
    }

    public void setModuleName(String modulename) {
        this.modulename = modulename;
    }
    
    
    public Boolean getAccessed() {
        return accessed;
    }

    public void setAccessed(Boolean accessed) {
        this.accessed = accessed;
    }
}
