package portfolio;

public class Portfolio {
	private long id;
	private String projTitle;
	private String projImage;
	private String projCate;
	private String projCont;

	public Portfolio(long id, String projTitle, String projImage, String projCate, String projCont) {
		super();
		this.id = id;
		this.projTitle = projTitle;
		this.projImage = projImage;
		this.projCate = projCate;
		this.projCont = projCont;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProjTitle() {
		return projTitle;
	}

	public void setProjTitle(String projTitle) {
		this.projTitle = projTitle;
	}

	public String getProjImage() {
		return projImage;
	}

	public void setProjImage(String projImage) {
		this.projImage = projImage;
	}

	public String getProjCate() {
		return projCate;
	}

	public void setProjCate(String projCate) {
		this.projCate = projCate;
	}

	public String getProjCont() {
		return projCont;
	}

	public void setProjCont(String projCont) {
		this.projCont = projCont;
	}

}
