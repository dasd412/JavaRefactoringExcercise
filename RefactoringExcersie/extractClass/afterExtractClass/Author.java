package afterExtractClass;

public class Author {

	  private String name;
	  private String mail;
	    
	public Author(String authorName, String authorMail) {
		// TODO Auto-generated constructor stub
		this.name=authorName;
		this.mail=authorMail;
	}
	
	public String getAuthorName() { return name; }
    public String getAuthorMail() { return mail; }
    public void setAuthorName(String name) { this.name = name; }
    public void setAuthorMail(String mail) { this.mail = mail; }

}
