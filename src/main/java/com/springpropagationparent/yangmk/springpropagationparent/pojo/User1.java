package com.springpropagationparent.yangmk.springpropagationparent.pojo;

/**
 * @author yangmingkai
 * @ClassName User1
 * @Description TODO
 * @date 2018/11/29 4:13 PM
 **/
public class User1 {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
