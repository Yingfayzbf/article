package com.uworks.domain;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.util.Date;
import java.util.List;

/**
 * 文章
 */
@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long            id;
    /**
     * 标题
     */
    private String          title;
    /**
     * 内容
     */
    private String          content;
    /**
     * 所属标签
     */
    @Column(name = "label_ids")
    @OneToMany(cascade={CascadeType.REFRESH,CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE},   fetch=FetchType.LAZY,mappedBy="article")
    private List<Label>     labels;
    /**
     * 作者
     */
    @JoinColumn(name = "athohor_id",unique = true)
    @OneToOne
    private User            author;
    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date            createTime;
    /**
     * 审核状态
     */
    private String          status;
    /**
     * 审核人
     */
    private User            checker;
    /**
     * 编辑历史纪录
     */
    @Column(name = "editLog_ids")
    @OneToMany(cascade={CascadeType.REFRESH,CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE},   fetch=FetchType.LAZY,mappedBy="article")
    private List<EditLog>   editLogs;

    public Article() {
    }

    public Article(long id, String title, String content, List<Label> labels, User author, Date createTime, String status, User checker, List<EditLog> editLogs) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.labels = labels;
        this.author = author;
        this.createTime = createTime;
        this.status = status;
        this.checker = checker;
        this.editLogs = editLogs;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getChecker() {
        return checker;
    }

    public void setChecker(User checker) {
        this.checker = checker;
    }

    public List<EditLog> getEditLogs() {
        return editLogs;
    }

    public void setEditLogs(List<EditLog> editLogs) {
        this.editLogs = editLogs;
    }
}
