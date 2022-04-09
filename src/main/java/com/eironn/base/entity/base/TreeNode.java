package com.eironn.base.entity.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * 树节点，所有需要实现树节点的，都需要继承该类
 *
 * @author eric
 * @since 1.0.0
 */
@Data
@ToString
@ApiModel(value = "TreeNode", description = "TreeNode")
public class TreeNode<T> {
    @ApiModelProperty(value = "当前节点id")
    protected String id;

    @ApiModelProperty(value = "父节点id")
    protected String pid;

    @ApiModelProperty(value = "是否叶子节点1是，0否")
    protected Integer leaf;

    @ApiModelProperty(value = "层级")
    protected Integer level;

    @ApiModelProperty(value = "节点名字")
    protected String name;

    @ApiModelProperty(value = "排序")
    protected Integer order;

    @ApiModelProperty(value = "子节点列表")
    protected List<T> children = new ArrayList<>();

    public void add(T node) {
        children.add(node);
    }
}
