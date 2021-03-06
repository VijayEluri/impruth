package org.mmpp.impruth.model;

/**
 * OwnBook generated by hbm2java
 */
public class OwnBook implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userId;
	private int releaseId;
	private org.mmpp.impruth.model.ReleaseInformation release;


	public OwnBook() {
	}

	public OwnBook(int userId, int releaseId) {
		this.userId = userId;
		this.releaseId = releaseId;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getReleaseId() {
		return this.releaseId;
	}

	public void setReleaseId(int releaseId) {
		this.releaseId = releaseId;
	}
	public org.mmpp.impruth.model.ReleaseInformation getRelease() {
		return release;
	}

	public void setRelease(org.mmpp.impruth.model.ReleaseInformation release) {
		this.release = release;
	}

}
