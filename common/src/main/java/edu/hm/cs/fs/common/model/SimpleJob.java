package edu.hm.cs.fs.common.model;

/**
 * @author Luca
 */
public class SimpleJob {
  private String title;
  private String provider;
  private String description;
  private SimplePerson contact;

  public SimpleJob() {
  }
  
  public SimpleJob(final Job job) {
    title = job.getTitle();
    provider = job.getProvider();
    description = job.getDescription();
    contact = job.getContact();
  }
  
  public String getTitle() {
    return title;
  }

  public void setTitle(final String title) {
    this.title = title;
  }

  public String getProvider() {
    return provider;
  }

  public void setProvider(final String provider) {
    this.provider = provider;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(final String description) {
    this.description = description;
  }

  public SimplePerson getContact() {
    return contact;
  }

  public void setContact(final SimplePerson contact) {
    this.contact = contact;
  }

}