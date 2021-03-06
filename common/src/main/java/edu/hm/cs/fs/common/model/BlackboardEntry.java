package edu.hm.cs.fs.common.model;

import edu.hm.cs.fs.common.model.simple.SimplePerson;

import java.util.Date;
import java.util.List;

/**
 * Created by Fabio on 18.02.2015.
 */
public class BlackboardEntry {
    private String id;
    private SimplePerson author;
    private String subject;
    private String text;
    private List<SimplePerson> teachers;
    private List<Group> groups;
    private Date publish;
    private String url;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public SimplePerson getAuthor() {
        return author;
    }

    public void setAuthor(final SimplePerson author) {
        this.author = author;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(final String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public List<SimplePerson> getTeachers() {
        return teachers;
    }

    public void setTeachers(final List<SimplePerson> teachers) {
        this.teachers = teachers;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(final List<Group> groups) {
        this.groups = groups;
    }

    public Date getPublish() {
        return publish;
    }

    public void setPublish(final Date publish) {
        this.publish = publish;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }
}
