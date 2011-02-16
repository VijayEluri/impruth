package org.mmpp.impruth.action.models;

public class ScanBarcodeJsonBook {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * タイトル
	 */
	private String _title;
	/**
	 * 通巻表記
	 */
	private String _number;
	/**
	 * 著者
	 */
	private String _authorName;
	/**
	 * 出版社
	 */
	private String _publishCompanyName;
	/**
	 * 
	 */
	private String _barcode;

	/**
	 * 管理ID
	 */
	private String _id;

	/**
	 * 発売日
	 */
	private String _releaseDate;

	/**
	 * 画像Url
	 */
	private String _imageUrl;

	/**
	 * アマゾンID
	 */
	private String _asin;
	
	public String getTitle() {
		return _title;
	}
	public void setTitle(String title) {
		this._title = title;
	}
	public String getNumber() {
		return _number;
	}
	public void setNumber(String number) {
		this._number = number;
	}
	public String getAuthorName() {
		return _authorName;
	}
	public void setAuthorName(String authorName) {
		this._authorName = authorName;
	}
	public String getPublishCompanyName() {
		return _publishCompanyName;
	}
	public void setPublishCompanyName(String publishCompanyName) {
		this._publishCompanyName = publishCompanyName;
	}

	public void setId(String id) {
		_id = id;		
	}
	public String getId() {

		return _id;
	}

	public void setBarcode(String barcode) {
		_barcode = barcode;		
	}
	public String getBarcode() {

		return _barcode;
	}
	public void setReleaseDate(String releaseDate){
		_releaseDate = releaseDate;
	}
	public String getReleaseDate() {
		return _releaseDate;
	}
	public String getImageUrl() {
		return _imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		_imageUrl = imageUrl;
	}
	public String getASIN() {
		return _asin;
	}
	public void setASIN(String asin) {
		_asin = asin;
	}
}
