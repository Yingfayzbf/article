package com.uworks.domain;

import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.util.Date;

/**
 * 文章编辑历史记录
 */
@Entity
@Table(name = "editLog")
public class EditLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long        id;
    /**
     * 所属文章
     */
    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH}, fetch=FetchType.EAGER,optional=false)
    @JoinColumn(name = "article_id")
    private Article     article;
    /**
     *编辑者
     */
    @JoinColumn(name = "editor_id")
    private User        editor;
    /**
     * 编辑时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date        editorTime;

    public EditLog() {
    }

    public EditLog(long id, Article article, User editor, Date editorTime) {
        this.id = id;
        this.article = article;
        this.editor = editor;
        this.editorTime = editorTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public User getEditor() {
        return editor;
    }

    public void setEditor(User editor) {
        this.editor = editor;
    }

    public Date getEditorTime() {
        return editorTime;
    }

    public void setEditorTime(Date editorTime) {
        this.editorTime = editorTime;
    }
}
