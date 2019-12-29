package immutableInterface;

public class Author implements ImmutableAuthor{

	  private String name;
	  private String mail;
	    
	public Author(String authorName, String authorMail) {
		// TODO Auto-generated constructor stub
		this.name=authorName;
		this.mail=authorMail;
	}
	

    public void setAuthorName(String name) { this.name = name; }
    public void setAuthorMail(String mail) { this.mail = mail; }

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getMail() {
		// TODO Auto-generated method stub
		return mail;
	}

}
